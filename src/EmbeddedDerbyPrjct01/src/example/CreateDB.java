package example;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class CreateDB {
	public static final String Driver = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String JDBC_URL = "jdbc:derby:zadb;create=true";
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName(Driver);
	
			Connection connection = DriverManager.getConnection(JDBC_URL);
			//connection.createStatement().execute("create table Campers(kp_id varchar(10),"
		   //		+ " first_name varchar(15), last_name varchar(15))");
			connection.createStatement().execute("insert into Campers values"
					+ "('0001', 'JT', 'Archibald'), "
					+ "('0002', 'Sam', 'Joseph'), "
					+ "('0003', 'William', 'Davis')");
			System.out.println("Attributes inserted successfully.");
	}
}
