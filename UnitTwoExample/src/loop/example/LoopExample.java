package loop.example;

public class LoopExample {
	public static void main(String args[]) {
		System.out.println("For Loop Example");
		
		for(int i =0; i <= 10; i++) {
			System.out.println("Value of i: " + i);
		}
		
		System.out.println("---------------------");
		
		String cities[] = {"Kathmandu", "Pokhara", "Biratnagar", "Hetauda", "Birgunj"};
		for(int i = 0; i < 5; i++) {
			System.out.println("Value of i: " + i + " City Name: " + cities[i]);
		}
		
		System.out.println("-------------------------");
		// String cities[] = {"Kathmandu", "Pokhara", "Biratnagar", "Hetauda", "Birgunj"};
		for(int i =0; i < 5; i++) {
			System.out.println("Value of i: " + i);
			if(cities[i] == "Kathmandu") {
				System.out.println("Capital of Nepal");
			}
			System.out.println("City Name: " + cities[i]);
		}
		// student no: here 103 and 107 are CR
		int student_no[] = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
		System.out.println("CR checking Example");
		System.out.println("Case OR");
		for(int i =0; i < 10; i++) {
			if((student_no[i] == 103) || (student_no[i] == 107)) {
				System.out.println("Student No: " + student_no[i] + " is CR");
			} else {
				System.out.println("Student No: " + student_no[i] + " is not CR");
			}
		}
		
		System.out.println("--------------");
		System.out.println("Case AND");
		for(int i =0; i < 10; i++) {
			if((student_no[i] == 103) && (student_no[i] == 107)) {
				System.out.println("Student No: " + student_no[i] + " is CR");
			} else {
				System.out.println("Student No: " + student_no[i] + " is not CR");
			}
		}
		
		// advance for loop
		for(String city_name: cities) {
			System.out.println("City Name: " + city_name);
		}
		for(int no: student_no) {
			System.out.println("Student No: " + no);
		}
		
		// 2 while loop example
		System.out.println("While Loop");
		int i = 10;
		while(i <= 10) {
			System.out.println("Value of i: " + i);
			i++;
		}
		
		int count = 0;
		while(count < 5) {
			System.out.println("City Name: " + cities[count]);
			count++;
		}
	}
}
