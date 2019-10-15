package gui;

import java.util.Scanner;

public class StringRemove {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.nextLine();
		System.out.println("Enter char to remove ");
		String ch = sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==ch.charAt(0))
				count++;
		if(count>1){
			System.out.println("Which "+ch+" you want remove");
			for(int i=1;i<=count;i++)
			System.out.print(i+" ");
		}
		int in = sc.nextInt();
		int index = str.indexOf(ch,in);
		sc.close();
		// index will -1 if given char is not present
		if (index < 0) {
			System.out.println("Char does not exist in string");
			return;
		}
		// substring will return the string in given range
		str = str.substring(0, index) + str.substring(index + 1);
		System.out.println(str);
	}

}
