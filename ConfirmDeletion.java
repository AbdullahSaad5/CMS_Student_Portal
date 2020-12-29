package CMS_Student_Portal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ConfirmDeletion implements ActionListener {
	static JFrame closingFrame;
	JFrame confirmFrame;
	JLabel warning;
	JPasswordField passField;
	JButton submit;

	public ConfirmDeletion() {
		confirmFrame = new JFrame();
		confirmFrame.setSize(400, 200);
		confirmFrame.setResizable(false);
		confirmFrame.setLocationRelativeTo(null);
		confirmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		confirmFrame.setLayout(null);
		confirmFrame.getContentPane().setBackground(new Color(0xEF5350));

		warning = new JLabel("Enter Your Password To Continue: ");
		warning.setFont(new Font("Roboto", Font.BOLD, 17));
		warning.setBounds(61, 39, 280, 21);
		warning.setForeground(Color.white);
		confirmFrame.add(warning);

		passField = new JPasswordField();
		passField.setBounds(125, 80, 150, 20);
		confirmFrame.add(passField);

		submit = new JButton("Submit");
		submit.setFocusable(false);
		submit.setFont(new Font("Roboto", Font.PLAIN, 12));
		submit.setBounds(160, 120, 80, 20);
		submit.addActionListener(this);
		confirmFrame.add(submit);

		confirmFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (Identify.isTeacher) {
			if (passField.getText().equals(Identify.account.getPassword())) {
				Teacher.Delete(Identify.account.getName());
				System.out.println("Deleted");
				closingFrame.dispose();
				new Login();
			}
			confirmFrame.dispose();
		} else {
			if (passField.getText().equals(Identify.account.getPassword())) {
				Student.Delete(Identify.account.getName());
				System.out.println("Deleted");
				closingFrame.dispose();
				new Login();
			}
			confirmFrame.dispose();
		}
	}
}