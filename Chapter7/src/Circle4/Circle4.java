package Circle4;
/*

Program: RandomNum.java          Last Date of this Revision: 03, 3, 2022

Purpose: Create a RandomNum application that prompts the user for two numbers. 
		 The first is a minimum value and the second is a maximum value.
		 RandomNum than displays an integer between the min and max values entered by the user.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

public class Circle4 {

	public static void main(String[] args) 
	{
		CircleFUNC4 spotA = new CircleFUNC4();
		CircleFUNC4 spotB = new CircleFUNC4(5);
		
		if(spotA.equals(spotB)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are not equal");
		}
		
		System.out.println(" ");
		System.out.println("Circle Radius: "+ spotA.getRadius());
		System.out.println("Circle circumference: "+ spotA.circumference());
		System.out.println(" ");
		System.out.println("Circle Radius: "+ spotB.getRadius());
		System.out.println("Circle circumference: "+ spotB.circumference());
		
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
