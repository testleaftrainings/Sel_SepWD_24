package week1.day3;

public class LearnMethods {
	
	//Types of methods
	//Main method - To execute the program
	//Normal method - To perform an action
	
	//Functionality of mobile phone
	// makeCall, sendSms, takePhoto - User defined methodName
	//Naming convention of method is camelCase
	//Methods should be called by the objectName
	
	//Calling the methods
	//objectName.methodName
	
	//Method Signature
	public void makeCall() {
		System.out.println("Make Call");
			}
	
	public void sendSms() {
		System.out.println("Send Sms");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		
		LearnMethods phone= new LearnMethods();
		phone.makeCall();
		phone.sendSms();
	}
}
