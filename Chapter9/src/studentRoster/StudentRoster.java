package studentRoster;

import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int arrayindexS;
		String[] ROSTER;
		
		System.out.println("How many Students?");
		arrayindexS = input.nextInt();
		ROSTER = new String[arrayindexS];
		
		ROSTER[0] = "Wilbur";
		ROSTER[1] = "Dream";
		ROSTER[2] = "TechnoBlade";
		ROSTER[3] = "Tommyinit";
		ROSTER[4] = "Skeppy";
		
		for (int i = 0; i < arrayindexS; i++)
		{
			System.out.println(ROSTER[i]);
		}
		

	}

}
