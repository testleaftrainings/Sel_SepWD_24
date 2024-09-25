package week3.day2;

public class StringMethods {

	public static void main(String[] args) {
		// To convert the string into characters
		
		String str="SepWDBatch";
		//toCharArray - converts string into characters
		
		// {S,e,p,W,D,B,a.t,c,h}
		//  0 1 2 3 4
		
		char[] characterOfWord  = str.toCharArray();
		
		for (int i = 0; i < characterOfWord.length; i++) {
			System.out.println(characterOfWord[i]);
		}
		
		// retrieve a char at particular index
		//charAt
		char charAt = str.charAt(7);
		
	}

}
