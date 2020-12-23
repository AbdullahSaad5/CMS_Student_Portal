package CMS_Student_Portal;

import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class NotAvailable extends Student_Portal_Screen {
	public NotAvailable() {
		
		if(Student_Portal_Screen.regBool) {
			regCard.setBackground(new Color(0x13A89E));
			regCard.setForeground(Color.WHITE);
		}else if(Student_Portal_Screen.feesBool) {
			fees.setBackground(new Color(0x13A89E));
			fees.setForeground(Color.WHITE);
		}else if(Student_Portal_Screen.resultBool) {
			resultCard.setBackground(new Color(0x13A89E));
			resultCard.setForeground(Color.WHITE);
		}
		JPanel detailsPanel = new JPanel();
		detailsPanel.setBackground(Color.white);
		detailsPanel.setLayout(null);
		detailsPanel.setBounds(157, 157, 1053, 375);
		
		
		JLabel error = new JLabel("Error 404: Page Not Found");
		error.setBounds(140, 73, 800, 200);
		error.setFont(new Font("Roboto", Font.BOLD, 40));
		error.setIconTextGap(90);
		error.setForeground(Color.black);
		error.setVerticalTextPosition(JLabel.CENTER);
		error.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/Error.png")));
		
		detailsPanel.add(error);
		mainPanel.add(detailsPanel);
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
		background.setBounds(0, 0, 1366, 768);
		mainPanel.add(background);
		
		mainFrame.setVisible(true);
	}
	
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == dashboard) {
			dashboard.setBackground(Color.WHITE);
			dashboard.setForeground(Color.black);
		}
		if (e.getSource() == regCard && !Student_Portal_Screen.regBool) {
			regCard.setBackground(Color.WHITE);
			regCard.setForeground(Color.black);
		}
		if (e.getSource() == fees && !Student_Portal_Screen.feesBool) {
			fees.setBackground(Color.WHITE);
			fees.setForeground(Color.black);
		}
		if (e.getSource() == resultCard && !Student_Portal_Screen.resultBool) {
			resultCard.setBackground(Color.WHITE);
			resultCard.setForeground(Color.black);
		}
		if (e.getSource() == profile) {
			profile.setBackground(Color.WHITE);
			profile.setForeground(Color.black);
		}
		if (e.getSource() == logOut) {
			logOut.setBackground(Color.WHITE);
			logOut.setForeground(Color.black);
		}
	}
}
