
import java.util.Arrays;
public class MyClass {
  
   public static void main(String[] args)
   {
       int[] numbers = {5,3,2,9,3,15,22};
       int res[]=new int[numbers.length-1];
       int i,temp;
       System.out.println(Arrays.toString(numbers));
       int n=numbers.length;
       int j=0;
       for(i=0;i<n-1;i++){
    	   res[j++]=numbers[i]+numbers[i+1];
       }
           
       System.out.println(Arrays.toString(res));
   }
}