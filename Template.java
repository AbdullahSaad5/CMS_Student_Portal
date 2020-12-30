package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;

public class Template {
	JFrame mainFrame;
	JLabel universityTitle, footerLabel;
	JPanel headerPanel, footerPanel;
	JButton backButton;

	public Template() {
		// Initiating Objects
		mainFrame = new JFrame();
		headerPanel = new JPanel();
		footerPanel = new JPanel();

		// Setting frame settings
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(1366, 768);
		mainFrame.setResizable(false);
		mainFrame.setTitle("CUOnline Portal Desktop Version");
		mainFrame.setLayout(new BorderLayout());
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setIconImage(new ImageIcon(getClass().getResource("/CMS_Student_Portal/WindowIcon.png")).getImage());

		// Setting GUI
		mainFrame.add(headerPanel, BorderLayout.NORTH);
		headerPanel.setLayout(null);
		headerPanel.setPreferredSize(new Dimension(1366, 250));

		universityTitle = new JLabel("COMSATS University, Islamabad");
		universityTitle.setFont(new Font("Roboto", Font.BOLD, 25));
		universityTitle.setBounds(500, -15, 380, 250);
		headerPanel.add(universityTitle);

		ImageIcon back = new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/previous.png"));
		backButton = new JButton(back);
		backButton.setFocusable(false);
		backButton.setBorder(null);
		backButton.setBackground(new Color(238, 238, 238));
		headerPanel.add(backButton);
		backButton.setBounds(16, 16, 32, 32);
		backButton.setEnabled(false);

		ImageIcon logo = new ImageIcon(getClass().getResource("compressedLogo.png"));
		universityTitle.setIcon(logo);
		universityTitle.setHorizontalTextPosition(JLabel.CENTER);
		universityTitle.setVerticalTextPosition(JLabel.BOTTOM);
		universityTitle.setIconTextGap(15);

		footerLabel = new JLabel("CUOnline, Principal Seat © 2018-COMSATS ®");
		footerPanel.add(footerLabel);
		footerPanel.setPreferredSize(new Dimension(1366, 20));
		footerLabel.setHorizontalTextPosition(JLabel.CENTER);
		footerLabel.setVerticalTextPosition(JLabel.BOTTOM);
		footerLabel.setFont(new Font(Font.SERIF, Font.BOLD, 12));
		mainFrame.add(footerPanel, BorderLayout.SOUTH);

		mainFrame.setVisible(true);

	}
}
