package week3.day1;

public class HDFC implements RBI {

	public void mandatoryKyc() {
		System.out.println("Pan card");
		}

	public void withdrawalLimit() {
		System.out.println("5000");
		}
	
	public static void main(String[] args) {
		HDFC hd=new HDFC();
		hd.mandatoryKyc();
		hd.withdrawalLimit();
	}

}
