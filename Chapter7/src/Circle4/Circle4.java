package Circle4;
/*

Program: Circle4.java          Last Date of this Revision: 05, 18, 2022

Purpose: Modify the Circle class to override the equals and toString methods, as shown in the previous section.
		 Modify the existing client code to test the new methods.

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

Objects are not equal
 
Circle Radius: 1.0
Circle circumference: 6.283185307179586
 
Circle Radius: 5.0
Circle circumference: 31.41592653589793

*/
