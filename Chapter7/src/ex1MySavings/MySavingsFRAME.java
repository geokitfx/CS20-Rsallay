package ex1MySavings;

import java.text.NumberFormat;
import java.util.Scanner;


public class MySavingsFRAME {

	public static void main(String[] args) 
	{
		MSMathFRAME frameWork = new MSMathFRAME();
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		Scanner input = new Scanner(System.in);
        double data;
        
        System.out.println("Enter any number: ");
        data = input.nextDouble();
        frameWork.addTot(data);
        
		
		System.out.println("Total: "+ money.format(frameWork.getTotal()));
		
		System.out.println("Enter any number: ");
        data = input.nextDouble();
        frameWork.subTot(data);
        
        System.out.println("Total: "+ money.format(frameWork.getTotal()));
        
        input.close();
		
	}

}
