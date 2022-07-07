package iteratioCtr_Assessment;

import java.util.Scanner;

public class seedNo {

    public static void main(String[] args) {

	int num1, num2, prod1 = 1, prod2, rem, oNum;

	Scanner scan = new Scanner(System.in);
	num1 = scan.nextInt();
	num2 = scan.nextInt();

	oNum = num1;

	while (num1 > 0) {

	    rem = num1 % 10;
	    prod1 = prod1 * rem;
	    num1 = num1 / 10;

	}

	prod2 = prod1 * oNum;

	if (prod2 == num2) {
	    System.out.println(oNum + " is a seed of " + num2);
	} else {
	    System.out.println(oNum + " is NOT a seed of " + num2);
	}

	scan.close();
    }
}
