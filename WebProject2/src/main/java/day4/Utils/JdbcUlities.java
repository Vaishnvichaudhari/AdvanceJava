package day4.Utils;

import java.sql.Connection;
import java.sql.DriverManager;


public class JdbcUlities {
	//This class provides a functionality to obtain the Connection to DB and returns the same to the caller. 
	public static Connection buildConnection() throws Exception {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		Class.forName(driverClassName);
		String connectionUrl = "jdbc:mysql://localhost:3306/course?useSSL=false";
		String userId = "root";
		String password = "Vaish@123";
			
		Connection	dbConnection = DriverManager.getConnection(connectionUrl, userId, password);
		return dbConnection;
	}
}
