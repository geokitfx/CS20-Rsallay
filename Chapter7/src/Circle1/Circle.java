package Circle1;
/*

Program: RandomNum.java          Last Date of this Revision: 03, 3, 2022

Purpose: Create a RandomNum application that prompts the user for two numbers. 
		 The first is a minimum value and the second is a maximum value.
		 RandomNum than displays an integer between the min and max values entered by the user.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

public class Circle {

	public static void main(String[] args) 
	{
		CircleFUNC spot = new CircleFUNC ();
		
		spot.setRadius(3);
		System.out.println("Circle Radius: "+ spot.getRadius());
		System.out.println("Circle circumference: "+ spot.circumference());
		
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
