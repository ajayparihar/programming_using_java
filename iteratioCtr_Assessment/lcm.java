package iteratioCtr_Assessment;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
	int num1, num2, lcm;

	Scanner scan = new Scanner(System.in);
	System.out.print("Num1: ");
	num1 = scan.nextInt();

	System.out.print("Num2: ");
	num2 = scan.nextInt();

	lcm = (num1 > num2) ? num1 : num2;

	while (true) {
	    if (lcm % num1 == 0 && lcm % num2 == 0) {
		System.out.print(lcm);
		break;
	    }
	    lcm = lcm + 1;
	}

	scan.close();
    }

}
