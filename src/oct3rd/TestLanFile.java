package oct3rd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestLanFile {
	public static void main(String[] args) throws Exception {
		final File folder = new File("\\\\L34465WIN\\test\\123.txt");
		
		System.out.println(folder);
		System.out.println(folder.getName());
		System.out.println(folder.getAbsolutePath());
		BufferedReader br = new BufferedReader(new FileReader(folder));
		String line=br.readLine();
		while(line!=null){
			System.out.println(line);
			line=br.readLine();
		}
		
	}
}
