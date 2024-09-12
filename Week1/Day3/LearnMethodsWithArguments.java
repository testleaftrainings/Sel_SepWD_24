package week1.day3;

public class LearnMethodsWithArguments {
	
	
	//shortcut to create the method
	//Type methodName -> Then type ctrl+space
	public void takePhoto(boolean ext) {
		System.out.println(ext);
		}
	
   public static void main(String[] args) {
		LearnMethodsWithArguments photo=new LearnMethodsWithArguments();
		photo.takePhoto(false);
		
		//Default Values
		//String -Null
		//int  - 0
		//boolean - false
	}

}
