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
		JButton htm = new JButton();
		htm.setText("Hours to Minutes");
		htm.setBackground(Color.WHITE);
		htm.setBounds(0,0,150, 40);   // X,Y L,W
		frame.setLayout(null); 
		frame.setVisible(true);
		htm.addActionListener(new MSPenny());
//---------------------------------------------------------------// 
		JButton dth = new JButton();
		dth.setText("Days to Hours");
		dth.setBackground(Color.WHITE);
		dth.setBounds(0,40,150, 40);   
		frame.setLayout(null); 
		frame.setVisible(true);
		dth.addActionListener(new MSNickel());
//---------------------------------------------------------------// 
		JButton mth = new JButton();
		mth.setText("Minutes to Hours");
		mth.setBackground(Color.WHITE);
		mth.setBounds(150,0,150, 40);   
		frame.setLayout(null); 
		frame.setVisible(true);
		mth.addActionListener(new MSDime());
//---------------------------------------------------------------//
		JButton htd = new JButton();
		htd.setText("Hours to Days");
		htd.setBackground(Color.WHITE);
		htd.setBounds(150,40,150, 40);   
		frame.setLayout(null); 
		frame.setVisible(true);
		htd.addActionListener(new MSQuarter());
//---------------------------------------------------------------//
		frame.setLayout(new FlowLayout());
		frame.add(htm);
		frame.add(dth);
		frame.add(mth);
		frame.add(htd);
//---------------------------------------------------------------//

	}
}
