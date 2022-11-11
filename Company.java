package threading.companyThread;

public class Company {
	
	
	// when producer produce item at that time Consumer can't work
	int n;
	boolean f=false;
	
	//if f is false chance : producer
	//f=true : chance :consumer
	synchronized public void produce_item(int n) {
		
		if(f) {
			try {
				wait();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		this.n = n;		
		System.out.println("Produce = "+this.n);
		f=true;
		notify();
		
	}

    synchronized public int consume_item() throws InterruptedException {
    	
    	if(!f)
    	{
    		wait();
    	}
		
		
		System.out.println("Consumed = "+this.n);
		f=false;
		notify();
		return this.n;
		
	}
}
