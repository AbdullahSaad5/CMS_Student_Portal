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
		dashBool = true;
		
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
		OOPSubject.add(courseNo);

		courseName = new JLabel("Object Oriented Programming");
		courseName.setFont(new Font("Roboto", Font.BOLD, 13));
		courseName.setBounds(178, 8, 170, 15);
		OOPSubject.add(courseName);

		credits = new JLabel("4");
		credits.setFont(new Font("Roboto", Font.BOLD, 13));
		credits.setBounds(438, 8, 10, 15);
		OOPSubject.add(credits);

		teacher = new JLabel("Saneeha Aamir");
		teacher.setFont(new Font("Roboto", Font.BOLD, 13));
		teacher.setBounds(530, 8, 200, 15);
		teacher.setHorizontalTextPosition(JLabel.CENTER);
		OOPSubject.add(teacher);

		class_ = new JLabel("BCS 3 BCS-3B B");
		class_.setFont(new Font("Roboto", Font.BOLD, 13));
		class_.setBounds(710, 8, 100, 15);
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
		super.mouseEntered(e);
		if (e.getSource() == OOPSubject) {
			OOPSubject.setBackground(new Color(0xEEEEEE));
		}
	}
	
	public void mouseExited(MouseEvent e) {
		super.mouseEntered(e);
		if (e.getSource() == OOPSubject) {
			OOPSubject.setBackground(Color.white);
		}
	}

	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		if (e.getSource() == OOPSubject) {
			new Notifications();
			mainFrame.dispose();
		}
	}

}
