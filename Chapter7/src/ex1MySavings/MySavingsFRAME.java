package ex1MySavings;

import java.util.Scanner;

public class MySavingsFRAME {

	public static void main(String[] args) 
	{
		MSMathFRAME spotA = new MSMathFRAME(0);
		
		Scanner input = new Scanner(System.in);
        double data;
        
        System.out.println("Enter any number: ");
        data = input.nextDouble();
        spotA.addTot(data);
        
		
		System.out.println("Total: "+ spotA.getTotal());
		
		System.out.println("Enter any number: ");
        data = input.nextDouble();
        spotA.subTot(data);
        
        System.out.println("Total: "+ spotA.getTotal());
        
        input.close();
		
	}

}
