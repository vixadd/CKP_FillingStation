package ckp.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface QuereyDB {
	public static final String JDBC_URL = "jdbc:derby:ckpdb;create=true";
	public static String sql_statement(String sql) throws SQLException {
		String result = "";
		Connection connection = DriverManager.getConnection(JDBC_URL);
		connection.createStatement().executeQuery(sql);
		return result;
	}
}
