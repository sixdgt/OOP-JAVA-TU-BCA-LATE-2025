package examples;
// this is our custom exception class with specific message
public class CustomCredentialCheckException extends Exception{
	// constructor
	public CustomCredentialCheckException(String message) {
		// it will call the constructor of super class i.e Exception
		super(message);
	}

	public static boolean checkLogin(String username, String pwd) 
			throws CustomCredentialCheckException{
		if(username.equals("admin") && pwd.equals("12345")) {
			return true;
		} else {
			throw new CustomCredentialCheckException("Invalid credentials");
		}
	}
}
