package utility;
import java.util.concurrent.ThreadLocalRandom;

public class Utility {
	
	public int rand(int min,int max){
		
		
		return ThreadLocalRandom.current().nextInt(min, max + 1);
		
		
	}
	
}
