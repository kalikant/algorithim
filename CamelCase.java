package hackerrank;

import java.util.Scanner;

/*
 * 
 * Alice wrote a sequence of words in CamelCase as a string of letters, , having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given , print the number of words in  on a new line.

 */
public class CamelCase {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        
	        int upperCaseCount=1;
	        for(int i=0;i<s.length();i++)
	        	if(Character.isUpperCase(s.charAt(i))) ++upperCaseCount;
	        
	        System.out.println(upperCaseCount);
	        in.close();
	    }
}
