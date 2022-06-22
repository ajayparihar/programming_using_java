package iteratioCtr_Assessment;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
	int num, rem = 0, rev = 0;
	Scanner scan = new Scanner(System.in);
	num = scan.nextInt();
	int temp = num;

	while (temp > 0) {
	    rem = temp % 10;
	    rev = (rev * 10) + rem;
	    temp = temp / 10;
	}
	if (rev==num) {
	    System.out.println(num+" is a PALINDROME");
	} else {
	    System.out.println(num+" is NOT a PALINDROME");
	}
	scan.close();
    }

}
