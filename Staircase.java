import java.util.Scanner;

/*
 * Consider a staircase of size :

   #
  ##
 ###
####
Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .

Input Format

A single integer, , denoting the size of the staircase.

Output Format

Print a staircase of size  using # symbols and spaces.

Note: The last line must have  spaces in it.

Sample Input

6 
Sample Output

     #
    ##
   ###
  ####
 #####
######
Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of .
*/



public class Staircase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int line=Integer.parseInt(sc.nextLine());
		
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=line-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}

		sc.close();
	}

}
