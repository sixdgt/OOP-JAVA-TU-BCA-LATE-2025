package casestudy;

import java.util.Scanner;

public class Main {
	Employee e; // declaring employee object
	// constructor
	public Main(){
		e = new Employee(); // initializing employee object
	}
	// method
	public void program() {
//		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("************************");
		System.out.println("***** Case Study One: Class, Object, Method, Recursive & Scanner *****");
		System.out.println("*************************");
		System.out.println("********** Enter the actions below to operate ******");
		System.out.println("1. VIEW 2. CHECK 3. ADD 4. EXIT");
		String action = sc.next();
		if(action.toUpperCase().equals("VIEW")) {
			e.showEmployee();
			program(); // here our program method will be recursive
		} else if (action.toUpperCase().equals("CHECK")) {
			if(!e.checkEmployeeRecord()) {
				System.out.println("Already added");
			} else {
				System.out.println("No record found");
			}
			program();
		} else if (action.toUpperCase().equals("ADD")) {
			System.out.println("Enter Employee Name: ");
			e.full_name = sc.next();
			System.out.println("Enter Email: ");
			e.email = sc.next();
			System.out.println("Enter Contact: ");
			e.contact = sc.next();
			System.out.println("Enter Designation: ");
			e.designation = sc.next();
			System.out.println("Enter Address: ");
			e.address = sc.next();
			System.out.println("Enter Shift: ");
			e.shift = sc.next();
			e.recordEmployeeData(); // adding employee
			System.out.println("********* Employee added **********");
			program();
		} else if (action.toUpperCase().equals("EXIT")) {
			System.out.println("************ Program is shutting down....... *******");
		} else {
			System.out.println("******* Please enter action properly *****");
			program();
		}
	}
	public static void main(String args[]) {
		Main m = new Main();
		m.program();
	}
}
