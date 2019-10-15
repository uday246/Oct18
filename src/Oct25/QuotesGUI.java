package Oct25;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class QuotesGUI {  
static    JFrame frame = new JFrame("JFrame Example");  
static String quotes[]={"Morning sun brings new energies to me!","Just the thought of you brightens up my morning.","Without me, my coffee is useless.","Mission one accomplished.. I woke up.","Add life to your days not days to your life."};
	
public static void main(String s[]) {  
        JPanel panel = new JPanel();  
        panel.setLayout(null);  
        final JLabel label1 = new JLabel(quotes[0]);  
        label1.setBounds(200, 50, 400, 30);
        
        JButton quote = new JButton();  
        quote.setText("Get Quote");  
        quote.setBounds(200, 150, 100, 20);

        quote.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	label1.setText(quotes[(int) (System.currentTimeMillis()%5)]);
            }
        });
        panel.add(quote);
        panel.add(label1);
        frame.add(panel);
        frame.setSize(600, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  

