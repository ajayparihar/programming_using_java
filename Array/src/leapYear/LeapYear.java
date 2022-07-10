package leapYear;

public class LeapYear {
    public static int[] findLeapYears(int year) {

	int[] yrs = new int[15];

	if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
	    for (int i = 0; i < 15; i++) {
		yrs[i] = year;
		year = year + 4;
	    }
	} else {
	    for (int i = 0; i < 4; i++) {
		year++;
		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
		    for (int i1 = 0; i1 < 15; i1++) {
			yrs[i1] = year;
			year = year + 4;
		    }
		}

	    }

	}

	return yrs;
    }

    public static void main(String[] args) {
	int year = 1900;
	int[] leapYears;
	leapYears = findLeapYears(year);
	for (int index = 0; index < leapYears.length; index++) {
	    System.out.println(leapYears[index]);
	}
    }
}
