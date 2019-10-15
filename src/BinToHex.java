import java.util.Scanner;

public class BinToHex {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 4 bits binary value : ");
	String binaryStr = sc.nextLine();
	
	int decimal = Integer.parseInt(binaryStr,2);
	String hexStr = Integer.toString(decimal,16);
	System.out.println("The hex value is "+hexStr.toUpperCase());
}
}
