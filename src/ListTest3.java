import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class ListTest3 {

   public static void main( String[] args ) {

      LinkedList< Integer > list = new LinkedList< Integer >();
      Random r = new Random();
      int sum=0,val=0;
      for(int i=0;i<25;i++){
    	  // generating random elements 1-100
    	  val = r.nextInt(100);
    	  // finding sum of elements
    	  sum+=val;
    	  list.add(val);
      }
      System.out.println("Before After sort: "+list);
      // sorting the list
      Collections.sort(list);
      System.out.println("Elements After sort: "+list);
      System.out.println("Sum of elements : "+sum);
      System.out.println("Average of elements "+(sum/25.0));


   }

} 