package studentRoster;

import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		Scanner name = new Scanner(System.in);
		int arrayindexS;
		String[] ROSTER;
		
		System.out.println("How many Students?");
		arrayindexS = num.nextInt();
		ROSTER = new String[arrayindexS];
		
		for (int n = 0; n < arrayindexS; n++)
		{
			System.out.println("Student Names?");
			String studentName = name.nextLine();
			ROSTER[n] = studentName;
		}
		
			System.out.println("Student Roster");
		for (int i = 0; i < arrayindexS; i++)
		{
			System.out.println("Student "+ i +": "+ROSTER[i]);
		}
		
		num.close();
		name.close();
	}

}

/*
		ROSTER[0] = "Wilbur";
		ROSTER[1] = "Dream";
		ROSTER[2] = "TechnoBlade";
		ROSTER[3] = "Tommyinit";
		ROSTER[4] = "Skeppy";
*/