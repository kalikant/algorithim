import java.util.Scanner;

/*
 * 
 * Colleen is turning  years old! Therefore, she has  candles of various heights on her cake, and candle  has height . Because the taller candles tower over the shorter ones, Colleen can only blow out the tallest candles.

Given the  for each individual candle, find and print the number of candles she can successfully blow out.

 */


public class BirthdayCakeCandles {

	 static int birthdayCakeCandles(int n, int[] ar) {
	        // Complete this function
		 int tallest=Integer.MIN_VALUE;
		 for(int i=0;i<n;i++)
		 	 if(ar[i]>tallest) tallest=ar[i];
		 
		 int tallestCackeCount=0;
		
		 for(int i=0;i<n;i++)
			 if((tallest - ar[i]) == 0) ++tallestCackeCount;
		
		 return tallestCackeCount;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = birthdayCakeCandles(n, ar);
	        System.out.println(result);
	    }

}
