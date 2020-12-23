package CMS_Student_Portal;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Notifications extends Subject_Window{
	JLabel announcement;
	public Notifications(){
		
		notifications.setBackground(new Color(0x13A89E));
		notifications.setForeground(Color.WHITE);
		
		announcement = new JLabel("No new announcement available.");
		supportPanel.add(announcement);
		announcement.setFont(new Font("Roboto", Font.PLAIN, 13));
		announcement.setBounds(432, 105, 190, 15);
		announcement.setForeground(new Color(0x474747));
		announcement.setBackground(Color.orange);
	}

}
