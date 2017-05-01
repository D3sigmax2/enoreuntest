package stations;
import persons.*;
import threads.*;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import graphics.Graphics;
import  persons.*;

public class Station {
	
	int pos[]= new int[2];
	private Graphics graphic;
	JLabel image;
	private ArrayList<Person> persons_received = new ArrayList<Person>();
	
	public Station(int rush_hours[][],Thread_clock clock,String img,int pos[],Graphics graphic){
		
		this.pos[0] = pos[0];
		this.pos[1] = pos[1];
		this.graphic = graphic;
		image = new JLabel( new ImageIcon(img));
		graphic.jframeadd(image, this.pos);
		CrowdGenerator generator = new CrowdGenerator(this.graphic,12, rush_hours, clock, this);
		generator.start();
		Thread_listmanager manager = new Thread_listmanager(this,this.graphic);
		
		manager.start();
		
	}
	public void getpersonlist(ArrayList<Person> persons){
		synchronized(persons_received){
		persons_received.addAll(persons);
		}
	}
	public int[] getpos(){
		return pos;
	}
	public ArrayList<Person> getpersons(){
		synchronized(persons_received){
		return persons_received;
		}
	}
	public void clearpersons(){
		synchronized(persons_received){
		persons_received.clear();
		}
	}
}