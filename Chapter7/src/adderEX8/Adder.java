package adderEX8;
/*

Program: Adder.java          Last Date of this Revision: 05, 18, 2022

Purpose: The g

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;

public class Adder {
	
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
		System.out.println("");
		System.out.println(frameWork.getTrys()+" Trys");
		System.out.println(frameWork.getScore()+" Score");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
        
		int awn = a + b;
		int Try = 1;
		int Success = 1;
		
		int ScoreA = 5;
		int ScoreB = 3;
		int ScoreC = 1;
		
		if (value == awn) 
		{
			frameWork.addSuccess(Success);
		} 
		else
		{
			frameWork.addTry(Try);
			frameWork.addSuccess(Success);
		}
		
		if (frameWork.getSuccess() == 1 && frameWork.getTrys() == 0) {
			frameWork.addScore(ScoreA);
			frameWork.reset();
		} else if (frameWork.getSuccess() == 2 && frameWork.getTrys() == 1) {
			frameWork.addScore(ScoreB);
			frameWork.reset();
		} else if (frameWork.getSuccess() == 3 && frameWork.getTrys() == 2) {
			frameWork.addScore(ScoreC);
			frameWork.reset();
		} else if (frameWork.getTrys() == 4) {
			System.out.println("The correct awnser is : " + a + " + " + b + " = " + awn);
			frameWork.reset();
		}
		
		if (value == 999) {
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