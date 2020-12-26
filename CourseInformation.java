package CMS_Student_Portal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.util.Scanner;

public class CourseInformation extends Subject_Window{
	
	public CourseInformation() {
		courseInformation.setBackground(new Color(0x13A89E));
		courseInformation.setForeground(Color.WHITE);
		
		JTextArea students = new JTextArea();
		students.setEditable(false);
		students.setFont(new Font("Casadia Code",Font.PLAIN, 12));
		String message = "";
		try {
			Scanner input = new Scanner(new File("/home/abdullah/Documents/CourseInfo.txt"));
			while(input.hasNext()) {
				message += input.nextLine();
				message += "\n";
			}
			
		} catch (Exception e) {
			System.out.println("File Not Found");
		}
		students.setText(message);
		
		JScrollPane mainWindow = new JScrollPane(students, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		mainWindow.getVerticalScrollBar().setBackground(new Color(0x1E214A));
		mainWindow.getHorizontalScrollBar().setBackground(new Color(0x1E214A));
		mainWindow.getBackground().brighter();
		mainWindow.setBounds(150, 251,1053, 370);
		mainPanel.add(mainWindow);
		
		supportPanel.setVisible(false);
		mainPanel.repaint();
	}
	
	public void mouseExited(MouseEvent e) {
		 if (e.getSource() == courseInformation) {
			//Do nothing
		} else {
			super.mouseExited(e);
		}
	}
}
