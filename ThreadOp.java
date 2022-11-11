package threading;

public class ThreadOp {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("program is started ...");
		
		int x = 60+50;
		
		System.out.println("value x ="+x);
		
		//Thread.sleep(1000);
		
		Thread t = Thread.currentThread();
		String tname = t.getName();
		
		System.out.println("current running thread is = "+tname);
		
		// change thread name
		t.setName("Mymain");
		
		System.out.println(t.getName());
		System.out.println(t.getId());
		
		Thread.sleep(2000);
		
		
		System.out.println("Going to start userDefined thread ........");
		
		UserThread uthread = new UserThread();
		uthread.start();
		System.out.println(uthread.getId());
		System.out.println(uthread.getName());
		System.out.println(uthread.getPriority());
	
		
		System.out.println("program ended.....");
		
		
		
	}

}

class UserThread extends Thread{
	
	public void run() {
		// task for thread..
		System.out.println("This is userdefined thread ..........");
	
	}
	
}
