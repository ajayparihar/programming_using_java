package stringAssess;

public class SpacesDuplicateRemove {

    public static String removeDuplicatesandSpaces(String str) {

	String spaces = str.replaceAll("\\s", "");
	String rep = "";

	char[] ch = spaces.toCharArray();

	for (int i = 0; i < ch.length; i++) {
	    boolean dup = false;

	    for (int j = 0; j < rep.length(); j++) {

		if (ch[i] == rep.charAt(j)) {
		    dup = true;
		    break;
		}
	    }
	    if (!dup) {
		rep += ch[i];
	    }

	}

	return rep;
    }

    public static void main(String[] args) {
	String str = "object oriented programming";
	System.out.println(removeDuplicatesandSpaces(str));
    }
}
