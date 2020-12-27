package CMS_Student_Portal;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class viewAllStudents extends Teacher_Portal_Screen {
	JLabel mainLabel;
	JTextArea students;
	JScrollPane mainWindow;
	JTextField search;
	JButton searchButton;
	static String searched;

	public viewAllStudents() {
		mainLabel = new JLabel("View All Students");
		mainPanel.add(mainLabel);
		mainLabel.setForeground(Color.white);
		mainLabel.setBounds(87, 16, 240, 34);
		mainLabel.setFont(new Font("Roboto", Font.BOLD + Font.ITALIC, 30));

		infoPanel.add(mainLabel);

		students = new JTextArea();
		students.setEditable(false);
		students.setAutoscrolls(true);
		students.setFont(new Font("Roboto", Font.ITALIC, 15));
		students.setText(Student.displayAllStudents());

		mainWindow = new JScrollPane(students, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		mainWindow.getVerticalScrollBar().setBackground(new Color(0x1E214A));
		mainWindow.getBackground().darker();
		mainWindow.setBounds(157, 275, 1053, 400);
		mainPanel.add(mainWindow);

		search = new JTextField();
		search.setBounds(1028, 37, 200, 20);
		infoPanel.add(search);

		searchButton = new JButton("Search Button");
		searchButton.setBounds(1250, 37, 91, 20);
		searchButton.setFont(new Font("Roboto", Font.BOLD, 13));
		searchButton.setForeground(Color.white);
		searchButton.setBackground(null);
		searchButton.setBorder(null);
		searchButton.setFocusable(false);
		searchButton.addActionListener(this);
		infoPanel.add(searchButton);
		
		mainWindow.repaint();
		mainPanel.revalidate();
		infoPanel.revalidate();
		mainPanel.repaint();
		infoPanel.repaint();
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
		background.setBounds(0, 0, 1366, 768);
		mainPanel.add(background);

		

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == searchButton) {
			searched = search.getText();
			if(searched.isBlank()) {
				JOptionPane.showMessageDialog(null, "Enter Something in Search Bar First!");
			}
			else {
				new SearchStudent();
			}
		} else {
			super.actionPerformed(e);
		}
	}
}
