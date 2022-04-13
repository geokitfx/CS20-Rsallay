import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class DTH implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			int choice = JOptionPane.showConfirmDialog(null, "Confirm?");
			if (choice == JOptionPane.YES_OPTION) { 
				String ageText = JOptionPane.showInputDialog(null, "How many days?");
				int days = Integer.parseInt(ageText);
				
				int hours = days * 24;
				
				JOptionPane.showMessageDialog(null, "You inputed " + days + " Day's, Thats " + hours + "Hours!");
				 } 
			else 
			{ // choice == NO_OPTION or CANCEL_OPTION
				 JOptionPane.showMessageDialog(null, "Then why did you pick me?");
				 }
		}
}