import java.util.Scanner;

public class CalculatorWithMethods {

	static Scanner input = new Scanner(System.in);

	boolean mainloop = true;

	public static void main(String[] args) {

		double res;

		int count = 0;

		while (true) {

			int choice = (int) getMenuOption();
			double operand1 = getInput("What is the first number?");

			double operand2 = getInput("What is the second number?");
			switch (choice) {

			case 1:

			{

				// Method for getting operands.


				res = add(operand1, operand2);

				System.out.println(operand1 + " + " + operand2 + " = " + res);

				break;

			}

			case 2:

			{


				res = subtract(operand1, operand2);

				System.out.println(operand1 + " - " + operand2 + " = " + res);

				break;

			}

			case 3:

			{

				res = multiply(operand1, operand2);

				System.out.println(operand1 + " * " + operand2 + " = " + res);

				break;

			}

			case 4:

			{


				if (operand2 == 0) {

					System.out.println("Double.NaN");

				} else {

					operand1 = getInput("What is the first number?");

					operand2 = getInput("What is the second number?");

					res = divide(operand1, operand2);

					System.out.println(operand1 + " / " + operand2 + " = " + res);

				}

				break;

			}

			case 5:

			{

				double operand1 = getInput("Enter degrees ?");
				res=Math.sin(operand1);
				System.out.println("Sin(" + operand1+") is : "+res);

				break;

			}
			case 6:

			{

				double operand1 = getInput("Enter degrees ?");
				res=Math.cos(operand1);
				System.out.println("Cos(" + operand1+") is : "+res);

				break;

			}
			case 7:

			{

				double operand1 = getInput("Enter degrees ?");
				res=Math.tan(operand1);
				System.out.println("tan(" + operand1+") is : "+res);

				break;

			}



			default: {

				count++;

				System.out.println("** Invalid Choice **");

			}

			}

			if (count == 3) {

				break;

			}

		}

	}

	// Addition.

	public static double add(double operand1, double operand2) {

		return operand1 + operand2;

	}

	// Subtraction.

	public static double subtract(double operand1, double operand2) {

		return operand1 - operand2;

	}

	// Multiplication

	public static double multiply(double operand1, double operand2) {

		return operand1 * operand2;

	}

	// Division

	public static double divide(double operand1, double operand2) {
		// if operand2 is 0 than return Nan
		if(operand2==0)
			return Double.NaN;

		return operand1 / operand2;

	}

	// Random number

	public static double random(double x, double y) {
		// using random from math class to generate within range
		return Math.random() * ((y - x) + 1)+ x;
	}

	// Getting the operands.

	public static double getInput(String str) {

		System.out.print(str);

		double num = input.nextDouble();

		return num;

	}

	// Display menu

	public static double getMenuOption() {

		double choice;

		System.out.println("\nMenu\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5.Sin \n6 Cost \n7 Tan \n8. Quit");

		System.out.println("What would you like to do?");

		choice = input.nextInt();

		return choice;

	}

}