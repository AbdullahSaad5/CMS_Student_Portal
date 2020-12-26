package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student_Signup extends Template implements ActionListener {
	JPanel mainPanel;
	JButton submit;
	JTextField nameField, regNoField, semesterField, ageField, gpaField, cityField, busField, emailField;
	JLabel nameLabel, regNoLabel, semesterLabel, ageLabel, gpaLabel, cityLabel, busLabel, mainLabel, emailLabel,
			success;
	JLabel nameError, regError, emailError, semError, ageError, gpaError, cityError, busError;
	String name, regNo, semester, age, gpa, city, bus, email;

	public Student_Signup() {
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

		regNoLabel = new JLabel("Reg No:");
		mainPanel.add(regNoLabel);
		regNoLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		regNoLabel.setBounds(574, 99, 65, 20);

		regNoField = new JTextField();
		mainPanel.add(regNoField);
		regNoField.setBounds(658, 99, 150, 20);

		emailLabel = new JLabel("Email:");
		mainPanel.add(emailLabel);
		emailLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		emailLabel.setBounds(586, 139, 50, 20);

		emailField = new JTextField();
		mainPanel.add(emailField);
		emailField.setBounds(658, 139, 150, 20);

		semesterLabel = new JLabel("Semester:");
		mainPanel.add(semesterLabel);
		semesterLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		semesterLabel.setBounds(560, 180, 75, 20);

		semesterField = new JTextField();
		mainPanel.add(semesterField);
		semesterField.setBounds(658, 180, 150, 20);

		ageLabel = new JLabel("Age:");
		mainPanel.add(ageLabel);
		ageLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		ageLabel.setBounds(593, 220, 50, 20);

		ageField = new JTextField();
		mainPanel.add(ageField);
		ageField.setBounds(658, 220, 150, 20);

		gpaLabel = new JLabel("CGPA:");
		mainPanel.add(gpaLabel);
		gpaLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		gpaLabel.setBounds(587, 261, 50, 20);

		gpaField = new JTextField();
		mainPanel.add(gpaField);
		gpaField.setBounds(658, 261, 150, 20);

		cityLabel = new JLabel("Home City:");
		mainPanel.add(cityLabel);
		cityLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		cityLabel.setBounds(554, 302, 85, 20);

		cityField = new JTextField();
		mainPanel.add(cityField);
		cityField.setBounds(658, 302, 150, 20);

		busLabel = new JLabel("Bus Facility:");
		mainPanel.add(busLabel);
		busLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		busLabel.setBounds(554, 343, 90, 20);

		busField = new JTextField();
		mainPanel.add(busField);
		busField.setBounds(658, 343, 150, 20);

		mainLabel = new JLabel("Enter Your Details");
		mainPanel.add(mainLabel);
		mainLabel.setBounds(595, 20, 175, 20);
		mainLabel.setFont(new Font("Roboto", Font.BOLD + Font.ITALIC, 20));

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

		regError = new JLabel();
		regError.setBounds(829, 99, 300, 20);
		mainPanel.add(regError);
		regError.setForeground(new Color(198, 2, 2));
		regError.setFont(new Font("Roboto", Font.PLAIN, 12));

		emailError = new JLabel();
		emailError.setBounds(829, 139, 300, 20);
		mainPanel.add(emailError);
		emailError.setForeground(new Color(198, 2, 2));
		emailError.setFont(new Font("Roboto", Font.PLAIN, 12));

		semError = new JLabel();
		semError.setBounds(829, 180, 300, 20);
		mainPanel.add(semError);
		semError.setForeground(new Color(198, 2, 2));
		semError.setFont(new Font("Roboto", Font.PLAIN, 12));

		ageError = new JLabel();
		ageError.setBounds(829, 220, 300, 20);
		mainPanel.add(ageError);
		ageError.setForeground(new Color(198, 2, 2));
		ageError.setFont(new Font("Roboto", Font.PLAIN, 12));

		gpaError = new JLabel();
		gpaError.setBounds(829, 261, 300, 20);
		mainPanel.add(gpaError);
		gpaError.setForeground(new Color(198, 2, 2));
		gpaError.setFont(new Font("Roboto", Font.PLAIN, 12));

		cityError = new JLabel();
		cityError.setBounds(829, 302, 300, 20);
		mainPanel.add(cityError);
		cityError.setForeground(new Color(198, 2, 2));
		cityError.setFont(new Font("Roboto", Font.PLAIN, 12));

		busError = new JLabel();
		busError.setBounds(829, 343, 300, 20);
		mainPanel.add(busError);
		busError.setForeground(new Color(198, 2, 2));
		busError.setFont(new Font("Roboto", Font.PLAIN, 12));

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		boolean correct = true;
		name = nameField.getText().strip().toUpperCase();
		regNo = regNoField.getText().strip().toUpperCase();
		semester = semesterField.getText().strip();
		age = ageField.getText().strip();
		gpa = gpaField.getText().strip();
		city = cityField.getText().strip().toUpperCase();
		bus = busField.getText().strip().toUpperCase();
		email = emailField.getText().strip().toLowerCase();

		if (e.getSource() == submit) {
			if (name.isBlank() || regNo.isBlank() || semester.isBlank() || age.isBlank() || gpa.isBlank()
					|| city.isBlank() || bus.isBlank() || email.isBlank()) {
				success.setText("Please Enter All the Details.");
				success.setForeground(new Color(255, 0, 0));
				success.setBounds(590, 440, 190, 20);
				correct = false;
				return;
			}
			// Checking Name
			if (!(Utilities.checkStringWithSpaces(name) || Utilities.checkString(name))) {
				nameError.setText("Invalid Name (Must be letters only)");
				correct = false;
			} else {
				nameError.setText("");
			}

			if (!Utilities.checkRegistrationNumber(regNo)) {
				regError.setText("Invalid Registration Number Format");
				correct = false;
			} else {
				regError.setText("");
			}
			if (!Utilities.checkEmail(email)) {
				emailError.setText("Invalid Email Format");
				correct = false;
			} else {
				emailError.setText("");
			}
			if (!(Utilities.checkNumber(semester)
					&& (Integer.parseInt(semester) > 0 && Integer.parseInt(semester) <= 12))) {
				semError.setText("Invalid Semester (Must be Digits only)");
				correct = false;
			} else {
				semError.setText("");
			}
			if (!(Utilities.checkNumber(age) && (Integer.parseInt(age) > 15 && Integer.parseInt(age) <= 60))) {
				ageError.setText("Invalid Age (Must be Digits only)");
				correct = false;
			} else {
				ageError.setText("");
			}
			if (!((Utilities.checkFloat(gpa) || Utilities.checkNumber(gpa))
					&& (Double.parseDouble(gpa) >= 0 && Double.parseDouble(gpa) <= 4))) {
				gpaError.setText("Invalid GPA (Must be Decimal Number only)");
				correct = false;
			} else {
				gpaError.setText("");
			}
			if (!(Utilities.checkString(city) || Utilities.checkStringWithSpaces(city))) {
				cityError.setText("Invalid City (Must be letters only)");
				correct = false;
			} else {
				cityError.setText("");
			}
			if (!(bus.equalsIgnoreCase("yes") || bus.equalsIgnoreCase("no"))) {
				busError.setText("Invalid Input (Must be YES / NO)");
				correct = false;
			} else {
				busError.setText("");
			}

			if (correct) {
				Student student = (Student) Identify.account;
				success.setText("Details Registered.");
				success.setForeground(new Color(0, 255, 0));
				success.setBounds(618, 440, 130, 20);
				student.setName(name);
				student.setRegNo(regNo);
				student.setSemester(semester);
				student.setAge(age);
				student.setCGPA(gpa);
				student.setHomeCity(city);
				student.setBusFacility(bus);
				student.setEmail(email);
				Student.writeStudentRecord(student);
				new Student_Dashboard();
				mainFrame.dispose();
			}
		} else {
			new SignUp();
			mainFrame.dispose();
		}
	}
}
