package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExample {
	public static void main(String args[]) {
		try {
			String username = "root"; // database user
			String password = "1234"; // database password
			String url = "jdbc:mysql://localhost:3306/lab_ten_jdbc";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			String query = "UPDATE tbl_employee SET full_name='Surekha Khapung', contact='9898543986', "
					+ "shift='Day' WHERE emp_reg_no=12403 AND emp_id=3";
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(query); // it returns int value i.e. 1 or 0
			if (result > 0) {
				System.out.println("Data udpated successfully");
			} else {
				System.out.println("Data update failed!!");
			}			
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
