import java.util.Scanner;

public class HexToBib {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hex value : ");
		String hex = sc.nextLine();
		int decimal = Integer.parseInt(hex, 16);
		// Converting hexa decimal number to binary in Java
		String binary = Integer.toBinaryString(decimal);
		System.out.println("The binary value is : "+binary);
	}
}
