package persons;
import java.util.ArrayList;

import threads.*;

public class CrowdGenerator extends Thread {
	private boolean running = true;
	private int importance, rush_hours[][], clock_time;
	private int time = 1;
	public ArrayList<Person> persons = new ArrayList<Person>();
	Thread_clock clock;
	private String text;
	
	public CrowdGenerator(int importance, int rush_hours[][], Thread_clock clock, String text) {
		
		this.importance = importance;
		this.rush_hours = rush_hours;
		this.clock = clock;
		this.text = text;
	}
	
	public void run(){
		
			while(running){
				
				if(clock.a == 0){
					time = 1;
				}
				if(rush_hours[0][time]==clock.a&&clock.a != clock_time){
				
					for(int k = 0; k <rush_hours[1][time];k++){
						
						persons.add(new Person(1,6));
						
					}
					clock_time = clock.a;
					//System.out.println();
					//System.out.println(persons.size());
					if(time < rush_hours[0].length-1){
						time++;
					}
				}
				else if(0 == clock.a%rush_hours[0][0]&&rush_hours[0][time]!=clock.a&&clock.a != clock_time){
					
					for(int k = 0; k < rush_hours[1][0];k++){
						
						persons.add(new Person(1,6));
						
					}
					clock_time = clock.a;
					//System.out.print(" "+persons.size());
				}
				
				
				if(persons.size()!=0){
					System.out.println(text + clock.a + " " +persons.size());
				}
				persons.clear();
				try{
					Thread.sleep(0);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				
			}
		
	}
	
	public void stopping(){
		
		this.running = false;

	}
}
