/*
	 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

	 */
import java.util.Scanner;

public class MiniMaxSum {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        long totalSum=0;
        for(int i=0;i<arr.length;i++)
        	totalSum+=Integer.toUnsignedLong(arr[i]);
        
        long diff=0;
        long min=Long.MAX_VALUE;
        long max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
        	diff=totalSum - arr[i];
            
            if(diff < min) min=diff;
            if(diff > max) max=diff;
            
        }
        
        String mi=Long.toString(min);
        String mx=Long.toString(max);
        
        
        System.out.println(min+" "+max);
        
        in.close();
	}

}
