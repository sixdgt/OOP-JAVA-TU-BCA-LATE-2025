package exceptions;

import java.lang.ArithmeticException;

public class ArrayBoundExceptionExample {
	public static void main(String args[]) {
		// arraybound exception example
		int even[] = {12, 14, 16, 18, 20};
		System.out.println("Total Array Length: " + even.length);
		System.out.println("Array Bounds Exception Example");
		System.out.println("Index 2: " + even[2]);
		try {
			System.out.println(100/0);
			System.out.println("Index 12: " + even[12]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Message: " + e.getMessage());
		} catch (ArithmeticException e2) {
			System.out.println(e2.getMessage());
		} catch (Exception e3) {
			System.out.println(e3.getMessage());
		} finally {
			
		}
		System.out.println("Index 3: " + even[3]);
	}
}
