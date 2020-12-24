package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Subject_Window extends Student_Portal_Screen {
	JPanel supportPanel;
	JLabel courseName, creditHours, teacherName, courseCode;
	JButton notifications, attendance, marks, learning, assignments, MDB, GDB, quizzes, lectureContents,
			courseInformation;
	static Boolean notiBool = true, attBool = false, marksBool = false, learnBool = false, assignBool = false,
			MDBBool = false, GDBBool = false, quizBool = false, lecBool = false, courseBool = false;

	public Subject_Window() {

		dashboard.setBackground(new Color(0x13A89E));
		dashboard.setForeground(Color.WHITE);

		courseName = new JLabel("Object Oriented Programming");
		courseName.setFont(new Font("Roboto", Font.BOLD, 22));
		courseName.setBounds(157, 159, 300, 26);
		courseName.setForeground(Color.white);
		mainPanel.add(courseName);

		creditHours = new JLabel("Credit Hours : 4");
		creditHours.setFont(new Font("Roboto", Font.BOLD, 14));
		creditHours.setBounds(319, 195, 200, 16);
		creditHours.setForeground(Color.white);
		mainPanel.add(creditHours);

		teacherName = new JLabel("Teacher : Saneeha Aamir");
		teacherName.setFont(new Font("Roboto", Font.BOLD, 14));
		teacherName.setBounds(157, 219, 200, 16);
		teacherName.setForeground(Color.white);
		mainPanel.add(teacherName);

		courseCode = new JLabel("Course Code : CSC241");
		courseCode.setFont(new Font("Roboto", Font.BOLD, 14));
		courseCode.setBounds(157, 195, 200, 16);
		courseCode.setForeground(Color.white);
		mainPanel.add(courseCode);

		supportPanel = new JPanel();
		mainPanel.add(supportPanel);
		supportPanel.setBounds(157, 252, 1053, 225);
		supportPanel.setBackground(Color.WHITE);
		supportPanel.setLayout(null);

		notifications = new JButton("<html><p style='text-align:center'>Course<br>Notifications</p></html>");
		notifications
				.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/Dashboard/dashboard.png")));
		notifications.setBounds(552, 161, 61, 68);
		mainPanel.add(notifications);
		notifications.setFont(new Font("Roboto", Font.BOLD, 8));
		notifications.setHorizontalTextPosition(JLabel.CENTER);
		notifications.setVerticalTextPosition(JLabel.BOTTOM);
		notifications.setBackground(null);
		notifications.setForeground(Color.white);
		notifications.setFocusable(false);
		notifications.setBorder(null);
		notifications.setMargin(null);
		notifications.addMouseListener(this);

		attendance = new JButton("<html><p style='text-align:center'>Attendance<br>   </p></html>");
		attendance.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/Dashboard/Attendance.png")));
		attendance.setBounds(617, 161, 61, 68);
		mainPanel.add(attendance);
		attendance.setFont(new Font("Roboto", Font.BOLD, 8));
		attendance.setHorizontalTextPosition(JLabel.CENTER);
		attendance.setVerticalTextPosition(JLabel.BOTTOM);
		attendance.setBackground(null);
		attendance.setForeground(Color.white);
		attendance.setFocusable(false);
		attendance.setBorder(null);
		attendance.setMargin(null);
		attendance.addMouseListener(this);

		marks = new JButton("<html><p style='text-align:center'>Marks<br>Summary</p></html>");
		marks.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/Dashboard/Marks.png")));
		marks.setBounds(682, 161, 61, 68);
		mainPanel.add(marks);
		marks.setFont(new Font("Roboto", Font.BOLD, 8));
		marks.setHorizontalTextPosition(JLabel.CENTER);
		marks.setVerticalTextPosition(JLabel.BOTTOM);
		marks.setBackground(null);
		marks.setForeground(Color.white);
		marks.setFocusable(false);
		marks.setBorder(null);
		marks.setMargin(null);
		marks.addMouseListener(this);

		learning = new JButton("<html><p style='text-align:center'>Learning<br>Resources</p></html>");
		learning.setIcon(
				new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/Dashboard/Course Contents.png")));
		learning.setBounds(747, 161, 61, 68);
		mainPanel.add(learning);
		learning.setFont(new Font("Roboto", Font.BOLD, 8));
		learning.setHorizontalTextPosition(JLabel.CENTER);
		learning.setVerticalTextPosition(JLabel.BOTTOM);
		learning.setBackground(null);
		learning.setForeground(Color.white);
		learning.setFocusable(false);
		learning.setBorder(null);
		learning.setMargin(null);
		learning.addMouseListener(this);

		assignments = new JButton("<html><p style='text-align:center'>Assignments<br>   </p></html>");
		assignments
				.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/Dashboard/Assignments.png")));
		assignments.setBounds(811, 161, 61, 68);
		mainPanel.add(assignments);
		assignments.setFont(new Font("Roboto", Font.BOLD, 8));
		assignments.setHorizontalTextPosition(JLabel.CENTER);
		assignments.setVerticalTextPosition(JLabel.BOTTOM);
		assignments.setBackground(null);
		assignments.setForeground(Color.white);
		assignments.setFocusable(false);
		assignments.setBorder(null);
		assignments.setMargin(null);
		assignments.addMouseListener(this);

		MDB = new JButton("<html><p style='text-align:center'>MDB<br>   </p></html>");
		MDB.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/Dashboard/MDB.png")));
		MDB.setBounds(876, 161, 61, 68);
		mainPanel.add(MDB);
		MDB.setFont(new Font("Roboto", Font.BOLD, 8));
		MDB.setHorizontalTextPosition(JLabel.CENTER);
		MDB.setVerticalTextPosition(JLabel.BOTTOM);
		MDB.setBackground(null);
		MDB.setForeground(Color.white);
		MDB.setFocusable(false);
		MDB.setBorder(null);
		MDB.setMargin(null);
		MDB.addMouseListener(this);

		GDB = new JButton("<html><p style='text-align:center'>GDB<br>  </p></html>");
		GDB.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/Dashboard/GDB.png")));
		GDB.setBounds(941, 161, 61, 68);
		mainPanel.add(GDB);
		GDB.setFont(new Font("Roboto", Font.BOLD, 8));
		GDB.setHorizontalTextPosition(JLabel.CENTER);
		GDB.setVerticalTextPosition(JLabel.BOTTOM);
		GDB.setBackground(null);
		GDB.setForeground(Color.white);
		GDB.setFocusable(false);
		GDB.setBorder(null);
		GDB.setMargin(null);
		GDB.addMouseListener(this);

		quizzes = new JButton("<html><p style='text-align:center'>Quizzes<br>​​​​​  </p></html>");
		quizzes.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/Dashboard/Quiz.png")));
		quizzes.setBounds(1006, 161, 61, 68);
		mainPanel.add(quizzes);
		quizzes.setFont(new Font("Roboto", Font.BOLD, 8));
		quizzes.setHorizontalTextPosition(JLabel.CENTER);
		quizzes.setVerticalTextPosition(JLabel.BOTTOM);
		quizzes.setBackground(null);
		quizzes.setForeground(Color.white);
		quizzes.setFocusable(false);
		quizzes.setBorder(null);
		quizzes.setMargin(null);
		quizzes.addMouseListener(this);

		lectureContents = new JButton("<html><p style='text-align:center'>Lecture<br>Contents</p></html>");
		lectureContents.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/Dashboard/GDB.png")));
		lectureContents.setBounds(1071, 161, 61, 68);
		mainPanel.add(lectureContents);
		lectureContents.setFont(new Font("Roboto", Font.BOLD, 8));
		lectureContents.setHorizontalTextPosition(JLabel.CENTER);
		lectureContents.setVerticalTextPosition(JLabel.BOTTOM);
		lectureContents.setBackground(null);
		lectureContents.setForeground(Color.white);
		lectureContents.setFocusable(false);
		lectureContents.setBorder(null);
		lectureContents.setMargin(null);
		lectureContents.addMouseListener(this);

		courseInformation = new JButton("<html><p style='text-align:center'>Course<br>Information</p></html>");
		courseInformation
				.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/Dashboard/Course Info.png")));
		courseInformation.setBounds(1136, 161, 61, 68);
		mainPanel.add(courseInformation);
		courseInformation.setFont(new Font("Roboto", Font.BOLD, 8));
		courseInformation.setHorizontalTextPosition(JLabel.CENTER);
		courseInformation.setVerticalTextPosition(JLabel.BOTTOM);
		courseInformation.setBackground(null);
		courseInformation.setForeground(Color.white);
		courseInformation.setFocusable(false);
		courseInformation.setBorder(null);
		courseInformation.setMargin(null);
		courseInformation.addMouseListener(this);
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
		background.setBounds(0, 0, 1366, 768);
		mainPanel.add(background);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		super.mouseEntered(e);
		if (e.getSource() == notifications) {
			notifications.setBackground(new Color(0x13A89E));
		}
		if (e.getSource() == attendance) {
			attendance.setBackground(new Color(0x13A89E));
		}
		if (e.getSource() == marks) {
			marks.setBackground(new Color(0x13A89E));
		}
		if (e.getSource() == learning) {
			learning.setBackground(new Color(0x13A89E));
		}
		if (e.getSource() == assignments) {
			assignments.setBackground(new Color(0x13A89E));
		}
		if (e.getSource() == GDB) {
			GDB.setBackground(new Color(0x13A89E));
		}
		if (e.getSource() == MDB) {
			MDB.setBackground(new Color(0x13A89E));
		}
		if (e.getSource() == quizzes) {
			quizzes.setBackground(new Color(0x13A89E));
		}
		if (e.getSource() == lectureContents) {
			lectureContents.setBackground(new Color(0x13A89E));
		}
		if (e.getSource() == courseInformation) {
			courseInformation.setBackground(new Color(0x13A89E));
		}
	}


	public void mouseExited(MouseEvent e) {
		super.mouseExited(e);
		if (e.getSource() == notifications && !notiBool) {
			notifications.setBackground(null);
		}
		if (e.getSource() == attendance && !attBool) {
			attendance.setBackground(null);
		}
		if (e.getSource() == marks && !marksBool) {
			marks.setBackground(null);
		}
		if (e.getSource() == learning && !learnBool) {
			learning.setBackground(null);
		}
		if (e.getSource() == assignments && !assignBool) {
			assignments.setBackground(null);
		}
		if (e.getSource() == GDB && !GDBBool) {
			GDB.setBackground(null);
		}
		if (e.getSource() == MDB && !MDBBool) {
			MDB.setBackground(null);
		}
		if (e.getSource() == quizzes && !quizBool) {
			quizzes.setBackground(null);
		}
		if (e.getSource() == lectureContents && !lecBool) {
			lectureContents.setBackground(null);
		}
		if (e.getSource() == courseInformation && !courseBool) {
			courseInformation.setBackground(null);
		}
	}

	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		if (e.getSource() == notifications) {
			notiBool = true;
			attBool = false;
			marksBool = false;
			learnBool = false;
			assignBool = false;
			MDBBool = false;
			GDBBool = false;
			quizBool = false;
			lecBool = false;
			courseBool = false;
			new Notifications();
			mainFrame.dispose();
		}
		if (e.getSource() == attendance) {
			notiBool = false;
			attBool = true;
			marksBool = false;
			learnBool = false;
			assignBool = false;
			MDBBool = false;
			GDBBool = false;
			quizBool = false;
			lecBool = false;
			courseBool = false;
			new Subject_Window();
			mainFrame.dispose();
		}
		if (e.getSource() == marks) {
			notiBool = false;
			attBool = false;
			marksBool = true;
			learnBool = false;
			assignBool = false;
			MDBBool = false;
			GDBBool = false;
			quizBool = false;
			lecBool = false;
			courseBool = false;
			new Subject_Window();
			mainFrame.dispose();
		}
		if (e.getSource() == learning) {
			notiBool = false;
			attBool = false;
			marksBool = false;
			learnBool = true;
			assignBool = false;
			MDBBool = false;
			GDBBool = false;
			quizBool = false;
			lecBool = false;
			courseBool = false;
			new Subject_Window();
			mainFrame.dispose();
		}
		if (e.getSource() == assignments) {
			notiBool = false;
			attBool = false;
			marksBool = false;
			learnBool = false;
			assignBool = true;
			MDBBool = false;
			GDBBool = false;
			quizBool = false;
			lecBool = false;
			courseBool = false;
			new Subject_Window();
			mainFrame.dispose();
		}
		if (e.getSource() == GDB) {
			notiBool = false;
			attBool = false;
			marksBool = false;
			learnBool = false;
			assignBool = false;
			MDBBool = false;
			GDBBool = true;
			quizBool = false;
			lecBool = false;
			courseBool = false;
			new Subject_Window();
			mainFrame.dispose();
		}
		if (e.getSource() == MDB) {
			notiBool = false;
			attBool = false;
			marksBool = false;
			learnBool = false;
			assignBool = false;
			MDBBool = true;
			GDBBool = false;
			quizBool = false;
			lecBool = false;
			courseBool = false;
			new Subject_Window();
			mainFrame.dispose();
		}
		if (e.getSource() == quizzes) {
			notiBool = false;
			attBool = false;
			marksBool = false;
			learnBool = false;
			assignBool = false;
			MDBBool = false;
			GDBBool = false;
			quizBool = true;
			lecBool = false;
			courseBool = false;
			new Subject_Window();
			mainFrame.dispose();
		}
		if (e.getSource() == lectureContents) {
			notiBool = false;
			attBool = false;
			marksBool = false;
			learnBool = false;
			assignBool = false;
			MDBBool = false;
			GDBBool = false;
			quizBool = false;
			lecBool = true;
			courseBool = false;
			new Subject_Window();
			mainFrame.dispose();
		}
		if (e.getSource() == courseInformation) {
			notiBool = false;
			attBool = false;
			marksBool = false;
			learnBool = false;
			assignBool = false;
			MDBBool = false;
			GDBBool = false;
			quizBool = false;
			lecBool = false;
			courseBool = true;
			new Subject_Window();
			mainFrame.dispose();
		}

	}

}
