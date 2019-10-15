package Oct16;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class VendorPricesReader
{

public static void main(String[] args) throws IOException
{
  /*
   * Create a Java program that reads the contents of the text given file (vendorPrices.csv).
   * Read the file line by line using @Scanner
   * @parse each int into an array
   */
  
  try(FileInputStream file = new FileInputStream("vendorPrice.csv");)
  {
        Scanner sr = new Scanner(file);
        String line = sr.nextLine();
        sr.useDelimiter(","); // delimit by line
        System.out.println(line);
        String arr[]= line.split(",");
        for(String s:arr)
        	System.out.println(s);
  }
}

}