package studentRoster;

/*
Program: StudentRoster.java          Last Date of this Revision: 05, 30, 2022

Purpose: Create a StudentRoster application that prompts the user for the number of students in the class,
 		 and them prompts the user for each students names and stores the name in an array.
 		 After all the names have been entered, the application should display the title "Student Roster" and then List the names in the array.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		Scanner name = new Scanner(System.in);
		int arrayindexS;
		String[] ROSTER;
		
		System.out.println("How many Students?");
		arrayindexS = num.nextInt();
		ROSTER = new String[arrayindexS];
		
		for (int n = 0; n < arrayindexS; n++)
		{
			System.out.println("Student Names?");
			String studentName = name.nextLine();
			ROSTER[n] = studentName;
		}
		
			System.out.println("Student Roster");
		for (int i = 0; i < arrayindexS; i++)
		{
			System.out.println("Student "+ i +": "+ROSTER[i]);
		}
		
		num.close();
		name.close();
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