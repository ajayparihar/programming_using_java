package infy_proj;

import java.util.Scanner;

public class AvgMethod {
    public double avgCalc(int a, int b, int c) {

	return (a + b + c) / 3.00;

    }

    public static void main(String[] args) {
	int num1;
	int num2;
	int num3;

	AvgMethod avg = new AvgMethod();

	Scanner scan = new Scanner(System.in);

	num1 = scan.nextInt();
	num2 = scan.nextInt();
	num3 = scan.nextInt();

	scan.close();
	double avrg = avg.avgCalc(num1, num2, num3);
	System.out.println(Math.round(avrg * 100.0) / 100.0);

    }

}
