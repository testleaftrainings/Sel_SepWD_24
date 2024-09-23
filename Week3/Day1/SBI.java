package week3.day1;

public class SBI implements RBI {
	
	
	public void depositAmount() {
		System.out.println("1 Lakh");

	}

	public void mandatoryKyc() {
		System.out.println("Aadhaar Card");
		
	}

	public void withdrawalLimit() {
	System.out.println("10000");
		
	}
	
	public static void main(String[] args) {
		SBI sb=new SBI();
		sb.mandatoryKyc();
		sb.withdrawalLimit();
		sb.depositAmount();
		}

}
