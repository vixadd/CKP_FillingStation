package example;

import java.awt.GridLayout;
import java.sql.*;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class QuereyDB extends CreateDB{
	public static final String SQL_Statement = "select * from Campers";
	public static void main(String[] args) throws SQLException{
		String result = "";
		
			Connection connection = DriverManager.getConnection(CreateDB.JDBC_URL);
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

			// Set up JPanel for display of results.
			
			JFrame frame = new JFrame("My Frame");
			frame.setSize(640, 480);
			JPanel panel = new JPanel();
			panel.setSize(640,  480);
			panel.add(new JLabel("Results \n"));
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.add(panel);
			frame.setLayout(new GridLayout());
			frame.setVisible(true);
			Vector textFieldVector = new Vector();
			textFieldVector.setSize(20);
			JTextField tf;
			tf = new JTextField(result);
			textFieldVector.add(tf);
			panel.add(tf); //myPanel is the JPanel where I want to put the JTextFields
			
			panel.validate();
			panel.repaint();
			
	}
}