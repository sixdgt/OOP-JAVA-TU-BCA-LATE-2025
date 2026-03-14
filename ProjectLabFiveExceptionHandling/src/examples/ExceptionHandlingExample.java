package examples;

import java.io.IOException;

public class ExceptionHandlingExample {
	public static void main(String args[]) {
		// Using Try-Catch Block
		try {
			System.out.println("Example One: " + (100/0));
		} catch(Exception e) {
			System.out.println("Message: " + e.getMessage());
		}
		
		// Using Try-Catch with Finally
		try {
			int arr[] = {12, 11, 13, 14};
			System.out.println("Example Two: " + arr[12]);
		} catch(Exception e) {
			System.out.println("Message: " + e.getMessage());
		} finally {
			System.out.println("Finally block is executed..");
		}
		
		// multiple catch block
		try {
			System.out.println("Example Three: " + (100/0));
			int arr[] = {12, 11, 13, 14};
			System.out.println("Example Four: " + arr[12]);
		} catch(ArithmeticException ae) {
			System.out.println("Message: " + ae.getMessage());
		} catch(IndexOutOfBoundsException ie) {
			System.out.println("Message: " + ie.getMessage());
		} catch(Exception e) {
			System.out.println("Message: " + e.getMessage());
		}
		// Other Exception classes: NullPointerException, NumberFormatException
		// NullPointerException
		try {
		    String name = null;
		    // it will not raise exception when simply printing the 'null' object
		    System.out.println("Example Five: NullPointerException example");
		    // if we use string function/method then it will raise exception
		    int len = name.length();
		    if(len > 2) {
		        System.out.println("Total Length:" + len);
		    }
		} catch(Exception e) {
		    System.out.println("Message: " + e.getMessage());
		}
		
		// another example: ArithmeticException with 'throw' & 'new' keyword
		System.out.println("Example Six: ");
		try {
			int age = 15;
			if(age < 18) {
				throw new ArithmeticException("You're not eligible to vote.");
			}
		} catch(Exception e) {
			System.out.println("Message: " + e.getMessage());
		}
		
		// example of throws
		try {
			System.out.println("Example Seven: ");
			// checkAge() is static that's why it is being called with class name directly
			ExceptionHandlingExample.checkAge(13); 
		} catch(Exception e) {
			System.out.println("Message: " + e.getMessage());
		}
		
		// our custom exception with specific message
		try {
			System.out.println("Example Eight: CustomException");
			// note: CustomCredentialCheckException must be created extending Exception
			// also, checkLogin() should be implemented with 'throws' & 'throw' keyword
			CustomCredentialCheckException.checkLogin("dav", "1234");
		} catch (Exception e) {
			System.out.println("Message: " + e.getMessage());
		}
		
		// our custom exception without specific message
		try {
			System.out.println("Example Nine: CustomException");
			System.out.println("Check eligibility: " + CustomAgeException.checkAge(12));
		} catch (Exception e) {
			// no specific message in class so displaying custom message
			System.out.println("Message: Not eligible");
		}
	}
	// 'throws' keyword example with method
	public static void checkAge(int age) throws ArithmeticException{
		if (age < 18) {
			throw new ArithmeticException("You're not eligible to vote.");
		}
		System.out.println("You'are eligible to vote");
	}
}
