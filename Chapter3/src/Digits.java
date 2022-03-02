/*

Program: Digits.java          Last Date of this Revision: 02, 22, 2022

Purpose: Create a Digits application that prompts the user for a number then displays the one's ten's hundred's ETc place.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Digits {

	public static void main(String[] args) throws InterruptedException
    {
    	System.out.println("Hello and welcome to Rowan's Place value Digit Program.");
        TimeUnit.SECONDS.sleep(5);
    	System.out.println("Please note that I only work up until 2,147,483,647 and no further.");
        TimeUnit.SECONDS.sleep(5);
		Scanner scann = new Scanner(System.in);
        System.out.println("Enter any number: ");
        
        int number = scann.nextInt();
        scann.close();
        
        int num1 = number % 10;
        int num2 = number / 10 % 10;
        int num3 = number / 100 % 10;
        int num4 = number / 1000 % 10;
        int num5 = number / 10000 % 10;
        int num6 = number / 100000 % 10;
        int num7 = number / 1000000 % 10;
        int num8 = number / 10000000 % 10;
        int num9 = number / 100000000 % 10;
    	int num0A = number / 1000000000 % 10;
        int numEnd = 0;
        
        
        if (num1 >= 0 && num2 <= 0 && num3 <= 0 && num4 <= 0 && num5 <= 0 && num6 <= 0 && num7 <= 0 && num8 <= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0) 
        {
    	    System.out.println("Ones: " + num1);
        } 
        else if (num1 >= 0 && num2 >= 0 && num3 <= 0 && num4 <= 0 && num5 <= 0 && num6 <= 0 && num7 <= 0 && num8 <= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0)
        {
    	    System.out.println("Ones: " + num1);
        	System.out.println("Tens: " + num2);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 <= 0 && num5 <= 0 && num6 <= 0 && num7 <= 0 && num8 <= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0)
        {
    	    System.out.println("Ones: " + num1);
        	System.out.println("Tens: " + num2);
        	System.out.println("Hundreds: " + num3);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0 && num5 <= 0 && num6 <= 0 && num7 <= 0 && num8 <= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0)
        {
    	    System.out.println("Ones: " + num1);
        	System.out.println("Tens: " + num2);
        	System.out.println("Hundreds: " + num3);
        	System.out.println("Thousands: " + num4);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0 && num5 >= 0 && num6 <= 0 && num7 <= 0 && num8 <= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0)
        {
    	    System.out.println("Ones: " + num1);
        	System.out.println("Tens: " + num2);
        	System.out.println("Hundreds: " + num3);
        	System.out.println("Thousands: " + num4);
        	System.out.println("Ten-Thousands: " + num5);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0 && num5 >= 0 && num6 >= 0 && num7 <= 0 && num8 <= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0)
        {
    	    System.out.println("Ones: " + num1);
        	System.out.println("Tens: " + num2);
        	System.out.println("Hundreds: " + num3);
        	System.out.println("Thousands: " + num4);
        	System.out.println("Ten-Thousands: " + num5);
        	System.out.println("Hundred-Thousands: " + num6);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0 && num5 >= 0 && num6 >= 0 && num7 >= 0 && num8 <= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0)
        {
    	    System.out.println("Ones: " + num1);
        	System.out.println("Tens: " + num2);
        	System.out.println("Hundreds: " + num3);
        	System.out.println("Thousands: " + num4);
        	System.out.println("Ten-Thousands: " + num5);
        	System.out.println("Hundred-Thousands: " + num6);
        	System.out.println("Millions: " + num7);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0 && num5 >= 0 && num6 >= 0 && num7 >= 0 && num8 >= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0)
        {
    	    System.out.println("Ones: " + num1);
        	System.out.println("Tens: " + num2);
        	System.out.println("Hundreds: " + num3);
        	System.out.println("Thousands: " + num4);
        	System.out.println("Ten-Thousands: " + num5);
        	System.out.println("Hundred-Thousands: " + num6);
        	System.out.println("Millions: " + num7);
        	System.out.println("Ten-Millions: " + num8);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0 && num5 >= 0 && num6 >= 0 && num7 >= 0 && num8 >= 0 && num9 >= 0 && num0A <= 0 && numEnd <= 0)
        {
    	    System.out.println("Ones: " + num1);
        	System.out.println("Tens: " + num2);
        	System.out.println("Hundreds: " + num3);
        	System.out.println("Thousands: " + num4);
        	System.out.println("Ten-Thousands: " + num5);
        	System.out.println("Hundred-Thousands: " + num6);
        	System.out.println("Millions: " + num7);
        	System.out.println("Ten-Millions: " + num8);
        	System.out.println("Hundred-Millions: " + num9);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0 && num5 >= 0 && num6 >= 0 && num7 >= 0 && num8 >= 0 && num9 >= 0 && num0A >= 0 && numEnd <= 0)
        {
    	    System.out.println("Ones: " + num1);
        	System.out.println("Tens: " + num2);
        	System.out.println("Hundreds: " + num3);
        	System.out.println("Thousands: " + num4);
        	System.out.println("Ten-Thousands: " + num5);
        	System.out.println("Hundred-Thousands: " + num6);
        	System.out.println("Millions: " + num7);
        	System.out.println("Ten-Millions: " + num8);
        	System.out.println("Hundred-Millions: " + num9);
    		System.out.println("Billion: " + num0A);
        }
        else 
        {
        	System.out.println("Something went wronng");
        }
        
        TimeUnit.SECONDS.sleep(5);
    	System.out.println("Program Finished, Thank you for using this Program.");
    		
        }
    }



/* Screen Dump
 
Hello and welcome to Rowan's Place value Digit Program.
Please note that I only work up until 2,147,483,647 and no further.
Enter any number: 
2147483647
Ones: 7
Tens: 4
Hundreds: 6
Thousands: 3
Ten-Thousands: 8
Hundred-Thousands: 4
Millions: 7
Ten-Millions: 4
Hundred-Millions: 1
Billion: 2
Program Finished, Thank you for using this Program.

*/
