/*

Program: RandomNum.java          Last Date of this Revision: 03, 3, 2022

Purpose: Create a RandomNum application that prompts the user for two numbers. 
		 The first is a minimum value and the second is a maximum value.
		 RandomNum than displays an integer between the min and max values entered by the user.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RandomNum {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.out.println("Hello and welcome to Rowan's RandomNum application");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("First enter a Minimum Value and then enter a Maximum Value.");
        TimeUnit.SECONDS.sleep(5);
        
        System.out.println("Minimum value: ");
        TimeUnit.SECONDS.sleep(5);
		Scanner scanmin = new Scanner(System.in);
		int min = scanmin.nextInt();
        
        System.out.println("Maximum value:");
        TimeUnit.SECONDS.sleep(5);
		Scanner scanmax = new Scanner(System.in);
        int max = scanmax.nextInt();
        
        scanmin.close();
        scanmax.close();
        
        int a = (int) ((Math.random() * (max - min)) + min);
        
        System.out.println("Random Number is: " + a);
		
		TimeUnit.SECONDS.sleep(5);
    	System.out.println("Program Finished, Thank you for using this Program.");
	}

}

/* Screen Dump

Hello and welcome to Rowan's RandomNum application
First enter a Minimum Value and then enter a Maximum Value.
Minimum value: 
1
Maximum value:
10000
Random Number is: 2831
Program Finished, Thank you for using this Program.

*/