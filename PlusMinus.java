/*
Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.


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
