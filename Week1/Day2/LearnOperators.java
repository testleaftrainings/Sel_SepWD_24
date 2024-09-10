package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		// Operators in java
		
		//Arithmetic Operators
		//Comparison Operators
		//Assignment Operators
		//Logical Operators
		
		//Assignment Operator
		//simple Assignment opeator 
		   int a=5;
		   System.out.println(a);
		
		//Complex Assignment Operator
		//a=a+7;
		  a+=7;
		  System.out.println("The value of a "+a);
		
		
		//Arithmetic Operators
		int b=11;
		int c=3;
		
		//addition
		System.out.println(b+c);
		
		//Subraction
		System.out.println(b-c);
		
		//Multiplication
		System.out.println(b*c);
		
		//Division
		System.out.println(b/c);
		
		//Module Operator
		System.out.println(b%c);
		
		
		System.out.println("------------------");
		
		
		//Comparison Operator
		// ==  equalTo
		// !=  notEqualTo
		//lessThan
		//lessThan or equalTO
		//greaterThan
		//greaterThanOrEqualTo
		
		int p=5;
		int q=7;
		
		System.out.println(p==q);
		System.out.println(p!=q);
		System.out.println(p<q);
		System.out.println(p<=q);
		System.out.println(p>q);
		System.out.println(p>=q);
		
		
	    System.out.println("-------------------");
		
		//Logical Operator
		//&& operator   -  Both conditions should satisfy   -true
		//|| Operator   -  Either of the condition satisfy  -true
		
		
		int s=20;
		int m=15;
		
		//And Operator
		System.out.println(s>m&&s>=m);
		
		//Or Operator
		System.out.println(s==m||s<m);
		
		System.out.println("---------------------");
		
		
		//Increment and Decrement Operator
		//Increment - preIncrement & postIncrement
		//Decremnet -preDecremnet & postDecrement
		
		  int k=7;
		
		//postIncrement  (Value increasing by 1 in the next iteration)
		
		System.out.println(k++);
		System.out.println(k);
		
		//preIncrement (Value increasing by 1 in the current iteration)
		System.out.println(++k);
		
		//postDecrement   (Value decreasing by 1 in the next iteration)
		System.out.println(k--);
		System.out.println(k);
		
		//preDecrement   (Value decreasing by 1 in the current iteration)
		System.out.println(--k);
		
		}

}
