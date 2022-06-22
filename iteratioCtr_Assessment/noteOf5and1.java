package iteratioCtr_Assessment;

import java.util.Scanner;

public class noteOf5and1 {
    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter No of 1$ Note");
	int availOne = scan.nextInt();

	System.out.println("Enter No of 5$ Note");
	int availFive = scan.nextInt();

	System.out.println("Enter Purchase Amount");
	int purAmt = scan.nextInt();

	int five = purAmt / 5;
	int one = purAmt % 5;

	if (availOne >= one && availFive >= five) {
	    System.out.println("1$ notes needed = " + one);
	    System.out.println("5$ notes needed = " + five);
	} else {
	    System.out.println(-1);
	}
	scan.close();
    }

}
