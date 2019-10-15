import java.io.BufferedReader;
import java.io.FileReader;

public class SimpleReader {
public static void main(String[] args) throws Exception{
	// mandotory to give complete path
	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\teegu\\workspace\\Oct\\src\\SimpleReader.java"));
	String line=br.readLine();
	int count=1;
	while(line!=null){
		System.out.println(count+" : "+line);
		line=br.readLine();
		count++;
	}
}
}
