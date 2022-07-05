package hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:mysql://remotemysql.com:3306/3MSqkCvvap?useSSL=false";
		String user = "3MSqkCvvap";
		String password = "NWtwy7H0M6";
		
		try {
			System.out.println("Connecting to DB");
			Connection conn = DriverManager.getConnection(jdbcURL, user, password);
			System.out.println("Connection Successful!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
