package Oct30;

import java.util.Scanner;

class Fib {
	// store the value of n
	private int num;

	// constructor used to assign the value
	public Fib(int aNum) {
		super();
		num = aNum;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int aNum) {
		num = aNum;
	}

	public void calcFib() {
		// three variables as per the question
		int fold1 = 0, fold2 = 0, fold3 = 1;
		// generating sequence untill it reaches the give number
		while(fold1<num){
			// assigning fold2 to fold1
			fold1 = fold2;
			// assigning fold3 to fold2
			
			fold2 = fold3;
			// adding fold1 and fold2 to generate the sum
			fold3 = fold1 + fold2;
			// print if fold3 is < given number
			if(fold1<num)
				System.out.print(fold1 + " ");
			else
				break;
		}
	}
}

public class FibTester {
	public static void main(String[] args) {
		// creating scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		// reading number
		int num = sc.nextInt();
		// creating Fib class object
		Fib f = new Fib(num);
		// calling calcFib method
		f.calcFib();
		sc.close();
	}
}
