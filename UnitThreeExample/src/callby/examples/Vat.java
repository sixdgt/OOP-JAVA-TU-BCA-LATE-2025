package callby.examples;

public class Vat {
	public double vat_percent;
	
	public double calculateVatAmount(Item i) {
		double vat_amt = (this.vat_percent /100) * i.price;
		return vat_amt;
	}
}
