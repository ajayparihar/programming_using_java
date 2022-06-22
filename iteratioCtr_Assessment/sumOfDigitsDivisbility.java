package iteratioCtr_Assessment;

import java.util.Scanner;

public class sumOfDigitsDivisbility {
    public static void main(String[] args) {
	
	int num, num1, sum = 0, temp = 0;
	
	Scanner scan = new Scanner(System.in);
	num = scan.nextInt();

	num1 = num;

	while (num > 0) {
	    temp = num % 10;
	    sum = sum + temp;
	    num = num / 10;
	}
	if ((num % sum) == 0) {
	    System.out.println("Number " + num1 + " is Divisible By its Sum " + sum);
	} else {
	    System.out.println("Number " + num1 + " is NOT Divisible By its Sum " + sum);
	}

	scan.close();
    }

}
