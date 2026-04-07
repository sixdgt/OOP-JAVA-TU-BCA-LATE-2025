package examples;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public static void main(String args[]) {
		System.out.println("JDBC MySQL Database Connection Example");
		String username = "root"; // database user
		String password = "1234"; // database password
		// keep blank if you're using xampp MySQL
		String url = "jdbc:mysql://localhost:3306/lab_ten_jdbc";
		try {
			// Installing MySQL Connector Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establishing database connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Status: Connected Successfully!");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
