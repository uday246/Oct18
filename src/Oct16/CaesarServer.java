package Oct16;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class CaesarServer extends javafx.application.Application implements CaesarConstants, EventHandler<ActionEvent>
{
private Stage stage;
private Scene scene;
private VBox root = new VBox(8.0D);
  

private TextField tfShift = new TextField();
private Button btnStart = new Button("Start");
private TextArea taLog = new TextArea();
  

private ServerSocket sSocket = null;
private static byte shiftValue = 3;
private byte shiftVal;
  
public CaesarServer() {}
  
public static void main(String[] args) { launch(args); }
  


public void start(Stage _stage)
{
stage = _stage;
stage.setTitle("Caesar Server - v 3.0");
stage.setOnCloseRequest(new EventHandler() {
public void handle(WindowEvent evt) { System.exit(0);
}

@Override
public void handle(Event aArg0) {
	// TODO Auto-generated method stub
	
}

});
int X = 600;
int Y = 100;
int WIDTH = 350;
int HEIGHT = 350;
  

tfShift.setPrefColumnCount(3);
FlowPane fpRow1 = new FlowPane(8.0D, 8.0D);
fpRow1.getChildren().addAll(new javafx.scene.Node[] { new javafx.scene.control.Label("Shift: "), tfShift, btnStart });
btnStart.setOnAction(this);
root.getChildren().add(fpRow1);
  

root.getChildren().add(taLog);
taLog.setPrefColumnCount(30);
taLog.setPrefRowCount(30);
taLog.setWrapText(true);
  

scene = new Scene(root, 350.0D, 350.0D);
stage.setScene(scene);
stage.setX(600.0D);
stage.setY(100.0D);
stage.show();
  

shiftVal = 3;
tfShift.setText("3");
}
  
public void handle(ActionEvent ae)
{
String label = ((Button)ae.getSource()).getText();
switch (label) {
case "Start":
doStart();
break;
case "Stop":
doStop();
}
}
  
public void doStart()
{
try
{
shiftVal = ((byte)Integer.parseInt(tfShift.getText()));
if (shiftVal < 1)
throw new NumberFormatException("Shift value of " + shiftVal + " is too small.");
if (shiftVal > 25) {
throw new NumberFormatException("Shift value of " + shiftVal + " is too large.");
}
} catch (NumberFormatException nfe) {
taLog.appendText(nfe.toString() + "\n");
return;
}
  
tfShift.setEditable(false);
btnStart.setText("Stop");
  
Thread t = new CaesarServer.ServerThread();
t.start();
}
  
class ServerThread extends Thread {
ServerThread() {}
  
public void run() {
try { CaesarServer.access$002((byte)Integer.parseInt(tfShift.getText()));
sSocket = new ServerSocket(16789);
try
{
for (;;) {
new CaesarServer.CaesarThread(CaesarServer.this, sSocket.accept()).start();
}
} catch (SocketException se) {
if (se.toString().indexOf("socket closed") < 0) {
safeAlert(Alert.AlertType.ERROR, "Socket Exception: " + se, "Exception");
}
}
catch (Exception e) {
safeAlert(Alert.AlertType.ERROR, "Exception: " + e, "Exception");
}
Platform.runLater(new Runnable() {
public void run() {
btnStart.setText("Start");
tfShift.setEditable(true);
}
});
return;
}
catch (BindException be) {
safeAlert(Alert.AlertType.ERROR, "Bind Exception: " + be + "\nServer is already running on this computer, or port is in use.", "Bind Exception");
  
System.exit(1);
}
catch (IOException ioe) {
safeAlert(Alert.AlertType.ERROR, "IO Exception: " + ioe, "Unexpected IO Exception");
System.exit(1);
}
catch (Exception e) {
safeAlert(Alert.AlertType.ERROR, "Exception: " + e, "Unexpected Exception");
System.exit(1);
}
}
}
  

public void doStop()
{
try
{
sSocket.close();
}
catch (Exception e) {
Alert alert = new Alert(Alert.AlertType.ERROR, "Exception: " + e, new ButtonType[0]);
alert.setHeaderText("Exception");
alert.showAndWait();
}
}
  

public static void access$002(byte aParseInt) {
	// TODO Auto-generated method stub
	
}

public void safeAlert(final Alert.AlertType type, final String message, final String header)
{
Platform.runLater(new Runnable() {
public void run() {
Alert alert = new Alert(type, message, new ButtonType[0]);
alert.setHeaderText(header);
alert.showAndWait();
}
});
}
  
public void safeLog(final String message)
{
Platform.runLater(new Runnable() {
public void run() {
taLog.appendText(message);
}
});
}
  

public class CaesarThread
extends Thread
{
private Socket sClient;
  
private byte myShift;
private String prefix;
  
public CaesarThread(Socket me)
{
myShift = CaesarServer.shiftValue;
sClient = me;
prefix = ("<" + me.getInetAddress().getHostName() + ":" + me.getPort() + "> ");
}
  
public void run()
{
boolean encrypt = true;
byte diff = 32;
  

Scanner scn = null;
PrintWriter pw = null;
  
try
{
scn = new Scanner(new java.io.InputStreamReader(sClient.getInputStream()));
  

pw = new PrintWriter(new java.io.BufferedWriter(new java.io.OutputStreamWriter(sClient.getOutputStream())));
}
catch (Exception e) {
safeLog(prefix + "Oops! Error on open to client. Should never have gotten here.\n");
return;
}
  
String messageIn = scn.nextLine();
safeLog(prefix + messageIn + "\n");
if ((messageIn != null) && (
((encrypt = messageIn.equalsIgnoreCase("ENCRYPT"))) ||
(messageIn.equalsIgnoreCase("DECRYPT")))) {
safeLog(prefix + "REPLY - OK\n");
pw.println("OK");
pw.flush();
}
else
{
safeLog(prefix + "REPLY - ERROR\n");
pw.println("ERROR");
pw.flush();
return;
}
  
while (scn.hasNextLine()) {
messageIn = scn.nextLine();
  
safeLog(prefix + "MESSAGE " + messageIn + "\n");
byte[] tmpMsg = messageIn.toLowerCase().getBytes();
  

for (int i = 0; i < tmpMsg.length; i++) {
byte ch = tmpMsg[i];
  
if ((ch >= 97) && (ch <= 122))
{
if (encrypt) {
tmpMsg[i] = ((byte)((ch - 97 + myShift) % 26 + 97));
} else {
tmpMsg[i] = ((byte)((ch - 97 - myShift + 26) % 26 + 97));
}
}
if (Character.isUpperCase(messageIn.charAt(i))) {
int tmp411_409 = i; byte[] tmp411_407 = tmpMsg;tmp411_407[tmp411_409] = ((byte)(tmp411_407[tmp411_409] - 32));
}
}
String returnMsg = new String(tmpMsg);
  
safeLog(prefix + " REPLY " + returnMsg + "\n");
pw.println(returnMsg);
pw.flush();
}
}
}
}
