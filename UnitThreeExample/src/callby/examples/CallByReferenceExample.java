package callby.examples;

public class CallByReferenceExample {
	public static void main(String args[]) {
		Vat v = new Vat();
		v.vat_percent = 13.00;
		
		Item i = new Item("Gaming Mouse", 2000.00, "Electronics");
		System.out.println("Item Name: " + i.title);
		System.out.println("Item price: " + i.price);
		System.out.println("Item category: " + i.category);
		System.out.println("Item price with vat: " + i.getActualPrice(i, v));
	}
}
