/*

Program: EX6.java          Last Date of this Revision: 03, 28, 2022

Purpose: Create a Digits application that prompts the user for a number then displays the one's ten's hundred's ETc place.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EX6 {

	public static void main(String[] args) throws InterruptedException
    {
    	System.out.println("Hello and welcome to Rowan's Digit sum Program.");
        TimeUnit.SECONDS.sleep(2);
		Scanner scann = new Scanner(System.in);
        System.out.println("Enter a Positive interger: ");
        
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
        	int sum = num1;
    	    System.out.println("The sum of the digits is: " + sum);
        } 
        else if (num1 >= 0 && num2 >= 0 && num3 <= 0 && num4 <= 0 && num5 <= 0 && num6 <= 0 && num7 <= 0 && num8 <= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0)
        {
        	int sum = num1 + num2;
    	    System.out.println("The sum of the digits is: " + sum);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 <= 0 && num5 <= 0 && num6 <= 0 && num7 <= 0 && num8 <= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0)
        {
        	int sum = num1 + num2 + num3;
    	    System.out.println("The sum of the digits is: " + sum);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0 && num5 <= 0 && num6 <= 0 && num7 <= 0 && num8 <= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0)
        {
        	int sum = num1 + num2 + num3 + num4;
    	    System.out.println("The sum of the digits is: " + sum);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0 && num5 >= 0 && num6 <= 0 && num7 <= 0 && num8 <= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0)
        {
        	int sum = num1 + num2 + num3 + num4 + num5;
    	    System.out.println("The sum of the digits is: " + sum);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0 && num5 >= 0 && num6 >= 0 && num7 <= 0 && num8 <= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0)
        {
        	int sum = num1 + num2 + num3 + num4 + num5 + num6;
    	    System.out.println("The sum of the digits is: " + sum);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0 && num5 >= 0 && num6 >= 0 && num7 >= 0 && num8 <= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0)
        {
        	int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7;
    	    System.out.println("The sum of the digits is: " + sum);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0 && num5 >= 0 && num6 >= 0 && num7 >= 0 && num8 >= 0 && num9 <= 0 && num0A <= 0 && numEnd <= 0)
        {
        	int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8;
    	    System.out.println("The sum of the digits is: " + sum);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0 && num5 >= 0 && num6 >= 0 && num7 >= 0 && num8 >= 0 && num9 >= 0 && num0A <= 0 && numEnd <= 0)
        {
        	int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9;
    	    System.out.println("The sum of the digits is: " + sum);
        }
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0 && num5 >= 0 && num6 >= 0 && num7 >= 0 && num8 >= 0 && num9 >= 0 && num0A >= 0 && numEnd <= 0)
        {
        	int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num0A;
    	    System.out.println("The sum of the digits is: " + sum);
        }
        else 
        {
        	System.out.println("Something went wronng");
        }
        
        TimeUnit.SECONDS.sleep(3);
    	System.out.println("Program Finished, Thank you for using this Program.");
    		
        }
    }



/* Screen Dump
 
Hello and welcome to Rowan's Digit sum Program.
Enter a Positive interger: 
892
The sum of the digits is: 19
Program Finished, Thank you for using this Program.

*/
