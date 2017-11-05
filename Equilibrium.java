public class Equilibrium {

	public static void main(String[] args) {
		
		int[] A= {-1,3,-4,5,1,-6,2,1};
		
		Equilibrium obj=new Equilibrium();
		
		for(int val:obj.solution(A))
			System.out.println(val);
	}

	public int[] solution(int[] A) {
		
		int totalSum=0;
		int leftSum=0;
		int rightSum=0;
		int [] equiList= new int[10];
		
		for(int j=0;j<A.length;j++)
			totalSum +=A[j];
		
		
		for(int i=0;i<A.length-1;i++)
		{
			rightSum= totalSum - A[i];
			if(leftSum == rightSum)
				equiList[i]=A[i];
			leftSum +=A[i];
		}
		
		return equiList;
	}
	
	
	
}
