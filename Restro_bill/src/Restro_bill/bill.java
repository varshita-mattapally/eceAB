package Restro_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTable table;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1029, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Resturant Bill");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 43));
		lblNewLabel.setBounds(350, 22, 273, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 31));
		lblNewLabel_1.setBounds(101, 155, 103, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Quantity");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 31));
		lblNewLabel_1_1.setBounds(101, 233, 130, 42);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Veg Briyani  =260", "Chicken Briyani =340", "Kheema Briyani =420", "Prawns Briyani =320"}));
		c1.setBounds(297, 155, 193, 42);
		frame.getContentPane().add(c1);
		
		table = new JTable();
		table.setBounds(582, 132, 367, 247);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("Veg Briyani  =260"))
				{
					bill=q*260;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Select item:"+item+"\n qnty: "+q+"  \n your bill:"+bill);
				}
				else if(item.equals("Chicken Briyani =340"))
				{
					bill=q*340;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Select item:"+item+"\n qnty: "+q+"  \n your bill:"+bill);
				}
				else if(item.equals("Kheema Briyani =420"))
				{
					bill=q*420;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Select item:"+item+"\n qnty: "+q+"  \n your bill:"+bill);
				}
				else if(item.equals("Prawns Briyani =320"))
				{
					bill=q*320;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Select item:"+item+"\n qnty: "+q+"  \n your bill:"+bill);
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		btnNewButton.setBounds(215, 342, 139, 37);
		frame.getContentPane().add(btnNewButton);
		
		t1 = new JTextField();
		t1.setBounds(301, 239, 189, 42);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
	}
}
