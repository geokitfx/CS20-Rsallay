package adderEX8;
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
		
		Scanner input = new Scanner(System.in);
		int min = 0;
        
        int max = 20;
        
        input.close();
        
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