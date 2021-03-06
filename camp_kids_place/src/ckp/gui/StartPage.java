package ckp.gui;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.SystemColor;
import java.sql.SQLException;

import ckp.src.*;

public class StartPage extends QuereyDB{

	private JFrame frmCampKidsPlace;
	private JTextField txtCampKidsPlace;
	private final JTextArea txtrThisIsThe = new JTextArea();
	private JPanel panel;
	private JTextField txtCreatedByDavid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartPage window = new StartPage();
					window.frmCampKidsPlace.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCampKidsPlace = new JFrame();
		frmCampKidsPlace.setTitle("Camp Kids Place Menu");
		frmCampKidsPlace.getContentPane().setBackground(new Color(204, 204, 204));
		frmCampKidsPlace.getContentPane().setLayout(null);
		
		txtCampKidsPlace = new JTextField();
		txtCampKidsPlace.setEditable(false);
		txtCampKidsPlace.setBounds(0, 0, 646, 83);
		txtCampKidsPlace.setForeground(SystemColor.activeCaption);
		txtCampKidsPlace.setFont(new Font("Luminari", Font.BOLD, 52));
		txtCampKidsPlace.setBackground(SystemColor.activeCaptionText);
		txtCampKidsPlace.setHorizontalAlignment(SwingConstants.CENTER);
		txtCampKidsPlace.setText("Camp Kids Place");
		frmCampKidsPlace.getContentPane().add(txtCampKidsPlace);
		txtCampKidsPlace.setColumns(10);
		txtrThisIsThe.setBackground(new Color(204, 204, 204));
		txtrThisIsThe.setLineWrap(true);
		txtrThisIsThe.setColumns(1);
		txtrThisIsThe.setWrapStyleWord(true);
		txtrThisIsThe.setFont(new Font("Luminari", Font.PLAIN, 13));
		txtrThisIsThe.setEditable(false);
		txtrThisIsThe.setRows(2);
		txtrThisIsThe.setText("This is the Central App for the Camp Kids Place filling station. "
		                         +"The directory to the right allows for everything from viewing" 
		                         +" of campers to editing specifics and have people checkout items"
		                         +" at the Filling Station which is the main purpose of this application."
		                         +"\n\nThe Directory is on the other side of this window. Use the instructions"
		                         +" to navigate through the application.");
		txtrThisIsThe.setBounds(10, 95, 247, 263);
		frmCampKidsPlace.getContentPane().add(txtrThisIsThe);
		
		panel = new JPanel();
		panel.setBounds(269, 95, 353, 287);
		frmCampKidsPlace.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnFillingStation = new JButton("Filling Station");
		btnFillingStation.setBounds(15, 30, 161, 29);
		panel.add(btnFillingStation);
		
		JButton btnViewCampers = new JButton("View Campers");
		btnViewCampers.setBounds(15, 94, 161, 29);
		panel.add(btnViewCampers);
		
		JButton btnSearchForCamper = new JButton("Add/Delete Camper");
		btnSearchForCamper.setBounds(15, 229, 161, 29);
		panel.add(btnSearchForCamper);
		
		JTextArea txtrOpenTheFilling = new JTextArea();
		txtrOpenTheFilling.setWrapStyleWord(true);
		txtrOpenTheFilling.setLineWrap(true);
		txtrOpenTheFilling.setBackground(SystemColor.window);
		txtrOpenTheFilling.setText("Open the Filling Station Portion");
		txtrOpenTheFilling.setBounds(189, 30, 146, 36);
		panel.add(txtrOpenTheFilling);
		
		JTextArea txtrViewATable = new JTextArea();
		txtrViewATable.setWrapStyleWord(true);
		txtrViewATable.setText("View a table of Campers");
		txtrViewATable.setLineWrap(true);
		txtrViewATable.setBackground(SystemColor.window);
		txtrViewATable.setBounds(188, 94, 134, 36);
		panel.add(txtrViewATable);
		
		JButton button = new JButton("Search For Camper");
		button.setBounds(15, 162, 161, 29);
		panel.add(button);
		
		JTextArea txtrSearchForOne = new JTextArea();
		txtrSearchForOne.setWrapStyleWord(true);
		txtrSearchForOne.setText("Search for one camper in particular");
		txtrSearchForOne.setLineWrap(true);
		txtrSearchForOne.setBackground(SystemColor.window);
		txtrSearchForOne.setBounds(189, 162, 133, 39);
		panel.add(txtrSearchForOne);
		
		JTextArea txtrAddANew = new JTextArea();
		txtrAddANew.setWrapStyleWord(true);
		txtrAddANew.setText("Add a new or delete a current camper");
		txtrAddANew.setLineWrap(true);
		txtrAddANew.setBackground(SystemColor.window);
		txtrAddANew.setBounds(188, 229, 147, 39);
		panel.add(txtrAddANew);
		
		txtCreatedByDavid = new JTextField();
		txtCreatedByDavid.setForeground(SystemColor.activeCaption);
		txtCreatedByDavid.setBackground(SystemColor.activeCaptionText);
		txtCreatedByDavid.setFont(new Font("Malayalam MN", Font.PLAIN, 13));
		txtCreatedByDavid.setHorizontalAlignment(SwingConstants.CENTER);
		txtCreatedByDavid.setText("Created By: David Kroell © 2016");
		txtCreatedByDavid.setEditable(false);
		txtCreatedByDavid.setBounds(10, 370, 247, 28);
		frmCampKidsPlace.getContentPane().add(txtCreatedByDavid);
		txtCreatedByDavid.setColumns(10);
		frmCampKidsPlace.setBounds(100, 100, 646, 426);
		frmCampKidsPlace.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Outline Action Listener Declarations.
		
		
		btnFillingStation.addActionListener(new ActionListener() {
			 
            /**
             * Open the Filling station window.
             * @param e is the action event
             */
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
            }
        
        });
		
		button.addActionListener(new ActionListener() {
			 
            /**
             * Open the Camper search Window
             * @param e is the action event
             */
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
            }
        
        });
		
		btnViewCampers.addActionListener(new ActionListener() {
			 
            /**
             * Open the View Campers Window
             * @param e is the action event
             */
            @Override
            public void actionPerformed(ActionEvent e)
            {
            	try {
					QuereyDB.table();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        
        });
		
		btnSearchForCamper.addActionListener(new ActionListener() {
			 
            /**
             * Open the search camper window.
             * @param e is the action event
             */
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
            }
        
        });
	}
}
