package threading;

public class myThread implements Runnable{
	
	public  void run() {
		//task for thread......
		for(int i =1; i<=5; i++) {
			System.out.println("i = "+i);	
			
			try{Thread.sleep(1000);}catch(Exception e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		//this is main thread which run the all program
		
		myThread t1 = new myThread();
        Thread thr = new Thread(t1);
        
        myExtendThread t2 = new myExtendThread();;
        
        thr.start();
        t2.start();
        
	}

}
