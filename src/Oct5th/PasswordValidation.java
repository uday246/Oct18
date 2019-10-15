package Oct5th;

import java.util.Scanner;

public class PasswordValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password");
		String pwd = sc.nextLine();
		System.out.println("confirm password");

		String pwd1 = sc.nextLine();
		
		while (!isValidPassword(pwd,pwd1)) {
			System.out.println("InValid password, Please try again");
			System.out.println("Enter password");
			pwd = sc.nextLine();
			System.out.println("confirm password");
			pwd1 = sc.nextLine();
		} 
		sc.close();
			System.out.println("Password changed successfully");
	}

	private static boolean isValidPassword(String aPwd,String pwd1) {
		if(!aPwd.equals(pwd1))
			return false;
		// checks for length
		if (aPwd.length() < 8)
			return false;
		boolean uF=false,lF=false,dF=false;
		for (int i = 0; i < aPwd.length(); i++) {
			// checks for digits
			if(Character.isDigit(aPwd.charAt(i)))
				dF=true;
			// checks for lowercase
			if(Character.isLowerCase(aPwd.charAt(i)))
				lF=true;
			// checks for uppercase
			if(Character.isUpperCase(aPwd.charAt(i)))
				uF=true;
		}
		return uF&&lF&&dF;
	}
}
