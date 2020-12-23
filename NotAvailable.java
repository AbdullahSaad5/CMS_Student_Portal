package CMS_Student_Portal;

import java.awt.*;
import javax.swing.*;

public class NotAvailable extends Student_Portal_Screen {
	public NotAvailable() {
		JPanel detailsPanel = new JPanel();
		detailsPanel.setBackground(new Color(0xEAEAEA));
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
		
		mainFrame.setVisible(true);
	}
}
