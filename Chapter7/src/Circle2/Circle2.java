package Circle2;
/*

Program: Circle2.java          Last Date of this Revision: 05, 18, 2022

Purpose: Modify the Circle class to include an overloaded constructor that accepts the radius of the Circle object, as shown in the previous section.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

public class Circle2 {

	public static void main(String[] args) 
	{
		CircleFUNC2 spotA = new CircleFUNC2();
		spotA.setRadius(3);
		
		CircleFUNC2 spotB = new CircleFUNC2(5);
		
		System.out.println("Circle Radius: "+ spotA.getRadius());
		System.out.println("Circle circumference: "+ spotA.circumference());
		System.out.println(" ");
		System.out.println("Circle Radius: "+ spotB.getRadius());
		System.out.println("Circle circumference: "+ spotB.circumference());
		
	}

}

/* Screen Dump

Circle Radius: 3.0
Circle circumference: 18.84955592153876
 
Circle Radius: 5.0
Circle circumference: 31.41592653589793

*/
