package CMS_Student_Portal;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class NotAvailableSubject extends Subject_Window{
	JLabel dataLabel;
	public NotAvailableSubject() {
		
		if(Subject_Window.attBool) {
			attendance.setBackground(new Color(0x13A89E));
			attendance.setForeground(Color.WHITE);
		}
		if(Subject_Window.MDBBool) {
			MDB.setBackground(new Color(0x13A89E));
			MDB.setForeground(Color.WHITE);
		}
		if(Subject_Window.GDBBool) {
			GDB.setBackground(new Color(0x13A89E));
			GDB.setForeground(Color.WHITE);
		}
		if(Subject_Window.marksBool) {
			marks.setBackground(new Color(0x13A89E));
			marks.setForeground(Color.WHITE);
		}
		if(Subject_Window.lecBool) {
			lectureContents.setBackground(new Color(0x13A89E));
			lectureContents.setForeground(Color.WHITE);
		}
		if(Subject_Window.courseBool) {
			courseInformation.setBackground(new Color(0x13A89E));
			courseInformation.setForeground(Color.WHITE);
		}
		
		dataLabel = new JLabel("No data available.");
		supportPanel.add(dataLabel);
		dataLabel.setForeground(new Color(0x474747));
		dataLabel.setFont(new Font("Roboto", Font.PLAIN, 13));
		dataLabel.setBounds(470, 105, 190, 15);
		

		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
		background.setBounds(0, 0, 1366, 768);
		mainPanel.add(background);
		
		
	}
}
