package week3.day1;

public class ImplementationClass extends AxisBank {


	public void mandatoryKyc() {
		System.out.println("Driving License");
		}

	public void withdrawalLimit() {
		System.out.println("7000");
		}

	@Override
	public void carLoan() {
		System.out.println("7 Lakhs");
		}

	public static void main(String[] args) {
		ImplementationClass imp=new ImplementationClass();
		imp.withdrawalLimit();
		imp.mandatoryKyc();
		imp.carLoan();
		imp.goldLoan();
	}
}
