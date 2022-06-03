package dice;

/*
UNABLE TO FINISH
*/

import java.util.Scanner;

public class DiceRolls {

	public static void main(String[] args) {
		
		int[] outcomes = new int[13];
		Scanner input = new Scanner(System.in);
		int numRolls;
		int outcome;
		int numDice;
		
		System.out.print("How many Dice? ");
		numDice = input.nextInt();
		
		System.out.print("How many rolls? ");
		numRolls = input.nextInt();
		
		for (int roll = 0; roll < numRolls; roll++)
		{
			outcome = (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1);
			outcomes[outcome] += 1;
		}
		
		for (int i = 2; i <= 12; i++)
		{
			System.out.println(i + ": " + outcomes[i]);
		}
		
		input.close();

	}

}


/*
UNABLE TO FINISH
PLEASE SKIP
*/