import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*

Program: Exercise2.java          Last Date of this Revision: 03, 7, 2022

Purpose: Create a PackageCheck application that prompts the user for the weight of a package and its dimensions,
		 and then displays an appropriate message if the package does not meet the requirements.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/



public class Exercise2 {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.out.println("Hello and welcome to Rowan's Package Check application");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("First enter the Package weight");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Then enter the Package Dimensions");
        TimeUnit.SECONDS.sleep(2);
        
        System.out.println("Weight in Kilograms: ");
        TimeUnit.SECONDS.sleep(3);
		Scanner scanweight = new Scanner(System.in);
		int weight = scanweight.nextInt();
        
        System.out.println("length in centimeters:");
        TimeUnit.SECONDS.sleep(3);
		Scanner scanlength = new Scanner(System.in);
        int length = scanlength.nextInt();
        
        System.out.println("width in centimeters:");
        TimeUnit.SECONDS.sleep(3);
		Scanner scanwidth = new Scanner(System.in);
        int width = scanwidth.nextInt();
        
        System.out.println("height in centimeters:");
        TimeUnit.SECONDS.sleep(3);
		Scanner scanheight = new Scanner(System.in);
        int height = scanheight.nextInt();
        
        scanweight.close();
        scanlength.close();
        scanwidth.close();
        scanheight.close();
        
        int cmS1 = (length * width * height);
        
        if (weight > 27 && cmS1 > 100000)
        {
        	System.out.println("The Package is too Large and Heavy");
        } 
        else if (weight <= 27 && cmS1 > 100000) 
        {
        	System.out.println("The Package is too Large");
        } 
        else if (weight > 27 && cmS1 <= 100000) 
        {
        	System.out.println("The Package is too Heavy");
        }
        else 
        {
        	System.out.println("The Package is just fine");
        }
		
		TimeUnit.SECONDS.sleep(2);
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