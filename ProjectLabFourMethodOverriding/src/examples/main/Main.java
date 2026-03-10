package examples.main;

import examples.abstraction.Circle;
import examples.abstraction.Shape;
import examples.abstraction.Rectangle;
import examples.interfaces.User;
import examples.interfaces.Admin;
import examples.interfaces.Staff;

public class Main {
	public static void main(String args[]) {
		System.out.println("Abstraction Examples..");
		Circle c = new Circle();
		c.radius = 8;
		System.out.println("Area of cicle: " + c.calculateArea());
		System.out.println("Perimeter of circle: " + c.calculatePerimeter());
		
		Rectangle r = new Rectangle();
		r.length = 6;
		r.breadth = 3;
		System.out.println("Area of rectangle: " + r.calculateArea());
		System.out.println("Perimeter of rectangle: " + r.calculatePerimeter());
		System.out.println();
		System.out.println("Interface Examples..");
		
		User a = new Admin();
		System.out.println("Admin Login: " + a.login("admin", "admin"));
		System.out.println("Admin Status: " + a.isActive("davadmin"));
		
		User s = new Staff();
		System.out.println("Staff Login: " + s.login("davastaff", "staff"));
		System.out.println("Staff Status: " + s.isActive("davastaff"));
	}
}
