/*

Program: SurfsUpP1.java          Last Date of this Revision: 03, 1, 2022

Purpose: Create a SurfsUp application that prompts the user for wave height and then displays "Great day for surfing!".

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SurfsUpP1 {

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
        	System.out.println("The wave is " + number + "FT High, Bad day for surfing.");
        }
        
        TimeUnit.SECONDS.sleep(5);
    	System.out.println("Program Finished, Thank you for using this Program.");
    		
        }
    }



/* Screen Dump
 
Hello and welcome to Rowan's Surf's up calculator.
How tall is the wave in feet?
Height of wave: 
2147483647
The wave is 2147483647FT High, Great day for surfing!
Program Finished, Thank you for using this Program.


*/