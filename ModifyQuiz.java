package CMS_Student_Portal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ModifyQuiz implements ActionListener{
	JFrame updateFrame;
	JLabel message;
	JTextField text1, text2, text3;
	JButton submit;
	public ModifyQuiz() {
		updateFrame = new JFrame();
		updateFrame.setTitle("Update Information");
		updateFrame.setResizable(false);
		updateFrame.setSize(400, 200);
		updateFrame.setLocationRelativeTo(null);
		updateFrame.setDefaultCloseOperation(updateFrame.DISPOSE_ON_CLOSE);
		updateFrame.setLayout(null);
		updateFrame.getContentPane().setBackground(new Color(0x4CAF50));
		updateFrame.setIconImage(new ImageIcon(getClass().getResource("/CMS_Student_Portal/WindowIcon.png")).getImage());


		message = new JLabel("Enter New End Time To Continue: ");
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
		if(!Teacher_Quiz_GUI.assigned) {
			JOptionPane.showMessageDialog(null, "No Quiz found to modify.");
		}
		else {
			Time endTime = new Time(Integer.parseInt(text1.getText()), Integer.parseInt(text2.getText()), Integer.parseInt(text3.getText()));
			if(!Time.verifyTime(endTime)) {
				JOptionPane.showMessageDialog(null, "Invalid Time Format Entered.");
			}
			else {
				Quiz.update(endTime);
				JOptionPane.showMessageDialog(null, "Quiz End Time Modified.");
				updateFrame.dispose();
			}
		}
	}
}
