package squares;

/*
Program: Squares.java          Last Date of this Revision: 05, 30, 2022

Purpose: Create a squares application that stores the square of an element's index in an integer array of 5 elements.
		 For example, the third element, which has index 2, should store 4.
		 The application should then display the value of each element in the array.
		 
		 Index 2 is 3, [0,1,2] so it will be 2x2 and display 4

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		int arrayindexS;
		
		System.out.println("How many Squares?");
		arrayindexS = num.nextInt();
		
			System.out.println("Squares");
		for (int i = 0; i < arrayindexS; i++)
		{
			System.out.println(i+ "²" + " = " + (i*i));
		}
		
		num.close();
	}

}

/*
How many Squares?
5
Squares
0² = 0
1² = 1
2² = 4
3² = 9
4² = 16

*/