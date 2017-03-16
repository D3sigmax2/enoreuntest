package tests;
import utility.Utility;

public class test_rand {
	

	public static void main(String[] args){
		int count_errors = 0;
		int min=0;
		int max=9;
		for(int i = 0; i<1000; i++){
			
			Utility random = new Utility();
			int randomnumb =random.rand(min,max);
			
			System.out.print(randomnumb);
			
			if(randomnumb>max || randomnumb<min){
					
				System.out.println("                               error");
				count_errors++;
				
			}else{
				System.out.println("");
			}
			
			
		}
		System.out.println(count_errors);
	}
}