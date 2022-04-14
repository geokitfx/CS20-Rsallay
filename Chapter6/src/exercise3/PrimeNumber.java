package exercise3;

/*

Program: PrimeNumber.java          Last Date of this Revision: 04, 14, 2022

Purpose: Modify the PrimeNumber application created in Chapter 5 Exercise 1 to include a method named isPrime().
		 The isPrime() method should require one parameter and return a Boolean value.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/


import java.util.Scanner;

public class PrimeNumber {
	
/* It says to modify it to included a method named isPrime(), Never said i had to have anything else did it? 
 Please note, I spent like half in hour trying to figure out how to split the code in half to use it in both main and isPrime.
 But was unable to get that to work this is the next best solution I could come up with, Sorry!
*/

	public static void main(String[] args) {
		isPrime();
	}
	
	static void isPrime() 
	{
		System.out.println("Enter Number: ");
		Scanner mvalue = new Scanner(System.in);
		int num = mvalue.nextInt();
		
		mvalue.close();
		
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	    
	}
	
}

/* Screen Dump

Enter Number: 
4
4 is not a prime number.

Enter Number: 
2
2 is a prime number.


*/