import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*

Program: NumbersSum.java          Last Date of this Revision: 03, 18, 2022

Purpose: Create a NumbersSum application that prompts the user for a number 
		 and then displays the numbers 1 trough the number entered, 
		 each on a separate line. Below the numbers, the sum is displayed.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

public class NumbersSum {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Hello and welcome to Rowan's Numbers Sum application");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("First enter the max value");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Then let the Program work");
        TimeUnit.SECONDS.sleep(2);
        
        System.out.println("Max value: ");
        TimeUnit.SECONDS.sleep(3);
		Scanner mvalue = new Scanner(System.in);
		int value = mvalue.nextInt(), sum = 0;
		
		mvalue.close();
		
        for (int x = 1; x <= value; x++)
        {	
        	sum += x;
        	System.out.println("Value of x: " + x);
        }
			
        System.out.println("Sum of x:  " + sum);
        
        TimeUnit.SECONDS.sleep(2);
    	System.out.println("Program Finished, Thank you for using this Program.");

	}
}

/* Screen Dump

Hello and welcome to Rowan's Numbers Sum application
First enter the max value
Then let the Program work
Max value: 
100
Value of x: 1
Value of x: 2
Value of x: 3
Value of x: 4
Value of x: 5
Value of x: 6
Value of x: 7
Value of x: 8
Value of x: 9
Value of x: 10
Value of x: 11
Value of x: 12
Value of x: 13
Value of x: 14
Value of x: 15
Value of x: 16
Value of x: 17
Value of x: 18
Value of x: 19
Value of x: 20
Value of x: 21
Value of x: 22
Value of x: 23
Value of x: 24
Value of x: 25
Value of x: 26
Value of x: 27
Value of x: 28
Value of x: 29
Value of x: 30
Value of x: 31
Value of x: 32
Value of x: 33
Value of x: 34
Value of x: 35
Value of x: 36
Value of x: 37
Value of x: 38
Value of x: 39
Value of x: 40
Value of x: 41
Value of x: 42
Value of x: 43
Value of x: 44
Value of x: 45
Value of x: 46
Value of x: 47
Value of x: 48
Value of x: 49
Value of x: 50
Value of x: 51
Value of x: 52
Value of x: 53
Value of x: 54
Value of x: 55
Value of x: 56
Value of x: 57
Value of x: 58
Value of x: 59
Value of x: 60
Value of x: 61
Value of x: 62
Value of x: 63
Value of x: 64
Value of x: 65
Value of x: 66
Value of x: 67
Value of x: 68
Value of x: 69
Value of x: 70
Value of x: 71
Value of x: 72
Value of x: 73
Value of x: 74
Value of x: 75
Value of x: 76
Value of x: 77
Value of x: 78
Value of x: 79
Value of x: 80
Value of x: 81
Value of x: 82
Value of x: 83
Value of x: 84
Value of x: 85
Value of x: 86
Value of x: 87
Value of x: 88
Value of x: 89
Value of x: 90
Value of x: 91
Value of x: 92
Value of x: 93
Value of x: 94
Value of x: 95
Value of x: 96
Value of x: 97
Value of x: 98
Value of x: 99
Value of x: 100
Sum of x:  5050

*/