package persons;
import threads.Thread_person;

public class Person extends AbPerson {
	
	public Person(String text){
		
		Thread_person thread = new Thread_person(text);
		thread.start();
		
	}
	

}
