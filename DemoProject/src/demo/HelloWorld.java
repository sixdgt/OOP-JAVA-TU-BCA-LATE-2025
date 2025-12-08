package demo;

public class HelloWorld {
	int num;
	public void check() {
		System.out.println(this.num);
		
		if (this.num == 5) {
			System.out.println(this.num);
			this.num = 5 + 1;
			System.out.println(this.num);
		}
	}
	public static void main(String args[]) {
		String name = "Sandesh";
		System.out.println(name);
		
		name = "Himal";
		System.out.println(name);
		int num = 5;
		
		System.out.println(num);
		
		if (num == 5) {
			System.out.println(num);
			num = 5 + 1;
			System.out.println(num);
		}
		System.out.println(num);
		System.out.println("Function code");
//		HelloWorld hw = new HelloWorld();
//		hw.num = 5;
//		System.out.println(hw.num);
//		hw.check();
//		System.out.println(hw.num);
	}
	
}
