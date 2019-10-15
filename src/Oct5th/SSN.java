package Oct5th;

import java.util.Scanner;

public class SSN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter SSN");
		String str = sc.nextLine();
		plot(str);
		sc.close();
	}

	private static void plot(String aStr) {
		// loop to iterate through string
		for(int i=0;i<aStr.length();i++){
			System.out.print(aStr.charAt(i)+" : ");
			// loop to print the pattern 
			for(int j=0;j<Integer.parseInt(aStr.charAt(i)+"");j++)
				System.out.print(aStr.charAt(i));
		System.out.println();
		}
	}
}
