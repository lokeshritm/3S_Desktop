package com.alyss.admin;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import com.alyss.main.Alyss_Home;
import java.awt.SystemColor;

public class AdminMain extends JFrame {

	private JPanel contentPane;
	private JTextField videoNameAddVideo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField schoolAddSchool;
	private JTextField emailAddSchool;
	private JTextField userIDAddSchool;
	private JTextField passwordAddSchool;
	private JTextField retypePasswordAddSchool;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMain frame = new AdminMain();
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
	public AdminMain() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdminMain.class.getResource("/image/logoq.png")));
		setTitle("Admin Dashboard");
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
					.addComponent(main, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(show, GroupLayout.PREFERRED_SIZE, 776, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(main, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
				.addComponent(show, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
		);
		show.setLayout(new CardLayout(0, 0));
		
		final JPanel allVideoPanel = new JPanel();
		allVideoPanel.setBackground(new Color(48, 79, 9));
		show.add(allVideoPanel, "name_20900170105556");
		
		JLabel lblNewLabel_17 = new JLabel("Board");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_17.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_18 = new JLabel("Class");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_18.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_19 = new JLabel("Subject");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_19.setForeground(Color.WHITE);
		
		JComboBox comboBox_4 = new JComboBox();
		
		JComboBox comboBox_5 = new JComboBox();
		
		JComboBox comboBox_6 = new JComboBox();
		GroupLayout gl_allVideoPanel = new GroupLayout(allVideoPanel);
		gl_allVideoPanel.setHorizontalGroup(
			gl_allVideoPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_allVideoPanel.createSequentialGroup()
					.addGroup(gl_allVideoPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_allVideoPanel.createSequentialGroup()
							.addGap(108)
							.addComponent(lblNewLabel_17))
						.addGroup(gl_allVideoPanel.createSequentialGroup()
							.addGap(82)
							.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
					.addGap(103)
					.addGroup(gl_allVideoPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_allVideoPanel.createSequentialGroup()
							.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(104)
							.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(158, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_allVideoPanel.createSequentialGroup()
							.addGap(36)
							.addComponent(lblNewLabel_18)
							.addPreferredGap(ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
							.addComponent(lblNewLabel_19)
							.addGap(188))))
		);
		gl_allVideoPanel.setVerticalGroup(
			gl_allVideoPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_allVideoPanel.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_allVideoPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_17)
						.addComponent(lblNewLabel_19)
						.addComponent(lblNewLabel_18))
					.addGap(33)
					.addGroup(gl_allVideoPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(451, Short.MAX_VALUE))
		);
		allVideoPanel.setLayout(gl_allVideoPanel);
		
		final JPanel addSchoolPanel = new JPanel();
		addSchoolPanel.setBackground(new Color(48, 79, 9));
		show.add(addSchoolPanel, "name_20913425462482");
		
		JLabel lblSchoolName = new JLabel("School Name");
		lblSchoolName.setForeground(Color.WHITE);
		lblSchoolName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmailId.setForeground(Color.WHITE);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setForeground(Color.WHITE);
		lblUserId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblRetypePassword = new JLabel("Retype Password");
		lblRetypePassword.setForeground(Color.WHITE);
		lblRetypePassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblBoard = new JLabel("Board");
		lblBoard.setForeground(Color.WHITE);
		lblBoard.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblClass.setForeground(Color.WHITE);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setForeground(Color.WHITE);
		lblSubject.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		schoolAddSchool = new JTextField();
		schoolAddSchool.setColumns(10);
		
		emailAddSchool = new JTextField();
		emailAddSchool.setColumns(10);
		
		userIDAddSchool = new JTextField();
		userIDAddSchool.setColumns(10);
		
		passwordAddSchool = new JTextField();
		passwordAddSchool.setColumns(10);
		
		retypePasswordAddSchool = new JTextField();
		retypePasswordAddSchool.setColumns(10);
		
		JComboBox boardAddSchool = new JComboBox();
		
		JComboBox classAddSchool = new JComboBox();
		
		JComboBox subjectAddSchool = new JComboBox();
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_addSchoolPanel = new GroupLayout(addSchoolPanel);
		gl_addSchoolPanel.setHorizontalGroup(
			gl_addSchoolPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_addSchoolPanel.createSequentialGroup()
					.addGap(111)
					.addGroup(gl_addSchoolPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblClass)
						.addComponent(lblSubject)
						.addComponent(lblBoard)
						.addComponent(lblRetypePassword)
						.addComponent(lblPassword)
						.addComponent(lblSchoolName)
						.addComponent(lblEmailId)
						.addComponent(lblUserId))
					.addGap(121)
					.addGroup(gl_addSchoolPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(userIDAddSchool, 168, 168, Short.MAX_VALUE)
						.addComponent(emailAddSchool, 168, 168, Short.MAX_VALUE)
						.addComponent(subjectAddSchool, 0, 168, Short.MAX_VALUE)
						.addComponent(passwordAddSchool, 168, 168, Short.MAX_VALUE)
						.addComponent(retypePasswordAddSchool, 168, 168, Short.MAX_VALUE)
						.addComponent(boardAddSchool, 0, 168, Short.MAX_VALUE)
						.addComponent(classAddSchool, 0, 168, Short.MAX_VALUE)
						.addComponent(schoolAddSchool, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
					.addGap(242))
				.addGroup(gl_addSchoolPanel.createSequentialGroup()
					.addGap(189)
					.addComponent(btnSubmit)
					.addContainerGap(512, Short.MAX_VALUE))
		);
		gl_addSchoolPanel.setVerticalGroup(
			gl_addSchoolPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_addSchoolPanel.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_addSchoolPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(schoolAddSchool, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSchoolName))
					.addGap(31)
					.addGroup(gl_addSchoolPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmailId)
						.addComponent(emailAddSchool, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_addSchoolPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUserId)
						.addComponent(userIDAddSchool, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(gl_addSchoolPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(passwordAddSchool, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPassword, Alignment.TRAILING))
					.addGap(42)
					.addGroup(gl_addSchoolPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(retypePasswordAddSchool, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRetypePassword))
					.addGroup(gl_addSchoolPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblClass, Alignment.TRAILING)
						.addGroup(gl_addSchoolPanel.createSequentialGroup()
							.addGap(31)
							.addGroup(gl_addSchoolPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(boardAddSchool, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBoard))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(classAddSchool, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(36)
					.addGroup(gl_addSchoolPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(subjectAddSchool, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSubject))
					.addGap(44)
					.addComponent(btnSubmit)
					.addGap(51))
		);
		addSchoolPanel.setLayout(gl_addSchoolPanel);
		
		final JPanel addVideoPanel = new JPanel();
		addVideoPanel.setBackground(new Color(48, 79, 9));
		show.add(addVideoPanel, "name_20918070249411");
		
		JLabel lblNewLabel = new JLabel("Board");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Class");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Subject");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3 = new JLabel("Video Name");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_4 = new JLabel("Video Path");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_5 = new JLabel("Image Path");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox boardAddVideo = new JComboBox();
		
		JComboBox classAddVideo = new JComboBox();
		
		JComboBox subjectAddVideo = new JComboBox();
		
		videoNameAddVideo = new JTextField();
		videoNameAddVideo.setColumns(10);
		
		JButton videoBrowseAddVideo = new JButton("Browse video");
		
		JLabel lblNewLabel_6 = new JLabel("video path");
		lblNewLabel_6.setForeground(Color.WHITE);
		
		JButton browseImageAddVideo = new JButton("Browse Image");
		
		JLabel lblNewLabel_7 = new JLabel("image path");
		lblNewLabel_7.setForeground(Color.WHITE);
		
		JButton submitAddVideo = new JButton("Submit");
		GroupLayout gl_addVideoPanel = new GroupLayout(addVideoPanel);
		gl_addVideoPanel.setHorizontalGroup(
			gl_addVideoPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_addVideoPanel.createSequentialGroup()
					.addGroup(gl_addVideoPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addVideoPanel.createSequentialGroup()
							.addGap(127)
							.addGroup(gl_addVideoPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_5))
							.addGap(111)
							.addGroup(gl_addVideoPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_addVideoPanel.createParallelGroup(Alignment.LEADING, false)
									.addComponent(videoNameAddVideo)
									.addComponent(subjectAddVideo, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(classAddVideo, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(boardAddVideo, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_addVideoPanel.createSequentialGroup()
									.addComponent(videoBrowseAddVideo)
									.addGap(18)
									.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_addVideoPanel.createSequentialGroup()
									.addComponent(browseImageAddVideo)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNewLabel_7))))
						.addGroup(gl_addVideoPanel.createSequentialGroup()
							.addGap(180)
							.addComponent(submitAddVideo)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_addVideoPanel.setVerticalGroup(
			gl_addVideoPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_addVideoPanel.createSequentialGroup()
					.addGap(41)
					.addGroup(gl_addVideoPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(boardAddVideo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addGroup(gl_addVideoPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(classAddVideo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(50)
					.addGroup(gl_addVideoPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(subjectAddVideo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(49)
					.addGroup(gl_addVideoPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(videoNameAddVideo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(50)
					.addGroup(gl_addVideoPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(videoBrowseAddVideo)
						.addComponent(lblNewLabel_6))
					.addGap(43)
					.addGroup(gl_addVideoPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_5)
						.addGroup(gl_addVideoPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(browseImageAddVideo)
							.addComponent(lblNewLabel_7)))
					.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
					.addComponent(submitAddVideo)
					.addGap(52))
		);
		addVideoPanel.setLayout(gl_addVideoPanel);
		
		final JPanel addQuizPanel = new JPanel();
		addQuizPanel.setBackground(new Color(48, 79, 9));
		show.add(addQuizPanel, "name_21140576162513");
		
		JComboBox boardAddQuiz = new JComboBox();
		
		JComboBox classAddQuiz = new JComboBox();
		
		JComboBox subjectAddQuiz = new JComboBox();
		
		JComboBox videoAddQuiz = new JComboBox();
		
		JTextArea questionArea = new JTextArea();
		JScrollPane uScrollPane=new JScrollPane(questionArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JLabel lblQuestion = new JLabel("Question");
		lblQuestion.setForeground(Color.WHITE);
		lblQuestion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblOption = new JLabel("Option 1");
		lblOption.setForeground(Color.WHITE);
		lblOption.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblOption_1 = new JLabel("Option 2");
		lblOption_1.setForeground(Color.WHITE);
		lblOption_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblOption_2 = new JLabel("Option 3");
		lblOption_2.setForeground(Color.WHITE);
		lblOption_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblOption_3 = new JLabel("Option 4");
		lblOption_3.setForeground(Color.WHITE);
		lblOption_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		JRadioButton option1 = new JRadioButton("");
		option1.setBackground(new Color(48, 79, 9));
		
		JRadioButton option2 = new JRadioButton("");
		option2.setBackground(new Color(48, 79, 9));
		
		JRadioButton option3 = new JRadioButton("");
		option3.setBackground(new Color(48, 79, 9));
		
		JRadioButton option4 = new JRadioButton("");
		option4.setBackground(new Color(48, 79, 9));
		ButtonGroup answerSelect=new ButtonGroup();
		answerSelect.add(option1);
		answerSelect.add(option2);
		answerSelect.add(option3);
		answerSelect.add(option4);
		
		JButton submitAddQuiz = new JButton("Submit");
		submitAddQuiz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_8 = new JLabel("Board");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_9 = new JLabel("Class");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_10 = new JLabel("Subject");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_11 = new JLabel("Video");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout gl_addQuizPanel = new GroupLayout(addQuizPanel);
		gl_addQuizPanel.setHorizontalGroup(
			gl_addQuizPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_addQuizPanel.createSequentialGroup()
					.addGap(87)
					.addComponent(submitAddQuiz)
					.addContainerGap(614, Short.MAX_VALUE))
				.addGroup(gl_addQuizPanel.createSequentialGroup()
					.addGap(71)
					.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addQuizPanel.createSequentialGroup()
							.addComponent(lblNewLabel_8)
							.addContainerGap())
						.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_addQuizPanel.createSequentialGroup()
								.addComponent(lblOption_3)
								.addContainerGap())
							.addGroup(gl_addQuizPanel.createSequentialGroup()
								.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.LEADING)
									.addComponent(lblQuestion)
									.addComponent(uScrollPane, GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
									.addGroup(gl_addQuizPanel.createSequentialGroup()
										.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.LEADING)
											.addComponent(lblOption)
											.addComponent(lblOption_1)
											.addComponent(lblOption_2))
										.addGap(67)
										.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.LEADING, false)
											.addComponent(textField_1)
											.addComponent(textField_2)
											.addComponent(textField_3)
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.LEADING, false)
											.addComponent(option1, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
											.addComponent(option2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(option3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(option4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
									.addGroup(gl_addQuizPanel.createSequentialGroup()
										.addComponent(boardAddQuiz, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
										.addGap(68)
										.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.LEADING)
											.addComponent(classAddQuiz, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel_9))
										.addGap(57)
										.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.LEADING)
											.addComponent(lblNewLabel_10)
											.addComponent(subjectAddQuiz, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
										.addGap(35)
										.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.LEADING)
											.addComponent(lblNewLabel_11)
											.addComponent(videoAddQuiz, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(86, GroupLayout.PREFERRED_SIZE)))))
		);
		gl_addQuizPanel.setVerticalGroup(
			gl_addQuizPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_addQuizPanel.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_8)
						.addComponent(lblNewLabel_9)
						.addComponent(lblNewLabel_11)
						.addComponent(lblNewLabel_10))
					.addGap(18)
					.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(boardAddQuiz, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(videoAddQuiz, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(classAddQuiz, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(subjectAddQuiz, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addComponent(lblQuestion)
					.addGap(18)
					.addComponent(uScrollPane, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOption)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(option1))
					.addGap(28)
					.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOption_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(option2))
					.addGap(26)
					.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblOption_2)
						.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(option3)))
					.addGap(30)
					.addGroup(gl_addQuizPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOption_3)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(option4))
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addComponent(submitAddQuiz)
					.addGap(26))
		);
		addQuizPanel.setLayout(gl_addQuizPanel);
		
		final JPanel intrectivityPanel = new JPanel();
		intrectivityPanel.setBackground(new Color(48, 79, 9));
		show.add(intrectivityPanel, "name_29882626024559");
		
		JLabel lblNewLabel_12 = new JLabel(" Board");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_13 = new JLabel("Class");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_14 = new JLabel("Subject");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_14.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_15 = new JLabel("Video");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_15.setForeground(Color.WHITE);
		
		JComboBox comboBox = new JComboBox();
		
		JComboBox comboBox_1 = new JComboBox();
		
		JComboBox comboBox_2 = new JComboBox();
		
		JComboBox comboBox_3 = new JComboBox();
		
		JLabel lblInteractrivityName = new JLabel("Interactivity Name");
		lblInteractrivityName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInteractrivityName.setForeground(Color.WHITE);
		
		JLabel lblIntreactivityPath = new JLabel("Intreactivity path");
		lblIntreactivityPath.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIntreactivityPath.setForeground(Color.WHITE);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setForeground(Color.WHITE);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnSubmit_1 = new JButton("Submit");
		btnSubmit_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_intrectivityPanel = new GroupLayout(intrectivityPanel);
		gl_intrectivityPanel.setHorizontalGroup(
			gl_intrectivityPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_intrectivityPanel.createSequentialGroup()
					.addGroup(gl_intrectivityPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_intrectivityPanel.createSequentialGroup()
							.addGroup(gl_intrectivityPanel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_intrectivityPanel.createSequentialGroup()
									.addGroup(gl_intrectivityPanel.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(Alignment.LEADING, gl_intrectivityPanel.createSequentialGroup()
											.addGap(82)
											.addGroup(gl_intrectivityPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblInteractrivityName)
												.addComponent(lblIntreactivityPath))
											.addPreferredGap(ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
											.addGroup(gl_intrectivityPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_intrectivityPanel.createSequentialGroup()
													.addComponent(btnBrowse)
													.addGap(18)
													.addComponent(lblNewLabel_16))))
										.addGroup(Alignment.LEADING, gl_intrectivityPanel.createSequentialGroup()
											.addGap(63)
											.addGroup(gl_intrectivityPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_intrectivityPanel.createSequentialGroup()
													.addComponent(lblNewLabel_12)
													.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblNewLabel_13)
													.addGap(137)))))
									.addGap(16)
									.addComponent(lblNewLabel_14)
									.addGap(93))
								.addGroup(Alignment.TRAILING, gl_intrectivityPanel.createSequentialGroup()
									.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addGap(78)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
									.addGap(48)))
							.addGroup(gl_intrectivityPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_15)))
						.addGroup(gl_intrectivityPanel.createSequentialGroup()
							.addGap(135)
							.addComponent(btnSubmit_1)))
					.addContainerGap(90, Short.MAX_VALUE))
		);
		gl_intrectivityPanel.setVerticalGroup(
			gl_intrectivityPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_intrectivityPanel.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_intrectivityPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_12)
						.addComponent(lblNewLabel_13)
						.addComponent(lblNewLabel_14)
						.addComponent(lblNewLabel_15))
					.addGap(36)
					.addGroup(gl_intrectivityPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(86)
					.addGroup(gl_intrectivityPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblInteractrivityName))
					.addGap(52)
					.addGroup(gl_intrectivityPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBrowse)
						.addComponent(lblIntreactivityPath)
						.addComponent(lblNewLabel_16))
					.addGap(85)
					.addComponent(btnSubmit_1)
					.addContainerGap(156, Short.MAX_VALUE))
		);
		intrectivityPanel.setLayout(gl_intrectivityPanel);
		
		JButton allVideo = new JButton("All Video");
		allVideo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		allVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show.removeAll();
				show.repaint();
				show.revalidate();
				
				show.add(allVideoPanel);
				show.repaint();
				show.revalidate();
			}
		});
		
		JButton addSchool = new JButton("Add School");
		addSchool.setFont(new Font("Tahoma", Font.PLAIN, 11));
		addSchool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show.removeAll();
				show.repaint();
				show.revalidate();
				
				show.add(addSchoolPanel);
				show.repaint();
				show.revalidate();
			}
		});
		
		JButton addVideo = new JButton("Add Video");
		addVideo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		addVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show.removeAll();
				show.repaint();
				show.revalidate();
				
				show.add(addVideoPanel);
				show.repaint();
				show.revalidate();
			}
		});
		
		JButton addQuiz = new JButton("Add Quiz");
		addQuiz.setFont(new Font("Tahoma", Font.PLAIN, 11));
		addQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show.removeAll();
				show.repaint();
				show.revalidate();
				
				show.add(addQuizPanel);
				show.repaint();
				show.revalidate();
			}
		});
		
		JButton logout = new JButton("Logout");
		logout.setFont(new Font("Tahoma", Font.PLAIN, 11));
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Alyss_Home homeFrame=new Alyss_Home();
				homeFrame.setVisible(true);
				dispose();
			}
		});
		
		JButton intrectivity = new JButton("Add Interactivity");
		intrectivity.setFont(new Font("Tahoma", Font.PLAIN, 11));
		intrectivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show.removeAll();
				show.repaint();
				show.revalidate();
				
				show.add(intrectivityPanel);
				show.repaint();
				show.revalidate();
			}
		});
		GroupLayout gl_main = new GroupLayout(main);
		gl_main.setHorizontalGroup(
			gl_main.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_main.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_main.createParallelGroup(Alignment.LEADING)
						.addComponent(logout, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_main.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(intrectivity, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(addSchool, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(addQuiz, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(addVideo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(allVideo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_main.setVerticalGroup(
			gl_main.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_main.createSequentialGroup()
					.addGap(30)
					.addComponent(allVideo)
					.addGap(26)
					.addComponent(addSchool)
					.addGap(26)
					.addComponent(addVideo)
					.addGap(26)
					.addComponent(addQuiz)
					.addGap(18)
					.addComponent(intrectivity)
					.addPreferredGap(ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
					.addComponent(logout)
					.addGap(21))
		);
		main.setLayout(gl_main);
		contentPane.setLayout(gl_contentPane);
	}
}
