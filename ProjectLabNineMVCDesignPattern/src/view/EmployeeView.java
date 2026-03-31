package view;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import controller.EmployeeController;

public class EmployeeView {
	EmployeeController ec;
	
	public EmployeeView() {
		ec = new EmployeeController();
	}
	
	public void program() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("**** Welcome to MVC Design Pattern Session ****");
		System.out.println("*****************************************");
		System.out.println("To add employee record enter: ADD");
		System.out.println("To view employee detail enter: VIEW");
		System.out.println("Enter Action: ");
		String action = sc.next();
		if (action.toLowerCase().equals("add")) {
			System.out.println("Enter all the required information.");
			
			System.out.println("Enter Employee No: ");
			int emp_no = sc.nextInt();
			
			System.out.println("Enter Full Name: ");
			String full_name = sc.next();
			
			System.out.println("Enter Email: ");
			String email = sc.next();
			
			System.out.println("Enter Designation: ");
			String designation = sc.next();
			
			System.out.println("Enter Department: ");
			String department = sc.next();
			
			Map<String, String> req_data = new HashMap<>();
			req_data.put("emp_no", emp_no + "");
			req_data.put("full_name", full_name);
			req_data.put("email", email);
			req_data.put("designation", designation);
			req_data.put("department", department);
			if(ec.recordEmployee(req_data)) {
				System.out.println("Add successfully");
				program();
			}
			program();
		} else if (action.toLowerCase().equals("view")) {
			ec.showEmployee();
			program();
		} else {
			System.out.println("Please enter correct action.");
			program();
		}
		sc.close();
	}
	
	public static void main(String args[]) {
		EmployeeView ev = new EmployeeView();
		ev.program();
	}
}
