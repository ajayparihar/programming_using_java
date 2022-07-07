package sumOfDigits;

import java.util.Scanner;

class Calculator {

    public int sumOfDigits(int num) {
	int sum = 0;
	while (num > 0) {
	    int rem = num % 10;
	    sum = sum + rem;
	    num = num / 10;

	}

	return sum;

    }

}

class Tester {

    public static void main(String args[]) {

	Calculator calculator = new Calculator();

	int num;

	Scanner scan = new Scanner(System.in);

	num = scan.nextInt();

	scan.close();

	System.out.println(calculator.sumOfDigits(num));

    }
}