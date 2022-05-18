package adderEX8;
/*

Program: Adder.java          Last Date of this Revision: 05, 18, 2022

Purpose: The Adder game prompts the player for the answer to an addition problem.
		 The Adder game creates a problem from two randomly selected integers between 0 and 20.
		 Adder allows the player three tries to enter a correct answer.
		 If the correct answer is entered on the first try, the player is awarded 5 points.
		 If the correct answer is entered on the second try, 3 points are awarded.
		 The correct answer on the third try earns 1 point.
		 If after three tries, the correct answer is still not entered, the player receives no points and the correct answer is displayed.
		 The game continues until 999 is entered as an answer.
		 At the end of the game Adder displays the player's Score.

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
		System.out.println(frameWork.getTrys()+" Try's");
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
			System.out.println("The correct answer is : " + a + " + " + b + " = " + awn);
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

14 + 14 = 
 
0 Try's
0 Score
 
28
6 + 4 = 
 
0 Try's
5 Score
 
1
19 + 5 = 
 
1 Try's
5 Score
 
24
2 + 3 = 
 
0 Try's
8 Score
 
1
17 + 8 = 
 
1 Try's
8 Score
 
1
1 + 18 = 
 
2 Try's
8 Score
 
19
3 + 4 = 
 
0 Try's
9 Score
 
1
18 + 16 = 
 
1 Try's
9 Score
 
1
14 + 16 = 
 
2 Try's
9 Score
 
1
8 + 19 = 
 
3 Try's
9 Score
 
1
The correct answer is : 8 + 19 = 27
9 + 19 = 
 
0 Try's
9 Score
 
999
Your score is: 9

*/