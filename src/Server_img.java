
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class Server_img {

	private static final int port = 1010;
	static Scanner sc = new Scanner(System.in);
	private static byte[] byteImage;
	public static long time;

	public static void main(String[] args) throws IOException, AWTException {
		Robot robot = new Robot();

		ServerSocket server = null;

		try {
			server = new ServerSocket(port);
			System.out.println("Server socket ready on port: " + port);
		} catch (IOException e) {
			System.err.println("Could not listen on port: " + port);
			System.out.println(e);
			System.exit(-1);
		}
		System.out.println("Enter the Delay time in Milli Sec");
		time = sc.nextLong();
		while (true) {
			Socket socket = null;
			try {
				socket = server.accept();
				
			} catch (IOException e) {
				server.close();

				e.printStackTrace();
			}
			try {
				new Multiple(socket, time).start();
			} catch (Exception e) {
				server.close();
				e.printStackTrace();
			}
		}

	}
}

class Multiple extends Thread {
	Socket server;
	String folder, folder1, folder2, userName, StartTime, endTime, dat;
	int count;
	long startSize, endSize;
	public static long time;
	static int clientCount;
	File f, dir1;
	Date date = new Date();

	Multiple(Socket s, long time) throws Exception {

		server = s;
		Multiple.time = time;
		String t = s.getRemoteSocketAddress().toString();
		StartTime = date.getHours() + ":" + date.getMinutes();

		String temp[] = t.split(":");
		t = temp[0];
		String t1 = "";
		for (int i = 0; i < t.length(); i++)
			if (t.charAt(i) == '.' || t.charAt(i) == ':')
				t1 += "_";
			else
				t1 += t.charAt(i);

		SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy");
		dat = sf.format(date);

		System.out.println("\n\nClient is Connected.."
				+ s.getRemoteSocketAddress() + "\n");

		String tt = "D:\\Snaps";
		File f = new File(tt);
		if (!f.exists())
			f.mkdir();

		folder = "D:\\Snaps\\" + t1;
		File dir = new File(folder);
		if (!dir.exists())
			dir.mkdir();
		clientCount++;

		DataOutputStream dout = new DataOutputStream(server.getOutputStream());
		dout.writeUTF(time + "");
		dout.flush();

		System.out.println("Server sent the time to Client"
				+ s.getRemoteSocketAddress());
		DataInputStream dis = new DataInputStream(server.getInputStream());
		userName = (String) dis.readUTF();
		System.out.println("User Logined... " + userName);

		folder2 = "D:\\Snaps\\" + t1 + "\\" + userName;
		File dir2 = new File(folder2);
		if (!dir2.exists())
			dir2.mkdir();

		folder1 = "D:\\Snaps\\" + t1 + "\\" + userName + "\\" + dat;
		dir1 = new File(folder1);
		if (!dir1.exists())
			dir1.mkdir();
	System.out.println("Created"+dir1);
		//startSize = FileUtils.sizeOfDirectory(dir1) / 1024;

	}

	public void run() {

		System.out.println();
		Date d = new Date();
		for (int i = 0;; i++) {
			try {
				ObjectInputStream ois = new ObjectInputStream(
						server.getInputStream());
				byte[] byteImage = (byte[]) ois.readObject();
				BufferedImage img = null;
				ByteArrayInputStream bais = new ByteArrayInputStream(byteImage);

				System.out.print("\r\rReceiving Images From : " + clientCount
						+ " Clients");

				img = ImageIO.read(bais);
				File f = new File(folder1 + "\\" + date.getHours() + "Hrs"
						+ date.getMinutes() + "Mins"
						+ System.currentTimeMillis() + ".jpg");
				count++;

				ImageIO.write(img, "jpg", f);

			} catch (Exception e) {

				try {
					System.out.println("\n\nClient is Disconnected.."
							+ server.getRemoteSocketAddress()
							+ "\nTotal Images Received : " + count);
					clientCount--;
					endTime = date.getHours() + ":" + date.getMinutes();
					//endSize = FileUtils.sizeOfDirectory(dir1) / 1024;
					endSize=0;
					File file = new File(folder2 + "\\" + userName + ".txt");
					FileWriter fileWriter = new FileWriter(file, true);

					BufferedWriter bw = new BufferedWriter(fileWriter);
					bw.newLine();
					bw.newLine();
					bw.newLine();
					bw.write("Date : " + dat);
					bw.newLine();
					bw.write("StartTime : " + StartTime + "\n");
					bw.newLine();

					bw.write("EndTime : " + endTime + "\n");
					bw.newLine();

					bw.write("Total Images Received: " + count + "\n");
					bw.newLine();

					bw.write("Total size: " + (endSize - startSize) + "Kbs\n");

					bw.flush();

					server.close();
				} catch (IOException e1) {

					e1.printStackTrace();
				}
				break;
			}

		}

	}

}

