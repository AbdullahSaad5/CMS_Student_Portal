package CMS_Student_Portal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class UpdateProfile implements MouseListener {
	static String updated;
	static int code;
	JFrame mainFrame;
	JLabel mainLabel;
	JButton userButton, passButton, emailButton, homeButton, busButton;

	public UpdateProfile() {
		mainFrame = new JFrame();
		mainFrame.setResizable(false);
		mainFrame.setSize(432, 650);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(mainFrame.DISPOSE_ON_CLOSE);
		mainFrame.setLayout(null);
		mainFrame.getContentPane().setBackground(new Color(0x4CAF50));

		mainLabel = new JLabel("Profile Update Menu");
		mainLabel.setBounds(78, 39, 277, 35);
		mainLabel.setForeground(Color.white);
		mainLabel.setFont(new Font("Roboto", Font.BOLD, 30));
		mainFrame.add(mainLabel);

		userButton = new JButton("Update Username");
		userButton.setBounds(116, 171, 201, 29);
		userButton.setFont(new Font("Roboto", Font.PLAIN, 25));
		userButton.setFocusable(false);
		userButton.setForeground(Color.white);
		userButton.setBackground(null);
		userButton.setBorder(null);
		mainFrame.add(userButton);
		userButton.addMouseListener(this);

		passButton = new JButton("Update Password");
		passButton.setBounds(118, 265, 197, 29);
		passButton.setFont(new Font("Roboto", Font.PLAIN, 25));
		passButton.setFocusable(false);
		passButton.setForeground(Color.white);
		passButton.setBackground(null);
		passButton.setBorder(null);
		mainFrame.add(passButton);
		passButton.addMouseListener(this);

		emailButton = new JButton("Update Email");
		emailButton.setBounds(142, 359, 149, 29);
		emailButton.setFont(new Font("Roboto", Font.PLAIN, 25));
		emailButton.setFocusable(false);
		emailButton.setForeground(Color.white);
		emailButton.setBackground(null);
		emailButton.setBorder(null);
		mainFrame.add(emailButton);
		emailButton.addMouseListener(this);

		homeButton = new JButton("Update Home City");
		homeButton.setBounds(114, 453, 204, 29);
		homeButton.setFont(new Font("Roboto", Font.PLAIN, 25));
		homeButton.setFocusable(false);
		homeButton.setForeground(Color.white);
		homeButton.setBackground(null);
		homeButton.setBorder(null);
		mainFrame.add(homeButton);
		homeButton.addMouseListener(this);

		busButton = new JButton("Update Bus Facility");
		busButton.setBounds(108, 547, 216, 29);
		busButton.setFont(new Font("Roboto", Font.PLAIN, 25));
		busButton.setFocusable(false);
		busButton.setForeground(Color.white);
		busButton.setBackground(null);
		busButton.setBorder(null);
		mainFrame.add(busButton);
		busButton.addMouseListener(this);

		mainFrame.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == userButton) {
			code = 1;
			new UpdateWindow();
			mainFrame.dispose();
		} else if (e.getSource() == passButton) {
			code = 2;
			new UpdateWindow();
			mainFrame.dispose();
		} else if (e.getSource() == emailButton) {
			code = 3;
			new UpdateWindow();
			mainFrame.dispose();
		} else if (e.getSource() == homeButton) {
			code = 4;
			new UpdateWindow();
			mainFrame.dispose();
		} else if (e.getSource() == busButton) {
			code = 5;
			new UpdateWindow();
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

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == userButton) {
			userButton.setForeground(new Color(0x4CAF50));
			userButton.setBackground(Color.white);
		} else if (e.getSource() == passButton) {
			passButton.setForeground(new Color(0x4CAF50));
			passButton.setBackground(Color.white);
		} else if (e.getSource() == emailButton) {
			emailButton.setForeground(new Color(0x4CAF50));
			emailButton.setBackground(Color.white);
		} else if (e.getSource() == homeButton) {
			homeButton.setForeground(new Color(0x4CAF50));
			homeButton.setBackground(Color.white);
		} else if (e.getSource() == busButton) {
			busButton.setForeground(new Color(0x4CAF50));
			busButton.setBackground(Color.white);
		}

	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == userButton) {
			userButton.setForeground(Color.white);
			userButton.setBackground(null);
		} else if (e.getSource() == passButton) {
			passButton.setForeground(Color.white);
			passButton.setBackground(null);
		} else if (e.getSource() == emailButton) {
			emailButton.setForeground(Color.white);
			emailButton.setBackground(null);
		} else if (e.getSource() == homeButton) {
			homeButton.setForeground(Color.white);
			homeButton.setBackground(null);
		} else if (e.getSource() == busButton) {
			busButton.setForeground(Color.white);
			busButton.setBackground(null);
		}

	}

}
