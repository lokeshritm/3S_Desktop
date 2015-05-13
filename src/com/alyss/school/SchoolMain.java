package com.alyss.school;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import com.alyss.main.Alyss_Home;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class SchoolMain extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchoolMain frame = new SchoolMain();
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
	public SchoolMain() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SchoolMain.class.getResource("/image/logoq.png")));
		setTitle("School Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(48, 79, 9));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel main = new JPanel();
		main.setBackground(new Color(48, 79, 9));
		
		final JPanel show = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(main, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(show, GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(main, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
				.addComponent(show, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
		);
		show.setLayout(new CardLayout(0, 0));
		
		final JPanel dashboardPanel = new JPanel();
		dashboardPanel.setBackground(new Color(48, 79, 9));
		show.add(dashboardPanel, "name_29534226686531");
		GroupLayout gl_dashboardPanel = new GroupLayout(dashboardPanel);
		gl_dashboardPanel.setHorizontalGroup(
			gl_dashboardPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 785, Short.MAX_VALUE)
		);
		gl_dashboardPanel.setVerticalGroup(
			gl_dashboardPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 552, Short.MAX_VALUE)
		);
		dashboardPanel.setLayout(gl_dashboardPanel);
		final JPanel createTeacherPanel = new JPanel();
		final JPanel teacherPanel = new JPanel();
		teacherPanel.setBackground(new Color(48, 79, 9));
		show.add(teacherPanel, "name_29540155733411");
		
		JButton btnCreateTeacher = new JButton("Create Teacher");
		btnCreateTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show.removeAll();
				show.repaint();
				show.revalidate();
				
				show.add(createTeacherPanel);
				show.repaint();
				show.revalidate();
			}
		});
		GroupLayout gl_teacherPanel = new GroupLayout(teacherPanel);
		gl_teacherPanel.setHorizontalGroup(
			gl_teacherPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_teacherPanel.createSequentialGroup()
					.addGap(337)
					.addComponent(btnCreateTeacher)
					.addContainerGap(341, Short.MAX_VALUE))
		);
		gl_teacherPanel.setVerticalGroup(
			gl_teacherPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_teacherPanel.createSequentialGroup()
					.addContainerGap(490, Short.MAX_VALUE)
					.addComponent(btnCreateTeacher)
					.addGap(39))
		);
		teacherPanel.setLayout(gl_teacherPanel);
		
		
		createTeacherPanel.setBackground(new Color(48, 79, 9));
		show.add(createTeacherPanel, "name_24010472220606");
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show.removeAll();
				show.repaint();
				show.revalidate();
				
				show.add(teacherPanel);
				show.repaint();
				show.revalidate();
			}
		});
		
		JLabel lblNewLabel = new JLabel("Teacher Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_2 = new JLabel("User ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4 = new JLabel("Retype Password");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_5 = new JLabel("Board");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_6 = new JLabel("Class");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_7 = new JLabel("Subject");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setForeground(Color.WHITE);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		
		JComboBox comboBox = new JComboBox();
		
		JComboBox comboBox_1 = new JComboBox();
		
		JComboBox comboBox_2 = new JComboBox();
		GroupLayout gl_createTeacherPanel = new GroupLayout(createTeacherPanel);
		gl_createTeacherPanel.setHorizontalGroup(
			gl_createTeacherPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_createTeacherPanel.createSequentialGroup()
					.addGroup(gl_createTeacherPanel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_createTeacherPanel.createSequentialGroup()
							.addGap(121)
							.addGroup(gl_createTeacherPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_7)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_6)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel))
							.addGap(164))
						.addGroup(Alignment.TRAILING, gl_createTeacherPanel.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNewButton)
							.addGap(93)))
					.addGroup(gl_createTeacherPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBack)
						.addGroup(gl_createTeacherPanel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textField_2)
							.addComponent(textField_1)
							.addComponent(textField_4)
							.addComponent(textField_3)
							.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox_2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(209, Short.MAX_VALUE))
		);
		gl_createTeacherPanel.setVerticalGroup(
			gl_createTeacherPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_createTeacherPanel.createSequentialGroup()
					.addGap(52)
					.addGroup(gl_createTeacherPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(29)
					.addGroup(gl_createTeacherPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_createTeacherPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(29)
					.addGroup(gl_createTeacherPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_createTeacherPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_7)
							.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_createTeacherPanel.createSequentialGroup()
							.addGroup(gl_createTeacherPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3))
							.addGap(29)
							.addGroup(gl_createTeacherPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4))
							.addGap(37)
							.addGroup(gl_createTeacherPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(37)
							.addGroup(gl_createTeacherPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_6)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(53)))
					.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
					.addGroup(gl_createTeacherPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBack)
						.addComponent(btnNewButton))
					.addGap(39))
		);
		createTeacherPanel.setLayout(gl_createTeacherPanel);
		
		JButton dashboard = new JButton("Dashboard");
		dashboard.setFont(new Font("Tahoma", Font.PLAIN, 11));
		dashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show.removeAll();
				show.repaint();
				show.revalidate();
				
				show.add(dashboardPanel);
				show.repaint();
				show.revalidate();
			}
		});
		
		JButton teacher = new JButton("Teachers");
		teacher.setFont(new Font("Tahoma", Font.PLAIN, 11));
		teacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show.removeAll();
				show.repaint();
				show.revalidate();
				
				show.add(teacherPanel);
				show.repaint();
				show.revalidate();
			}
		});
		
		JButton logout = new JButton("Logout");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Alyss_Home frame=new Alyss_Home();
				frame.setVisible(true);
			}
		});
		GroupLayout gl_main = new GroupLayout(main);
		gl_main.setHorizontalGroup(
			gl_main.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_main.createSequentialGroup()
					.addGroup(gl_main.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_main.createSequentialGroup()
							.addGap(27)
							.addComponent(logout))
						.addGroup(gl_main.createSequentialGroup()
							.addContainerGap()
							.addComponent(dashboard, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
						.addGroup(gl_main.createSequentialGroup()
							.addContainerGap()
							.addComponent(teacher, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
					.addGap(46))
		);
		gl_main.setVerticalGroup(
			gl_main.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_main.createSequentialGroup()
					.addGap(26)
					.addComponent(dashboard)
					.addGap(18)
					.addComponent(teacher)
					.addGap(421)
					.addComponent(logout)
					.addContainerGap(14, Short.MAX_VALUE))
		);
		main.setLayout(gl_main);
		contentPane.setLayout(gl_contentPane);
	}
}
