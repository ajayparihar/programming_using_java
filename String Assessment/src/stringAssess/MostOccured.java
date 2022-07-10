package stringAssess;

import java.util.Scanner;

public class MostOccured {
    public static char findHighestOccurrence(String str) {
	char[] ch = str.toCharArray();
	int[] freq = new int[str.length()];
	char maxChar = str.charAt(0);
	int max;

	for (int i = 0; i < ch.length; i++) {
	    freq[i] = 1;
	    for (int j = 0; j < ch.length; j++) {
		if (ch[i] == ch[j] && ch[i] != ' ' && ch[i] != '0') {
		    freq[i]++;
		    ch[j] = '0';

		}
	    }
	}

	max = freq[0];

	for (int i = 0; i < freq.length; i++) {

	    if (max < freq[i]) {
		max = freq[i];
		maxChar = ch[i];
	    }
	}

	return maxChar;
    }

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	scan.close();
	System.out.println(findHighestOccurrence(str));
    }
}
