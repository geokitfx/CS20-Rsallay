import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*

Program: Hurricane.java          Last Date of this Revision: 03, 3, 2022

Purpose: Create a Hurricane application that displays the wind speed for the hurricane category entered by the user.
		 Display the speed in MPH, KTS, and KM/HR.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/



public class Exercise8 {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.out.println("Hello and welcome to Rowan's RandomNum application");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("First enter a Minimum Value and then enter a Maximum Value.");
        TimeUnit.SECONDS.sleep(5);
        
        System.out.println("Minimum value: ");
        TimeUnit.SECONDS.sleep(5);
		Scanner scanmin = new Scanner(System.in);
		int min = scanmin.nextInt();
        
        System.out.println("Maximum value:");
        TimeUnit.SECONDS.sleep(5);
		Scanner scanmax = new Scanner(System.in);
        int max = scanmax.nextInt();
        
        scanmin.close();
        scanmax.close();
        
        int a = (int) ((Math.random() * (max - min)) + min);
        
        System.out.println("Random Number is: " + a);
		
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