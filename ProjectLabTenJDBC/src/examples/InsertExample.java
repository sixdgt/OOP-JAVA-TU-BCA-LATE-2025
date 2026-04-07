package examples;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class InsertExample {
	public static void main(String args[]) {
		try {
			String username = "root"; // database user
			String password = "1234"; // database password
			String url = "jdbc:mysql://localhost:3306/lab_ten_jdbc";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			String query = "INSERT INTO tbl_employee(full_name, email, contact, shift, emp_reg_no)"
					+ " VALUES('Surekha Magar', 'surekhamagar@gmail.com', '9898543564', 'Morning', 12403)";
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(query); // it returns int value i.e. 1 or 0
			if (result > 0) {
				System.out.println("Data inserted successfully");
			} else {
				System.out.println("Data insertion failed!!");
			}			
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
