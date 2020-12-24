package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Student_Profile extends Student_Portal_Screen {
	JPanel detailsPanel;
	JLabel mainLabel;
	JLabel nameLabel, name;
	JLabel regLabel, regNo;
	JLabel semLabel, sem;
	JLabel ageLabel, age;
	JLabel gpaLabel, gpa;
	JLabel homeLabel, home;
	JLabel busLabel, bus;
	JLabel emailLabel, email;
	JLabel background;

	Student curr;

	public Student_Profile() {
		profile.setBackground(new Color(0x13A89E));
		profile.setForeground(Color.WHITE);

		curr = new Student((Student) Identify.account);

		detailsPanel = new JPanel();
		mainPanel.add(detailsPanel);
		detailsPanel.setBackground(new Color(0xEAEAEA));
		detailsPanel.setLayout(null);
		detailsPanel.setBounds(157, 157, 1053, 375);

		mainLabel = new JLabel("Student Details:");
		mainLabel.setFont(new Font("Roboto", Font.BOLD, 25));
		mainLabel.setBounds(13, 17, 180, 30);
		detailsPanel.add(mainLabel);

		nameLabel = new JLabel("Name:");
		nameLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		nameLabel.setBounds(13, 66, 50, 20);

		name = new JLabel();
		name.setFont(new Font("Roboto", Font.BOLD, 15));
		name.setText(curr.getName());
		name.setBounds(133, 66, 300, 20);

		regLabel = new JLabel("Reg No:");
		regLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		regLabel.setBounds(13, 98, 60, 20);

		regNo = new JLabel();
		regNo.setFont(new Font("Roboto", Font.BOLD, 15));
		regNo.setText(curr.getRegNo());
		regNo.setBounds(133, 98, 300, 20);

		semLabel = new JLabel("Semester:");
		semLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		semLabel.setBounds(13, 128, 100, 20);

		sem = new JLabel();
		sem.setFont(new Font("Roboto", Font.BOLD, 15));
		sem.setText(curr.getSemester());
		sem.setBounds(133, 128, 300, 20);

		emailLabel = new JLabel("Email:");
		emailLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		emailLabel.setBounds(13, 160, 50, 20);

		email = new JLabel();
		email.setFont(new Font("Roboto", Font.BOLD, 15));
		email.setText(curr.getEmail());
		email.setBounds(133, 160, 300, 20);

		ageLabel = new JLabel("Age:");
		ageLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		ageLabel.setBounds(13, 194, 50, 20);

		age = new JLabel();
		age.setFont(new Font("Roboto", Font.BOLD, 15));
		age.setText(curr.getAge());
		age.setBounds(133, 194, 300, 20);

		gpaLabel = new JLabel("CGPA:");
		gpaLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		gpaLabel.setBounds(13, 226, 50, 20);

		gpa = new JLabel();
		gpa.setFont(new Font("Roboto", Font.BOLD, 15));
		gpa.setText(curr.getCGPA());
		gpa.setBounds(133, 226, 300, 20);

		homeLabel = new JLabel("Home City:");
		homeLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		homeLabel.setBounds(13, 258, 100, 20);

		home = new JLabel();
		home.setFont(new Font("Roboto", Font.BOLD, 15));
		home.setText(curr.getHomeCity());
		home.setBounds(133, 258, 300, 20);

		busLabel = new JLabel("Bus Facility:");
		busLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		busLabel.setBounds(13, 290, 100, 20);

		bus = new JLabel();
		bus.setFont(new Font("Roboto", Font.BOLD, 15));
		bus.setText(curr.getBusFacility());
		bus.setBounds(133, 290, 300, 20);

		detailsPanel.add(nameLabel);
		detailsPanel.add(regLabel);
		detailsPanel.add(semLabel);
		detailsPanel.add(ageLabel);
		detailsPanel.add(gpaLabel);
		detailsPanel.add(homeLabel);
		detailsPanel.add(busLabel);
		detailsPanel.add(emailLabel);

		detailsPanel.add(name);
		detailsPanel.add(regNo);
		detailsPanel.add(sem);
		detailsPanel.add(age);
		detailsPanel.add(gpa);
		detailsPanel.add(home);
		detailsPanel.add(bus);
		detailsPanel.add(email);

		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
		background.setBounds(0, 0, 1366, 768);
		mainPanel.add(background);

		mainFrame.setVisible(true);
	}
}
