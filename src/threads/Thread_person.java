package threads;
import utility.Utilility;

public class Thread_person extends Thread{

	private boolean running = true;
	private String text;
	
	public Thread_person(String text) {
		// TODO Auto-generated constructor stub
		this.text = text;
	}

	public void run()
	{
		while(running){
			
			//System.out.println(randtest.rand(10, 20));
		System.out.println(text);
		try{
			Utilility rand = new Utilility();
			
			Thread.sleep(rand.rand(500, 1000));
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		}
	}
	
	public void stopping(){
		this.running = false;
	}
}
