package ex1MySavings;

import java.awt.*;
import javax.swing.*;

public class MySavingsGUI {

	public static void main(String[] args) {
		 
		JFrame frame = new JFrame();
		frame.setForeground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(new Point(10, 50));
		frame.setSize(new Dimension(1600, 900)); // W,H
		frame.setTitle("Time Converter");
		frame.setVisible(true);
//---------------------------------------------------------------// 
		JButton tot = new JButton();
		tot.setText("Total $");
		tot.setBackground(Color.WHITE);
		tot.setBounds(0,0,150, 40);   // X,Y L,W
		frame.setLayout(null); 
		frame.setVisible(true);
		tot.addActionListener(new MSTotal());
//---------------------------------------------------------------// 
		JButton adp = new JButton();
		adp.setText("Add a Penny");
		adp.setBackground(Color.WHITE);
		adp.setBounds(0,0,150, 40);   // X,Y L,W
		frame.setLayout(null); 
		frame.setVisible(true);
		adp.addActionListener(new MSPenny());
//---------------------------------------------------------------// 
		JButton adn = new JButton();
		adn.setText("Add a Nickel");
		adn.setBackground(Color.WHITE);
		adn.setBounds(0,40,150, 40);   
		frame.setLayout(null); 
		frame.setVisible(true);
		adn.addActionListener(new MSNickel());
//---------------------------------------------------------------// 
		JButton add = new JButton();
		add.setText("Add a Dime");
		add.setBackground(Color.WHITE);
		add.setBounds(150,0,150, 40);   
		frame.setLayout(null); 
		frame.setVisible(true);
		add.addActionListener(new MSDime());
//---------------------------------------------------------------//
		JButton adq = new JButton();
		adq.setText("Add a Quarter");
		adq.setBackground(Color.WHITE);
		adq.setBounds(150,40,150, 40);   
		frame.setLayout(null); 
		frame.setVisible(true);
		adq.addActionListener(new MSQuarter());
//---------------------------------------------------------------//
		JButton sub = new JButton();
		sub.setText("Withdraw $");
		sub.setBackground(Color.WHITE);
		sub.setBounds(150,40,150, 40);   
		frame.setLayout(null); 
		frame.setVisible(true);
		sub.addActionListener(new MSWithdraw());
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
