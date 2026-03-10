package examples.single;

public class SingleMain {
	public static void main(String args[]) {
		// When creating object of User it only carries properties of User class
		System.out.println("User properties:");
		User u1 = new User();
		u1.first_name = "Rajesh";
		u1.last_name = "Hamal";
		u1.username = "rhuser";
		u1.role = "admin";
		u1.showUserDetail();
		System.out.print("-----------------");
		// When creating object of Customer, it carries both User & Customer class properties
		System.out.println("Customer properties:");
		Customer c1 = new Customer();
		c1.customer_id = 1;
		c1.email = "hitesh@gmail.com";
		c1.contact = "9876543210";
		c1.current_address = "Dhobighat, Lalitpur";
		System.out.println("It shows properties of User NULL because no data assigned..");
		c1.showCustomerDetail();
		// User class properties
		c1.first_name = "Hitesh";
		c1.last_name = "Rijal";
		c1.username = "hruser";
		c1.role = "Developer";
		System.out.println("After User properties added.");
		c1.showCustomerDetail();
	}
}
