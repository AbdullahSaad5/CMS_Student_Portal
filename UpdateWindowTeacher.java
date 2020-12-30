package CMS_Student_Portal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UpdateWindowTeacher implements ActionListener {
	JFrame updateFrame;
	JLabel message;
	JTextField text;
	JPasswordField text2;
	JButton submit;

	public UpdateWindowTeacher() {
		updateFrame = new JFrame();
		updateFrame.setTitle("Update Information");
		updateFrame.setResizable(false);
		updateFrame.setSize(400, 200);
		updateFrame.setLocationRelativeTo(null);
		updateFrame.setDefaultCloseOperation(updateFrame.DISPOSE_ON_CLOSE);
		updateFrame.setLayout(null);
		updateFrame.getContentPane().setBackground(new Color(0x4CAF50));
		updateFrame.setIconImage(new ImageIcon(getClass().getResource("/CMS_Student_Portal/WindowIcon.png")).getImage());


		message = new JLabel("Enter New Information To Continue: ");
		message.setFont(new Font("Roboto", Font.BOLD, 17));
		message.setBounds(60, 39, 300, 21);
		message.setForeground(Color.white);
		updateFrame.add(message);

		text = new JTextField();
		updateFrame.add(text);

		text2 = new JPasswordField();
		updateFrame.add(text2);

		if (UpdateProfile.code == 2) {
			text2.setBounds(125, 80, 150, 20);
		} else {
			text.setBounds(125, 80, 150, 20);
		}
		submit = new JButton("Submit");
		submit.setFocusable(false);
		submit.setFont(new Font("Roboto", Font.PLAIN, 12));
		submit.setBounds(160, 120, 80, 20);
		submit.addActionListener(this);
		updateFrame.add(submit);

		updateFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String entered = text.getText();
		String password = text2.getText();
		String username = Identify.account.getUsername();

		if (!entered.isBlank() || !password.isBlank()) {
			if (UpdateProfileTeacher.code == 1 && Utilities.checkUsername(entered)) {
				Teacher.Update(username, entered, 1);
			} else if (UpdateProfileTeacher.code == 2 && Utilities.checkPassword(password)) {
				Teacher.Update(username, password, 2);
			} else if (UpdateProfileTeacher.code == 3 && Utilities.checkEmail(entered)) {
				Teacher.Update(username, entered, 3);
				Teacher_Profile.email.setText(entered);
			} else if (UpdateProfileTeacher.code == 4
					&& (Utilities.checkString(entered) || Utilities.checkStringWithSpaces(entered))) {
				Teacher.Update(username, entered, 4);
				Teacher_Profile.qualification.setText(entered.toUpperCase());
			} else if (UpdateProfileTeacher.code == 5 && Utilities.checkNumber(entered)) {
				Teacher.Update(username, entered, 5);
				Teacher_Profile.experience.setText(entered.toUpperCase());
			} else {
				JOptionPane.showMessageDialog(null, "Invalid Data Entered. Try Again!");
			}
		}
		updateFrame.dispose();
	}
}