package examples.single;

public class User {
	public String first_name;
	public String last_name;
	public String username;
	public String role;
	
	public void showUserDetail() {
		System.out.println("First Name: " + this.first_name);
		System.out.println("Last Name: " + this.last_name);
		System.out.println("Username: " + this.username);
		System.out.println("Role: " + this.role);
	}
}
