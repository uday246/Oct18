import java.util.Scanner;

public class EvenNumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number between 10-20 ");
	int x= sc.nextInt();
	for(int i=x;i<20;i++)
		if(i%2==0)
			System.out.print(i+" ");
	
	sc.close();
}
}
