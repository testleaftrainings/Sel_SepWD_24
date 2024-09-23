package week3.day1;

public class CalculatorFunctinality {

	//Addition Operator
	//adding 2 numbers
	public void addNumbers(int a,int b) {
		System.out.println(a+b);
     }
	
	//adding 3 numbers
	public void addNumbers(int a,int b, int c) {
		System.out.println(a+b+c);
		}
	
	//adding 2 numbers with decimals
    public void addNumbers(float a,float b) {
		System.out.println(a+b);
		}
	
	public static void main(String[] args) {
		CalculatorFunctinality calc=new CalculatorFunctinality();	
        calc.addNumbers(1.5f, 3.5f);
        calc.addNumbers(7, 8);
        calc.addNumbers(2, 5, 7);
	}

}
