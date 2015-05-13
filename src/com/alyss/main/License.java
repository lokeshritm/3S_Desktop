package com.alyss.main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class License extends JFrame {
	private JTextField licenseNumber;
	private JTextField schoolName;
	private JTextField teacherName;
	private JTextField mobile;
	private JTextField email;
	private JTextField location;
	private JTextField address;
	static License frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try{
					License frame=new License();
					frame.setVisible(true);	
				}
				catch(Exception e){
					System.out.print(e);
				}
				}
		});
	}

	/**
	 * Create the frame.
	 */
	public License() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(License.class.getResource("/components/images/logo.png")));
		setBackground(new Color(51, 102, 51));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel();
		label.setText("Fill all fields then click 'Register' button to save.");
		label.setForeground(new Color(102, 153, 255));
		label.setFont(new Font("Tahoma", Font.ITALIC, 8));
		
		JLabel label_1 = new JLabel();
		label_1.setText("License Details");
		label_1.setForeground(new Color(42, 16, 121));
		label_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		
		JLabel label_2 = new JLabel();
		label_2.setIcon(new ImageIcon(License.class.getResource("/components/images/logo3.png")));
		label_2.setText("jLabel12");
		label_2.setForeground(new Color(204, 255, 255));
		label_2.setBackground(new Color(153, 255, 255));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(38)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addGap(116))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
							.addGap(36))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addContainerGap())
						.addComponent(label_2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))
		);
		panel.setLayout(gl_panel);
		
		JLabel lblNewLabel = new JLabel("License Number");
		
		licenseNumber = new JTextField();
		licenseNumber.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("School Name");
		
		schoolName = new JTextField();
		schoolName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Teacher Name");
		
		teacherName = new JTextField();
		teacherName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		
		JLabel lblNewLabel_4 = new JLabel("Mobile Number");
		
		final JComboBox gender = new JComboBox();
		gender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		mobile = new JTextField();
		mobile.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Email ID");
		
		email = new JTextField();
		email.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Location");
		
		location = new JTextField();
		location.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		
		address = new JTextField();
		address.setColumns(10);
		
		JButton registerButton = new JButton("Register");
		registerButton.addActionListener(new ActionListener() {
			// Action for Submit Button
			public void actionPerformed(ActionEvent arg0) {
				
				}
		});      
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {
			// Action for Cancel Button
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 499, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(71)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(registerButton)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
									.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblAddress)))
							.addGap(81)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(cancel)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(licenseNumber, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
									.addComponent(schoolName)
									.addComponent(teacherName)
									.addComponent(mobile)
									.addComponent(email)
									.addComponent(location)
									.addComponent(address)
									.addComponent(gender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(licenseNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(schoolName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(teacherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(gender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(mobile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(location, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddress)
						.addComponent(address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(registerButton)
						.addComponent(cancel))
					.addGap(45))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
