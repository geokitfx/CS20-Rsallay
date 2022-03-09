import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*

Program: Exercise8.java          Last Date of this Revision: 03, 9, 2022

Purpose: Create a RandomGenerator application that implements the Linear Congruential Method.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/



public class Exercise8 {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.out.println("Hello and welcome to Rowan's Linear Congruential Method application");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("First enter a Seed Value and then enter Values for A, C and M");
        TimeUnit.SECONDS.sleep(3);
        
        System.out.println("Seed: ");
        TimeUnit.SECONDS.sleep(2);
		Scanner scanseed = new Scanner(System.in);
		int seed = scanseed.nextInt();
        
        System.out.println("Value A:");
        TimeUnit.SECONDS.sleep(2);
		Scanner scanA = new Scanner(System.in);
        int lcmA = scanA.nextInt();
        
        System.out.println("Value C:");
        TimeUnit.SECONDS.sleep(2);
		Scanner scanC = new Scanner(System.in);
        int lcmC = scanC.nextInt();
        
        System.out.println("Value M:");
        TimeUnit.SECONDS.sleep(2);
		Scanner scanM = new Scanner(System.in);
        int lcmM = scanM.nextInt();
        
        scanseed.close();
        scanA.close();
        scanC.close();
        scanM.close();
        
        int output1 = (lcmA * seed+lcmC) % lcmM;
        int output2 = (lcmA * output1+lcmC) % lcmM;
        int output3 = (lcmA * output2+lcmC) % lcmM;
        int output4 = (lcmA * output3+lcmC) % lcmM;
        int output5 = (lcmA * output4+lcmC) % lcmM;
        int output6 = (lcmA * output5+lcmC) % lcmM;
        int output7 = (lcmA * output6+lcmC) % lcmM;
        int output8 = (lcmA * output7+lcmC) % lcmM;
        int output9 = (lcmA * output8+lcmC) % lcmM;
        int output10 = (lcmA * output9+lcmC) % lcmM;
           
        System.out.println("("+lcmA+"*"+seed+"+"+lcmC+")"+" ÷ "+lcmM+" = "+output1);
        System.out.println("("+lcmA+"*"+output1+"+"+lcmC+")"+" ÷ "+lcmM+" = "+output2);
        System.out.println("("+lcmA+"*"+output2+"+"+lcmC+")"+" ÷ "+lcmM+" = "+output3);
        System.out.println("("+lcmA+"*"+output3+"+"+lcmC+")"+" ÷ "+lcmM+" = "+output4);
        System.out.println("("+lcmA+"*"+output4+"+"+lcmC+")"+" ÷ "+lcmM+" = "+output5);
        System.out.println("("+lcmA+"*"+output5+"+"+lcmC+")"+" ÷ "+lcmM+" = "+output6);
        System.out.println("("+lcmA+"*"+output6+"+"+lcmC+")"+" ÷ "+lcmM+" = "+output7);
        System.out.println("("+lcmA+"*"+output7+"+"+lcmC+")"+" ÷ "+lcmM+" = "+output8);
        System.out.println("("+lcmA+"*"+output8+"+"+lcmC+")"+" ÷ "+lcmM+" = "+output9);
        System.out.println("("+lcmA+"*"+output9+"+"+lcmC+")"+" ÷ "+lcmM+" = "+output10);
		
		TimeUnit.SECONDS.sleep(3);
    	System.out.println("Program Finished, Thank you for using this Program.");

	}

}

/* Screen Dump

Hello and welcome to Rowan's Linear Congruential Method application
First enter a Seed Value and then enter Values for A, C and M
Seed: 
17
Value A:
4359
Value C:
68
Value M:
21
(4359*17+68) ÷ 21 = 20
(4359*20+68) ÷ 21 = 14
(4359*14+68) ÷ 21 = 5
(4359*5+68) ÷ 21 = 2
(4359*2+68) ÷ 21 = 8
(4359*8+68) ÷ 21 = 17
(4359*17+68) ÷ 21 = 20
(4359*20+68) ÷ 21 = 14
(4359*14+68) ÷ 21 = 5
(4359*5+68) ÷ 21 = 2
Program Finished, Thank you for using this Program.

*/