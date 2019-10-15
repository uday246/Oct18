
public class Test {
  
   public static void main(String[] args){
       Test test = new Test();
       test.writeBackward2("JOHN");
   }
  
   public void writeBackward2(String s){
      
       //base condition to return if the string is empty
       if(s.trim().isEmpty()){
           return;
       }else{
           //recursively call the writeBackward2 method by removing the first character from string
           writeBackward2(s.substring(1));
           System.out.println("About to write first character of "+s);
           System.out.println(s.charAt(0));
       }
   }
}
