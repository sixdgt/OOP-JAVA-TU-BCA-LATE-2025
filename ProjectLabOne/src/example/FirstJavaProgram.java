package example;

public class FirstJavaProgram {
	public static void main(String args[]) {
		System.out.println("My First Java Program");
		
		// single line comment
		// note: comment will not allocated memory and
		// comment are not readable while executing the program
		/*
		 * Multiple line comment
		 **/
		System.out.println("Comments are not seen while the program runs");
		
		System.out.println("Trying out some operators in Java");
		System.out.println("Arithematic Operator Example");
		// 1. Addition
		int a = 5;
		int b = 6;
		System.out.println("Sum of two whole number: " + (a + b));
		
		float price = 1500.0f;
		float vat = 150.0f;
		System.out.println("Total Price: " + (price + vat));
		
		// 2. subtraction
		float discount = 250.0f;
		System.out.println((price + vat) - discount);
	}
}
