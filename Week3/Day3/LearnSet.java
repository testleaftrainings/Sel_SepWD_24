package week3.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// Set - Interface
		//Declaration of Set
		//HashSet
		
		//Set<String> mentors=new HashSet<String>();
		
		//TreeSet
		//Set<String> mentors=new TreeSet<String>();
		
		//LinkedHashSet- Insertion Order
		Set<String> mentors =new LinkedHashSet<String>();
		
		mentors.add("Saranya");
		mentors.add("Vinoth");
		mentors.add("Bhuvanesh");
		mentors.add("Anburaj");
		
		System.out.println("Mentors Names: "+mentors);
		
		
		//remove an element
		mentors.remove("Vinoth");
		
		System.out.println("Current set: "+mentors);
		
		//add duplicate
		mentors.add("Saranya");
		
		System.out.println("After adding duplicate: "+mentors);
		
		//To find the size
		int sizeOfSet = mentors.size();
		
		System.out.println("Set Size is :"+sizeOfSet);
     
//		[Saranya, Bhuvanesh, Anburaj]
		// 0          1         2
		
		//addAll
		
		Set<String> trainers=new HashSet<String>();
		trainers.addAll(mentors);
		System.out.println("Current trainers names: "+trainers);
		
		//Retrieve particular based on index
		//declare empty list
		
		List<String> staffs=new ArrayList<String>(trainers);
		
		System.out.println("Current List is: "+staffs);
		
		//Retrieve a particular value
		String index1Value= staffs.get(1);
		System.out.println("Index 1 value: "+index1Value);
		
		}

}
