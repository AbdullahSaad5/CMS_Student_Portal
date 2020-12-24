package CMS_Student_Portal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Notifications extends Subject_Window{
	JLabel announcement;
	public Notifications(){
		
		notifications.setBackground(new Color(0x13A89E));
		notifications.setForeground(Color.WHITE);
		
		
		announcement = new JLabel("No new announcement available.");
		supportPanel.add(announcement);
		announcement.setFont(new Font("Roboto", Font.PLAIN, 13));
		announcement.setBounds(432, 140, 190, 15);
		announcement.setForeground(new Color(0x474747));
		
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
		background.setBounds(0, 0, 1366, 768);
		mainPanel.add(background);

	}
	
	public void mouseExited(MouseEvent e) {
		 if (e.getSource() == notifications) {
			//Do nothing
		} else {
			super.mouseExited(e);
		}
	}
}
