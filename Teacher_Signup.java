package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teacher_Signup extends Template implements ActionListener {
	JPanel mainPanel;
	JButton submit;
	JTextField nameField, fieldField, experienceField, ageField, qualificationField, emailField;
	JLabel nameLabel, fieldLabel, experienceLabel, ageLabel, qualificationLabel, emailLabel, success, mainLabel;
	JLabel nameError, fieldError, expError, ageError, qualificationError, emailError;

	public Teacher_Signup() {
		backButton.setEnabled(true);
		backButton.addActionListener(this);

		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainFrame.add(mainPanel, BorderLayout.CENTER);

		success = new JLabel("");
		mainPanel.add(success);
		success.setFont(new Font("Roboto", Font.PLAIN, 15));

		nameLabel = new JLabel("Name:");
		mainPanel.add(nameLabel);
		nameLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		nameLabel.setBounds(582, 58, 55, 20);

		nameField = new JTextField();
		mainPanel.add(nameField);
		nameField.setBounds(658, 58, 150, 20);
		
		emailLabel = new JLabel("Email:");
		mainPanel.add(emailLabel);
		emailLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		emailLabel.setBounds(578, 109, 65, 20);

		emailField = new JTextField();
		mainPanel.add(emailField);
		emailField.setBounds(658, 109, 150, 20);
		

		fieldLabel = new JLabel("Field:");
		mainPanel.add(fieldLabel);
		fieldLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		fieldLabel.setBounds(586, 159, 55, 20);

		fieldField = new JTextField();
		mainPanel.add(fieldField);
		fieldField.setBounds(658, 159, 150, 20);

		experienceLabel = new JLabel("Experience:");
		mainPanel.add(experienceLabel);
		experienceLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		experienceLabel.setBounds(549, 209, 85, 20);

		experienceField = new JTextField();
		mainPanel.add(experienceField);
		experienceField.setBounds(658, 209, 150, 20);

		ageLabel = new JLabel("Age:");
		mainPanel.add(ageLabel);
		ageLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		ageLabel.setBounds(587, 261, 50, 20);

		ageField = new JTextField();
		mainPanel.add(ageField);
		ageField.setBounds(658, 261, 150, 20);

		qualificationLabel = new JLabel("Qualification:");
		mainPanel.add(qualificationLabel);
		qualificationLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		qualificationLabel.setBounds(534, 312, 100, 20);

		qualificationField = new JTextField();
		mainPanel.add(qualificationField);
		qualificationField.setBounds(658, 312, 150, 20);


		submit = new JButton("Submit");
		mainPanel.add(submit);
		submit.setFocusable(false);
		submit.setBounds(633, 400, 100, 20);
		submit.setFont(new Font("Roboto", Font.PLAIN, 16));
		submit.addActionListener(this);
		
		
		nameError = new JLabel();
		nameError.setBounds(829, 58, 300, 20);
		mainPanel.add(nameError);
		nameError.setForeground(new Color(198, 2, 2));
		nameError.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		emailError = new JLabel();
		emailError.setBounds(829, 109, 300, 20);
		mainPanel.add(emailError);
		emailError.setForeground(new Color(198, 2, 2));
		emailError.setFont(new Font("Roboto", Font.PLAIN, 12));

		fieldError = new JLabel();
		fieldError.setBounds(829, 159, 300, 20);
		mainPanel.add(fieldError);
		fieldError.setForeground(new Color(198, 2, 2));
		fieldError.setFont(new Font("Roboto", Font.PLAIN, 12));

		expError = new JLabel();
		expError.setBounds(829, 209, 300, 20);
		mainPanel.add(expError);
		expError.setForeground(new Color(198, 2, 2));
		expError.setFont(new Font("Roboto", Font.PLAIN, 12));

		ageError = new JLabel();
		ageError.setBounds(829, 261, 300, 20);
		mainPanel.add(ageError);
		ageError.setForeground(new Color(198, 2, 2));
		ageError.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		
		qualificationError = new JLabel();
		qualificationError.setBounds(829, 312, 300, 20);
		mainPanel.add(qualificationError);
		qualificationError.setForeground(new Color(198, 2, 2));
		qualificationError.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		
		mainLabel = new JLabel("Enter Your Details");
		mainPanel.add(mainLabel);
		mainLabel.setBounds(595, 20, 175, 20);
		mainLabel.setFont(new Font("Roboto", Font.BOLD + Font.ITALIC, 20));



	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean correct = true;
		if (e.getSource() == submit) {
			if (nameField.getText().isBlank() || fieldField.getText().isBlank() || experienceField.getText().isBlank()
					|| ageField.getText().isBlank() || qualificationField.getText().isBlank() || emailField.getText().isBlank()) {
				success.setText("Please Enter All the Details.");
				success.setForeground(new Color(255, 0, 0));
				success.setBounds(590, 440, 190, 20);
				correct = false;
				return;
			}
			if (!Utilities.checkStringWithSpaces(nameField.getText())) {
				nameError.setText("Invalid Name (Must be letters only)");
				correct = false;
			} else {
				nameError.setText("");
			}

			if (!Utilities.checkString(fieldField.getText())) {
				fieldError.setText("Invalid Registration Number Format");
				correct = false;
			} else {
				fieldError.setText("");
			}
			if (!Utilities.checkEmail(emailField.getText())) {
				emailError.setText("Invalid Email Format");
				correct = false;
			} else {
				emailError.setText("");
			}
			if (!Utilities.checkNumber(experienceField.getText())) {
				expError.setText("Invalid Experence (Must be Digits only [Years])");
				correct = false;
			} else {
				expError.setText("");
			}
			if (!Utilities.checkNumber(ageField.getText())) {
				ageError.setText("Invalid Age (Must be Digits only)");
				correct = false;
			} else {
				ageError.setText("");
			}
			if (!Utilities.checkStringWithSpaces(qualificationField.getText())) {
				qualificationError.setText("Invalid GPA (Must be Decimal Number only)");
				correct = false;
			} else {
				qualificationError.setText("");
			}
			if(correct){
				Teacher teacher = (Teacher) Identify.account;
				success.setText("Details Registered.");
				success.setForeground(new Color(0, 255, 0));
				success.setBounds(618, 440, 130, 20);
				teacher.setName(nameField.getText());
				teacher.setField(fieldField.getText());
				teacher.setExperience(experienceField.getText());
				teacher.setAge(ageField.getText());
				teacher.setQualification(qualificationField.getText());
				teacher.setEmail(emailField.getText());
				Teacher.writeTeacherRecord(teacher);
				new Teacher_Portal_Screen();
				mainFrame.dispose();
			}
		} 
		else {
			new SignUp();
			mainFrame.dispose();
		}
	}
}
