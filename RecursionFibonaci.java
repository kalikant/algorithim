public class RecursionFibonaci {

	public static void main(String[] args) {
		
		RecursionFibonaci obj=new RecursionFibonaci();
		int fib=obj.fibonaci(5);
		System.out.println(fib);
		
	}
	
	private int fibonaci(int val)
	{
		if(val <=1)
			return 1;
		else
			return fibonaci(val -1) + fibonaci(val -2);
		
	}

}
