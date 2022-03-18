import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*

Program: NumbersSum.java          Last Date of this Revision: 03, 18, 2022

Purpose: Create a NumbersSum application that prompts the user for a number 
		 and then displays the numbers 1 trough the number entered, 
		 each on a separate line. Below the numbers, the sum is displayed.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

public class NumbersSum {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Hello and welcome to Rowan's Numbers Sum application");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("First enter the max value");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Then let the Program work");
        TimeUnit.SECONDS.sleep(2);
        
        System.out.println("Max value: ");
        TimeUnit.SECONDS.sleep(3);
		Scanner mvalue = new Scanner(System.in);
		int value = mvalue.nextInt(), sum = 0;
		
		mvalue.close();
		
        for (int x = 1; x <= value; x++)
        {	
        	sum += x;
        	System.out.println("Value of x: " + x);
        }
			
        System.out.println("Sum of x:  " + sum);

	}
}

/* Screen Dump



*/