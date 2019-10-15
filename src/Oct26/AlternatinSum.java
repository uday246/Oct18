package Oct26;

import java.util.Scanner;

public class AlternatinSum{
	public static void main(String[] args) {
		int n=5;
		int arr[]=new int[n];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+n+" elements ");
		int sum=0;
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
			if(i%2==0)
				sum=sum+arr[i];
			else
				sum=sum-arr[i];
		}
		System.out.println("Alternatim sum is : "+sum);
	}
}