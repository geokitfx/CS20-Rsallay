/*

Program: RectanglePerimeter.java          Last Date of this Revision: 02, 22, 2022

Purpose: Create a RectanglePerimeter application that calculates and displayes a rectangle with a width of 4 and length of 13.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		Scanner lengthInput = new Scanner(System.in);
	    System.out.println("Enter length");
	    int length = lengthInput.nextInt();
	    
	    Scanner widthInput = new Scanner(System.in);
	    System.out.println("Enter width");
	    int width = widthInput.nextInt();
	    
	    lengthInput.close();
	    widthInput.close();

	    int area;
	    area = length * width;
	    
	    int parea;
	    parea = length + width;
	    
	    int perimeter;
	    perimeter = parea * 2;
	    
	    System.out.println("Area is: " + area);
	    System.out.println("Perimeter is: " + perimeter);

	}

}

/* Screen Dump

Enter length
13
Enter width
4
Area is: 52
Perimeter is: 34

*/
