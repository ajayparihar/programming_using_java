package iteratioCtr_Assessment;

import java.util.Scanner;

public class sevenProdOfThree {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	if (num3 == 7) {
	    System.out.println(-1);
	}

	else if (num1 == 7) {
	    System.out.println(num2 * num3);
	}

	else if (num2 == 7) {
	    System.out.println(num3);
	}

	else {
	    System.out.println((num2 * num3) * num1);
	}
	sc.close();
    }
}
