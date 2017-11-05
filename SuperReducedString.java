import java.util.Scanner;

/*
 * 
 * Steve has a string, , consisting of  lowercase English alphabetic letters. In one operation, he can delete any pair of adjacent letters with same value. For example, string "aabcc" would become either "aab" or "bcc" after operation.

Steve wants to reduce  as much as possible. To do this, he will repeat the above operation as many times as it can be performed. Help Steve out by finding and printing 's non-reducible form!

Note: If the final string is empty, print Empty String .

Input Format

A single string, .

Constraints

Output Format

If the final string is empty, print Empty String; otherwise, print the final non-reducible string.

Sample Input 0

aaabccddd
Sample Output 0

abd
Sample Case 0

Steve can perform the following sequence of operations to get the final string:

aaabccddd → abccddd
abccddd → abddd
abddd → abd
Thus, we print abd.

Sample Input 1

baab
Sample Output 1

Empty String
Explanation 1

Steve can perform the following sequence of operations to get the final string:

baab → bb
bb → Empty String
Thus, we print Empty String.

Sample Input 2

aa
Sample Output 2

Empty String
Explanation 2

Steve can perform the following sequence of operations to get the final string:

aa → Empty String
Thus, we print Empty String.

 */
public class SuperReducedString {

	static String super_reduced_string(String s) {
		// Complete this function

		boolean match = true;

		String str = s;

		while (match) {
			match = false;
			int i = 0;
			while (i < str.length() - 1) {
				if (str.charAt(i) == str.charAt(i + 1)) {
					StringBuilder sb = new StringBuilder(str);
					sb.deleteCharAt(i);
					sb.deleteCharAt(i);
					str = sb.toString();
					match = true;
					i = 0;
				}
				i++;
			}
		}

		if (!"".equals(str))
			return str;
		else
			return "Empty String";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = super_reduced_string(s);
		System.out.println(result);
		in.close();
	}

}
