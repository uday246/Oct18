package Oct16;

import java.util.Scanner;

public class JavaMethods {
	public static void main(String[] args) {
		JavaMethods j = new JavaMethods();
		j.sumOfFirstNNumbersCubes(5);
		j.sumOfFirstNNumbersSqures(5);
		j.sumOfNEvenNumbers(10);
		j.sumOfNOddNumbers(10);
		j.smallestOfThree();
	}
	public int sumOfNOddNumbers(int n) {
		int sum = 0, count = 0;
		for (int i = 0;; i++) {
			if (count == n)
				break;
			if (i % 2 == 1) {
				sum += i;
				count++;
			}

		}
		return sum;
	}
	public int sumOfFirstNNumbersSqures(int n) {
		int sum = 0;
		for (int i = 0;i<n; i++) {
			sum=sum+(i*i);
		}
		return sum;
	}
	public int sumOfFirstNNumbersCubes(int n) {
		int sum = 0;
		for (int i = 0;i<n; i++) {
			sum=sum+(i*i*i);
		}
		return sum;
	}
	
	public int sumOfNEvenNumbers(int n) {
		int sum = 0, count = 0;
		for (int i = 0;; i++) {
			if (count == n)
				break;
			if (i % 2 == 0) {
				sum += i;
				count++;
			}

		}
		return sum;
	}
	public void smallestOfThree(){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1<num2 && num1<num3)
			System.out.println("Smallest Num is : "+num1);
		else if(num2<num3)
			System.out.println("Smallest Num is : "+num2);
		else
			System.out.println("Smallest Num is : "+num3);
		
				
	}
}
