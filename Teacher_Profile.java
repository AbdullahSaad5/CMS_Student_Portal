package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Teacher_Profile extends Teacher_Portal_Screen implements MouseListener {
	JPanel detailsPanel;
	JLabel nameLabel, name;
	JLabel fieldLabel, field;
	static JLabel experienceField, experience;
	JLabel ageLabel, age;
	static JLabel qualificationLabel, qualification;
	static JLabel emailLabel, email;
	JLabel mainLabel, mainLabel2, mainLabel3;
	JButton profileUpdate, profileDelete;
	Teacher curr;

	public Teacher_Profile() {

		curr = new Teacher((Teacher) Identify.account);
		
		mainLabel = new JLabel("View Profile");
		mainLabel.setBounds(87 , 16, 240, 34);
		mainLabel.setFont(new Font("Roboto", Font.BOLD + Font.ITALIC, 30));
		mainLabel.setForeground(Color.white);
		infoPanel.add(mainLabel);
		
		
		detailsPanel = new JPanel();
		mainPanel.add(detailsPanel);
		detailsPanel.setBackground(Color.white);
		detailsPanel.setLayout(null);
		detailsPanel.setBounds(157, 275, 1053, 400);
		
		mainLabel2 = new JLabel("Teacher Details:");
		mainLabel2.setFont(new Font("Roboto", Font.BOLD, 25));
		mainLabel2.setBounds(13, 17, 200, 30);
		detailsPanel.add(mainLabel2);
		
		mainLabel3 = new JLabel("Profile Settings:");
		mainLabel3.setFont(new Font("Roboto", Font.BOLD, 25));
		mainLabel3.setBounds(800, 17, 200, 30);
		detailsPanel.add(mainLabel3);

		profileUpdate = new JButton("Profile Update");
		profileUpdate.setBounds(842, 106, 140, 30);
		profileUpdate.setFont(new Font("Roboto", Font.BOLD, 20));
		profileUpdate.setForeground(new Color(0xFFA726));
		profileUpdate.setBackground(null);
		profileUpdate.setFocusable(false);
		profileUpdate.setBorder(null);
		profileUpdate.addMouseListener(this);
		detailsPanel.add(profileUpdate);

		profileDelete = new JButton("Delete Profile");
		profileDelete.setBounds(847, 205, 130, 30);
		profileDelete.setFont(new Font("Roboto", Font.BOLD, 20));
		profileDelete.setForeground(new Color(0xE64A19));
		profileDelete.setBackground(null);
		profileDelete.setFocusable(false);
		profileDelete.setBorder(null);
		profileDelete.addMouseListener(this);
		detailsPanel.add(profileDelete);

		nameLabel = new JLabel("Name:");
		nameLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		nameLabel.setBounds(13, 80, 50, 20);

		name = new JLabel();
		name.setFont(new Font("Roboto", Font.BOLD, 15));
		name.setText(curr.getName());
		name.setBounds(133, 80, 300, 20);

		emailLabel = new JLabel("Email:");
		emailLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		emailLabel.setBounds(13, 120, 60, 20);

		email = new JLabel();
		email.setFont(new Font("Roboto", Font.BOLD, 15));
		email.setText(curr.getEmail());
		email.setBounds(133, 120, 300, 20);

		fieldLabel = new JLabel("Field:");
		fieldLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		fieldLabel.setBounds(13, 160, 60, 20);

		field = new JLabel();
		field.setFont(new Font("Roboto", Font.BOLD, 15));
		field.setText(curr.getField());
		field.setBounds(133, 160, 300, 20);

		experienceField = new JLabel("Experience:");
		experienceField.setFont(new Font("Roboto", Font.PLAIN, 15));
		experienceField.setBounds(13, 200, 100, 20);

		experience = new JLabel();
		experience.setFont(new Font("Roboto", Font.BOLD, 15));
		experience.setText(curr.getExperience());
		experience.setBounds(133, 200, 300, 20);

		ageLabel = new JLabel("Age:");
		ageLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		ageLabel.setBounds(13, 240, 50, 20);

		age = new JLabel();
		age.setFont(new Font("Roboto", Font.BOLD, 15));
		age.setText(curr.getAge());
		age.setBounds(133, 240, 300, 20);

		qualificationLabel = new JLabel("Qualification:");
		qualificationLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		qualificationLabel.setBounds(13, 280, 100, 20);

		qualification = new JLabel();
		qualification.setFont(new Font("Roboto", Font.BOLD, 15));
		qualification.setText(curr.getQualification());
		qualification.setBounds(133, 280, 300, 20);

		detailsPanel.add(nameLabel);
		detailsPanel.add(fieldLabel);
		detailsPanel.add(experienceField);
		detailsPanel.add(ageLabel);
		detailsPanel.add(qualificationLabel);
		detailsPanel.add(emailLabel);

		detailsPanel.add(name);
		detailsPanel.add(field);
		detailsPanel.add(experience);
		detailsPanel.add(age);
		detailsPanel.add(qualification);
		detailsPanel.add(email);
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
		background.setBounds(0, 0, 1366, 768);
		mainPanel.add(background);
		
		detailsPanel.repaint();
		mainFrame.setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == profileUpdate) {
			new UpdateProfileTeacher();
		} else if (e.getSource() == profileDelete) {
			int choice = JOptionPane.showConfirmDialog(null, "Do You Want To Continue?", "Delete Confirm",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (choice == 0) {
				ConfirmDeletion.closingFrame = mainFrame;
				new ConfirmDeletion();
			}
		}
	}

	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == profileUpdate) {
			profileUpdate.setBackground(new Color(0xFFA726));
			profileUpdate.setForeground(Color.white);
		} else if (e.getSource() == profileDelete) {
			profileDelete.setForeground(Color.white);
			profileDelete.setBackground(new Color(0xE64A19));
		}
	}

	public void mouseExited(MouseEvent e) {

		if (e.getSource() == profileUpdate) {
			profileUpdate.setBackground(null);
			profileUpdate.setForeground(new Color(0xFFA726));
		} else if (e.getSource() == profileDelete) {
			profileDelete.setForeground(new Color(0xE64A19));
			profileDelete.setBackground(null);
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
