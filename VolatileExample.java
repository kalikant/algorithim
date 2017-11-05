import java.util.Scanner;

public class VolatileExample extends Thread {

	private volatile boolean running=true;
	
	public void run()
	{
		while(running)
			System.out.println(Thread.currentThread() +  "I am running");
		
		try {
			Thread.sleep(1000000000000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void shutDown()
	{
		running=false;
	}
	
	public static void main(String[] args) {
		
		VolatileExample t1=new VolatileExample();
		t1.start();
		
		VolatileExample t2=new VolatileExample();
		t2.start();
		
		System.out.println("Please return to stop ... ");
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
		
		t1.shutDown();
		t2.shutDown();

	}

}
