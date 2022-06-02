package reverse;

/*
Program: StudentRoster.java          Last Date of this Revision: 06, 2, 2022

Purpose: Create a reverse application that stores the number corresponding to the elements index in an integer array of 10 elements.
		 For example, the second element, which has index 1, should store 1.
		 The application should then display the title "Countdown" and the list the numbers stored in the array in reverse order.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/


public class Reverse {

	public static void main(String[] args) {
		
		int arrayindexS = 10;
		
		System.out.println("Countup");
		for (int i = 0; i < arrayindexS; i++)
		{
			System.out.println("Student " + i);
		}
		
		System.out.println(" ");
		
		System.out.println("Countdown");
		for (int n = arrayindexS-1; n >= 0; n--)
		{
			System.out.println("Reverse "+ n);
		}
		
	}
}

/*
How many Students?
5
Student Names?
Wilbur
Student Names?
Techno
Student Names?
Dream
Student Names?
Tommy
Student Names?
Ranboo
Student Roster
Student 0: Wilbur
Student 1: Techno
Student 2: Dream
Student 3: Tommy
Student 4: Ranboo
*/