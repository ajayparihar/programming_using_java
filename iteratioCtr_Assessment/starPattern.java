package iteratioCtr_Assessment;

import java.util.Scanner;

public class starPattern {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a NUMBER");
	int num = scan.nextInt();

	for (int i = 1; i <= num; i++) {
	    for (int j = num; j >= i; j--) {
		System.out.print("*");
	    }
	    System.out.println("");
	}
    }

}
