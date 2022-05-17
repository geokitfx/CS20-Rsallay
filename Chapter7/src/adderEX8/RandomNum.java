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
		System.out.println("Max value: ");
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		
		int min = 0;
        
        int max = 20;
        
        input.close();
        
        int a = (int) ((Math.random() * (max - min)) + min);
        
        if(value == a) {
			
		} else {
			System.out.println("Objects are not equal");
		}
        
        System.out.println("Random Number is: " + a);
		
		TimeUnit.SECONDS.sleep(5);
    	System.out.println("Program Finished, Thank you for using this Program.");
    	
    	int mina = 1;
		int maxa = 20;
		int increment = 1;
        
        // Exit when x becomes greater than 4
        for (int i = mina; i <= maxa; i += increment)
        {
            System.out.println("Value of x:" + i);
        }
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