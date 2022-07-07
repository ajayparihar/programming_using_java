package iteratioCtr_Assessment;

import java.util.Scanner;

public class armstrongNo {
    public static void main(String[] args) {
	int num, temp, length, rem, prod = 0;

	System.out.println("Enter a NUMBER");
	Scanner scan = new Scanner(System.in);
	num = scan.nextInt();
	temp = num;

	length = (int) (Math.log10(num) + 1);

	while (num > 0) {
	    rem = num % 10;
	    prod = prod + (int) Math.pow(rem, length);
	    num = num / 10;
	}

	if (prod == temp) {
	    System.out.println(temp + " is an Armstrong Number");
	} else {
	    System.out.println(temp + " is Not an Armstrong Number");
	}
	scan.close();
    }
}
