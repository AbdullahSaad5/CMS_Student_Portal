package CMS_Student_Portal;

import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Student_Dashboard extends Student_Portal_Screen {

	JPanel heading, subsPanel, tableHeader, OOP_Subject, data_Subject, CS_Subject, ODE_Subject, FOG_Subject;
	JLabel headingLabel;
	JLabel courseNo, courseName, credits, teacher, class_, attendanceSummary;
	JLabel courseNo2, courseName2, credits2, teacher2, class_2, attendanceSummary2;
	JLabel courseNo3, courseName3, credits3, teacher3, class_3, attendanceSummary3;
	JLabel courseNo4, courseName4, credits4, teacher4, class_4, attendanceSummary4;
	JLabel courseNo5, courseName5, credits5, teacher5, class_5, attendanceSummary5;
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

		OOP_Subject = new JPanel();
		OOP_Subject.setLayout(null);
		OOP_Subject.setBounds(0, 33, 1053, 31);
		OOP_Subject.setBackground(Color.white);
		subsPanel.add(OOP_Subject);
		OOP_Subject.addMouseListener(this);

		data_Subject = new JPanel();
		data_Subject.setLayout(null);
		data_Subject.setBounds(0, 66, 1053, 31);
		data_Subject.setBackground(Color.white);
		subsPanel.add(data_Subject);
		data_Subject.addMouseListener(this);

		CS_Subject = new JPanel();
		CS_Subject.setLayout(null);
		CS_Subject.setBounds(0, 99, 1053, 31);
		CS_Subject.setBackground(Color.white);
		subsPanel.add(CS_Subject);
		CS_Subject.addMouseListener(this);

		FOG_Subject = new JPanel();
		FOG_Subject.setLayout(null);
		FOG_Subject.setBounds(0, 132, 1053, 31);
		FOG_Subject.setBackground(Color.white);
		subsPanel.add(FOG_Subject);
		FOG_Subject.addMouseListener(this);

		ODE_Subject = new JPanel();
		ODE_Subject.setLayout(null);
		ODE_Subject.setBounds(0, 165, 1053, 31);
		ODE_Subject.setBackground(Color.white);
		subsPanel.add(ODE_Subject);
		ODE_Subject.addMouseListener(this);

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
		// ------------------------------------------------------------------------------------
		courseNo = new JLabel("CSC241");
		courseNo.setFont(new Font("Roboto", Font.BOLD, 13));
		courseNo.setBounds(38, 8, 55, 15);
		OOP_Subject.add(courseNo);

		courseName = new JLabel("Object Oriented Programming");
		courseName.setFont(new Font("Roboto", Font.BOLD, 13));
		courseName.setBounds(178, 8, 170, 15);
		OOP_Subject.add(courseName);

		credits = new JLabel("4");
		credits.setFont(new Font("Roboto", Font.BOLD, 13));
		credits.setBounds(438, 8, 10, 15);
		OOP_Subject.add(credits);

		teacher = new JLabel("Saneeha Aamir");
		teacher.setFont(new Font("Roboto", Font.BOLD, 13));
		teacher.setBounds(530, 8, 200, 15);
		teacher.setHorizontalTextPosition(JLabel.CENTER);
		OOP_Subject.add(teacher);

		class_ = new JLabel("BCS 3 BCS-3B B");
		class_.setFont(new Font("Roboto", Font.BOLD, 13));
		class_.setBounds(710, 8, 100, 15);
		OOP_Subject.add(class_);

		attendanceSummary = new JLabel(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/attendanceBar.gif")));
		attendanceSummary.setFont(new Font("Roboto", Font.BOLD, 13));
		attendanceSummary.setBounds(876, 4, 150, 21);
		attendanceSummary.setForeground(new Color(0x43A047));
		OOP_Subject.add(attendanceSummary);
//------------------------------------------------------------------------------------
		courseNo2 = new JLabel("HUM103");
		courseNo2.setFont(new Font("Roboto", Font.BOLD, 13));
		courseNo2.setBounds(38, 8, 55, 15);
		CS_Subject.add(courseNo2);

		courseName2 = new JLabel("Communication Skills");
		courseName2.setFont(new Font("Roboto", Font.BOLD, 13));
		courseName2.setBounds(178, 8, 170, 15);
		CS_Subject.add(courseName2);

		credits2 = new JLabel("3");
		credits2.setFont(new Font("Roboto", Font.BOLD, 13));
		credits2.setBounds(438, 8, 10, 15);
		CS_Subject.add(credits2);

		teacher2 = new JLabel("Mehmood-ul-Hassan");
		teacher2.setFont(new Font("Roboto", Font.BOLD, 13));
		teacher2.setBounds(530, 8, 200, 15);
		teacher2.setHorizontalTextPosition(JLabel.CENTER);
		CS_Subject.add(teacher2);

		class_2 = new JLabel("BCS 3 BCS-3B B");
		class_2.setFont(new Font("Roboto", Font.BOLD, 13));
		class_2.setBounds(710, 8, 100, 15);
		CS_Subject.add(class_2);

		attendanceSummary2 = new JLabel(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/attendanceBar.gif")));
		attendanceSummary2.setFont(new Font("Roboto", Font.BOLD, 13));
		attendanceSummary2.setBounds(876, 4, 150, 21);
		attendanceSummary2.setForeground(new Color(0x43A047));
		CS_Subject.add(attendanceSummary2);
		// ------------------------------------------------------------------------------------
		courseNo3 = new JLabel("CSC211");
		courseNo3.setFont(new Font("Roboto", Font.BOLD, 13));
		courseNo3.setBounds(38, 8, 55, 15);
		data_Subject.add(courseNo3);

		courseName3 = new JLabel("Data Structures and Algorithms");
		courseName3.setFont(new Font("Roboto", Font.BOLD, 13));
		courseName3.setBounds(178, 8, 200, 15);
		data_Subject.add(courseName3);

		credits3 = new JLabel("4");
		credits3.setFont(new Font("Roboto", Font.BOLD, 13));
		credits3.setBounds(438, 8, 10, 15);
		data_Subject.add(credits3);

		teacher3 = new JLabel("Dr. Inayat-ur-Rehman");
		teacher3.setFont(new Font("Roboto", Font.BOLD, 13));
		teacher3.setBounds(530, 8, 200, 15);
		teacher3.setHorizontalTextPosition(JLabel.CENTER);
		data_Subject.add(teacher3);

		class_3 = new JLabel("BCS 3 BCS-3B B");
		class_3.setFont(new Font("Roboto", Font.BOLD, 13));
		class_3.setBounds(710, 8, 100, 15);
		data_Subject.add(class_3);

		attendanceSummary3 = new JLabel(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/attendanceBar.gif")));
		attendanceSummary3.setFont(new Font("Roboto", Font.BOLD, 13));
		attendanceSummary3.setBounds(876, 4, 150, 21);
		attendanceSummary3.setForeground(new Color(0x43A047));
		data_Subject.add(attendanceSummary3);
		// ------------------------------------------------------------------------------------
		courseNo4 = new JLabel("MTH242");
		courseNo4.setFont(new Font("Roboto", Font.BOLD, 13));
		courseNo4.setBounds(38, 8, 55, 15);
		ODE_Subject.add(courseNo4);

		courseName4 = new JLabel("Differential Equations");
		courseName4.setFont(new Font("Roboto", Font.BOLD, 13));
		courseName4.setBounds(178, 8, 170, 15);
		ODE_Subject.add(courseName4);

		credits4 = new JLabel("3");
		credits4.setFont(new Font("Roboto", Font.BOLD, 13));
		credits4.setBounds(438, 8, 10, 15);
		ODE_Subject.add(credits4);

		teacher4 = new JLabel("Imtiaz Khan");
		teacher4.setFont(new Font("Roboto", Font.BOLD, 13));
		teacher4.setBounds(530, 8, 200, 15);
		teacher4.setHorizontalTextPosition(JLabel.CENTER);
		ODE_Subject.add(teacher4);

		class_4 = new JLabel("BCS 3 BCS-3B B");
		class_4.setFont(new Font("Roboto", Font.BOLD, 13));
		class_4.setBounds(710, 8, 100, 15);
		ODE_Subject.add(class_4);

		attendanceSummary4 = new JLabel(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/attendanceBar.gif")));
		attendanceSummary4.setFont(new Font("Roboto", Font.BOLD, 13));
		attendanceSummary4.setBounds(876, 4, 150, 21);
		attendanceSummary4.setForeground(new Color(0x43A047));
		ODE_Subject.add(attendanceSummary4);
		// ------------------------------------------------------------------------------------
		courseNo5 = new JLabel("BIO231");
		courseNo5.setFont(new Font("Roboto", Font.BOLD, 13));
		courseNo5.setBounds(38, 8, 55, 15);
		FOG_Subject.add(courseNo5);

		courseName5 = new JLabel("Fundamental of Genetics");
		courseName5.setFont(new Font("Roboto", Font.BOLD, 13));
		courseName5.setBounds(178, 8, 170, 15);
		FOG_Subject.add(courseName5);

		credits5 = new JLabel("4");
		credits5.setFont(new Font("Roboto", Font.BOLD, 13));
		credits5.setBounds(438, 8, 10, 15);
		FOG_Subject.add(credits5);

		teacher5 = new JLabel("Liaqat Ali");
		teacher5.setFont(new Font("Roboto", Font.BOLD, 13));
		teacher5.setBounds(530, 8, 200, 15);
		teacher5.setHorizontalTextPosition(JLabel.CENTER);
		FOG_Subject.add(teacher5);

		class_5 = new JLabel("BCS 3 BCS-3B B");
		class_5.setFont(new Font("Roboto", Font.BOLD, 13));
		class_5.setBounds(710, 8, 100, 15);
		FOG_Subject.add(class_5);

		attendanceSummary5 = new JLabel(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/attendanceBar.gif")));
		attendanceSummary5.setFont(new Font("Roboto", Font.BOLD, 13));
		attendanceSummary5.setBounds(876, 4, 150, 21);
		attendanceSummary5.setForeground(new Color(0x43A047));
		FOG_Subject.add(attendanceSummary5);

		mainPanel.repaint();
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
		background.setBounds(0, 0, 1366, 768);
		mainPanel.add(background);

	}

	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == OOP_Subject) {
			OOP_Subject.setBackground(new Color(0xEEEEEE));
		} else if (e.getSource() == CS_Subject) {
			CS_Subject.setBackground(new Color(0xEEEEEE));
		} else if (e.getSource() == data_Subject) {
			data_Subject.setBackground(new Color(0xEEEEEE));
		} else if (e.getSource() == ODE_Subject) {
			ODE_Subject.setBackground(new Color(0xEEEEEE));
		} else if (e.getSource() == FOG_Subject) {
			FOG_Subject.setBackground(new Color(0xEEEEEE));
		} else {
			super.mouseEntered(e);
		}
	}

	public void mouseExited(MouseEvent e) {
		if (e.getSource() == dashboard) {
			// Do nothing
		} else if (e.getSource() == OOP_Subject) {
			OOP_Subject.setBackground(Color.white);
		} else if (e.getSource() == CS_Subject) {
			CS_Subject.setBackground(Color.white);
		} else if (e.getSource() == data_Subject) {
			data_Subject.setBackground(Color.white);
		} else if (e.getSource() == ODE_Subject) {
			ODE_Subject.setBackground(Color.white);
		} else if (e.getSource() == FOG_Subject) {
			FOG_Subject.setBackground(Color.white);
		} else {
			super.mouseExited(e);
		}
	}

	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		if (e.getSource() == OOP_Subject) {
			new Notifications();
			mainFrame.dispose();
		}
	}

}
