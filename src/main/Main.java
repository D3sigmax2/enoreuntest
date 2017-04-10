package main;
import threads.*;
import data.*;
import persons.*;
import stations.*;

public class Main {

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
		/*Thread_person person= new Thread_person("person_one",clock,8);
		Thread_person person_two= new Thread_person("            person_two",clock,6);
		person.start();
		person_two.start();*/
		Rush_hours hours = new Rush_hours();
		Station station = new Station(hours.first_station,clock);
		Station station2 = new Station(hours.second_station,clock);
		
	}
	
}
