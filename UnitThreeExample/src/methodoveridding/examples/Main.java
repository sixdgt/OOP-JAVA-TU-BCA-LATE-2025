package methodoveridding.examples;

public class Main {
	public static void main(String args[]) {
		Bank b = new Bank();
		System.out.println("Interest rate of Bank: " + b.getRateOfInterest());
		
		SBI branch = new SBI();
		System.out.println("Interest rate of SBI: " + branch.getRateOfInterest());
	}
}
