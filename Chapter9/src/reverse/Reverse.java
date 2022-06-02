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
Countup
Student 0
Student 1
Student 2
Student 3
Student 4
Student 5
Student 6
Student 7
Student 8
Student 9
 
Countdown
Reverse 9
Reverse 8
Reverse 7
Reverse 6
Reverse 5
Reverse 4
Reverse 3
Reverse 2
Reverse 1
Reverse 0
*/