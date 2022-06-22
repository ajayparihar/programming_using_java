package iteratioCtr_Assessment;

import java.util.Scanner;

public class nextDate {
    public static void main(String[] args) {

	int date, month, year;
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter Date");
	date = scan.nextInt();

	System.out.println("Enter Month");
	month = scan.nextInt();

	System.out.println("Enter Year");
	year = scan.nextInt();

	int nextDate = date + 1;
	System.out.println(nextDate + "-" + month + "-20" + year);

	scan.close();
    }
}
