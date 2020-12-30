package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SignUp extends Template implements ActionListener, MouseListener {
	JPanel mainPanel;
	JTextField userField;
	JPasswordField passField, passField2;
	JLabel userLabel, passLabel, passLabel2, loginLabel, success;
	JButton signUpButton;
	String username, pass1, pass2;
	JButton seePassword;
	private char defaultChar;

	public SignUp() {
		mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(200, 200));
		mainPanel.setLayout(null);
		mainFrame.add(mainPanel, BorderLayout.CENTER);
		backButton.setEnabled(true);
		backButton.addActionListener(this);

		success = new JLabel("");
		success.setFont(new Font("Roboto", Font.BOLD, 15));
		mainPanel.add(success);

		loginLabel = new JLabel("Create a new Account");
		loginLabel.setFont(new Font("Roboto", Font.BOLD + Font.ITALIC, 20));
		loginLabel.setBounds(570, 33, 225, 30);
		mainPanel.add(loginLabel);

		userLabel = new JLabel("Username:");
		passLabel = new JLabel("Password:");
		passLabel2 = new JLabel("Repeat Password:");

		userField = new JTextField();
		passField = new JPasswordField();
		passField2 = new JPasswordField();

		mainFrame.add(mainPanel);

		mainPanel.add(userField);
		userField.setBounds(660, 91, 150, 20);

		mainPanel.add(userLabel);
		userLabel.setBounds(560, 91, 100, 20);

		mainPanel.add(passField);
		passField.setBounds(660, 131, 150, 20);

		mainPanel.add(passLabel);
		passLabel.setBounds(560, 131, 100, 20);

		mainPanel.add(passField2);
		passField2.setBounds(660, 171, 150, 20);

		mainPanel.add(passLabel2);
		passLabel2.setBounds(504, 171, 130, 20);

		signUpButton = new JButton("Sign Up");
		mainPanel.add(signUpButton);
		signUpButton.setBounds(636, 240, 100, 20);
		signUpButton.setFocusable(false);
		signUpButton.addActionListener(this);

		seePassword = new JButton(
				new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/show-password.png")));
		seePassword.setBounds(840, 142, 32, 32);
		seePassword.setBorder(null);
		seePassword.setFocusable(false);
		mainPanel.add(seePassword);
		seePassword.setBackground(new Color(238, 238, 238));
		seePassword.addMouseListener(this);

		mainPanel.repaint();
		mainFrame.setVisible(true);

	}

	private void checkSignup() {
		username = userField.getText().strip();
		pass1 = passField.getText();
		pass2 = passField2.getText();
		if (username.isBlank() || pass1.isBlank() || pass2.isBlank()) {
			success.setText("Signup Failed!");
			success.setForeground(new Color(255, 0, 0));
			success.setBounds(636, 280, 150, 20);

		} else if (Utilities.checkUsername(username) && Utilities.usernameAvailability(username)
				&& Utilities.checkPassword(pass1) && Utilities.matchPasswords(pass1, pass2)) {
			success.setText("Signup Successful!");
			success.setForeground(new Color(0, 255, 0));
			success.setBounds(622, 280, 150, 20);
			if (Identify.isTeacher) {
				Identify.account = new Teacher();
				Identify.account.setUsername(username);
				Identify.account.setPassword(pass1);
				new Teacher_Signup();
			} else {
				Identify.account = new Student();
				Identify.account.setUsername(username);
				Identify.account.setPassword(pass1);
				new Student_Signup();
			}
			mainFrame.dispose();

		} else if (!Utilities.checkUsername(username)) {
			success.setText("Invalid Username");
			success.setForeground(new Color(255, 0, 0));
			success.setBounds(622, 280, 150, 20);
		} else if (!Utilities.usernameAvailability(username)) {
			success.setText("Username Already Taken");
			success.setForeground(new Color(255, 0, 0));
			success.setBounds(610, 280, 200, 20);
		} else if (!Utilities.checkPassword(pass1)) {

			success.setText(
					"<html>" + "<body>" + "<p>" + "<ul>" + "Invalid Password<br><br>" + "Password must contain: <br>"
							+ "<li>At least 6 character</li>" + "<li>At least one special character <br></li>"
							+ "<li>At least one uppercase and lowercase letter <br></li>" + "<ul>" + "<p>" + "</body>"
							+ "</html>");
			success.setForeground(new Color(0x052EAA));
			success.setBounds(560, 265, 350, 150);
		} else if (!Utilities.matchPasswords(pass1, pass2)) {
			success.setText("Passwords Don't Match");
			success.setForeground(new Color(255, 0, 0));
			success.setBounds(610, 280, 200, 20);
		} else {
			success.setText("Signup Failed!");
			success.setForeground(new Color(255, 0, 0));
			success.setBounds(636, 280, 150, 20);

		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == signUpButton) {
			checkSignup();
		} else {
			new LoginOrSignup();
			mainFrame.dispose();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		defaultChar = passField.getEchoChar();
		passField.setEchoChar((char) 0);
		passField2.setEchoChar((char) 0);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		passField.setEchoChar(defaultChar);
		passField2.setEchoChar(defaultChar);

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
