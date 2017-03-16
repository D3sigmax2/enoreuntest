package main;
import threads.Thread_person;
import persons.Person;

public class Main {

	public static void main(String[] args){
		String text = "test";
		String text2 = "salut";
		/*Thread_person person1 = new Thread_person(text);
		Thread_person person = new Thread_person(text2);
		person.start();
		person1.start();*/
		Person person = new Person(5);
		Person person1 = new Person(5);
		
		
	}
	
}
