package Oct14;

import java.util.Scanner;
import java.util.regex.*;

public class RegExTester {
   static String r, s;
   static Pattern pattern;
   static Matcher matcher;
   static boolean match, validRegex, doneMatching;
   static Scanner scanner = new Scanner(System.in);
    
   public static void main(String[] args)
   {
     
      System.out.println("Welcome to the "
        + "Regex Tester for the 2043 Human Class Project\n");
      do
      {
         do
         {
             System.out.print("\nEnter the regex specified by the 2043 programmer:  ");
             r = scanner.nextLine();
             validRegex = true;
             try
             {
                pattern = Pattern.compile(r);
             }
             catch (PatternSyntaxException pse)
             {
                System.out.println(pse.getMessage());
                validRegex = false;
             }
         } while (!validRegex);
         doneMatching = false;
         while (!doneMatching)
         {
             try
             {
                System.out.print("Enter the string to be matched: ");
                s = scanner.nextLine();
                if (s.length() == 0)
                   doneMatching = true;
                else
                {
                   matcher = pattern.matcher(s);
                   if (matcher.matches())
                   {
                       System.out.println("It's a match.");
                       doneMatching = true;
                   }
                   else
                      throw new IllegalArgumentException("Sorry, not a match!");
                }
             }
             catch (IllegalArgumentException iae)
             {
                System.out.println(iae.getMessage());
                validRegex = false;
             }
         }
      } while (tryAgain());
      System.out.println("Thanks! See you again soon, I hope.");
      System.exit(0);
    }
    private static boolean tryAgain()
    {
       System.out.print("Do you want to give it another try? (Y or N) ");
       String reply = scanner.nextLine();
       if (reply.equalsIgnoreCase("Y"))
          return true;
       return false;
    }
}