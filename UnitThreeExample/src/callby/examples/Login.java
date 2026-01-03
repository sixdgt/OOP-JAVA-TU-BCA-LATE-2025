package callby.examples;
// call by value example
public class Login {
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	public boolean checkLogin(String uname, String pwd) {
		if(uname.equals("admin") && pwd.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String args[]) {
		Login l = new Login();
		System.out.println("Login Status: " + l.checkLogin("admin", "1234"));
		System.out.println("Sum of two whole number: " + l.sum(11, 15, 23));
	}
}
