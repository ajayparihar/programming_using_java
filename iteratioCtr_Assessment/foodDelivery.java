package iteratioCtr_Assessment;

import java.util.Scanner;

public class foodDelivery {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 'N' for Non-veg and 'V' for Veg FOOD");
	char food = sc.next().charAt(0);
	System.out.println("Quantity of food");
	int quantity = sc.nextInt();
	System.out.println("Enter Distance");
	int dist = sc.nextInt();
	int total = 0, del = 0;

	if (quantity <= 0 || dist <= 0) {
	    total = -1;
	}

	else {
	    if (food == 'N' || food == 'n') {
		total = quantity * 15;
	    }

	    else if (food == 'V' || food == 'v') {
		total = quantity * 12;
	    }

	    else {
		total = -1;
	    }
	}
	if (dist > 3) {
	    del = ((dist - 6) * 2) + 3; // ((x-6)*2)+3 ----(10-6)*2=8+3=11
	} else {
	    del = 0;
	}

	System.out.println(total + del);

	sc.close();
    }

}
