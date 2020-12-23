package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;

public class Student_Assignment_GUI extends Subject_Window {
	JPanel headingPanel;
	JLabel number, title, startDate, endDate, fileSize, fileType, action, teacherComment;

	public Student_Assignment_GUI() {
		
		assignments.setBackground(new Color(0x13A89E));
		assignments.setForeground(Color.WHITE);
		
		headingPanel = new JPanel();
		headingPanel.setLayout(null);
		headingPanel.setBackground(new Color(0x1E1F4A));
		headingPanel.setBounds(0, 0, 1053, 33);
		
		number = new JLabel("#");
		number.setBounds(19, 9, 8, 14);
		number.setForeground(Color.white);
		number.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(number);
		
		title = new JLabel("Title");
		title.setBounds(74, 9, 25, 14);
		title.setForeground(Color.white);
		title.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(title);
		
		startDate = new JLabel("Start Date");
		startDate.setBounds(173, 9, 55, 14);
		startDate.setForeground(Color.white);
		startDate.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(startDate);
		
		endDate = new JLabel("Last Date");
		endDate.setBounds(320, 9, 51, 14);
		endDate.setForeground(Color.white);
		endDate.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(endDate);
		
		fileSize = new JLabel("File Size");
		fileSize.setBounds(458, 9, 46, 14);
		fileSize.setForeground(Color.white);
		fileSize.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(fileSize);
		
		fileType = new JLabel("File Type");
		fileType.setBounds(591, 9, 49, 14);
		fileType.setForeground(Color.white);
		fileType.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(fileType);
		
		action = new JLabel("Action");
		action.setBounds(720, 9, 36, 14);
		action.setForeground(Color.white);
		action.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(action);
		
		teacherComment = new JLabel("Teacher Comments");
		teacherComment.setBounds(869, 9, 106, 14);
		teacherComment.setForeground(Color.white);
		teacherComment.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(teacherComment);
		
		supportPanel.add(headingPanel);
		mainPanel.repaint();
		
		mainFrame.setVisible(true);
	}
}
