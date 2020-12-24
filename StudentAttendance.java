package CMS_Student_Portal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class StudentAttendance extends Subject_Window{
	JLabel attendanceGraph, headingLabel1, presents, absents;
	JPanel redIcon, greenIcon;
	public StudentAttendance() {
		
		attendance.setBackground(new Color(0x13A89E));
		attendance.setForeground(Color.WHITE);
		
		attendanceGraph = new JLabel(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/Attendamce.gif")));
		attendanceGraph.setBounds(443, 60, 184, 184);
		supportPanel.add(attendanceGraph);

		supportPanel.setBackground(new Color(251, 251, 251));
		headingLabel1 = new JLabel("Class Attendance Details");
		headingLabel1.setFont(new Font("Roboto", Font.PLAIN, 22));
		headingLabel1.setBounds(419, 10, 255, 26);
		supportPanel.add(headingLabel1);
		
		presents = new JLabel("Presents     32");
		presents.setFont(new Font("Roboto", Font.BOLD, 14));
		presents.setBounds(180, 120, 90, 16);
		absents = new JLabel("Absents       0");
		absents.setFont(new Font("Roboto", Font.BOLD, 14));
		absents.setBounds(182, 170, 90, 16);
		
		greenIcon = new JPanel();
		greenIcon.setBounds(150, 121, 13, 14);
		greenIcon.setBackground(new Color(0x329132));
		supportPanel.add(greenIcon);
		
		redIcon = new JPanel();
		redIcon.setBounds(150, 171, 13, 14);
		redIcon.setBackground(new Color(0xDA264A));
		supportPanel.add(redIcon);
		
		supportPanel.add(presents);
		supportPanel.add(absents);
		mainPanel.repaint();
		mainFrame.setVisible(true);
	}
	
	

	public void mouseExited(MouseEvent e) {
		if (e.getSource() == dashboard) {
			//Do nothing
		} else if (e.getSource() == attendance) {
			//Do nothing
		} else {
			super.mouseExited(e);
		}
	}
}
