package main;
import threads.Thread_person;


public class Main {

	public static void main(String[] args){
		String text = "test";
		String text2 = "hello";
		Thread_person person1 = new Thread_person(text);
		Thread_person person = new Thread_person(text2);
		person.start();
		person1.start();
		
		
	}
	
}
