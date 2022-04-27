package exercise5;

/*

Program: AddCoins.java          Last Date of this Revision: 04, 19, 2022

Purpose: Create an AddCoins application that prompts the user for the number of Pennies, Nickels, Dimes, and Quarters, and then displays their total dollar amount.
		 The AddCoins application should include a getDollarAmount() method that has four int Parameters corresponding to the number of,
		 Pennies, Nickels, Dimes, and Quarters, and returns a String that corresponds to the dollar value of the coins.
		 Note that the String returned should include the currency sign ($).

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20

*/

import java.util.Scanner;

public class AddCoins {
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	
	static void getDollarAmount() 
	{
		System.out.println("Quarters: ");
		Scanner qvalue = new Scanner(System.in);
		int qnum = qvalue.nextInt();
		
		System.out.println("Dimes: ");
		Scanner dvalue = new Scanner(System.in);
		int dnum = dvalue.nextInt();
		
		System.out.println("Nickels: ");
		Scanner nvalue = new Scanner(System.in);
		int nnum = nvalue.nextInt();
		
		System.out.println("Pennies: ");
		Scanner pvalue = new Scanner(System.in);
		int pnum = pvalue.nextInt();
		
		qvalue.close();
		dvalue.close();
		nvalue.close();
		pvalue.close();
		
		double qvt = round(qnum * 0.25, 2);
		double dvt = round(dnum * 0.10, 2);
		double nvt = round(nnum * 0.05, 2);
		double pvt = round(pnum * 0.01, 2);
		
		System.out.println("Quarters: " + qvt);
		System.out.println("Dimes: " + dvt);
		System.out.println("Nickels: " + nvt);
		System.out.println("Pennies: " + pvt);
		
		double total = qvt + dvt + nvt + pvt;
		
		System.out.println("Total: $" + total);
	    
	}
	
	static void mathMATH() 
	{	
		System.out.println("M.A.T.H");
		System.out.println("Mental");
		System.out.println("Abuse");
		System.out.println("To");
		System.out.println("Humans");
		System.out.println("I may be a computer by why mentally abuse your self?");
	}

	public static void main(String[] args) {	
		System.out.println("1. Use [Add coins] ");
		System.out.println("2. Don't use [Add coins] ");
		
		System.out.println("Enter your choice: ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		if (choice == 1){
			getDollarAmount();
		} else {
			mathMATH();
		}
		input.close();
	}
	
}

/* Screen Dump

1. Use [Add coins] 
2. Don't use [Add coins] 
Enter your choice: 
1
Quarters: 
1
Dimes: 
2
Nickels: 
3
Pennies: 
4
Quarters: 0.25
Dimes: 0.2
Nickels: 0.15
Pennies: 0.04
Total: $0.64

1. Use [Add coins] 
2. Don't use [Add coins] 
Enter your choice: 
2
M.A.T.H
Mental
Abuse
To
Humans
I may be a computer by why mentally abuse your self?

*/