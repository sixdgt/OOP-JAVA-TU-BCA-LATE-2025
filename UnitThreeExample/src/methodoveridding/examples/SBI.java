package methodoveridding.examples;

public class SBI extends Bank{
	@Override
	float getRateOfInterest() {
		System.out.println("This is the annual interest rate of SBI");
		float sbi_rate = 5.6f;
		System.out.println("Current Rate: " + sbi_rate);
		return sbi_rate;
	}
}
