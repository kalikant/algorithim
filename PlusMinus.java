/*
Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeroes in the array compared to its size.
Sample Input

6
-4 3 -9 0 4 1         
Sample Output

0.500000
0.333333
0.166667
Explanation

There are  positive numbers,  negative numbers, and  zero in the array. 
The respective fractions of positive numbers, negative numbers and zeroes are ,  and , respectively.
*/


import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
			
			int length=Integer.parseInt(sc.nextLine());
			String[] numbers=sc.nextLine().split(" ");
			double posCoun=0.0;
	        double negCount=0.0;
	        double zeroCount=0.0;
	        
			for(int i=0;i<length;i++)
			{
	            int num=Integer.parseInt(numbers[i]);
				if(num==0) ++zeroCount;
				if(num>0) ++posCoun;
	            if(num<0) ++negCount;
	     	}
			
	        System.out.println(new DecimalFormat("0.000000").format(posCoun/length));
	        System.out.println(new DecimalFormat("0.000000").format(negCount/length));
	        System.out.println(new DecimalFormat("0.000000").format(zeroCount/length));
	        
			sc.close();
	}
}
