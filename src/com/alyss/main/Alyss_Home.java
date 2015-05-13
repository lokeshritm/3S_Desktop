package com.alyss.main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Alyss_Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alyss_Home frame = new Alyss_Home();
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
	public Alyss_Home() {
		setTitle("Simplifying Science in School (3S)");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Alyss_Home.class.getResource("/image/logoq.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1013, 607);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(48, 79, 9));
		setContentPane(contentPane);
		
		JPanel buttonPanle = new JPanel();
		buttonPanle.setBorder(null);
		buttonPanle.setForeground(Color.WHITE);
		buttonPanle.setBackground(new Color(48, 79, 9));
		
		final JPanel showPanel = new JPanel();
		showPanel.setBackground(new Color(48, 79, 9));
		showPanel.setBorder(null);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(buttonPanle, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(showPanel, GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
					.addGap(1))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(buttonPanle, GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
						.addComponent(showPanel, GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE))
					.addContainerGap())
		);
		showPanel.setLayout(new CardLayout(0, 0));
		
		final JPanel aboutPanel = new JPanel();
		aboutPanel.setForeground(Color.WHITE);
		aboutPanel.setBorder(null);
		aboutPanel.setBackground(new Color(48, 79, 9));
		//JScrollPane aboutScroll = new JScrollPane(aboutPanel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
		showPanel.add(aboutPanel, "name_17199051320086");
		
		JLabel title = new JLabel("Simplifying Science in School (3S)");
		title.setFont(new Font("Tahoma", Font.BOLD, 27));
		title.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(Alyss_Home.class.getResource("/image/logo_with_name.png")));
		
		JTextArea aboutAlyssText = new JTextArea();
		aboutAlyssText.setFont(new Font("Calibri", Font.PLAIN, 18));
		aboutAlyssText.setForeground(new Color(255, 255, 255));
		aboutAlyssText.setBackground(new Color(48, 79, 9));
		aboutAlyssText.setText("  Alyss is pioneering introduction of a new era in Science Learning. We bring explanation " +
				"\n of science concepts in 3D HD animations to the schools and homes. The content is" +
				" \nspecially designed to enhance the scientific temperament of students while improving their " +
				"\ngrades in school (Board Examinations) and performance in competitive examinations \n" +
				"(Medical and engineering entrance tests)." +
				"\r\nFounded by an IIT alumnus with a strong passion for Science and Maths, Alyss is a team of \n" +
				"highly qualified content and animation experts sharing a zeal for Science.");
		GroupLayout gl_aboutPanel = new GroupLayout(aboutPanel);
		gl_aboutPanel.setHorizontalGroup(
			gl_aboutPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_aboutPanel.createSequentialGroup()
					.addContainerGap(179, Short.MAX_VALUE)
					.addComponent(title, GroupLayout.PREFERRED_SIZE, 502, GroupLayout.PREFERRED_SIZE)
					.addGap(84))
				.addGroup(gl_aboutPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(390, Short.MAX_VALUE))
				.addGroup(gl_aboutPanel.createSequentialGroup()
					.addGap(19)
					.addComponent(aboutAlyssText, GroupLayout.PREFERRED_SIZE, 687, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		gl_aboutPanel.setVerticalGroup(
			gl_aboutPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_aboutPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(title, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(aboutAlyssText, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		aboutPanel.setLayout(gl_aboutPanel);
		
		
		final JPanel offeringPanel = new JPanel();
		offeringPanel.setBorder(null);
		offeringPanel.setBackground(new Color(48, 79, 9));
		showPanel.add(offeringPanel, "name_17214796096958");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Alyss_Home.class.getResource("/image/desktopApp.jpg")));
		
		JTextArea textArea = new JTextArea();
		
		JLabel lblNewLabel_2 = new JLabel("Simplifying Science in School (3S)");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3 = new JLabel("My Alyss");
		GroupLayout gl_offeringPanel = new GroupLayout(offeringPanel);
		gl_offeringPanel.setHorizontalGroup(
			gl_offeringPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_offeringPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_offeringPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_offeringPanel.createSequentialGroup()
							.addGroup(gl_offeringPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_offeringPanel.createSequentialGroup()
									.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
									.addGap(10))
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_offeringPanel.setVerticalGroup(
			gl_offeringPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_offeringPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_offeringPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_1, 0, 0, Short.MAX_VALUE)
						.addGroup(gl_offeringPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)))
					.addGap(160)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(197, Short.MAX_VALUE))
		);
		offeringPanel.setLayout(gl_offeringPanel);
		
		final JPanel visionPanel = new JPanel();
		visionPanel.setBorder(null);
		visionPanel.setBackground(new Color(204, 102, 153));
		showPanel.add(visionPanel, "name_17220180303136");
		
		final JPanel missionPanel = new JPanel();
		missionPanel.setBorder(null);
		missionPanel.setBackground(new Color(255, 204, 153));
		showPanel.add(missionPanel, "name_17226743635620");
		
		final JPanel contactPanel = new JPanel();
		contactPanel.setBorder(null);
		showPanel.add(contactPanel, "name_17231191812815");
		
		final JButton about = new JButton("About Alyss");
		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPanel.removeAll();
				showPanel.repaint();
				showPanel.revalidate();
				
				showPanel.add(aboutPanel);
				showPanel.repaint();
				showPanel.revalidate();
			}
		});
		
		JButton offering = new JButton("Offering");
		offering.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPanel.removeAll();
				showPanel.repaint();
				showPanel.revalidate();
				
				showPanel.add(offeringPanel);
				showPanel.repaint();
				showPanel.revalidate();
			}
		});
		
		JButton vision = new JButton("Vision");
		vision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPanel.removeAll();
				showPanel.repaint();
				showPanel.revalidate();
				
				showPanel.add(visionPanel);
				showPanel.repaint();
				showPanel.revalidate();
			}
		});
		
		JButton mission = new JButton("Mission");
		mission.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPanel.removeAll();
				showPanel.repaint();
				showPanel.revalidate();
				
				showPanel.add(missionPanel);
				showPanel.repaint();
				showPanel.revalidate();
			}
		});
		
		JButton contact = new JButton("ContactUS");
		contact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPanel.removeAll();
				showPanel.repaint();
				showPanel.revalidate();
				
				showPanel.add(contactPanel);
				showPanel.repaint();
				showPanel.revalidate();
			}
		});
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login loginFrame=new Login();
				loginFrame.setVisible(true);
			}
		});
		GroupLayout gl_buttonPanle = new GroupLayout(buttonPanle);
		gl_buttonPanle.setHorizontalGroup(
			gl_buttonPanle.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_buttonPanle.createSequentialGroup()
					.addGroup(gl_buttonPanle.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_buttonPanle.createSequentialGroup()
							.addGap(38)
							.addGroup(gl_buttonPanle.createParallelGroup(Alignment.LEADING, false)
								.addComponent(about, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
								.addComponent(offering, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(vision, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(mission, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(contact, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_buttonPanle.createSequentialGroup()
							.addGap(64)
							.addComponent(login)))
					.addContainerGap(50, Short.MAX_VALUE))
		);
		gl_buttonPanle.setVerticalGroup(
			gl_buttonPanle.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_buttonPanle.createSequentialGroup()
					.addGap(33)
					.addComponent(about)
					.addGap(18)
					.addComponent(offering)
					.addGap(18)
					.addComponent(vision)
					.addGap(18)
					.addComponent(mission)
					.addGap(18)
					.addComponent(contact)
					.addPreferredGap(ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
					.addComponent(login)
					.addContainerGap())
		);
		buttonPanle.setLayout(gl_buttonPanle);
		contentPane.setLayout(gl_contentPane);
	}
}
