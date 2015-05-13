package com.alyss.main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	/**
	 * Created by Lokesh Kumar
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userID;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login Panel\r\n");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/image/logoq.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 463);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 156, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("User Login");
		lblNewLabel.setForeground(new Color(240, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 30));
		
		JLabel lblUserName = new JLabel("User ID *");
		lblUserName.setForeground(new Color(240, 255, 255));
		lblUserName.setFont(new Font("Verdana", Font.BOLD, 16));
		
		JLabel lblPassword = new JLabel("Password *");
		lblPassword.setForeground(new Color(240, 255, 255));
		lblPassword.setFont(new Font("Verdana", Font.BOLD, 16));
		
		userID = new JTextField();
		userID.setColumns(10);
		password = new JPasswordField();
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		login.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(150)
							.addComponent(login, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(62)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblUserName)
									.addComponent(lblPassword))
								.addPreferredGap(ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(password)
									.addComponent(userID, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addGap(142)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))))
					.addGap(113))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(43)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUserName)
						.addComponent(userID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblPassword)
							.addGap(59)
							.addComponent(login))
						.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(111, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
