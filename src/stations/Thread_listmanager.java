package stations;

import java.util.ArrayList;

import graphics.Graphics;
import persons.Person;

public class Thread_listmanager extends Thread{
	private boolean running = true;
	public int a;
	private Station station;
	private ArrayList<Person> persons;
	private Graphics graphic;
	
	public Thread_listmanager(Station station, Graphics graphic){
		
		this.station = station;
		this.graphic = graphic;
		
	}
	
	
	
	public void run(){
		
		while(running){
			 
			
			/*persons.addAll(station.getpersons());
			
			for(int i = 0; i < persons.size() ; i++){
				graphic.remove(persons.get(i).getimg());
				
			}
			persons.clear();
			station.clearpersons();*/
			try{
				
				Thread.sleep(100);
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void stopping(){
		
		this.running = false;

	}
}
