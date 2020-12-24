package CMS_Student_Portal;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class NotAvailableSubject extends Subject_Window{
	JLabel dataLabel;
	public NotAvailableSubject() {
		
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
