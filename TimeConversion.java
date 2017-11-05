import java.util.Scanner;

/*
 * 
 * 
 * Given a time in -hour AM/PM format, convert it to military (-hour) time.

Note: Midnight is  on a -hour clock, and  on a -hour clock. Noon is  on a -hour clock, and  on a -hour clock.

Input Format

A single string containing a time in -hour clock format (i.e.:  or ), where  and .

Output Format

Convert and print the given time in -hour format, where .

Sample Input

07:05:45PM
Sample Output

19:05:45

 */
public class TimeConversion {

	static String timeConversion(String s) {
		// Complete this function
		
		String amORpm=s.substring(8);
		String[] str=s.split(":");
		String hour=str[0];
		String mnt=str[1];
		String seconds=str[2].substring(0, 2);
		String hours24="";
		String time24="";
		
		if( amORpm.equalsIgnoreCase("PM") && hour.equalsIgnoreCase("12"))
		{
			time24+="12"+":"+mnt+":"+seconds;
			return time24;
		}
		else if(amORpm.equalsIgnoreCase("PM"))
		{
			hours24=Integer.toString((Integer.parseInt(hour)+12));
			time24+=hours24+":"+mnt+":"+seconds;
			return time24;
		}
		else if( amORpm.equalsIgnoreCase("AM") && hour.equalsIgnoreCase("12"))
		{
			time24+="00"+":"+mnt+":"+seconds;
			return time24;
		}
		
		return hour+":"+mnt+":"+seconds;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
		in.close();
	}
}
