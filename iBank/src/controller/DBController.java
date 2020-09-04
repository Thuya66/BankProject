package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBController {
	
	private String connection = "jdbc:mysql://localhost:3306/bank";
	private String connectionPassword = "thuya";
	private static Connection con = null;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getAccessControl() throws SQLException {
		
		if(null == con) {
			con = (Connection) DriverManager.getConnection(this.connection, "root" , this.connectionPassword);
			System.out.println("Connected");
		}		
		return con;
	}
	
	public void closeAccessControl() throws SQLException
	{
		if(null != con) {
			con.close();
			System.out.println("Disconnected");
		}

	}
	
}
