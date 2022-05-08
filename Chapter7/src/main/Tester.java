package main;

public class Tester {

	public static void main(String[] args) 
	{
		TestRectangle boxA = new TestRectangle ();
		TestRectangle boxB = new TestRectangle (3, 5);
		
		System.out.println("TestRectangle Box A has length of " + boxA.getLength() + " and width of " + boxA.getWidth());
		System.out.println("TestRectangle Box A has area of " + boxA.area());
		System.out.println("TestRectangle Box A has perimeter of " + boxA.perimeter());
		System.out.println(boxA.toString());
		
		System.out.println(" ");
		
		System.out.println("TestRectangle Box B has length of " + boxB.getLength() + " and width of " + boxB.getWidth());
		System.out.println("TestRectangle Box B has area of " + boxB.area());
		System.out.println("TestRectangle Box B has perimeter of " + boxB.perimeter());
		System.out.println(boxB.toString());
		
	}

}
