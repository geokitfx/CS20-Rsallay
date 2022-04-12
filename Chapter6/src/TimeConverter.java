import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/*

Program: TimeConverter.java          Last Date of this Revision: 04, 11, 2022

Purpose: Create a TimeCoverter application that allows the use to choose among converting hours to minutes,
		 days to hours, minutes to hours, or hours to days. Use methods as appropriate.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

public class TimeConverter {

	public static void main(String[] args) {
		 
		JFrame frame = new JFrame();
		frame.setForeground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(new Point(10, 50));
		frame.setSize(new Dimension(1600, 900)); // W,H
		frame.setTitle("Time Converter");
		frame.setVisible(true);
//---------------------------------------------------------------// 
		JButton htm = new JButton();
		htm.setText("Hours to Minutes");
		htm.setBackground(Color.WHITE);
		htm.setBounds(0,0,150, 40);   // X,Y L,W
		frame.setLayout(null); 
		frame.setVisible(true);
		htm.addActionListener(new HTM());
//---------------------------------------------------------------// 
		JButton dth = new JButton();
		dth.setText("Days to Hours");
		dth.setBackground(Color.WHITE);
		dth.setBounds(0,40,150, 40);   
		frame.setLayout(null); 
		frame.setVisible(true);
		dth.addActionListener(new DTH());
//---------------------------------------------------------------// 
		JButton mth = new JButton();
		mth.setText("Minutes to Hours");
		mth.setBackground(Color.WHITE);
		mth.setBounds(150,0,150, 40);   
		frame.setLayout(null); 
		frame.setVisible(true);
		mth.addActionListener(new MTH());
//---------------------------------------------------------------//
		JButton htd = new JButton();
		htd.setText("Hours to Days");
		htd.setBackground(Color.WHITE);
		htd.setBounds(150,40,150, 40);   
		frame.setLayout(null); 
		frame.setVisible(true);
		htd.addActionListener(new HTD());
//---------------------------------------------------------------//
		frame.setLayout(new FlowLayout());
		frame.add(htm);
		frame.add(dth);
		frame.add(mth);
		frame.add(htd);
//---------------------------------------------------------------//
	}
}



/*



*/
