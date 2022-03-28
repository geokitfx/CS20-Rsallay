import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*

Program: AccountSetup.java          Last Date of this Revision: 03, 18, 2022

Purpose: Create an AccountSetup application that prompts the user for a user name and a password.
		 The application should prompt the user until a password with at least eight characters is entered.
		 The user name and password should be converted to all lower case letters and then an appropriate message displayed.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

public class AccountSetup {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Hello and welcome to Rowan's Accout Setup application");
        TimeUnit.SECONDS.sleep(2);
        
        System.out.println("Enter a username: ");
        Scanner uName = new Scanner(System.in);
        String userName = uName.nextLine();
        userName = userName.toLowerCase();
        TimeUnit.SECONDS.sleep(2);
        
        int stringINTo = 0;  
        while (stringINTo < 1) 
        {
            System.out.println("Enter a password that's at least 8 characters: ");
            Scanner uPass = new Scanner(System.in);
            String userPa = uPass.nextLine();
            userPa = userPa.toLowerCase();
            int stringINT = userPa.length();   
            if (stringINT < 8) 
            {
            	System.out.println("Password is too short please enter new password");
            	TimeUnit.SECONDS.sleep(2);
            	continue;
            	
            }
            uPass.close();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Your user name is " + userName + " and your password is " + userPa);
            break;
        }
        uName.close();
        TimeUnit.SECONDS.sleep(2);
    	System.out.println("Program Finished, Thank you for using this Program.");

	}
}

/* Screen Dump

Hello and welcome to Rowan's Accout Setup application
Enter a username: 
1234
Enter a password that's at least 8 characters: 
123456789
Your user name is 1234 and your password is 123456789
Program Finished, Thank you for using this Program.

Hello and welcome to Rowan's Accout Setup application
Enter a username: 
1234
Enter a password that's at least 8 characters: 
1234
Password is too short please enter new password
Enter a password that's at east 8 characters: 
123456789
Your user name is 1234 and your password is 123456789
Program Finished, Thank you for using this Program.


*/