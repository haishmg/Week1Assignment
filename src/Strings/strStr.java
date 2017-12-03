package Strings;

public class strStr {
	public int strStr(final String haystack, final String needle) {
	    boolean found = true;
	    int pos = -1;
	    char[] cHaystack = haystack.toCharArray();
	    char[] cNeedle = needle.toCharArray();
	    for(int i=0; i<cHaystack.length; i++) {
	        found = true;
	        if(cHaystack[i] == cNeedle[0] && (i+cNeedle.length)<= cHaystack.length) {
	            for(int j=1; j<cNeedle.length; j++) {
	               // System.out.println("i=="+i);
	               // System.out.println("j=="+j);
	                if(cHaystack[i+j] != cNeedle[j]) {
	                    found = false;
	                    break;
	                }
	            }
	        if(found) {
	             pos = i;
	             return pos;
	         }   
	       }
	    }
	    return pos;
	}
}
