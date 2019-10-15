package Oct5th;

import java.util.Scanner;

class PGPEncryptDecrypt

{

	public String encryptFourDigit(String fourDigitString)

	{

		String fourDigitEncrypt = "";

		fourDigitEncrypt += ((Integer.parseInt(String.valueOf(fourDigitString.charAt(2))) + 7) % 10);

		fourDigitEncrypt += ((Integer.parseInt(String.valueOf(fourDigitString.charAt(3))) + 7) % 10);

		fourDigitEncrypt += ((Integer.parseInt(String.valueOf(fourDigitString.charAt(0))) + 7) % 10);

		fourDigitEncrypt += ((Integer.parseInt(String.valueOf(fourDigitString.charAt(1))) + 7) % 10);

		return fourDigitEncrypt;

	} // end of encryption method

	public String decryptFourDigit(String fourDigit)

	{

		String fourDigitDencrypt = "";

		fourDigitDencrypt += ((Integer.parseInt(String.valueOf(fourDigit.charAt(2))) - 7) % 10);

		fourDigitDencrypt += ((Integer.parseInt(String.valueOf(fourDigit.charAt(3))) - 7) % 10);

		fourDigitDencrypt += ((Integer.parseInt(String.valueOf(fourDigit.charAt(0))) - 7) % 10);

		fourDigitDencrypt += ((Integer.parseInt(String.valueOf(fourDigit.charAt(1))) - 7) % 10);

		return fourDigitDencrypt;

	} // end of decryption method

}

public class CryptographyTester

{

	public static boolean isValid(String fourDigit) {

		boolean valid = false;

		{

			try

			{

				Integer.parseInt(fourDigit);

				if (fourDigit.length() == 4)

					valid = true;

			}

			catch (NumberFormatException e)

			{

				System.out.println(e.getMessage());

			}

		}
		return valid;
	}

	public static void main(String[] args)

	{

		PGPEncryptDecrypt pgp = new PGPEncryptDecrypt();

		Scanner userinput = new Scanner(System.in);

		String fourDigit;

		boolean isValid = false;

		do

		{

			System.out.println("Enter a four digit value :");

			fourDigit = userinput.nextLine();

			if (isValid(fourDigit))

			{

				isValid = true;

			}

			else

				System.out.println("Invalid Four Digit Value");

		} while (!isValid);

		System.out.println("Original Four Digit Value : " + fourDigit);

		String encrypted = pgp.encryptFourDigit(fourDigit);

		System.out.println("Encyrpted Four Digit Value :" + encrypted);

		String decrypted = pgp.decryptFourDigit(encrypted);

		System.out.println("Decrypted Four Digit Value :" + decrypted);

	}

}
