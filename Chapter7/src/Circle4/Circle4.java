package Circle4;

public class Circle4 {

	public static void main(String[] args) 
	{
		CircleFUNC4 spotA = new CircleFUNC4();
		spotA.setRadius(3);
		
		CircleFUNC4 spotB = new CircleFUNC4(5);
		
		System.out.println("Circle Radius: "+ spotA.getRadius());
		System.out.println("Circle circumference: "+ spotA.circumference());
		System.out.println(" ");
		System.out.println("Circle Radius: "+ spotB.getRadius());
		System.out.println("Circle circumference: "+ spotB.circumference());
		
	}

}
