package inheritance.single.example;

public class SingleMain {
	public static void main(String args[]) {
		Car c = new Car();
		c.category = "EV";
		c.total_seat = "six";
		// using parent's properties with object
		c.brand = "Tesla";
		c.model = "2025";
		c.color = "Black";
		c.vehicleInfo();
		c.getCarInfo();
	}
}
