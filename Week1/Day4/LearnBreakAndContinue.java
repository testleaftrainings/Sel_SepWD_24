package week1.day4;

public class LearnBreakAndContinue {

	public static void main(String[] args) {
		// Break Statement
		//It breaks the loop and terminate out of the loop
		
		for (int i = 1; i <= 5; i++) {
			
			if(i==3) {
				break;
			}
			
			System.out.println(i);
	}
		
		System.out.println("--------------------------");
		
		//Continue - It skips the current iteration and executes the remaining

	       for (int i = 1; i <=10; i++) {
			if(i==7) {
				continue;
			}
			
			System.out.println(i);
		}
		
	}

}
