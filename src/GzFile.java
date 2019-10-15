import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

public class GzFile {

	public static void main(String[] args) throws IOException {

		GzFile GzFile = new GzFile();
		ArrayList<Integer> cars = GzFile.total();
		FileWriter pw = null;
		try {
			pw = new FileWriter("C:\\total.csv", true);
			PrintWriter bw = new PrintWriter(pw);
			for (Integer st : cars) {
				bw.println(st);
			}
			bw.flush();
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static String[] find(String rootPath) {

		File root = new File(rootPath);
		// Filter files whose name start with "B"
		FilenameFilter beginswithm = new FilenameFilter() {
			public boolean accept(File directory, String filename) {
				return filename.startsWith("B");
			}
		};
		// array to store filtered file names
		String[] files = root.list(beginswithm);
		String[] no = { "nofile" };
		if (files == null) {
			return no;
		}
		return files;
	}

	public ArrayList<Integer> total() throws FileNotFoundException, IOException {
		BufferedReader reader;
		int m = 0;
		int n = 0;
		String pa = "C:\\test";
		String[] filesList = find(pa);
		Pattern Errotype9364 = Pattern.compile("Boxing");
		Pattern Errotype93 = Pattern.compile("Material");
		for (String file : filesList) {
			reader = new BufferedReader(
					new InputStreamReader(new GZIPInputStream(new FileInputStream(pa + "//" + file))));

			String content;
			while ((content = reader.readLine()) != null) {
				Matcher mhn = Errotype9364.matcher(content);
				while (mhn.find())
					m++;
				Matcher mh = Errotype93.matcher(content);
				while (mh.find())
					n++;
			}
		}
		ArrayList<Integer> cars = new ArrayList<Integer>();
		cars.add(m);
		cars.add(n);
		return cars;
	}

}
