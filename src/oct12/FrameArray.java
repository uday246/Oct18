package oct12;

import javax.swing.JFrame;

public class FrameArray {
public static void main(String[] args) {
	JFrame js[][]=new JFrame[10][10];
	for(int i=0;i<js.length;i++){
		for(int j=0;j<js[i].length;j++){
			// creating frame
			js[i][j]= new JFrame();
			// setting size
			js[i][j].setSize(200,200);
			// setting location
			js[i][j].setLocation(i*200, j*200);
			js[i][j].setVisible(true);
		}
	}
}
}
