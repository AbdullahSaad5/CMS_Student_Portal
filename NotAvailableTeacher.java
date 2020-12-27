package CMS_Student_Portal;

import java.awt.*;
import javax.swing.*;

public class NotAvailableTeacher extends Teacher_Portal_Screen{
	JLabel mainLabel;
	JPanel detailsPanel;
	
	public NotAvailableTeacher() {
		mainLabel = new JLabel("Page Not Available");
		mainLabel.setBounds(87 , 16, 300, 34);
		mainLabel.setFont(new Font("Roboto", Font.BOLD + Font.ITALIC, 30));
		mainLabel.setForeground(Color.white);
		infoPanel.add(mainLabel);
		
		detailsPanel = new JPanel();
		mainPanel.add(detailsPanel);
		detailsPanel.setBackground(Color.white);
		detailsPanel.setLayout(null);
		detailsPanel.setBounds(157, 275, 1053, 400);
		
		JLabel error = new JLabel("Error 404: Page Not Found");
		error.setBounds(140, 100, 800, 200);
		error.setFont(new Font("Roboto", Font.BOLD, 40));
		error.setIconTextGap(90);
		error.setForeground(Color.black);
		error.setVerticalTextPosition(JLabel.CENTER);
		error.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/Error.png")));
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
		background.setBounds(0, 0, 1366, 768);
		mainPanel.add(background);
		
		
		detailsPanel.add(error);
	}
}
