package week1.day4;

public class LearnString {

	public static void main(String[] args) {
		// Declare String Literal
		String str1="TestLeaf";    //str1-reference address 5678
		String str2="TestLeaf";    //str2-reference address 5678
		
		
		//Declare String Instantiation
		String str3=new String("TestLeaf");
		
		
		//  ==         Compares the address of two strings
		// .equals     Compares the values
		
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		
        System.out.println("-----------------");
		
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
		
		System.out.println("--------------------");
		
		//equals ignore case
		  System.out.println(str1.equalsIgnoreCase(str3));
		
		//Contains  - Checks the partial match
		  System.out.println(str1.contains(str3));
		
		
		  System.out.println("----------------------");
		
		 //To find the length of String
		
		String str="WD Sep 2024";
		int lengthOfString = str.length();
		System.out.println(lengthOfString);
		
		
		//To convert all the characters to uppercase
		  String upperCase = str.toUpperCase();
		  System.out.println(upperCase);
		
		
		//replaceAll
		String replaceAll = str.replaceAll("[0-9]","");
		System.out.println(replaceAll);
		
		System.out.println("----------------------");
		
		//parseInt
		String amount="10000";
		String interest="100";
		System.out.println(amount+interest);
		
		
		//Converting String to Integer
		
		int amount1 = Integer.parseInt(amount);
	    int interest1 = Integer.parseInt(interest);
	 
	    System.out.println(amount1+interest1);
		
	}
}
