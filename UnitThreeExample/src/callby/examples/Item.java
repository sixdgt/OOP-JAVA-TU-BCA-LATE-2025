package callby.examples;

public class Item {
	public String title;
	public double price;
	public String category;
	// constructor
	public Item(String t, double p, String c) {
		this.title = t;
		this.price = p;
		this.category = c;
	}
	
	public double getActualPrice(Item i, Vat v) {
		double actual_price = i.price + v.calculateVatAmount(i);
		return actual_price;
	}
}
