package main;
import threads.*;
import data.*;
import persons.*;
import stations.*;
import graphics.Graphics;
public class Main {

	private static int pos[] = {20,20};
	private static int pos1[] = {400,20};
	private static int pos2[] = {800,20};
	private static int pos3[] = {1200,20};
	private static int pos4[] = {20,300};
	private static int pos5[] = {400,300};
	private static int pos6[] = {800,300};
	private static int pos7[] = {1200,300};
	private static int pos8[] = {20,700};
	private static int pos9[] = {400,700};
	private static String image = "station.png";
	
	
	
	public static void main(String[] args){
		//String text = "test";
		//String text2 = "salut";
		/*Thread_person person1 = new Thread_person(text);
		Thread_person person = new Thread_person(text2);
		person.start();
		person1.start();*/
		//Person person = new Person(5,10);
		//Person person1 = new Person(5,10);
	
		Thread_clock clock = new Thread_clock();
		clock.start();
		Graphics graphic = new Graphics();
		graphic.start();
		/*Thread_person person= new Thread_person("person_one",clock,8);
		Thread_person person_two= new Thread_person("            person_two",clock,6);
		person.start();
		person_two.start();*/
		Rush_hours hours = new Rush_hours();
		Station station = new Station(hours.first_station,clock,image,pos,graphic);
		Station station1 = new Station(hours.first_station,clock,image,pos9,graphic);

		//Person person = new Person(2,4,station,graphic);
		Station station2 = new Station(hours.second_station,clock,image,pos1,graphic);
		Station station3 = new Station(hours.third_station,clock,image,pos2,graphic);
		Station station4 = new Station(hours.second_station,clock,image,pos3,graphic);
		Station station5 = new Station(hours.third_station,clock,image,pos4,graphic);
		Station station6 = new Station(hours.second_station,clock,image,pos5,graphic);
		Station station8 = new Station(hours.third_station,clock,image,pos6,graphic);
		Station station9 = new Station(hours.second_station,clock,image,pos7,graphic);
		Station station10 = new Station(hours.third_station,clock,image,pos8,graphic);
		
	}
	
}
