package ckp.src;

import java.awt.BorderLayout;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.util.*;

public class QuereyDB extends InitializeDB{
	public static final String JDBC_URL = "jdbc:derby:ckpdb;create=true";
	
	/**
	 * Executes a sql statement on the Database.
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	public static String sql_statement(String sql) throws SQLException {
		String result = "";
		Connection connection = DriverManager.getConnection(JDBC_URL);
		connection.createStatement().executeQuery(sql);
		return result;
	}
	
	
	// SQL statement for the process.
	private static final String SQL_Statement = "select * from Campers";
	
	/**
	 * Running the table of all entries in the Database.
	 * @throws SQLException - For bypassing the Selection error which will crash statement.
	 */
	public static void table() throws SQLException{
		String result = "";
		
			Connection connection = DriverManager.getConnection(InitializeDB.JDBC_URL);
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery(SQL_Statement);
			ResultSetMetaData resultmetadata = resultset.getMetaData();
			int colcount = resultmetadata.getColumnCount();
			

			
			for (int i = 1; i <= colcount; i++) {
				result += String.format("%20s", resultmetadata.getColumnName(i) + "|");
			} while(resultset.next()) {
				result += System.lineSeparator();
				for (int j = 1; j <= colcount; j++) {
					result += String.format("%20s", resultset.getString(j) + "|");
				}
			}
			
			
			JFrame frmViewCampers = new JFrame();
			frmViewCampers.setTitle("View Campers");
			frmViewCampers.setBounds(100, 100, 649, 426);
			//frmViewCampers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel panel = new JPanel();
			frmViewCampers.getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			JTable table = convertto_table(result);
			table.setBounds(6, 6, 637, 392);
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(6, 6, 637, 392);
			panel.add(scrollPane);
			scrollPane.setViewportView(table);
	        frmViewCampers.setVisible(true);
	        
	}
	
	/**
	 * A conversion from SQL output to a structured textual base.
	 * @param t - The text of the table from traversing the database through sequel
	 * @return A structured listing of the result from the SQL injections.
	 */
	public static JTable convertto_table(String t) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(t);
		
		while(scan.hasNext()) {
			list.add(scan.nextLine());
		}
		
		// Setting the column names.
		String g = new String("");
		g = list.get(0).replace(" ", "");
		g = g.replace("|", ",");
		String[] col_names = g.split(",");
		
		list.remove(0);
		
		//obtaining data for the table;
		
		String obj_data[][] = new String[list.size()][3];
		
		String l = new String("");
		for(int i = 0; i < list.size(); i++) {
			l = list.get(i);
			l = l.replace(" ", "");
			l = l.replace("|", ",");
			String[] z = l.split(",");
			for (int f = 0; f < 3; f++) {
				obj_data[i][f] = z[f];
				//System.out.println(z[f]);
			}
		}
		scan.close();
		JTable table = new JTable(obj_data, col_names);
		return table;
	}
}
