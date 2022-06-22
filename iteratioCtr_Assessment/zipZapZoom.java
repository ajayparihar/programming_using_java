package iteratioCtr_Assessment;

import java.util.Scanner;

public class zipZapZoom {
    public static void main(String[] args) {
	int num;
	Scanner scan = new Scanner(System.in);
	num = scan.nextInt();

	if (num % 3 == 0 && num % 5 == 0) {
	    System.out.println("Zoom");
	}

	else if (num % 3 == 0) {
	    System.out.println("Zip");
	}

	else if (num % 5 == 0) {
	    System.out.println("Zap");

	} else {
	    System.out.println("Invalid");
	}
	scan.close();
    }

}
