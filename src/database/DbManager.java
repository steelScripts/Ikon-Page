package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_main", "root", "FF12advent");
			return conn;
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
			return null;			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
