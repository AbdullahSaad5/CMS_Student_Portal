package CMS_Student_Portal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ModifyAssignment implements ActionListener{
	JFrame updateFrame;
	JLabel message;
	JTextField text1, text2, text3;
	JButton submit;
	public ModifyAssignment() {
		updateFrame = new JFrame();
		updateFrame.setTitle("Update Information");
		updateFrame.setResizable(false);
		updateFrame.setSize(400, 200);
		updateFrame.setLocationRelativeTo(null);
		updateFrame.setDefaultCloseOperation(updateFrame.DISPOSE_ON_CLOSE);
		updateFrame.setLayout(null);
		updateFrame.getContentPane().setBackground(new Color(0x4CAF50));

		message = new JLabel("Enter New End Date To Continue: ");
		message.setFont(new Font("Roboto", Font.BOLD, 17));
		message.setBounds(70, 39, 300, 21);
		message.setForeground(Color.white);
		updateFrame.add(message);

		text1 = new JTextField();
		updateFrame.add(text1);
		text1.setBounds(125, 80, 45, 20);
		
		text2 = new JTextField();
		updateFrame.add(text2);
		text2.setBounds(175, 80, 45, 20);
		
		text3 = new JTextField();
		updateFrame.add(text3);
		text3.setBounds(225, 80, 50, 20);
		
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
		if(!Teacher_Assignment_GUI.assigned) {
			JOptionPane.showMessageDialog(null, "No Assignment found to modify.");
		}
		else {
			Date endDate = new Date(Integer.parseInt(text1.getText()), Integer.parseInt(text2.getText()), Integer.parseInt(text3.getText()));
			if(!Date.verifyDate(endDate)) {
				JOptionPane.showMessageDialog(null, "Invalid Date Format Entered.");
			}
			else {
				Assignment.Update(endDate);
				JOptionPane.showMessageDialog(null, "Assignment End Date Modified.");
				updateFrame.dispose();
			}
		}
	}
}
