package main;

public class Tester {

	public static void main(String[] args) 
	{
		TestRectangle boxA = new TestRectangle (3, 5);
		TestRectangle boxB = new TestRectangle (7, 11);
		TestRectangle boxC = new TestRectangle ();
		
		System.out.println("TestRectangle Box A has length of " + boxA.getLength() + " and width of " + boxA.getWidth());
		System.out.println("TestRectangle Box A has area of " + boxA.area());
		System.out.println("TestRectangle Box A has perimeter of " + boxA.perimeter());
		System.out.println(boxA.toString());
		
		System.out.println(" ");
		
		System.out.println("TestRectangle Box B has length of " + boxB.getLength() + " and width of " + boxB.getWidth());
		System.out.println("TestRectangle Box B has area of " + boxB.area());
		System.out.println("TestRectangle Box B has perimeter of " + boxB.perimeter());
		System.out.println(boxB.toString());
		
		System.out.println(" ");
		
		System.out.println("TestRectangle Box C has length of " + boxC.getLength() + " and width of " + boxC.getWidth());
		System.out.println("TestRectangle Box C has area of " + boxC.area());
		System.out.println("TestRectangle Box C has perimeter of " + boxC.perimeter());
		System.out.println(boxC.toString());
		
	}

}
