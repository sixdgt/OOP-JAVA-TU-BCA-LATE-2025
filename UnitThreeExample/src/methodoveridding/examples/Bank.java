package methodoveridding.examples;

public class Bank {
	public String name;
	public String email;
	public String contact;
	
//	Bank(String name, String contact){
//		this.name = name;
//		this.contact = contact;
//	}
//	
//	Bank(String name){
//		this.name = name;
//	}
//	
//	Bank(String name, String email, String contact){
//		this.name = name;
//		this.email = email;
//		this.contact = contact;
//	}
	float getRateOfInterest() {
		float standard_rate = 2.5f;
		return standard_rate;
	}
//	
//	public static void main(String args[]) {
//		Bank b1 = new Bank("NIC Asia");
//		Bank b2 = new Bank("Prime", "98745");
//		Bank b3 = new Bank("SBI", "9874", "contact@sbi.bank.com");
//	}
}
