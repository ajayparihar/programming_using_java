package stringAssess;

import java.util.Scanner;

public class MoveSplChar {

    public static String moveSpecialCharacters(String str) {

	String sort1 = "";
	String sort2 = "";

	for (int i = 0; i < str.length(); i++) {

	    if ((str.charAt(i) > 64 && str.charAt(i) < 91)||(str.charAt(i) > 96 && str.charAt(i) < 123)) {
		sort1 = sort1 + str.charAt(i);
	    } else {
		sort2 = sort2 + str.charAt(i);
	    }

	}

	String sort = sort1 + sort2;

	return sort;
    }

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter a Mixed String");

	String str = scan.nextLine();

	scan.close();

	System.out.println(moveSpecialCharacters(str));
    }

}