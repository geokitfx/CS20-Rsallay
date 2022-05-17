package adderEX8;
/*

Program: RandomNum.java          Last Date of this Revision: 03, 3, 2022

Purpose: Create a RandomNum application that prompts the user for two numbers. 
		 The first is a minimum value and the second is a maximum value.
		 RandomNum than displays an integer between the min and max values entered by the user.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;

public class RandomNum {
	
	public static void main(String[] args) 
	{
		GameMath frameWork = new GameMath();
		int end = 0;
		
		while (end == 0) {
			
		int min = 0;
	    int max = 20;
	    int a = (int) ((Math.random() * (max - min)) + min);
	    int b = (int) ((Math.random() * (max - min)) + min);
			
		System.out.println(a + " + " + b + " = ");
		System.out.println(frameWork.getTrys());
		System.out.println(frameWork.getScore());
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
        
		int awn = a + b;
		int Try = 1;
		
		int ScoreA = 5;
		int ScoreB = 3;
		int ScoreC = 1;
		
		if (value == awn) 
		{
			frameWork.reset();
		} 
		else 
		{
			frameWork.addTry(Try);
		}
		
		if (frameWork.getTrys() == 1) {
			frameWork.addScore(ScoreA);
			frameWork.reset();
		} else if (frameWork.getTrys() == 2) {
			frameWork.addScore(ScoreB);
			frameWork.reset();
		} else if (frameWork.getTrys() == 3) {
			frameWork.addScore(ScoreC);
			frameWork.reset();
		} else if (frameWork.getTrys() == 4) {
			System.out.println("Your score is: " + frameWork.getScore());
			end = end +1;
		}
		}
	}
        
	}


/* Screen Dump

Hello and welcome to Rowan's RandomNum application
First enter a Minimum Value and then enter a Maximum Value.
Minimum value: 
1
Maximum value:
10000
Random Number is: 2831
Program Finished, Thank you for using this Program.

*/