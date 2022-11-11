package threading.companyThread;

public class Consumer extends Thread{
	
	Company c;
	
	Consumer(Company c){
		this.c = c;
	}
	
	public void run() {
		
		while(true) {
			try {
				this.c.consume_item();
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
		
	}

}
