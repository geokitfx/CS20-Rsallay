import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*

Program: OddSum.java          Last Date of this Revision: 03, 18, 2022

Purpose: Create an OddSum application that prompts the user for a number
 		 and then sums the odd numbers from 1 to the number entered.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

public class OddSum {

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
		
        for (int x = 1; x <= value; x += 2)
        {
        	sum += x;
            System.out.println("Value of x:" + x);
        }
			
        System.out.println("Sum of x: " + sum);
        
        TimeUnit.SECONDS.sleep(2);
    	System.out.println("Program Finished, Thank you for using this Program.");

	}
}

/* Screen Dump

Hello and welcome to Rowan's Numbers Sum application
First enter the max value
Then let the Program work
Max value: 
150
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
Value of x:21
Value of x:23
Value of x:25
Value of x:27
Value of x:29
Value of x:31
Value of x:33
Value of x:35
Value of x:37
Value of x:39
Value of x:41
Value of x:43
Value of x:45
Value of x:47
Value of x:49
Value of x:51
Value of x:53
Value of x:55
Value of x:57
Value of x:59
Value of x:61
Value of x:63
Value of x:65
Value of x:67
Value of x:69
Value of x:71
Value of x:73
Value of x:75
Value of x:77
Value of x:79
Value of x:81
Value of x:83
Value of x:85
Value of x:87
Value of x:89
Value of x:91
Value of x:93
Value of x:95
Value of x:97
Value of x:99
Value of x:101
Value of x:103
Value of x:105
Value of x:107
Value of x:109
Value of x:111
Value of x:113
Value of x:115
Value of x:117
Value of x:119
Value of x:121
Value of x:123
Value of x:125
Value of x:127
Value of x:129
Value of x:131
Value of x:133
Value of x:135
Value of x:137
Value of x:139
Value of x:141
Value of x:143
Value of x:145
Value of x:147
Value of x:149
Sum of x: 5625

*/