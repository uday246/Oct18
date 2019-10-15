import java.util.Scanner;

public class Calories {
public static void main(String[] args) {
double height=0,weight=0,years=0,totalBMR=0,requiredBar=0;
String gender="",type="";
Scanner sc = new Scanner(System.in);
System.out.println("What is your age in years");
years = sc.nextDouble();
System.out.println("What is your total height in inches");
height = sc.nextDouble();
System.out.println("What is your total weight in pounds");
weight = sc.nextDouble();
// to clear the \n from the buffer
sc.nextLine();
System.out.println("Enter M or m for male calculations and F or f for femalae calculations");
gender=sc.nextLine();
System.out.println("Are you?");
System.out.println("A. Sedentary");
System.out.println("B. Some what active");
System.out.println("C. Active");
System.out.println("D.Highly active");
type=sc.nextLine();
// calculating the BMR based on given formula
if(gender.equalsIgnoreCase("F"))
	totalBMR = 655+(4.3*weight) + (4.7*height)-(4.7 * years);
if(gender.equalsIgnoreCase("M"))
	totalBMR = 66+(6.3*weight) + (12.9*height)-(6.8 * years);

// increasing BMR based on type
	if(type.equalsIgnoreCase("A"))
		totalBMR=totalBMR*1.2;
	if(type.equalsIgnoreCase("B"))
		totalBMR=totalBMR*1.3;
	if(type.equalsIgnoreCase("C"))
		totalBMR=totalBMR*1.4;
	if(type.equalsIgnoreCase("D"))
		totalBMR=totalBMR*1.5;
	
	requiredBar = totalBMR/230;
	System.out.println("With those measurements , you should eat "+requiredBar+" candy bars per day to maintain the same weight ");
	
	
}
}
