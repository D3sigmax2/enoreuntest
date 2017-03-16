package threads;

abstract class Thread_test  extends Thread_clock{
	
	private boolean running = true;
	
	public Thread_test(){
		
	}
	
	
	public void run(){
		
		while(running){
					
		}
		
	}
	
	
	public void stopping(){
		
		this.running = false;

	}
}
