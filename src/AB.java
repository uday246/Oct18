import java.util.Scanner;

public class AB {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Char");
	char c = sc.next().charAt(0);
	if(c=='A'||c=='B'){
		System.out.println("Thats's an A or B");
	}
	else{
		System.out.println("Thats's Not an A or B");
	}
	System.out.println("Goobye");
	sc.close();
}
}
