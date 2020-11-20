

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LocationDAO 
{
	private static String db = "jdbc:mysql://localhost:3036/CSCI201_Final_Database";
	private static String user = "root";
	private static String pwd = "root";
	
	public static Connection getConnection()
	{
		Connection conn = null;
		
		try {
			conn =  DriverManager.getConnection(db, user, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
