package Strings;

public class LengthOfLastWord {
	public int lengthOfLastWord(final String a) {
	    int len = 0;
	    String[] str = a.split(" ");
	    if(str.length > 0) {
	        len = str[str.length-1].length();
	    }
	    return len;
	}
}
