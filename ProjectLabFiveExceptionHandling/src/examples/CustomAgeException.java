package examples;

public class CustomAgeException extends Exception{
	
	public static boolean checkAge(int age) throws CustomAgeException{
		if (age < 18) {
			throw new CustomAgeException();
		}
		return true;
	}
}
