import java.util.Scanner;

class DivideByTwoException extends Exception{
	private String msg;

	public DivideByTwoException(String aMsg) {
		super();
		msg = aMsg;
	}

	@Override
	public String toString() {
		return "DivideByTwoException [msg=" + msg + "]";
	}
	
}
public class UserDefineException {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	try{
		if(n%2==0)
			throw new DivideByTwoException("Number should not divide with 2");
	}catch(DivideByTwoException d){
		System.out.println(d);
	}
}
}
