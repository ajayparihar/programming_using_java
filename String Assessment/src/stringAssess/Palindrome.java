package stringAssess;

import java.util.Objects;
import java.util.Scanner;

public class Palindrome {
    public static String checkPalindrome(String str) {

	String lStr = str.toLowerCase();
	String rev = "";
	for (int i = 0; i < lStr.length(); i++) {
	    char ch = lStr.charAt(i);
	    rev = ch + rev;
	}

	return rev;
    }

    public static void main(String args[]) {

	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	scan.close();

	if (Objects.equals(checkPalindrome(str), str))
	    System.out.println("The string is a palindrome!");
	else
	    System.out.println("The string is not a palindrome!");
    }
}