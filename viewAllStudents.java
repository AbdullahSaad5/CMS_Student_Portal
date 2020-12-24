package CMS_Student_Portal;

import java.awt.*;

import javax.swing.*;

public class viewAllStudents extends Teacher_Portal_Screen{
	JPanel viewPanel;
	JLabel mainLabel;
	public viewAllStudents() {
		mainLabel = new JLabel("View All Students");
		mainPanel.add(mainLabel);
		mainLabel.setForeground(Color.white);
		mainLabel.setBounds(87 , 16, 240, 34);
		mainLabel.setFont(new Font("Roboto", Font.BOLD + Font.ITALIC, 30));
		
		infoPanel.add(mainLabel);
		
		JTextArea students = new JTextArea();
		students.setEditable(false);
		students.setAutoscrolls(true);
		students.setFont(new Font("Roboto",Font.ITALIC, 15));
		students.setText(Student.displayAllStudents());
		
		
		JScrollPane mainWindow = new JScrollPane(students, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		mainWindow.getVerticalScrollBar().setBackground(new Color(0x1E214A));
		mainWindow.getBackground().darker();
		mainWindow.setBounds(157, 252, 1053, 300);
		mainPanel.add(mainWindow);
	}
}
