package stringAssess;

import java.util.Scanner;

public class WordReverse {

    public static String reverseEachWord(String str) {
	String[] words = str.split("\\s");
	String revStr = "";
	for (int i = 0; i < words.length; i++) {
	    String word = words[i];
	    String rev = "";

	    for (int j = word.length() - 1; j >= 0; j--) {
		rev = rev + word.charAt(j);
	    }
	    revStr = revStr + rev + " ";

	}
	return revStr;
    }

    public static void main(String args[]) {

	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	scan.close();

	System.out.println(reverseEachWord(str));
    }
}
