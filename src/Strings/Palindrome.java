package Strings;

public class Palindrome {
	public int isPalindrome(String a) {
	    StringBuffer palin = new StringBuffer();
	    int pal = 1;
	    char[] chars = a.toCharArray();
	    if(chars.length == 1) {
	        return pal;
	    }

	    for(int i=0; i< chars.length ; i++) {
	       if(Character.isDigit(chars[i]) || Character.isLetter(chars[i])) {
	            palin.append(Character.toLowerCase(chars[i]));
	        }
	    }
	    char[] chars2 = palin.toString().toCharArray();

	    for(int i=1; i<= chars2.length ; i++) {
	        if(chars2[i-1] != chars2[chars2.length-i]) {
	            pal = 0;
	            return pal;
	        }
	    }
	    return pal;
	}

}
