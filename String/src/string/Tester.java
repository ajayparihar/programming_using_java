package string;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

	Str string = new Str();
	String str;

	Scanner scan = new Scanner(System.in);
	scan.close();

	str = scan.nextLine();
	System.out.println(string.removeWhiteSpaces(str));
    }

}
