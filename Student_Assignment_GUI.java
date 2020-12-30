package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Student_Assignment_GUI extends Subject_Window implements MouseListener {
	JPanel headingPanel, assignmentPanel;
	JLabel number, title, startDate, endDate, fileSize, fileType, action, teacherComment, dataLabel;
	JLabel numberLabel, titleLabel, startDateLabel, endDateLabel, fileSizeLabel, fileTypeLabel, teacherCommentLabel;
	JButton upload, download, showComment;
	Assignment curr;

	public Student_Assignment_GUI() {

		assignments.setBackground(new Color(0x13A89E));
		assignments.setForeground(Color.WHITE);

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

		startDate = new JLabel("Start Date");
		startDate.setHorizontalAlignment(JLabel.CENTER);
		startDate.setBounds(159, 4, 144, 25);
		startDate.setForeground(Color.white);
		startDate.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(startDate);

		endDate = new JLabel("Last Date");
		endDate.setHorizontalAlignment(JLabel.CENTER);
		endDate.setBounds(304, 4, 151, 25);
		endDate.setForeground(Color.white);
		endDate.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(endDate);

		fileSize = new JLabel("File Size");
		fileSize.setHorizontalAlignment(JLabel.CENTER);
		fileSize.setBounds(456, 4, 73, 25);
		fileSize.setForeground(Color.white);
		fileSize.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(fileSize);

		fileType = new JLabel("File Type");
		fileType.setHorizontalAlignment(JLabel.CENTER);
		fileType.setBounds(530, 4, 89, 25);
		fileType.setForeground(Color.white);
		fileType.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(fileType);

		action = new JLabel("Action");
		action.setHorizontalAlignment(JLabel.CENTER);
		action.setBounds(620, 4, 281, 25);
		action.setForeground(Color.white);
		action.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(action);

		teacherComment = new JLabel("Teacher Comments");
		teacherComment.setHorizontalAlignment(JLabel.CENTER);
		teacherComment.setBounds(877, 4, 151, 25);
		teacherComment.setForeground(Color.white);
		teacherComment.setFont(new Font("Roboto", Font.BOLD, 12));
		headingPanel.add(teacherComment);

		ArrayList<Assignment> list = Assignment.readAssignmentRecord();
		if (list.size() == 0 || Assignment_Submissions.checkSubmission(currStudent.getRegNo())) {
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

			startDateLabel = new JLabel(curr.getStartDate().getDay() + "/" + curr.getStartDate().getMonth() + "/"
					+ curr.getStartDate().getYear());
			startDateLabel.setHorizontalAlignment(JLabel.CENTER);
			startDateLabel.setFont(new Font("Roboto", Font.BOLD, 12));
			startDateLabel.setBounds(159, 35, 144, 25);
			supportPanel.add(startDateLabel);

			endDateLabel = new JLabel(curr.getLastDate().getDay() + "/" + curr.getLastDate().getMonth() + "/"
					+ curr.getLastDate().getYear());
			endDateLabel.setHorizontalAlignment(JLabel.CENTER);
			endDateLabel.setFont(new Font("Roboto", Font.BOLD, 12));
			endDateLabel.setBounds(304, 35, 151, 25);
			supportPanel.add(endDateLabel);

			fileSizeLabel = new JLabel(curr.getFileSize() + "KBs");
			fileSizeLabel.setFont(new Font("Roboto", Font.BOLD, 12));
			fileSizeLabel.setHorizontalAlignment(JLabel.CENTER);
			fileSizeLabel.setBounds(456, 35, 73, 25);
			supportPanel.add(fileSizeLabel);

			String fileType = curr.getFileType();
			if (fileType.equalsIgnoreCase("word")) {
				fileTypeLabel = new JLabel(
						new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/word.png")));
			} else if (fileType.equalsIgnoreCase("ppt")) {
				fileTypeLabel = new JLabel(
						new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/powerpoint.png")));
			} else {
				fileTypeLabel = new JLabel(
						new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/pdf.png")));
			}
			fileTypeLabel.setHorizontalAlignment(JLabel.CENTER);
			fileTypeLabel.setBounds(530, 35, 89, 32);
			supportPanel.add(fileTypeLabel);

			download = new JButton(new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/download.png")));
			download.setText("Download");
			download.setFont(new Font("Roboto", Font.BOLD, 12));
			download.setBounds(619, 35, 141, 25);
			download.setBackground(null);
			download.setFocusable(false);
			download.setBorder(null);
			download.addMouseListener(this);
			supportPanel.add(download);

			upload = new JButton(new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/upload.png")));
			upload.setText("Upload");
			upload.setFont(new Font("Roboto", Font.BOLD, 12));
			upload.setBounds(761, 35, 141, 25);
			upload.setBackground(null);
			upload.setFocusable(false);
			upload.setBorder(null);
			upload.addMouseListener(this);
			supportPanel.add(upload);

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
		} else if (e.getSource() == upload) {
			JOptionPane.showMessageDialog(null, "Assignment Uploaded Successfully");
			Assignment_Submissions.writeSubmissionRecord(currStudent.getRegNo());
			upload.setText("Submitted");
			upload.setForeground(new Color(0x357720));
			upload.removeMouseListener(this);
			;
		} else if (e.getSource() == download) {
			JOptionPane.showMessageDialog(null, "Downlaod Not Allowed Right Now. Privacy Issues!");
		} else {
			super.mouseClicked(e);
		}
	}
}
