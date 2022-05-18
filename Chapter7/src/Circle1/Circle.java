package Circle1;
/*

Program: Circle.java           Last Date of this Revision: 05, 18, 2022

Purpose: Modify the Circle class to include a member method named [circumference].
		 The circumference() method should return the circumference of the circle (2PIr).

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

Circle Radius: 3.0
Circle circumference: 18.84955592153876


*/
