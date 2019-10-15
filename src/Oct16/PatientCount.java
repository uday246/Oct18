package Oct16;

import javax.swing.JOptionPane;

public class PatientCount {
	public static void main(String[] args) {
		String location;
		String type = "";
		String name = "";
		String surgeon = "";
		double fee = 0, max = -1;
		String maxDoc = "", maxLoc = "",max_name="";
		int agh_count = 0, upmc_count = 0;
		double agh_fee = 0, umpc_fee = 0;
		int knee_count = 0, hip_count = 0;
		int johnson_count = 0, atkins_count = 0, smith_count = 0;
		
		
		while (!name.equalsIgnoreCase("Quit")) {
			name = JOptionPane.showInputDialog(null, "Enter the name of the patient", "Input",
					JOptionPane.QUESTION_MESSAGE);
			location = JOptionPane.showInputDialog(null, "Enter the Location of the surgery", "Input",
					JOptionPane.QUESTION_MESSAGE);
			type = JOptionPane.showInputDialog(null, "Enter the The type of surgery (Knee or Hip)   ", "Input",
					JOptionPane.QUESTION_MESSAGE);
			fee = Double.parseDouble(JOptionPane.showInputDialog(null, "Fee paid by the insurance  ", "Input",
					JOptionPane.QUESTION_MESSAGE));
			surgeon = JOptionPane.showInputDialog(null, "Name of the Surgeon (Johnson, Atkins or Smith) ", "Input",
					JOptionPane.QUESTION_MESSAGE);

			

			if (max < fee) {
				max = fee;
				maxDoc = surgeon;
				maxLoc = location;
				max_name=name;
			}
			if (surgeon.equalsIgnoreCase("Johnson"))
				johnson_count++;
			if (surgeon.equalsIgnoreCase("Atkins"))
				atkins_count++;
			if (surgeon.equalsIgnoreCase("Smith"))
				smith_count++;

			if (location.equals("AGH")) {
				agh_count = agh_count + 1;
				agh_fee += fee;
			} else {
				upmc_count++;
				umpc_fee += fee;
			}
			if (type.equalsIgnoreCase("knee"))
				knee_count++;
			else
				hip_count++;
		}
		
		System.out.println("Count of knee surgeries : "+knee_count);
		System.out.println("Count of hip surgeries : "+hip_count);
		System.out.println("Average fee paid at AGH : "+(agh_fee/agh_count));
		System.out.println("Average fee paid at UMPC : "+(umpc_fee/upmc_count));
		System.out.println("Johnson surgeries count : "+johnson_count);
		System.out.println("Atkins surgeries count : "+atkins_count);
		System.out.println("Smith surgeries count : "+smith_count);
		if(johnson_count>atkins_count && johnson_count>smith_count){
			System.out.println("Most surgeries done by Johnson");
		}
		else if(atkins_count>smith_count){
			System.out.println("Most surgeries done by Atkins");
		}
		else{
			System.out.println("Most surgeries done by Smith");
			
		}
		System.out.println("Most fee paid by insurance : "+max_name+", Surgeon : "+maxDoc+" at location "+maxLoc);
		
		
	}
}
