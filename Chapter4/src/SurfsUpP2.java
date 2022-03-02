/*

Program: SurfsUpP2.java          Last Date of this Revision: 03, 1, 2022

Purpose: Modify the SurfsUp to display "Great day for surfing!" when the waves are 6 feet or over and "Go body boarding" when the waves are less than 6 feet.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SurfsUpP2 {

	public static void main(String[] args) throws InterruptedException
    {
    	System.out.println("Hello and welcome to Rowan's Surf's up calculator.");
        TimeUnit.SECONDS.sleep(5);
    	System.out.println("How tall is the wave in feet?");
        TimeUnit.SECONDS.sleep(5);
		Scanner scanh = new Scanner(System.in);
        System.out.println("Height of wave: ");
        
        int number = scanh.nextInt();
        
        scanh.close();
        
        if (number >= 6) 
        {
    	    System.out.println("The wave is " + number + "FT High, Great day for surfing!");
        } 
        else 
        {
        	System.out.println("The wave is " + number + "FT High, Go body boarding.");
        }
        
        TimeUnit.SECONDS.sleep(5);
    	System.out.println("Program Finished, Thank you for using this Program.");
    		
        }
    }



/* Screen Dump
 
Hello and welcome to Rowan's Surf's up calculator.
7
How tall is the wave in feet?
Height of wave: 
The wave is 7FT High, Great day for surfing!

Hello and welcome to Rowan's Surf's up calculator.
4
How tall is the wave in feet?
Height of wave: 
The wave is 4FT High, Go body boarding.
Program Finished, Thank you for using this Program.


*/