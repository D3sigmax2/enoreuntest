package stations;
import persons.*;
import threads.*;

public class Station {
	
	public Station(int rush_hours[][],Thread_clock clock){

		CrowdGenerator generator = new CrowdGenerator(12, rush_hours, clock);
		generator.start();
		
	}

}