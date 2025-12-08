package cli.example;

public class CliArgExample {
	public static void main(String args[]) {
		try {
			System.out.println(args[0]);
		} catch(Exception e) {
			System.out.println("Pass the argument");
		}
		System.out.println("Testing CLI Arguments");
	}
}
