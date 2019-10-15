import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Duplicates {
public static void main(String[] args) {
	ArrayList<String>single = new ArrayList<String>();
	ArrayList<String>duplicate = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Words : ");
	String line="";
	line = sc.next();
	while(!line.equals("q")){
		// contains checks given obj exists in the list or not
		if(single.contains(line)){
			// remove() removes the passed obj from the list
			single.remove(line);
			// adds obj to the list
			duplicate.add(line);
		}else{
			single.add(line);
		}
		line = sc.next();
	}
	sc.close();
	// sort the objects in the list
	Collections.sort(single);
	System.out.println("Words Which occured once ");
	System.out.println(single);
	System.out.println("Duplicate Words : ");
	System.out.println(duplicate);
}
}

