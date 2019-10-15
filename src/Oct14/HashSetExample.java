package Oct14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("people.txt"));
			String line = br.readLine();
			HashSet<String>cuba = new HashSet<String>();
			HashSet<String>jamaica= new HashSet<String>();
			HashSet<String>mexico = new HashSet<String>();
			
			while (line != null) {
				String temp[] = line.split(" ");
				if(temp[1].trim().equalsIgnoreCase("Cuba")){
					cuba.add(temp[0]);
				}
				else if(temp[1].trim().equalsIgnoreCase("Jamaica")){
					jamaica.add(temp[0]);
				}
				else if(temp[1].trim().equalsIgnoreCase("Mexico")){
					mexico.add(temp[0]);
				}
				line = br.readLine();
				
			}
			br.close();
			System.out.println("People Who visite Cuba : "+cuba);
			System.out.println("People Who visite Jamaica : "+jamaica);
			System.out.println("People Who visite Mexico : "+mexico);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
