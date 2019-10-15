import java.util.Scanner;

public class CharsEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from 0-35");
		int num = sc.nextInt();
		if (num < 10) {
			System.out.println(num);
		} else {
			// adding 55 to num so we can directly cast it to the char
			num+=55;
			System.out.println((char)num);
		}
	}
}
