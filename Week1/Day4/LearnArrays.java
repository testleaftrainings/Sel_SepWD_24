package week1.day4;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// To store numbers from 1 to 5
		
//		int a=1;
//		int b=2;
//		int c=3;
//		int d=4;
//		int e=5;
		
		//Declare Array by Instantiation
		//Store 5 Marks of a student
		
		int[] marks=new int[5];  // 0 1 2 3 4
		// 81,92,94,88,81
		marks[0]=81;
		marks[1]=92;
		marks[2]=94;
		marks[3]=88;
		marks[4]=81;
		
		
		
		//To store scores of a batsman
		
		//Declare Array by Literal
		      //index    0  1  2   3  4
		int[] scores = {80,50,100,10,78};
		
		
		//Methods of Array
		
		//To find the length of an Array
		int lengthOfArray= scores.length;
		System.out.println(lengthOfArray);
		
		//To retrieve a value from array
		//Score of 3rd match
		System.out.println("Score in 3rd match is "+scores[2]);
		
		//To sort the array:
		//Sorting it in ascending order
		//  Before Sorting  {80,50,100,10,78}
		//  After Sorting   {10,50,78,80,100}
		
		   Arrays.sort(scores);
		
		   System.out.println(scores[2]);
		
		//Print all the values
		
		
		//  0 1   2  3  4
		//{10,50,78,80,100}
		
		for (int i = 0; i < lengthOfArray ; i++) {
			
			System.out.println(scores[i]);  // scores[0] scores[1]
		}
		
		//To get the least value
		  System.out.println("Least Value "+scores[0]);
		
		//To get the largest value
		  System.out.println("Largest value "+scores[lengthOfArray-1]);
		
		}

}
