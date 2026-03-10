package examples.abstraction;

public abstract class Shape {
	// abstract method
	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();
	
	// non-abstraction method
	public void info() {
		System.out.println("I am shape");
	}
}
