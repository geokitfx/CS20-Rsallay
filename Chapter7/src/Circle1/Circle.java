package Circle1;

public class Circle {

	public static void main(String[] args) 
	{
		CircleFUNC spot = new CircleFUNC ();
		
		spot.setRadius(3);
		System.out.println("Circle Radius: "+ spot.getRadius());
		System.out.println("Circle circumference: "+ spot.circumference());
		
	}

}
