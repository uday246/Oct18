package Oct30;

import java.util.Scanner;

public class HexToDec {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String with 4 digits");
	String str=sc.nextLine();
	while(str.length()<4){
		System.out.println("Enter String with 4 digits");
		str=sc.nextLine();
	}
System.out.println(finDec(str,0,0,str.length()-1));
}

private static double finDec(String str,double sum,int p,int l) {
		if(l<0)
			return sum;
		char c=str.charAt(l);
		int n =0;
		if(c>='0' && c<='9'){
			n=c-48;
		}
		if(c=='a'||c=='A')
			n=10;
		if(c=='b'||c=='B')
			n=11;
		if(c=='c'||c=='C')
			n=12;
		if(c=='d'||c=='D')
			n=13;
		
		if(c=='e'||c=='E')
			n=14;
		if(c=='f'||c=='F')
			n=15;
		sum=sum + n *Math.pow(16, p);
		return finDec(str, sum, p+1, l-1);
	}
}

