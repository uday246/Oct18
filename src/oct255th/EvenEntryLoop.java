package oct255th;

import javax.swing.JOptionPane;

public class EvenEntryLoop {
public static void main(String[] args) {
	for(;;){
	    String name=JOptionPane.showInputDialog(null,"Enter even number, 999 exit");
	    if(name.equals("999"))
	    	break;
	    int n = Integer.parseInt(name);
	    if(n%2==0)
	        JOptionPane.showMessageDialog(null,"Good job!","Alert",JOptionPane.INFORMATION_MESSAGE);     
	    else
	    	JOptionPane.showMessageDialog(null,"Please type even number inly ","Alert",JOptionPane.ERROR_MESSAGE);
	}
}
}
