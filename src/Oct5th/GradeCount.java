package Oct5th;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;

public class GradeCount {
	private LinkedHashMap<String, Integer> storeData;

	public GradeCount() {
		// using linkedhashmpa to print the grades in order
		storeData = new LinkedHashMap<>();
		storeData.put("[90 - 100]", 0);
		storeData.put("[80 - 89]", 0);
		storeData.put("[70 - 79]", 0);
		storeData.put("[60 - 69]", 0);
		storeData.put("[<60]", 0);
		storeData.put("[Invalid Grade]", 0);
		
	}

	public void readFile(String filename) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				String[] tokens = strLine.split(" ");
				for (String str : tokens) {
					int number = Integer.parseInt(str);
					if (number < 60) {
						storeData.put("[<60]", (storeData.get("[<60]") + 1));
						

					} else if (number < 70 && number > 59) {
						storeData.put("[60 - 69]", (storeData.get("[60 - 69]") + 1));
					} else if (number < 80 && number > 69) {
						storeData.put("[70 - 79]", (storeData.get("[70 - 79]") + 1));
					} else if (number < 90 && number > 79) {
						
						storeData.put("[80 - 89]", (storeData.get("[80 - 89]") + 1));
					} else if (number < 101 && number > 89) {
						storeData.put("[90 - 100]", (storeData.get("[90 - 100]") + 1));
					}
					else {
						storeData.put("[Invalid Grade]", (storeData.get("[Invalid Grade]") + 1));
					}
				}
			}
			br.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	public void printGrade() {
		System.out.println("Category \t No. of Students");
		for (String key : storeData.keySet()) {
			System.out.println(key + " \t " + storeData.get(key));
		}
	}

	public static void main(String[] args) {
		GradeCount gradeCount = new GradeCount();
		gradeCount.readFile("gradebook.txt");
		gradeCount.printGrade();
	}
}
