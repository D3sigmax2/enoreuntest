package persons;
import java.util.ArrayList;

import graphics.Graphics;
import threads.*;
import stations.Station;

public class CrowdGenerator extends Thread {
	private boolean running = true;
	private int importance, rush_hours[][], clock_time;
	private int time = 1;
	private ArrayList<Person> persons = new ArrayList<Person>();
	Thread_clock clock;
	private String text;
	Station station;
	private Graphics graphic;
	
	public CrowdGenerator(Graphics graphic, int importance, int rush_hours[][], Thread_clock clock, Station station) {
		
		this.graphic = graphic;
		this.importance = importance;
		this.rush_hours = rush_hours;
		this.clock = clock;
		this.station = station;
	}
	
	public void run(){
		
			while(running){
				
				if(clock.a == 0){
					time = 1;
				}
				if(rush_hours[0][time]==clock.a&&clock.a != clock_time){
					for(int k = 0; k <rush_hours[1][time];k++){
						
						persons.add(new Person(1,6,station,this.graphic));
						
					}
					clock_time = clock.a;
					//System.out.println();
					//System.out.println(persons.size());
					if(time < rush_hours[0].length-1){
						time++;
					}
				}
				if(0 == clock.a%rush_hours[0][0]&&rush_hours[0][time]!=clock.a&&clock.a != clock_time){
					for(int k = 0; k < rush_hours[1][0];k++){
						
						persons.add(new Person(1,6,station,this.graphic));
						
					}
					clock_time = clock.a;
					//System.out.print(" "+persons.size());
				}
				
				
				if(persons.size()!=0){
					System.out.println(clock.a + " " +persons.size());
					
				}
				station.getpersonlist(persons);
				
				persons.clear();
				try{
					Thread.sleep(1);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				
			}
		
	}
	
	public void stopping(){
		
		this.running = false;

	}
}
