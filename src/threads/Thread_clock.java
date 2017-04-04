package threads;

public class Thread_clock extends Thread {

	private boolean running = true;
	public int a;
	public Thread_clock(){
		
	}
	
	
	public void run(){
		
		while(running){
			  if (a>86400){
				  a = 0;
				  //System.out.println();
			  }
			System.out.flush();
			a++;
			//System.out.print(a);
			try{
				
				Thread.sleep(125);
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void stopping(){
		
		this.running = false;

	}
	
}
