package iteratioCtr_Assessment;

public class quadEqun {
    public static void main(String[] args) {
	int a = 1, b = 4, c = 6;
	double x, y;
	int disc = (b * b) - (4 * (a * c));
	x = ((-b) + disc) / (2 * a);
	y = ((-b) - disc) / (2 * a);

	if (disc == 0) {
	    System.out.println("The root is " + x);
	}

	else if (disc > 0) {
	    System.out.println("The roots are " + x + " " + y);
	}

	else if (disc < 0) {
	    System.out.println("The Equation has no real roots");
	}

    }

}
