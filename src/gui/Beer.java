package gui;

public class Beer
{
   private String name; // the beer's name
   private double alcohol; // the alcohol %, eg, .05 for 5%
  
   public String getName()
   {
	   return name;
   }
  
   public void setName(String n)
   {
	   	this.name = n;
   }
  
   public double getAlcohol()
   {
	   return alcohol;
   }
  
   public void setAlcohol(double a)
   {
	   alcohol  = a;
   }
  
   public double intoxicated(double weight)
    {
    double numDrinks;
    // this is a simplification of the
    // Widmark formula
    numDrinks = (0.08 + 0.015) * weight /
                (12 * 7.5 * alcohol);
    return numDrinks;
    }
  
   public static void main(String[] args)
   {
       Beer beer1 = new Beer();
       Beer beer2 = new Beer();
     
       beer1.setName("Red label");
       beer1.setAlcohol(0.052); // 6.2% alcohol
       
       beer2.setName("Blue label");
       beer2.setAlcohol(0.062); // 6.2% alcohol
     
       
       // use setName and setAlcohol on each of these two beers
       /* your code goes here */
      
      
       double lightWeight = 120; /* set this equal to a light person's weight */
       double heavyWeight = 220; /* set this equal to a heavy person's weight */
      
       // set this equal to the number of drinks to get the light person intoxicated
       // with the first beer, then print that number along with their weight
       /* your code goes here */
       double lightDrinks1 = beer1.intoxicated(lightWeight);
       System.out.println("The number of " + beer1.getName() +
               " drinks needed to make\na person weighing " +
               lightWeight + " pounds intoxicated is " + lightDrinks1);
      
       System.out.println();
              
       double heavyDrinks1 =beer1.intoxicated(heavyWeight);
       
       // set this equal to the number of drinks to get the heavy person intoxicated
       // with the first beer, then print that number along with their weight
       /* your code goes here */
      
       System.out.println("The number of " + beer1.getName() +
               " drinks needed to make\na person weighing " +
               heavyWeight + " pounds intoxicated is " + heavyDrinks1);
       System.out.println();
              
       
       lightWeight = 150.0; // 100 pounds
       heavyWeight = 240.0; // 230 pounds
      
       
       double lightDrinks2 = beer2.intoxicated(lightWeight);
       System.out.println("The number of " + beer2.getName() +
               " drinks needed to make\na person weighing " +
               lightWeight + " pounds intoxicated is " + lightDrinks2);
       // set this equal to the number of drinks to get the light person intoxicated
       // with the second beer, then print that number along with their weight
       /* your code goes here */
      
      
       System.out.println();
              
       double heavyDrinks2 =beer2.intoxicated(heavyWeight);
       System.out.println("The number of " + beer2.getName() +
               " drinks needed to make\na person weighing " +
               heavyWeight + " pounds intoxicated is " + heavyDrinks2);
       // set this equal to the number of drinks to get the heavy person intoxicated
       // with the second beer, then print that number along with their weight
       /* your code goes here */
      
      
       System.out.println();
      
       /* DO NOT MODIFY LINES BELOW THIS COMMENT */
      
       Beer beer3 = new Beer();
       beer3.setName("Miller Genuine Draft Light");
       beer3.setAlcohol(0.042); // 4.2% alcohol
      
       lightWeight = 100.0; // 100 pounds
       heavyWeight = 230.0; // 230 pounds
      
       double lightDrinks3 = beer3.intoxicated(lightWeight);
       System.out.println("The number of " + beer3.getName() +
               " drinks needed to make\na person weighing " +
               lightWeight + " pounds intoxicated is " + lightDrinks3);
       System.out.println();
      
       double heavyDrinks3 = beer3.intoxicated(heavyWeight);
       System.out.println("The number of " + beer3.getName() +
               " drinks needed to make\na person weighing " +
               heavyWeight + " pounds intoxicated is " + heavyDrinks3);
       System.out.println();
   }
}