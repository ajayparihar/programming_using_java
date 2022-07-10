package com.assement1;

import java.util.Scanner;

public class QuadEqun {
    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	double a;
	double b;
	double c;
	
	System.out.println("Enter the Value of 'a'");
	a = scan.nextInt();
	System.out.println("Enter the Value of 'b'");
	b = scan.nextInt();
	System.out.println("Enter the Value of 'c'");
	c = scan.nextInt();

	double x;
	double y;
	
	double disc = (b * b) - (4 * (a * c));
	
	x = ((-b) + disc) / (2 * a);
	y = ((-b) - disc) / (2 * a);

	if (disc == 0) {
	    System.out.println("The root is " + x);
	}

	else if (disc > 0) {
	    System.out.println("The roots are " + x + " and " + y);
	}

	else if (disc < 0) {
	    System.out.println("The equations does not have real roots.");
	}
	scan.close();
    }

}