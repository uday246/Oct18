
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileExample {
	public static void main(String[] args) throws Exception {
		String path = "";
		//reading input from user using StreamReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter path: ");
		path = reader.readLine();
		File filesDirectory = new File(path);
		File[] files = filesDirectory.listFiles();
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}
