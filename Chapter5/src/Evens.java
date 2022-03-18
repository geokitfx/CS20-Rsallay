/*

Program: Evens.java          Last Date of this Revision: 03, 18, 2022

Purpose: Create an Evens application that displays the even numbers between 1 and 20, inclusive.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

public class Evens {

	public static void main(String[] args) 
	{
        
		int min = 1;
		int max = 20;
		int increment = 2;
        
        // Exit when x becomes greater than 4
        for (int i = min; i <= max; i += increment)
        {
            System.out.println("Value of x:" + i);
        }

	}

}

/* Screen Dump

Evens

Value of x:2
Value of x:4
Value of x:6
Value of x:8
Value of x:10
Value of x:12
Value of x:14
Value of x:16
Value of x:18
Value of x:20

UnEvens

Value of x:1
Value of x:3
Value of x:5
Value of x:7
Value of x:9
Value of x:11
Value of x:13
Value of x:15
Value of x:17
Value of x:19

*/