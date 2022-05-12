package ex1MySavings;

public class MySavingsFRAME {

	public static void main(String[] args) 
	{
		MSMathFRAME spotA = new MSMathFRAME();
		spotA.setRadius(3);
		
		MSMathFRAME spotB = new MSMathFRAME(5);
		
		System.out.println("Circle Radius: "+ spotA.getRadius());
		System.out.println("Circle circumference: "+ spotA.circumference());
		System.out.println(" ");
		System.out.println("Circle Radius: "+ spotB.getRadius());
		System.out.println("Circle circumference: "+ spotB.circumference());
		
	}

}
