package inheritance.single.example;

public class Car extends Vehicle{
	public String category;
	public String total_seat;
	
	public void getCarInfo() {
		System.out.println("I am car..");
		// using parent's properties inside class
		System.out.println("Brand: " + this.brand);
		System.out.println("Model: " + this.model);
		System.out.println("Color: " + this.color);
		// own properties
		System.out.println("Category: " + this.category);
		System.out.println("Total Seat: " + this.total_seat);
	}
}
