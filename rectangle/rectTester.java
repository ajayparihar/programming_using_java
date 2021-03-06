package rectangle;

import java.util.Scanner;

class Rectangle {
    float length;
    float width;

    public double calculateArea(float len, float wid) {

	return len * wid;
    }

    public double calculatePerimeter(float len, float wid) {	

	return (len + wid) * 2;
    }
}

class rectTester {
    public static void main(String args[]) {

	Rectangle rectangle = new Rectangle();

	float length;
	float width;

	Scanner scan = new Scanner(System.in);

	length = scan.nextInt();
	width = scan.nextInt();

	scan.close();

	System.out.println("Area of the rectangle is " + (rectangle.calculateArea(length, width)));
	System.out.println("Perimeter of the rectangle is " + (rectangle.calculatePerimeter(length, width)));
    }

}