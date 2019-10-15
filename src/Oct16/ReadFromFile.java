package Oct16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
public static void main(String[] args) throws IOException {
	BufferedReader br = new  BufferedReader(new FileReader("numbers.txt"));
	String line = br.readLine();
	String arr[] = new String[100];
	int index=0;
	while(line!=null){
		arr[index++] =line;
		line=br.readLine();
	}
	for(int i=0;i<index;i++)
		System.out.println(arr[i]);
}
}
 