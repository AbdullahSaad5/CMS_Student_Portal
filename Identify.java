package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Identify extends Template implements ActionListener {
	JPanel mainPanel;
	JLabel identityLabel;
	JButton teacherButton, studentButton;
	static Person account;
	static boolean isTeacher = false;

	public Identify(){
		mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(200, 200));
		mainFrame.add(mainPanel, BorderLayout.CENTER);

		identityLabel = new JLabel("Confirm Your Identity");
		identityLabel.setFont(new Font("Roboto", Font.BOLD, 20));
		identityLabel.setBounds(583, 54, 200, 25);
		mainPanel.setLayout(null);
		mainPanel.add(identityLabel);

		teacherButton = new JButton("Teacher");
		mainPanel.add(teacherButton);
		teacherButton.setFocusable(false);
		teacherButton.setBounds(478, 124, 150, 50);
		teacherButton.setFont(new Font("Roboto", Font.BOLD, 18));
		teacherButton.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/teacher.png")));
		teacherButton.setIconTextGap(10);
//		teacherButton.setBorder(null);
		teacherButton.setBackground(new Color(0x26C6DA));

		studentButton = new JButton("Student");
		mainPanel.add(studentButton);
		studentButton.setFocusable(false);
		studentButton.setBounds(738, 124, 150, 50);
		studentButton.setFont(new Font("Roboto", Font.BOLD, 18));
		studentButton.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/student.png")));
		studentButton.setIconTextGap(10);
//		studentButton.setBorder(null);
		studentButton.setBackground(new Color(0x66BB6A));

		studentButton.addActionListener(this);
		teacherButton.addActionListener(this);

		mainFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == teacherButton) {
			isTeacher = true;
		} else if (e.getSource() == studentButton) {
			isTeacher = false;
		}
		new LoginOrSignup();
		mainFrame.dispose();
	}
}