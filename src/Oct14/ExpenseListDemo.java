package Oct14;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 class Expense{
	 String cost;
	 String date;
	 String desc;
	public Expense(String aCost, String aDate, String aDesc) {
		super();
		cost = aCost;
		date = aDate;
		desc = aDesc;
	}
	 
 }
class ExpenseList

{

   private List<Expense> expenses;

  

  

   public ExpenseList()

   {

       expenses = new ArrayList<Expense>();

   }

   public void add(Expense exp)

   {

       expenses.add(exp);

   }

  

   public boolean isEmpty()

   {

       return expenses.isEmpty();

   }

   public boolean contains(Expense exp)

   {

       return expenses.contains(exp);

   }

   public Expense first()

   {

       return expenses.get(0);

   }

   public Expense next()

   {

       return expenses.next();

   }

   public void enumerate()

   {

       expenses.enumerate();

   }

  

   public double maxExpense()

   {

       double max =0.0, amt;

       Expense exp = first();

       while (exp!=null)

       {

           amt = exp.getAmount();

           if (amt>max)

               max = amt;

           exp = expenses.next();

       }

       return max;

   }

   public double minExpense()

   {

       double min =Double.MAX_VALUE, amt;

       Expense exp = first();

       if (exp==null) return 0.0;

       else

       {

      

           while (exp!=null)

           {

               amt = exp.getAmount();

               if (amt<min)

                   min = amt;

               exp = expenses.next();

           }

       }

       return min;

   }

   /*

   public double avgExpense()

   {

       //TODO: complete this method

       //Finds the average of all expenses

   }

   public double totalExpense()

   {

       //TODO: complete this method

       //Finds the sum of all expenses

   }

   public double amountSpentOn(String expItem)

   {

       //TODO: complete this method

       //Finds the amount spent on a particular item

   }

  

   */

}


public class ExpenseListDemo

{

public static void main(String[] args) throws IOException

{

Scanner keyboard = new Scanner(System.in);

System.out.print("Enter the filename to read from: ");

String filename = keyboard.nextLine();

File file = new File(filename);

Scanner inputFile = new Scanner(file);

ExpenseList sepexpenses = new ExpenseList();

String date, desc, cost;

Expense exp=null;

while (inputFile.hasNext())

{

date = inputFile.nextLine();

desc = inputFile.nextLine();

cost = inputFile.nextLine();

exp = new Expense(date, desc, Double.parseDouble(cost));

sepexpenses.add(exp);

}

inputFile.close();

System.out.println("September Expenses");

System.out.println("Max expense: $" + sepexpenses.maxExpense());

System.out.println("Min expense: $" + sepexpenses.minExpense());

//System.out.println("Average expense: $" + sepexpenses.avgExpense());

//System.out.println("The amount spent on groceries: $" + sepexpenses.amountSpentOn("Groceries"));

//System.out.println("Total expense: $" + sepexpenses.totalExpense());

}

}
