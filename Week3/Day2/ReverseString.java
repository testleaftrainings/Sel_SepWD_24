package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		String str="SepWDBatch";
		//          hctaBDWpeS
		
		char[] charArray = str.toCharArray();
                    //9 8 7 6 5 4 3 2 1 0
		for (int i = charArray.length-1 ; i >=0; i--) {
			System.out.println(charArray[i]);
		}
		
		System.out.println("-----------------");
		
		//charAT
		String st="Batch";
		  //       hctaB
		for (int i = st.length()-1; i >=0; i--) {
			System.out.println(st.charAt(i));
		}
	}
}
