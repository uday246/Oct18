using System;

class FindSquareRoot {
  public static void Main (string[] args) {
    Console.WriteLine("Enter number");
   double d =Convert.ToDouble(Console.ReadLine());
   double sqrt=0;
   if(d<0){
   throw new ApplicationException("Value can not be negative");
   }
        sqrt = Math.Sqrt(d); 
        Console.WriteLine("Squreroot of number : "+sqrt);
  }
}