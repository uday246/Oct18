package Oct26;

public class TwoLargest{
	  public static void main(String[] args) {
	    System.out.println("Enter the terminating value:");
	    double tValue = IO.readDouble();
	    double a = 0;
	    a=IO.readDouble();
	    double b = 0;
	    b=IO.readDouble();
	 if ((a==tValue)&&(b==tValue)){
	      IO.reportBadInput();
	    System.out.println("Enter another value:");


	    double largest = 0;
	    double sLargest = 0;
	    if (a>b){
	       largest = a;
	      sLargest = b;
	    }
	    else {
	       largest = b;
	      sLargest = a;
	      }
	double c = IO.readDouble();
	    while(c!= tValue){
	      if(c > sLargest){
	      if(c > largest){
	         sLargest = largest;
	          largest = c;
	        }else{
	         sLargest = c;
	        }}
	      double d = IO.readDouble();
	      if(d==tValue){
	        break;}
	        c = d;}
	      IO.outputDoubleAnswer(largest);
	      IO.outputDoubleAnswer(sLargest);
	  }}
