package Oct5th;

import java.io.*;
import java.util.Scanner;

public class Duplicates {

public static void main(String[] args) throws IOException {
Scanner input = new Scanner(System.in);
int duplicates = 0, numElements = 0;
String fileName = "";
String[] roster = new String[25]; //leaving extra room at end of array
  
System.out.print("Welcome!\n\nPlease enter the name of your file: ");
fileName = input.next();
  
numElements = readFileArray(roster, fileName);
insertionSort(roster, numElements);
  
duplicates = removeDuplicates(roster, numElements);

System.out.println("\nI found " + numElements + " names in " + fileName
+ " and " + duplicates + " duplicate names.");
  
System.out.print("\nPlease enter the name of the output file: ");
input.nextLine();
fileName = input.nextLine();
  
printArray(roster, numElements, fileName);
  
System.out.println("\nThe updated roster has now been written to " + fileName + ".");
System.out.println("\nGoodbye!");
  

}
  
/**
* Writes the contents of the array to the specified file
* with each element on its own line
* @param array the list of Strings
* @param numElements the current number of elements in the array
* @param fileName the file name to write the data into
*/
public static void printArray(String[] array,
int numElements, String fileName) throws IOException {

           for (int i = 0; i < numElements; i++) {
               System.out.println(array[i]);
           }
          
           if (fileName != null) {
           PrintWriter outFile = new PrintWriter(fileName);
           int j = 0;
         
       while (j < numElements) {
           for (int m = 0; m < numElements; m++) {
               outFile.println(array[m]);
               j++;
           }
       }

           outFile.close();
       }
}
  
  
/**
* Reads in the contents of a file and stores it as an array
* Also counts the number of elements in the file and returns
* the count
* @param array the list of String values
* @param fileName the name of file to read from
* @return the number of elements in the file
*/
public static int readFileArray(String[] array, String fileName) throws IOException {
   File inFile = new File(fileName);
   Scanner in = new Scanner(inFile);
   int i = 0;
  
   while(in.hasNext()) {
       array[i] = in.nextLine();
       i++;
      
   }
  
   in.close();
  
   return i;
}
  
/**
* Sorts an array of Strings from smallest to largest
* using the insertion sort algorithm
* @param array the list of String values
* @param numElements the current number of elements
*/

public static void insertionSort(String array[], int numElements) {

   for(int i = 1; i <= numElements - 1; i++) {

       String temp = array[i];

       int j = i;

       while (j > 0 && (array[j-1].compareTo(temp) > 0)) {

           array[j] = array[j-1];

           j = j - 1;

       }

       array[j] = temp;

   }

return;

}


  
/**
* Detects and removes duplicate values inside an array
* Calls the remove method each time it finds a duplicate
* @param array the list of String values containing duplicates
* @param numElements the current number of elements stored
* @return the total number of duplicates found
*/
public static int removeDuplicates(String[] array, int numElements) {
   int duplicates = 0;
   for (int i = 0; i < numElements; i++) {
       for (int j = i + 1; j < numElements; j++) {
    	   if(array[i]==null || array[j]==null)
    		   continue;
           if (array[i].equals(array[j])) {
               duplicates++;
               remove(array, numElements, i);
           }
       }
   }
       return duplicates;
}
  
/**
* Removes an element from an array at a specified index
* @param array the list of String values
* @param numElements the current number of elements stored
* @param indexToRemove where in the array to remove the element
*/
  
public static void remove(String array[], int numElements, int indexToRemove) {
   for(int i = indexToRemove; i < array.length-1; ++i) {
array[i] = array[i+1];
}
}
  
  
} //end of main
