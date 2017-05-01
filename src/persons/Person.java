package persons;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import graphics.Graphics;
import stations.Station;
import threads.Thread_person;
import utility.Utility;

public class Person {
	
	
	Utility random = new Utility();
	int pos[] = new int[2];
	Station station;
	private Graphics graphic;
	JLabel image;
	private int start;
	private int stop;
	
	public Person(int start, int numberOfStops, Station station, Graphics graphic){
		
		
		image = new JLabel( new ImageIcon("person.png"));
		this.start = start;
		this.stop = choose_destination(numberOfStops);
		this.station = station;
		this.graphic = graphic;
		this.pos[0]= random.rand(station.getpos()[0]+100, station.getpos()[0]+300);
		this.pos[1]= random.rand(station.getpos()[1], station.getpos()[1]+100);
		
		this.graphic.jframeadd(image,this.pos);
		
	}
	
	public int choose_destination(int numberOfStops){
		return random.rand(0, numberOfStops);
	}
	public int[] getpos(){
		return pos;
	}
	public JLabel getimg(){
		
		return image;
		
	}
	
	public void setpos(int pos[]){
		this.pos[0] = pos[0];
		this.pos[1] = pos[1];
	}
	
	public void update(){
		graphic.setlocation(image, this.pos);
	}
	

}
