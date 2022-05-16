package Circle3;

public class Circle3 {

	public static void main(String[] args) 
	{
		CircleFUNC3 spotA = new CircleFUNC3();
		spotA.setRadius(3);
		
		CircleFUNC3 spotB = new CircleFUNC3(5);
		
		System.out.println("Circle Radius: "+ spotA.getRadius());
		System.out.println("Circle circumference: "+ spotA.circumference());
		CircleFUNC3.displayAreaFormula();
		System.out.println(" ");
		System.out.println("Circle Radius: "+ spotB.getRadius());
		System.out.println("Circle circumference: "+ spotB.circumference());
		CircleFUNC3.displayAreaFormula();
		
	}

}
