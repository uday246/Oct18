package Oct14;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
public ReadFile() {
	try {
		BufferedReader br = new BufferedReader(new FileReader("WorldSeriesWinners.txt"));
		int count = 0;
		String line = br.readLine();
		while (line != null) {
			
			line = br.readLine();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
