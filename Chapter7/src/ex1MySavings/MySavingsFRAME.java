package ex1MySavings;

import java.util.Scanner;

public class MySavingsFRAME {

	public static void main(String[] args) 
	{
		MSMathFRAME frameWork = new MSMathFRAME();
		
		Scanner input = new Scanner(System.in);
        double data;
        
        System.out.println("Enter any number: ");
        data = input.nextDouble();
        frameWork.addTot(data);
        
		
		System.out.println("Total: "+ frameWork.getTotal());
		
		System.out.println("Enter any number: ");
        data = input.nextDouble();
        frameWork.subTot(data);
        
        System.out.println("Total: "+ frameWork.getTotal());
        
        input.close();
		
	}

}
