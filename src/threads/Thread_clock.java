package threads;

public class Thread_clock extends Thread {

	private boolean running = true;
	
	public Thread_clock(){
		
	}
	
	
	public void run(){
		int a = 0;
		while(running){
			System.out.print(String.format("\033[2J"));
			System.out.print(a++);
			try{
				
				Thread.sleep(1000);
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void stopping(){
		
		this.running = false;

	}
	
}
