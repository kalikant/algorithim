import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] input= {111,145,1890,1234,153,178,199
				,134,167,176,102,33,9,4,23,7,1,88,44,56,29};
		BubbleSort obj=new BubbleSort();
		
		long startTime = System.nanoTime();
		for(int val:obj.sort(input))
			System.out.println(val);
		long endTime = System.nanoTime();
		System.out.println(" sort time " + (endTime - startTime));
		
		long startTime1 = System.nanoTime();
		for(int val:obj.sort1(input))
			System.out.println(val);
		long endTime1 = System.nanoTime();
		System.out.println(" sort time " + (endTime1 - startTime1));
	}
	
	 private static StringBuilder readFile(String filePath) {	
	    	FileReader fileReader =null;
	    	BufferedReader bufferReader =null;
	    	String fileData="";
	    	StringBuilder SBfileData=new StringBuilder();
	    	
	    	try {
					File file = new File(filePath);
					if (!file.exists())
						System.out.println("File does not exist at specified location .. " + filePath);
					fileReader = new FileReader(filePath);
					bufferReader = new BufferedReader(fileReader);
					String line="";
					
					while( (line=bufferReader.readLine()) != null )
						//fileData +=line+'\n';
						SBfileData.append(line).append('\n');
					
			} catch (IOException e) {
				System.out.println("Ther is problem while reading from file.. " + e);
				
			}
			finally {

				try {

					if (bufferReader != null)
						bufferReader.close();

					if (fileReader != null)
						fileReader.close();

				} catch (IOException ex) {

					ex.printStackTrace();

				}
			}
	    	
	    	return SBfileData;
		}
	
	private int[] swap(int[] input,int currentPosition)
	{
		int temp=input[currentPosition];
		input[currentPosition]=input[currentPosition+1];
		input[currentPosition+1]=temp;
		return input;
	}
	
	private int[] sort(int[] input) {
		
		long startTime = System.nanoTime();
		int passCount=0;
		boolean swap=false;
		do {
			swap=false;
			int currentEliment=0;
			for(int i=0;i<input.length-1;i++)
			{
				++passCount;
				if(input[currentEliment] > input[currentEliment+1])
				{
					swap(input,currentEliment); 
					swap=true;
				}
				currentEliment ++;
			}
		}
		while(swap);
		
		long endTime = System.nanoTime();
		System.out.println(" sort time " + (endTime - startTime));
		
		System.out.println("Total pass count sort " + passCount);
		return input;
	}
	
	private int[] sort1(int[] input)
	{
		long startTime = System.nanoTime();
		int passCount=0;
		
		for(int i=0;i<input.length-1;i++)
		{
			for(int j=0;j<input.length-1;j++)
			{
				++passCount;
				if(input[j]>input[j+1])
				{	
					int temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
		}
		
		long endTime = System.nanoTime();
		System.out.println(" sort time " + (endTime - startTime));
		
		System.out.println("Total pass count sort-1 " +passCount);
		return input;
	}

	
}
