package threads;
import threads.Thread_clock;
import utility.Utilility;

public class Thread_person extends Thread{

	private boolean running = true;
	private int clock_time,counter;
	private String text;
	
	Thread_clock clock;
	
	public Thread_person(String text, Thread_clock clock,int counter) {
		// TODO Auto-generated constructor stub
		this.clock = clock;
		this.text = text;
		this.counter=counter;
	}

	public void run()
	{
		while(running){
			
			//System.out.println(randtest.rand(10, 20));
			clock_time = clock.a;
				
				//System.out.print(text);
				if (clock_time%counter== 0){
					
					System.out.println(text);
				}
				
		try{
			//Utilility rand = new Utilility();
			
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
