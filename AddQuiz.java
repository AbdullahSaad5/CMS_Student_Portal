package CMS_Student_Portal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class AddQuiz implements MouseListener {
	JFrame frame;
	JTextField titleField, startTimeField1, startTimeField2, starTimeField3, teacherCommentField, endTimeField1,
			endTimeField2, endTimeField3;
	JLabel titleLabel, startTimeLabel, teacherCommentLabel, mainLabel, endTimeLabel, success;
	JButton submit;

	public AddQuiz() {

		frame = new JFrame();
		frame.setLayout(null);
		frame.setTitle("Enter Details");
		frame.setResizable(false);
		frame.setSize(432, 650);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setLayout(null);
		frame.setIconImage(new ImageIcon(getClass().getResource("/CMS_Student_Portal/WindowIcon.png")).getImage());


		success = new JLabel("");
		frame.add(success);
		success.setFont(new Font("Roboto", Font.PLAIN, 15));

		titleLabel = new JLabel("Title:");
		titleLabel.setForeground(Color.white);
		frame.add(titleLabel);
		titleLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		titleLabel.setBounds(70, 100, 100, 20);

		titleField = new JTextField();
		frame.add(titleField);
		titleField.setBounds(200, 100, 150, 20);

		startTimeLabel = new JLabel("Start Time:");
		startTimeLabel.setForeground(Color.white);
		frame.add(startTimeLabel);
		startTimeLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		startTimeLabel.setBounds(70, 170, 100, 20);

		startTimeField1 = new JTextField();
		frame.add(startTimeField1);
		startTimeField1.setBounds(200, 170, 40, 20);

		startTimeField2 = new JTextField();
		frame.add(startTimeField2);
		startTimeField2.setBounds(245, 170, 40, 20);

		starTimeField3 = new JTextField();
		frame.add(starTimeField3);
		starTimeField3.setBounds(290, 170, 60, 20);

		endTimeLabel = new JLabel("Last Time:");
		endTimeLabel.setForeground(Color.white);
		frame.add(endTimeLabel);
		endTimeLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		endTimeLabel.setBounds(70, 240, 100, 20);

		endTimeField1 = new JTextField();
		frame.add(endTimeField1);
		endTimeField1.setBounds(200, 240, 40, 20);

		endTimeField2 = new JTextField();
		frame.add(endTimeField2);
		endTimeField2.setBounds(245, 240, 40, 20);

		endTimeField3 = new JTextField();
		frame.add(endTimeField3);
		endTimeField3.setBounds(290, 240, 60, 20);

		teacherCommentLabel = new JLabel("Comments:");
		teacherCommentLabel.setForeground(Color.white);
		frame.add(teacherCommentLabel);
		teacherCommentLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		teacherCommentLabel.setBounds(70, 310, 100, 20);

		teacherCommentField = new JTextField();
		teacherCommentField.setColumns(3);
		frame.add(teacherCommentField);
		teacherCommentField.setBounds(200, 310, 150, 20);

		mainLabel = new JLabel("Enter Quiz Details");
		mainLabel.setForeground(Color.white);
		mainLabel.setHorizontalAlignment(JLabel.CENTER);
		frame.add(mainLabel);
		mainLabel.setBounds(0, 50, 432, 20);
		mainLabel.setFont(new Font("Roboto", Font.BOLD + Font.ITALIC, 20));

		submit = new JButton("Submit");
		frame.add(submit);
		submit.setFocusable(false);
		submit.setBounds(166, 500, 100, 20);
		submit.setFont(new Font("Roboto", Font.BOLD, 16));
		submit.addMouseListener(this);

		frame.getContentPane().setBackground(new Color(0x1E214A));

		frame.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == submit) {
			Time startTime = new Time(Integer.parseInt(startTimeField1.getText()),
					Integer.parseInt(startTimeField2.getText()), Integer.parseInt(starTimeField3.getText()));
			Time endTime = new Time(Integer.parseInt(endTimeField1.getText()),
					Integer.parseInt(endTimeField2.getText()), Integer.parseInt(endTimeField3.getText()));
			String title = titleField.getText().strip();
			String teacherComment = teacherCommentField.getText().strip();
			if (!Time.verifyTime(startTime)) {
				JOptionPane.showMessageDialog(null, "Invalid Start Time Entered. Try Again.");
			} else if (!Time.verifyTime(endTime)) {
				JOptionPane.showMessageDialog(null, "Invalid End Time Entered. Try Again.");

			} else if (!Time.laterIsGreater(startTime, endTime)) {
				JOptionPane.showMessageDialog(null, "End Time should be greater than Start Time");

			} else if (title.isBlank()) {
				JOptionPane.showMessageDialog(null, "Title cannot be blank. Try Again.");

			} else {
				Quiz curr = new Quiz(startTime, endTime, title, teacherComment);
				Teacher_Quiz_GUI.currQuiz = new Quiz(curr);
				Quiz.issueQuiz(curr);
				JOptionPane.showMessageDialog(null, "Quiz Issued Successfully!");
				Teacher_Quiz_GUI.assigned = true;
				frame.dispose();
			}
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
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
