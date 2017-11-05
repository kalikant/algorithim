public class ThreadSyncExample {

	private static int count=0;
	
	public static synchronized void increment()
	{
		++count;
	}
	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runnable(){

			public void run() {
				for(int i=0;i<10000;i++)
					//++count;
					increment();
				
				System.out.println(Thread.currentThread());
			}
			
		});

		Thread t2=new Thread(new Runnable(){

			public void run() {
				for(int i=0;i<10000;i++)
					//++count;
					increment();
				System.out.println(Thread.currentThread());
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(count);
	}

}
