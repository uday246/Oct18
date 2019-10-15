import java.util.Scanner;

public class LetterTest {
	public static void main(String[] args) {
		char arr[][]=readLetters();
		// displaying array of chars
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
// method which reads chars into 3*4 array 
	private static char[][] readLetters() {
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[3][4];
		System.out.println("Enter letters :");
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				arr[i][j] = sc.next().charAt(0);
			}
		}
		sc.close();
		return arr;
	}
}
