package threading;

public class myExtendThread extends Thread{
	
	public void run() {
		for(int i =10; i>=1; i--) {
			System.out.println("i = "+i);
			try {Thread.sleep(2000);}catch(Exception e) {
				
			}
		}
	}

}
