package persons;
import threads.Thread_person;
import utility.Utility;

public class Person extends AbPerson {
	
	public Person(int start, int numberOfStops){
		
		super();
		this.start = start;
		this.stop = choose_destination(numberOfStops);
		
		
	}
	
	public int choose_destination(int numberOfStops){
		
		Utility random = new Utility();
		return random.rand(0, numberOfStops);
		
		
	}
	

}
