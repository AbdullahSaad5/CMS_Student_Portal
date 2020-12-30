package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Student_Quiz_GUI extends Subject_Window implements MouseListener {
	JPanel headingPanel, quizPanel;
	JLabel number, title, startTime, endTime, action, teacherComment, dataLabel;
	JLabel numberLabel, titleLabel, startTimeLabel, endTimeLabel, teacherCommentLabel;
	JButton attempt, instructions, showComment;
	Quiz curr;

	public Student_Quiz_GUI() {

		quizzes.setBackground(new Color(0x13A89E));
		quizzes.setForeground(Color.WHITE);

		headingPanel = new JPanel();
		headingPanel.setLayout(null);
		headingPanel.setBackground(new Color(0x1E1F4A));
		headingPanel.setBounds(0, 0, 1053, 33);

		number = new JLabel("#");
		number.setHorizontalAlignment(JLabel.CENTER);
		number.setBounds(0, 4, 25, 25);
		number.setForeground(Color.white);
		number.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(number);

		title = new JLabel("Title");
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBounds(26, 4, 132, 25);
		title.setForeground(Color.white);
		title.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(title);

		startTime = new JLabel("Start Time");
		startTime.setHorizontalAlignment(JLabel.CENTER);
		startTime.setBounds(159, 4, 144, 25);
		startTime.setForeground(Color.white);
		startTime.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(startTime);

		endTime = new JLabel("End Time");
		endTime.setHorizontalAlignment(JLabel.CENTER);
		endTime.setBounds(304, 4, 151, 25);
		endTime.setForeground(Color.white);
		endTime.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(endTime);

		action = new JLabel("Action");
		action.setHorizontalAlignment(JLabel.CENTER);
		action.setBounds(470, 4, 385, 25);
		action.setForeground(Color.white);
		action.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(action);

		teacherComment = new JLabel("Teacher Comments");
		teacherComment.setHorizontalAlignment(JLabel.CENTER);
		teacherComment.setBounds(877, 4, 151, 25);
		teacherComment.setForeground(Color.white);
		teacherComment.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(teacherComment);

		ArrayList<Quiz> list = Quiz.readQuizRecord();
		if (list.size() == 0 || Quiz_Submissions.checkSubmission(currStudent.getRegNo())) {
			dataLabel = new JLabel("No data available.");
			supportPanel.add(dataLabel);
			dataLabel.setForeground(new Color(0x474747));
			dataLabel.setFont(new Font("Roboto", Font.PLAIN, 13));
			dataLabel.setBounds(470, 140, 190, 15);
		} else {
			curr = list.get(0);
			numberLabel = new JLabel("1");
			numberLabel.setFont(new Font("Roboto", Font.BOLD, 12));
			numberLabel.setHorizontalAlignment(JLabel.CENTER);
			numberLabel.setBounds(0, 35, 25, 25);
			supportPanel.add(numberLabel);

			titleLabel = new JLabel(curr.getTitle());
			titleLabel.setFont(new Font("Roboto", Font.BOLD, 12));
			titleLabel.setHorizontalAlignment(JLabel.CENTER);
			titleLabel.setBounds(26, 35, 132, 25);
			supportPanel.add(titleLabel);

			startTimeLabel = new JLabel(curr.getStartTime().getHours() + ":" + curr.getStartTime().getMinutes() + ":"
					+ curr.getStartTime().getSeconds());
			startTimeLabel.setHorizontalAlignment(JLabel.CENTER);
			startTimeLabel.setFont(new Font("Roboto", Font.BOLD, 12));
			startTimeLabel.setBounds(159, 35, 144, 25);
			supportPanel.add(startTimeLabel);

			endTimeLabel = new JLabel(curr.getEndTime().getHours() + ":" + curr.getEndTime().getMinutes() + ":"
					+ curr.getEndTime().getSeconds());
			endTimeLabel.setHorizontalAlignment(JLabel.CENTER);
			endTimeLabel.setFont(new Font("Roboto", Font.BOLD, 12));
			endTimeLabel.setBounds(304, 35, 151, 25);
			supportPanel.add(endTimeLabel);

			instructions = new JButton(new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/warning.png")));
			instructions.setText("Instructions");
			instructions.setFont(new Font("Roboto", Font.BOLD, 12));
			instructions.setBounds(510, 35, 141, 25);
			instructions.setBackground(null);
			instructions.setFocusable(false);
			instructions.setBorder(null);
			instructions.addMouseListener(this);
			supportPanel.add(instructions);

			attempt = new JButton(new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/upload.png")));
			attempt.setText("Attempt");
			attempt.setFont(new Font("Roboto", Font.BOLD, 12));
			attempt.setBounds(661, 35, 141, 25);
			attempt.setBackground(null);
			attempt.setFocusable(false);
			attempt.setBorder(null);
			attempt.addMouseListener(this);
			supportPanel.add(attempt);

			showComment = new JButton();
			showComment.setText("Show Comment");
			showComment.setFont(new Font("Roboto", Font.BOLD, 12));
			showComment.setBounds(877, 35, 151, 25);
			showComment.setBackground(null);
			showComment.setFocusable(false);
			showComment.setBorder(null);
			showComment.addMouseListener(this);
			supportPanel.add(showComment);
		}

		supportPanel.add(headingPanel);
		mainPanel.repaint();

		mainFrame.setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == showComment) {
			JOptionPane.showMessageDialog(null, curr.getTeacherComment());
		} else if (e.getSource() == attempt) {
			JOptionPane.showMessageDialog(null, "Quiz Attempted Successfully");
			Quiz_Submissions.writeSubmissionRecord(currStudent.getRegNo());
			attempt.setText("Attempted");
			attempt.setForeground(new Color(0x357720));
			attempt.removeMouseListener(this);
			;
		} else if (e.getSource() == instructions) {
			JOptionPane.showMessageDialog(null,
					"The Quiz Should be Submitted Before Due Time. No Extra Time Will be Allotted. Make sure You Have Good and Stable Internet Connection Before Attempting the Quiz.");
		} else {
			super.mouseClicked(e);
		}
	}
}
