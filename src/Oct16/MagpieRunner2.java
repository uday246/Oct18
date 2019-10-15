package Oct16;

import java.util.Scanner;

class Magpie2{
        /**
         * Get a default greeting       
         * @return a greeting
         */
        public String getGreeting()
        {
                return "Hello, let's talk.";
        }
        
        /**
         * Gives a response to a user statement
         * 
         * @param statement
         *            the user statement
         * @return a response based on the rules given
         */
        public String getResponse(String statement)
        {
                String response = "";
                if (statement.indexOf("no") >= 0)
                {
                        response = "Why so negative?";
                }
                else if (statement.indexOf("mother") >= 0
                                || statement.indexOf("father") >= 0
                                || statement.indexOf("sister") >= 0
                                || statement.indexOf("brother") >= 0)
                {
                        response = "Tell me more about your family.";
                }
                else if(statement.toLowerCase().contains("cat")||statement.toLowerCase().contains("dog")){
                	response="Tell me more about your pets";
                }
                else
                {
                        response = getRandomResponse();
                }
                return response;
        }

        /**
         * Pick a default response to use if nothing else fits.
         * @return a non-committal string
         */
        private String getRandomResponse()
        {
                final int NUMBER_OF_RESPONSES = 4;
                double r = Math.random();
                int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
                String response = "";
                
                if (whichResponse == 0)
                {
                        response = "Interesting, tell me more.";
                }
                else if (whichResponse == 1)
                {
                        response = "Hmmm.";
                }
                else if (whichResponse == 2)
                {
                        response = "Do you really think so?";
                }
                else if (whichResponse == 3)
                {
                        response = "You don't say.";
                }

                return response;
        }
}
public class MagpieRunner2
{

        /**
         * Create a Magpie, give it user input, and print its replies.
         */
        public static void main(String[] args)
        {
                Magpie2 maggie = new Magpie2();
                
                System.out.println (maggie.getGreeting());
                Scanner in = new Scanner (System.in);
                String statement = in.nextLine();
                
                while (!statement.equals("Bye"))
                {
                        System.out.println (maggie.getResponse(statement));
                        statement = in.nextLine();
                }
        }

}