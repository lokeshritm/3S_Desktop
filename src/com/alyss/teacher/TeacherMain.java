package com.alyss.teacher;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class TeacherMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherMain frame = new TeacherMain();
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
	public TeacherMain() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TeacherMain.class.getResource("/image/logoq.png")));
		setTitle("Teacher Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(48, 79, 9));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		final JPanel videoAll = new JPanel();
		videoAll.setBackground(new Color(143, 188, 143));
		videoAll.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(videoAll, "name_19535408293865");
		
		JButton btnPlayQuiz = new JButton("Play Quiz");
		btnPlayQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnPlayVideo = new JButton("Play Video");
		btnPlayVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				contentPane.repaint();
				contentPane.revalidate();
				
				contentPane.add(videoAll);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		GroupLayout gl_videoAll = new GroupLayout(videoAll);
		gl_videoAll.setHorizontalGroup(
			gl_videoAll.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_videoAll.createSequentialGroup()
					.addGap(224)
					.addComponent(btnPlayVideo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnPlayQuiz)
					.addContainerGap(556, Short.MAX_VALUE))
		);
		gl_videoAll.setVerticalGroup(
			gl_videoAll.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_videoAll.createSequentialGroup()
					.addContainerGap(475, Short.MAX_VALUE)
					.addGroup(gl_videoAll.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPlayQuiz)
						.addComponent(btnPlayVideo))
					.addGap(44))
		);
		videoAll.setLayout(gl_videoAll);
		
		JPanel videoPlay = new JPanel();
		videoPlay.setBackground(new Color(211, 211, 211));
		videoPlay.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(videoPlay, "name_19542707076723");
		
		JButton btnBack = new JButton("Back");
		GroupLayout gl_videoPlay = new GroupLayout(videoPlay);
		gl_videoPlay.setHorizontalGroup(
			gl_videoPlay.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_videoPlay.createSequentialGroup()
					.addGap(361)
					.addComponent(btnBack)
					.addContainerGap(514, Short.MAX_VALUE))
		);
		gl_videoPlay.setVerticalGroup(
			gl_videoPlay.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_videoPlay.createSequentialGroup()
					.addContainerGap(499, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addGap(20))
		);
		videoPlay.setLayout(gl_videoPlay);
		
		JPanel quizPlay = new JPanel();
		quizPlay.setBackground(new Color(255, 140, 0));
		quizPlay.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(quizPlay, "name_19551033352536");
		
		JButton btnBack_1 = new JButton("Back");
		GroupLayout gl_quizPlay = new GroupLayout(quizPlay);
		gl_quizPlay.setHorizontalGroup(
			gl_quizPlay.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_quizPlay.createSequentialGroup()
					.addGap(323)
					.addComponent(btnBack_1)
					.addContainerGap(552, Short.MAX_VALUE))
		);
		gl_quizPlay.setVerticalGroup(
			gl_quizPlay.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_quizPlay.createSequentialGroup()
					.addContainerGap(473, Short.MAX_VALUE)
					.addComponent(btnBack_1)
					.addGap(46))
		);
		quizPlay.setLayout(gl_quizPlay);
	}
}
