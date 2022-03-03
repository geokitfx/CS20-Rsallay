/*

Program: Hurricane.java          Last Date of this Revision: 03, 3, 2022

Purpose: Create a Hurricane application that displays the wind speed for the hurricane category entered by the user.
		 Display the speed in MPH, KTS, and KM/HR.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Hurricane {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.out.println("Hello and welcome to Rowan's Hurricane speed Program.");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("MPH is Miles Per Hour. KTS is Knots. and KM/HR is Kilometter Per Hour");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("What is the Category of the Hurricane");
        TimeUnit.SECONDS.sleep(5);
        
		Scanner scanh = new Scanner(System.in);
		
        int hurricane = scanh.nextInt();
        
        scanh.close();
        
		switch (hurricane) {
		  case 1:
			System.out.println("Category " + hurricane);
		    System.out.println("MPH 74-95");
		    System.out.println("KTS 64-82");
		    System.out.println("KM/HR 119-153");
		    break;
		  case 2:
				System.out.println("Category " + hurricane);
			    System.out.println("MPH 96-110");
			    System.out.println("KTS 83-95");
			    System.out.println("KM/HR 178-209");
		    break;
		  case 3:
				System.out.println("Category " + hurricane);
			    System.out.println("MPH 111-130");
			    System.out.println("KTS 96-113");
			    System.out.println("KM/HR 178-209");
		    break;
		  case 4:
				System.out.println("Category " + hurricane);
			    System.out.println("MPH 131-155");
			    System.out.println("KTS 114-135");
			    System.out.println("KM/HR 210-249");
		    break;
		  case 5:
				System.out.println("Category " + hurricane);
				System.out.println("All Category " + hurricane + "'s are greater than");
			    System.out.println("MPH 155");
			    System.out.println("KTS 135");
			    System.out.println("KM/HR 249");
		    break;
		}
		
		TimeUnit.SECONDS.sleep(5);
    	System.out.println("Program Finished, Thank you for using this Program.");
	}

}

/* Screen Dump

Hello and welcome to Rowan's Hurricane speed Program.
MPH is Miles Per Hour. KTS is Knots. and KM/HR is Kilometter Per Hour
What is the Category of the Hurricane
1
Category 1
MPH 74-95
KTS 64-82
KM/HR 119-153
Program Finished, Thank you for using this Program.

Hello and welcome to Rowan's Hurricane speed Program.
MPH is Miles Per Hour. KTS is Knots. and KM/HR is Kilometter Per Hour
What is the Category of the Hurricane
2
Category 2
MPH 96-110
KTS 83-95
KM/HR 178-209
Program Finished, Thank you for using this Program.

Hello and welcome to Rowan's Hurricane speed Program.
MPH is Miles Per Hour. KTS is Knots. and KM/HR is Kilometter Per Hour
What is the Category of the Hurricane
3
Category 3
MPH 111-130
KTS 96-113
KM/HR 178-209
Program Finished, Thank you for using this Program.

Hello and welcome to Rowan's Hurricane speed Program.
MPH is Miles Per Hour. KTS is Knots. and KM/HR is Kilometter Per Hour
What is the Category of the Hurricane
4
Category 4
MPH 131-155
KTS 114-135
KM/HR 210-249
Program Finished, Thank you for using this Program.

Hello and welcome to Rowan's Hurricane speed Program.
MPH is Miles Per Hour. KTS is Knots. and KM/HR is Kilometter Per Hour
What is the Category of the Hurricane
5
Category 5
All Category 5's are greater than
MPH 155
KTS 135
KM/HR 249
Program Finished, Thank you for using this Program.

*/