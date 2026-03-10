package examples.single;
// Customer inherits User class here
public class Customer extends User{
	public String email;
	public int customer_id;
	public String contact;
	public String current_address;
	
	public void showCustomerDetail() {
		System.out.println("First Name: " + this.first_name);
		System.out.println("Last Name: " + this.last_name);
		System.out.println("Username: " + this.username);
		System.out.println("Role: " + this.role);
		System.out.println("Email: " + this.email);
		System.out.println("Customer ID: " + this.customer_id);
		System.out.println("Contact No: " + this.contact);
		System.out.println("Current Address: " + this.current_address);
	}
}
