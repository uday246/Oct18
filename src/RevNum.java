
public class RevNum {
	public static void main(String[] args) {
		int rev = reverse(123);
		System.out.println(rev);
		rev=reverse(-456);
		System.out.println(rev);

	}

	private static int reverse(int n) {
		boolean flag=false;
		//making negativ to positive
		if(n<0){
			n=n*-1;
			flag=true;
		}
		//converting into string than reversing and returning
		int rev=Integer.parseInt(new StringBuffer(n + "").reverse().toString());
		//if original num is negative than making reverse num also negative
		if(flag)
			rev=-1*rev;
		return rev;
	}
}
