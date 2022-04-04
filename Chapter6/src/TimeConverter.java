import javax.swing.*;

/*

Program: AccountSetup.java          Last Date of this Revision: 03, 28, 2022

Purpose: Create an AccountSetup application that prompts the user for a user name and a password.
		 The application should prompt the user until a password with at least eight characters is entered.
		 The user name and password should be converted to all lower case letters and then an appropriate message displayed.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

public class TimeConverter {

	public static void main(String[] args) {
		 
		 String name = JOptionPane.showInputDialog(null,
		 "What is your name?");
		 
		 int choice = JOptionPane.showConfirmDialog(null, "Do you like cake, " + name + "?");
		 
		 if (choice == JOptionPane.YES_OPTION) 
		 {
		 JOptionPane.showMessageDialog(null, "Of course! Who doesn't?");
		 } 
		 else 
		 { 
		 JOptionPane.showMessageDialog(null, "We'll have to agree to disagree.");
		 }
	}
}



/*



*/
