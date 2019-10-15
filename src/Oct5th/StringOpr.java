package Oct5th;

import java.util.Scanner;

public class StringOpr {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String ch="";
	while(!ch.equalsIgnoreCase("q")){
		printMenu();
		ch=sc.nextLine().toLowerCase();
		if(ch.equalsIgnoreCase("Q"))
			return;
		System.out.println("Enter sample text");
		String str=sc.nextLine();
		switch(ch.charAt(0)){
		case 'c':
			int n = getNumOfNonWSCharacters(str);
			System.out.println("Number of non-whitespace characters: "+n);
			break;
		case 'w':
			System.out.println("Enter sample word");
			String word = sc.nextLine();
			 n = findText(str,word);
			System.out.println(word+" instances :  "+n);
			break;
		case 'r':
			str = replaceExclamation(str);
			System.out.println("Edited text : "+str);
			break;
		case 's':
			str = shortenSpace(str);
			System.out.println("Edited text : "+str);
			break;
		case 'q':System.out.println(ch);break;
		default:
			System.out.println("Invalid input");
		}
	}
}

private static String shortenSpace(String aStr) {
	String res="";
	String arr[] = aStr.split(" ");
	for(int i=0;i<arr.length;i++){
		res=res+arr[i];
	}
	return res.trim();
	
}

private static String replaceExclamation(String aStr) {
	return aStr.replaceAll("!", ".");
}

private static int findText(String aStr, String aWord) {
	String arr[] = aStr.split(" ");
	int count=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i].equals(aWord))
			count++;
	}
	return count;
}

private static int getNumOfNonWSCharacters(String aStr) {
	int count=0;
	for(int i=0;i<aStr.length();i++){
		if(!Character.isWhitespace(aStr.charAt(i)))
			count++;
	}
	return count;
}

private static void printMenu() {
	System.out.println("c - Number of non-whitespace characters");
	System.out.println("w - Number of words");
	System.out.println("f - Find text");
	System.out.println("r - Replace all !'s");
	System.out.println("s - Shorten spaces");
	System.out.println("q - Quit");	
}
}
