package siva.jee.servlet.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {

	static String driverClass = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/sivaservletdb";
	static String username = "root";
	static String password = "root";

	private static Connection connection = null;

	static {
		try {
			Class.forName(driverClass);
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getDataBaseConnection() {
		return connection;
	}

}
