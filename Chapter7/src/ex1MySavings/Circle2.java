package ex1MySavings;

public class Circle2 {

	public static void main(String[] args) 
	{
		CircleFUNC2 spotA = new CircleFUNC2();
		spotA.setRadius(3);
		
		CircleFUNC2 spotB = new CircleFUNC2(5);
		
		System.out.println("Circle Radius: "+ spotA.getRadius());
		System.out.println("Circle circumference: "+ spotA.circumference());
		System.out.println(" ");
		System.out.println("Circle Radius: "+ spotB.getRadius());
		System.out.println("Circle circumference: "+ spotB.circumference());
		
	}

}
