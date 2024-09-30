package week3.day3;

import java.util.Set;
import java.util.TreeSet;

public class RemovingDuplicates {
	
	
	public static void main(String[] args) {
	 int numbers[]= {2,3,4,2,5,3};
    //index          0 1 2 3 4 5
	 
	//Declare Set
	 Set<Integer> uniqueNumbers=new TreeSet<Integer>();
	 
	 for (int i = 0; i < numbers.length; i++) {
		 //0 1 2 3 4 5
		 uniqueNumbers.add(numbers[i]);
	}
	 System.out.println("Unique Numbers: "+uniqueNumbers);
}

}
