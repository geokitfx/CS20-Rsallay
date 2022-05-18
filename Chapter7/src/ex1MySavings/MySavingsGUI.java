package ex1MySavings;
/*

Program: MySavingsGUI.java           Last Date of this Revision: 05, 18, 2022

Purpose: Create a MySavings application that displays a menu of choices for entering
 		 Pennies, Nickels, Dimes and Quarters into a piggy bank and then prompts the users to make a selection.
 		 The MySavings application should include a PiggyBank Object that can add coins to the piggy bank,
 		 Remove coins, and return the total amount in the bank.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.awt.*;
import javax.swing.*;

public class MySavingsGUI {

	public static void main(String[] args) {
		MSMathFRAME frameWork = new MSMathFRAME();
		 
		JFrame frame = new JFrame();
		frame.setForeground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(new Point(10, 50));
		frame.setSize(new Dimension(1600, 900)); // W,H
		frame.setTitle("My Savings");
		frame.setVisible(true);
//---------------------------------------------------------------// 
		JButton tot = new JButton();
		tot.setText("Total $");
		tot.setBackground(Color.WHITE);
		tot.setBounds(0,0,150, 40);   // X,Y L,W
		frame.setLayout(null); 
		frame.setVisible(true);
		tot.addActionListener(new MSTotal(frameWork));
//---------------------------------------------------------------// 
		JButton adp = new JButton();
		adp.setText("Add a Penny");
		adp.setBackground(Color.WHITE);
		adp.setBounds(0,0,150, 40);   // X,Y L,W
		frame.setLayout(null); 
		frame.setVisible(true);
		adp.addActionListener(new MSPenny(frameWork));
//---------------------------------------------------------------// 
		JButton adn = new JButton();
		adn.setText("Add a Nickel");
		adn.setBackground(Color.WHITE);
		adn.setBounds(0,40,150, 40);   
		frame.setLayout(null); 
		frame.setVisible(true);
		adn.addActionListener(new MSNickel(frameWork));
//---------------------------------------------------------------// 
		JButton add = new JButton();
		add.setText("Add a Dime");
		add.setBackground(Color.WHITE);
		add.setBounds(150,0,150, 40);   
		frame.setLayout(null); 
		frame.setVisible(true);
		add.addActionListener(new MSDime(frameWork));
//---------------------------------------------------------------//
		JButton adq = new JButton();
		adq.setText("Add a Quarter");
		adq.setBackground(Color.WHITE);
		adq.setBounds(150,40,150, 40);   
		frame.setLayout(null); 
		frame.setVisible(true);
		adq.addActionListener(new MSQuarter(frameWork));
//---------------------------------------------------------------//
		JButton sub = new JButton();
		sub.setText("Withdraw $");
		sub.setBackground(Color.WHITE);
		sub.setBounds(150,40,150, 40);   
		frame.setLayout(null); 
		frame.setVisible(true);
		sub.addActionListener(new MSWithdraw(frameWork));
//---------------------------------------------------------------//
		frame.setLayout(new FlowLayout());
		frame.add(tot);
		frame.add(adp);
		frame.add(adn);
		frame.add(add);
		frame.add(adq);
		frame.add(sub);
//---------------------------------------------------------------//

	}
}

/* Screen Dump

There is no screen dump for it is a program and i have no idea how to get one for it.

*/
