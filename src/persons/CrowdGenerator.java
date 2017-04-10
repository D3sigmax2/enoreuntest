package persons;
import java.util.ArrayList;

import threads.*;

public class CrowdGenerator extends Thread {
	private boolean running = true;
	private int importance, rush_hours[][];
	private int time = 1;
	public ArrayList<Person> persons = new ArrayList<Person>();
	Thread_clock clock;
	
	public CrowdGenerator(int importance, int rush_hours[][], Thread_clock clock) {
		
		this.importance = importance;
		this.rush_hours = rush_hours;
		this.clock = clock;
		
	}
	
	public void run(){
		
			while(running){
				
				if(clock.a == 0){
					time = 1;
				}
				if(rush_hours[0][time]==clock.a){
				
					for(int k = 0; k <rush_hours[1][time];k++){
						
						persons.add(new Person(1,6));
						
					}
					//System.out.println();
					System.out.println(persons.size());
					if(time < rush_hours[0].length-1){
						time++;
					}
				}
				else{
					
					for(int k = 0; k < rush_hours[1][0];k++){
						
						persons.add(new Person(1,6));
						
					}
					
					//System.out.print(" "+persons.size());
				}
				
				
				System.out.println(time);
				
				persons.clear();
				
			}
		
	}
	
	public void stopping(){
		
		this.running = false;

	}
}
