package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Student_Portal_Screen implements MouseListener {
	JFrame mainFrame;
	JPanel mainPanel, welcomePanel, footerPanel;
	JButton dashboard, regCard, fees, resultCard, profile, logOut;
	JLabel welcome, footerText;
	static boolean regBool, feesBool, resultBool;

	public Student_Portal_Screen() {
		mainFrame = new JFrame();
		mainFrame.setSize(1366, 768);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		mainFrame.setTitle("CUOnline Portal Desktop Version");
		mainFrame.setLayout(new BorderLayout());
		mainFrame.setLocationRelativeTo(null);

		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(0x1F2C4F));
		mainPanel.setLayout(null);
		mainFrame.add(mainPanel, BorderLayout.CENTER);

		welcomePanel = new JPanel();
		welcomePanel.setBackground(new Color(0x0898A0));
		welcomePanel.setBounds(0, 0, 1366, 25);
		welcomePanel.setLayout(null);
		mainPanel.add(welcomePanel);

//		Student curr = (Student)Identify.account;
//		welcome = new JLabel("Welcome: CIIT//" + curr.getRegNo() + "/ISB");
//		welcome.setBounds(157, 6, 250, 15);
//		welcome.setForeground(Color.WHITE);
//		welcome.setFont(new Font("Roboto", Font.BOLD, 15));
//		welcomePanel.add(welcome);

		footerPanel = new JPanel();
		footerPanel.setBackground(new Color(0x1E1F4A));
		footerPanel.setBounds(0, 704, 1366, 64);
		footerPanel.setLayout(null);
		mainPanel.add(footerPanel);

		footerText = new JLabel("CUOnline , Principal Sear @ 2018-COMSATS ®");
		footerText.setFont(new Font("Roboto", Font.BOLD, 13));
		footerText.setForeground(Color.white);
		footerText.setBounds(562, 18, 280, 15);
		footerPanel.add(footerText);

		// Adding dashboard button
//        "<html><p style='style='text-align: left'>Dashboard</p></html>"
		dashboard = new JButton("Dashboard");
		mainPanel.add(dashboard);
		dashboard.setBounds(607, 48, 64, 71);
		dashboard.setFont(new Font("Roboto", Font.BOLD, 8));
		dashboard.setFocusable(false);
		dashboard.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/dashboard.png")));
		dashboard.setVerticalTextPosition(JLabel.BOTTOM);
		dashboard.setHorizontalTextPosition(JLabel.CENTER);
		dashboard.setMargin(null);
		dashboard.setBackground(Color.WHITE);
		dashboard.addMouseListener(this);
		dashboard.setBorder(null);

		// Adding registration card button
		regCard = new JButton("<html><p style='text-align:center'>Registration<br>Card</p></html>");
		mainPanel.add(regCard);
		regCard.setBounds(679, 48, 64, 71);
		regCard.setFont(new Font("Roboto", Font.BOLD, 8));
		regCard.setFocusable(false);
		regCard.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/RegistrationCard.png")));
		regCard.setHorizontalTextPosition(JLabel.CENTER);
		regCard.setVerticalTextPosition(JLabel.BOTTOM);
		regCard.setBackground(Color.WHITE);
		regCard.addMouseListener(this);
		regCard.setBorder(null);

		// Adding fee button
		fees = new JButton("Fees");
		mainPanel.add(fees);
		fees.setBounds(751, 48, 64, 71);
		fees.setFont(new Font("Roboto", Font.BOLD, 8));
		fees.setFocusable(false);
		fees.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/feesIcon1.png")));
		fees.setHorizontalTextPosition(JLabel.CENTER);
		fees.setVerticalTextPosition(JLabel.BOTTOM);
		fees.setBackground(Color.WHITE);
		fees.addMouseListener(this);
		fees.setBorder(null);

		// Adding result card button
		resultCard = new JButton("Result Card");
		mainPanel.add(resultCard);
		resultCard.setBounds(822, 48, 64, 71);
		resultCard.setFont(new Font("Roboto", Font.BOLD, 8));
		resultCard.setFocusable(false);
		resultCard.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/resultCard.png")));
		resultCard.setHorizontalTextPosition(JLabel.CENTER);
		resultCard.setVerticalTextPosition(JLabel.BOTTOM);
		resultCard.setBackground(Color.WHITE);
		resultCard.addMouseListener(this);
		resultCard.setBorder(null);

		// Adding profile button
		profile = new JButton("Profile");
		mainPanel.add(profile);
		profile.setBounds(894, 48, 64, 71);
		profile.setFont(new Font("Roboto", Font.BOLD, 8));
		profile.setFocusable(false);
		profile.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/profile.png")));
		profile.setHorizontalTextPosition(JLabel.CENTER);
		profile.setVerticalTextPosition(JLabel.BOTTOM);
//        profile.addActionListener(this);
		profile.setBackground(Color.WHITE);
		profile.addMouseListener(this);
		profile.setBorder(null);

		// Adding logout button
		logOut = new JButton("Logout");
		mainPanel.add(logOut);
		logOut.setBounds(966, 48, 64, 71);
		logOut.setFont(new Font("Roboto", Font.BOLD, 8));
		logOut.setFocusable(false);
		logOut.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/logOut.png")));
		logOut.setHorizontalTextPosition(JLabel.CENTER);
		logOut.setVerticalTextPosition(JLabel.BOTTOM);
//        logOut.addActionListener(this);
		logOut.setBackground(Color.WHITE);
		logOut.addMouseListener(this);
		logOut.setBorder(null);

		JLabel image = new JLabel();
		mainPanel.add(image);
		image.setBounds(170, 42, 309, 93);
		image.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/logo_with_text.png")));

		JLabel user = new JLabel();
		mainPanel.add(user);
		user.setBounds(1097, 27, 113, 113);
		user.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/user.png")));

// Takes over the profile menu and doesn't show anything
//        JLabel background = new JLabel();
//        background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
//        background.setBounds(0,0, 1366, 768);
//        mainPanel.add(background);
		mainFrame.setVisible(true);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == dashboard) {
			dashboard.setBackground(new Color(0x13A89E));
			dashboard.setForeground(Color.white);
		}
		if (e.getSource() == regCard) {
			regCard.setBackground(new Color(0x13A89E));
			regCard.setForeground(Color.white);
		}
		if (e.getSource() == fees) {
			fees.setBackground(new Color(0x13A89E));
			fees.setForeground(Color.white);
		}
		if (e.getSource() == resultCard) {
			resultCard.setBackground(new Color(0x13A89E));
			resultCard.setForeground(Color.white);
		}
		if (e.getSource() == profile) {
			profile.setBackground(new Color(0x13A89E));
			profile.setForeground(Color.white);
		}
		if (e.getSource() == logOut) {
			logOut.setBackground(new Color(0x13A89E));
			logOut.setForeground(Color.white);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == dashboard) {
			dashboard.setBackground(Color.WHITE);
			dashboard.setForeground(Color.black);
		}
		if (e.getSource() == regCard) {
			regCard.setBackground(Color.WHITE);
			regCard.setForeground(Color.black);
		}
		if (e.getSource() == fees) {
			fees.setBackground(Color.WHITE);
			fees.setForeground(Color.black);
		}
		if (e.getSource() == resultCard) {
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

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == logOut) {
			new Login();
			mainFrame.dispose();
		} else if (e.getSource() == dashboard) {
			new Student_Dashboard();
			mainFrame.dispose();
		} else if (e.getSource() == resultCard || e.getSource() == fees || e.getSource() == regCard) {
			if (e.getSource() == resultCard) {
				regBool = false;
				feesBool = false;
				resultBool = true;
			} else if (e.getSource() == fees) {
				regBool = false;
				feesBool = true;
				resultBool = false;
			} else if (e.getSource() == regCard) {
				regBool = true;
				feesBool = false;
				resultBool = false;
			}
			new NotAvailable();
			mainFrame.dispose();
		} else if (e.getSource() == profile) {
			new Student_Profile();
			mainFrame.dispose();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
