package string;

public class Str {

    public String string;

    public String removeWhiteSpaces(String str) {
	this.string = str;

	return string.replaceAll("\\s", "");

    }

}
