package ckp.src;

import java.sql.*;

public class InitializeDB {
	public static final String Driver = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String JDBC_URL = "jdbc:derby:ckpdb;create=true";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(Driver);
		
		Connection connection = DriverManager.getConnection(JDBC_URL);
		connection.createStatement().execute("create table Campers(kp_id varchar(10),"
				+ " first_name varchar(15), last_name varchar(15), balance decimal(5,2),"
				+ " max_allowed decimal(5,2), notes varchar(100))");
		
		System.out.println("Database initialized");
	}
}
