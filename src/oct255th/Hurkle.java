package oct255th;

import java.util.Random;
import java.util.Scanner;

public class Hurkle

{

       public static void main(String[] args) {

              // TODO Auto-generated method stub

              // gets user input for the keyboard

              Scanner input = new Scanner(System.in);

              //Gets a random number between 0 and 1

              Random ran = new Random();

              //variable to hold the users' guess

              int usersAnswer;

              final int LIMIT = 10;

              //variable to hold the system random number

              int rGuess;

              rGuess = ran.nextInt(LIMIT);

              // Here we are creating an array of one character strings into a String variable named 'display'

              String[] display ={"0","1","2","3","4","5","6","7","8","9","10"};

              System.out.println("You get 3 tries to win!");

              // Tell the user how many tries they will get

              for(int tries = 0; tries < 3; tries++) {

                     //ask the user for a guess

                     System.out.println("What is your number guess?" + '\n');

                     //using the scanner class, get the user guess

                     usersAnswer = input.nextInt();

                     if(usersAnswer == rGuess){

                           System.out.print("Bingo, you win!" + '\n');

                           tries = 9999;       // 9999 is used because it is so far out of bounds it has to get out of the game

                     } else if (usersAnswer < rGuess){

                           display[usersAnswer] = ">";

                           // replace the user guessed number with feedback: greater than, this is saving the feedback

                     } else{      // so it doesn't get lost for the user

                           display[usersAnswer ] = "<";

                           // replace the user guessed number with feedback: less than

                     }

                     // Display the number line with feedback

                     System.out.print("Feedback : ");

                     for(int i=0;i<display.length;i++){

                           System.out.print( display[i] + " " );

                     }

              } // end of for loop for the game

              System.out.println('\n');

              System.out.println( "Game Over, 3 tries you lose! The number was " + rGuess); // 3 tries you lose

       }

}