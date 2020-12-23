package CMS_Student_Portal;

import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Student_Dashboard extends Student_Portal_Screen {

	JPanel heading, subsPanel, tableHeader, OOPSubject;
	JLabel headingLabel;
	JLabel courseNo, courseName, credits, teacher, class_, attendanceSummary;
	JLabel courseNohead, courseNamehead, creditshead, teacherhead, classhead, attendanceSummaryhead;

	public Student_Dashboard() {

		dashboard.setBackground(new Color(0x13A89E));
		dashboard.setForeground(Color.WHITE);

		heading = new JPanel();
		heading.setBounds(157, 157, 1053, 59);
		heading.setBackground(new Color(0x0898A0));
		heading.setBorder(BorderFactory.createLineBorder(Color.white, 9));
		heading.setLayout(null);

		headingLabel = new JLabel("Registered Courses List");
		headingLabel.setForeground(Color.WHITE);
		headingLabel.setFont(new Font("Roboto", Font.BOLD, 18));
		headingLabel.setBounds(429, 19, 194, 21);
		heading.add(headingLabel);

		subsPanel = new JPanel();
		subsPanel.setBounds(157, 216, 1053, 243);
		subsPanel.setBackground(Color.WHITE);
		subsPanel.setLayout(null);
		mainPanel.add(subsPanel);

		tableHeader = new JPanel();
		tableHeader.setBounds(0, 0, 1053, 31);
		tableHeader.setBackground(new Color(0x1F2C4F));
		tableHeader.setLayout(null);
		subsPanel.add(tableHeader);

		OOPSubject = new JPanel();
		OOPSubject.setLayout(null);
		OOPSubject.setBounds(0, 33, 1053, 31);
		OOPSubject.setBackground(Color.white);
		subsPanel.add(OOPSubject);
		OOPSubject.addMouseListener(this);

		mainPanel.add(heading);

		courseNohead = new JLabel("Course No");
		courseNohead.setFont(new Font("Roboto", Font.BOLD, 15));
		courseNohead.setBounds(29, 8, 75, 15);
		courseNohead.setForeground(Color.white);
		tableHeader.add(courseNohead);

		courseNamehead = new JLabel("Course Name");
		courseNamehead.setFont(new Font("Roboto", Font.BOLD, 15));
		courseNamehead.setBounds(218, 8, 95, 15);
		courseNamehead.setForeground(Color.white);
		tableHeader.add(courseNamehead);

		creditshead = new JLabel("Credits");
		creditshead.setFont(new Font("Roboto", Font.BOLD, 15));
		creditshead.setBounds(417, 8, 62, 15);
		creditshead.setForeground(Color.white);
		tableHeader.add(creditshead);

		teacherhead = new JLabel("Teacher");
		teacherhead.setFont(new Font("Roboto", Font.BOLD, 15));
		teacherhead.setBounds(555, 8, 62, 15);
		teacherhead.setForeground(Color.white);
		tableHeader.add(teacherhead);

		classhead = new JLabel("Class");
		classhead.setFont(new Font("Roboto", Font.BOLD, 15));
		classhead.setBounds(736, 8, 62, 15);
		classhead.setForeground(Color.white);
		tableHeader.add(classhead);

		attendanceSummaryhead = new JLabel("Attendance Summary");
		attendanceSummaryhead.setFont(new Font("Roboto", Font.BOLD, 15));
		attendanceSummaryhead.setBounds(877, 8, 150, 15);
		attendanceSummaryhead.setForeground(Color.white);
		tableHeader.add(attendanceSummaryhead);

		courseNo = new JLabel("CSC241");
		courseNo.setFont(new Font("Roboto", Font.BOLD, 13));
		courseNo.setBounds(38, 8, 55, 15);
//		courseNo.setForeground(Color.white);
		OOPSubject.add(courseNo);

		courseName = new JLabel("Object Oriented Programming");
		courseName.setFont(new Font("Roboto", Font.BOLD, 13));
		courseName.setBounds(178, 8, 170, 15);
//		courseName.setForeground(Color.white);
		OOPSubject.add(courseName);

		credits = new JLabel("4");
		credits.setFont(new Font("Roboto", Font.BOLD, 13));
		credits.setBounds(438, 8, 10, 15);
//		credits.setForeground(Color.white);
		OOPSubject.add(credits);

		teacher = new JLabel("Saneeha Aamir");
		teacher.setFont(new Font("Roboto", Font.BOLD, 13));
		teacher.setBounds(530, 8, 200, 15);
		teacher.setHorizontalTextPosition(JLabel.CENTER);
//		teacher.setForeground(Color.white);
		OOPSubject.add(teacher);

		class_ = new JLabel("BCS 3 BCS-3B B");
		class_.setFont(new Font("Roboto", Font.BOLD, 13));
		class_.setBounds(710, 8, 100, 15);
//		class_.setForeground(Color.white);
		OOPSubject.add(class_);

		attendanceSummary = new JLabel("100%");
		attendanceSummary.setFont(new Font("Roboto", Font.BOLD, 13));
		attendanceSummary.setBounds(935, 8, 35, 15);
		attendanceSummary.setForeground(new Color(0x43A047));
		OOPSubject.add(attendanceSummary);

		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
		background.setBounds(0, 0, 1366, 768);
		mainPanel.add(background);

	}

	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == regCard) {
			regCard.setBackground(new Color(0x13A89E));
			regCard.setForeground(Color.white);
		}
		if (e.getSource() == fees) {
			fees.setBackground(new Color(0x13A89E));
			fees.setForeground(Color.white);
		}
		if (e.getSource() == resultCard) {
			resultCard.setBackground(new Color(0x13A89E));
			resultCard.setForeground(Color.white);
		}
		if (e.getSource() == profile) {
			profile.setBackground(new Color(0x13A89E));
			profile.setForeground(Color.white);
		}
		if (e.getSource() == logOut) {
			logOut.setBackground(new Color(0x13A89E));
			logOut.setForeground(Color.white);
		}
		if (e.getSource() == OOPSubject) {
			OOPSubject.setBackground(new Color(0xF5F5F5));
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == regCard) {
			regCard.setBackground(Color.WHITE);
			regCard.setForeground(Color.black);
		}
		if (e.getSource() == fees) {
			fees.setBackground(Color.WHITE);
			fees.setForeground(Color.black);
		}
		if (e.getSource() == resultCard) {
			resultCard.setBackground(Color.WHITE);
			resultCard.setForeground(Color.black);
		}
		if (e.getSource() == profile) {
			profile.setBackground(Color.WHITE);
			profile.setForeground(Color.black);
		}
		if (e.getSource() == logOut) {
			logOut.setBackground(Color.WHITE);
			logOut.setForeground(Color.black);
		}
		if (e.getSource() == OOPSubject) {
			OOPSubject.setBackground(Color.white);
		}
	}

}
