package threading;

/*
 * Daemon thread 
 * > Daemon thread in java is a service provider thread that provides services 
 * to the user thread
 * 
 * setDaemon(boolean)
 * 
 * public boolean isDaemon()
 * 
 * Garbage collector is the best example of Daemon thread 
 * 
 * <------------------------------>
 * # Producer Consumer Problem 
 *    Example :company(
 *       1) produce items()
 *         
 *       2) consume items()
 *       )
 * # Synchronized, inter-thread communication 
 * 
 * 
 * <----------------------------->
 *  ways of creating thread 
 *  1) Implements (Runnable interface)
 *     
 *  2) Extends  (Thread class)
 *   
 * 
 * 
 * 
 */

public class DaemonThread {
	
public static void main(String[] args) {
		
		ImplThread ith = new ImplThread();
		
		Thread t = new Thread(ith);
		
//		ExteThread eth = new ExteThread();
		
		

		t.start();
//		eth.start();
		
		
	}

}



//Implements (Runnable)
class ImplThread implements Runnable{
	
	@Override
	public void run() {
		
		for(int i =1; i<10; i++) {
			System.out.println("implements method (i+2) = "+(i+2));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

//Extends (Thread)
class ExteThread extends Thread{
	@Override
	public void run() {
		
		for(int i =1; i<10; i++) {
			System.out.println("Extends method = "+i*4);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
		}
		
	}
	
}





