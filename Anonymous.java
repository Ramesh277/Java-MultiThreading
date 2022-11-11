package threading;

public class Anonymous {
	
	public static void main(String[] args) {
	
	//Anonymous 
	Runnable rt  = new Runnable()
			{
		      public void run() {
		    	  System.out.println("This is anonymous threading ");
		      }
			};
			
			Thread tt = new Thread(rt);
			tt.start();
			
    //lambda expression 
			
    Runnable lt = ()->{
    	for(int i =1; i<5; i++) {
    		System.out.println("Lambda Expression i*5 = "+(i*5));
    	}
    };
    
    Thread th = new Thread(lt);
    th.start();
		
			
	}		

}
