package operators.example;

public class JavaOperatorExample {
	public static void main(String args[]) {
		// Java Operators Example
		// 1. Assignment Operator
		int num = 12;
		System.out.println("Value of Num: " + num);
		num += 10;
		System.out.println("Value of Num: " + num);
		// it will work in similar way for -, *, /
		int price = 1400;
		int discount = 240;
		System.out.println("Price: " + price);
		System.out.println("Discount: " + discount);
		price -= discount;
		System.out.println("New Price after discount: " + price);
		
		// 2. Arithmetic Operator
		/* + addition 
		 * - subtraction
		 * * multiplication
		 * / division
		 * % modulus - it will return remainder value
		 **/
		// try addition, subtraction, multiplication and division yourself
		// modulus example
		int num_one = 23;
		System.out.println("Modulus example one: " + (num_one % 3));
		System.out.println("Modulus example two: " + (num_one % 2));
		
		// 3. Logical Operator
		// && and
		// || or
		// ! not
		boolean status = true;
		String username = "admin";
		// in this case it will print true because both statement are true
		System.out.println("Logical Operator AND: " + (status == true && username == "admin"));
		// in this case it will print false because one condition is false
		System.out.println("Logical Operator AND: " + (status == false && username == "admin"));
		// in case of OR if any of the condition is true then it will give us true output
		System.out.println("Logical Operator OR: " + (status == true || username == "guest"));
		// `not` will return false if true and `true` if false
		System.out.println("Logical Operator NOT: " + (!(status == true)));
		
		// 4. comparative operator
		// < less than
		// <= less than equals to
		// > greater than
		// >= greater than equals to
		// == equals to
		// != not equals to
		int total_student = 100;
		System.out.println("Less than: " + (total_student < 200)); // true
		System.out.println("Less than equals to: " + (total_student <= 200)); // true
		System.out.println("Greater than: " + (total_student > 200)); // false
		System.out.println("Greater than equals to: " + (total_student >= 200)); // false
		System.out.println("Greater than equals to: " + (total_student >= 100)); // true
		System.out.println("Equals to: " + (total_student == 100)); // true
		System.out.println("Not equals to: " + (total_student != 100)); // false
		
		// 5. bitwise operator
		// & bitwise AND
		// | bitwise OR
		// ^ bitwise XOR
		// ~ bitwise NOT
		int number_one = 12;
		int number_two = 14;
		System.out.println("Bitwise AND: " + (number_one & number_two));
		System.out.println("Bitwise OR: " + (number_one | number_two));
		System.out.println("Bitwise XOR: " + (number_one ^ number_two));
		System.out.println("Bitwise NOT: " + (~number_one));
		
		// 6. Shift Operator
		// << Left Shift
		// >> right shift
		System.out.println("Left Shift: " + (number_one << 2)); // shift by 2 bit
		System.out.println("Right Shift: " + (number_two >> 2)); // shift by 2 bit
	}
}
