package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// Select Example
public class SelectExample {
	public static void main(String args[]) {
		try {
			String username = "root"; // database user
			String password = "1234"; // database password
			String url = "jdbc:mysql://localhost:3306/lab_ten_jdbc";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			String query = "SELECT * FROM tbl_employee";
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(query); // it returns int value i.e. 1 or 0
			while(result.next()) {
				System.out.println("*******************");
				System.out.println("Employee ID: " + result.getInt("emp_id"));
				System.out.println("Employee Name: " + result.getString("full_name"));
				System.out.println("Employee Email: " + result.getString("email"));
				System.out.println("Employee Contact: " + result.getString("contact"));
				System.out.println("Employee Shift: " + result.getString("shift"));
				System.out.println("Employee Reg. No: " + result.getInt("emp_reg_no"));
				System.out.println("*********************");
			}		
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
