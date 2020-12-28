package CMS_Student_Portal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class AddAssignment implements MouseListener {
	JFrame frame;
	JTextField titleField, startDateField1, startDateField2, startDateField3, fileTypeField, teacherCommentField,
			endDateField1, endDateField2, endDateField3, fileSizeField;
	JLabel titleLabel, startDateLabel, fileTypeLabel, teacherCommentLabel, mainLabel, endDateLabel, fileSizeLabel,
			success;
	JButton submit;
	JRadioButton pdf, word, ppt;
	String file = "ppt";

	public AddAssignment() {

		frame = new JFrame();
		frame.setLayout(null);
		frame.setTitle("Enter Details");
		frame.setResizable(false);
		frame.setSize(432, 650);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setLayout(null);
//		frame.getContentPane().setBackground(new Color(0x4CAF50));

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

		startDateLabel = new JLabel("Start Date:");
		startDateLabel.setForeground(Color.white);
		frame.add(startDateLabel);
		startDateLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		startDateLabel.setBounds(70, 170, 100, 20);

		startDateField1 = new JTextField();
		frame.add(startDateField1);
		startDateField1.setBounds(200, 170, 40, 20);

		startDateField2 = new JTextField();
		frame.add(startDateField2);
		startDateField2.setBounds(245, 170, 40, 20);

		startDateField3 = new JTextField();
		frame.add(startDateField3);
		startDateField3.setBounds(290, 170, 60, 20);

		endDateLabel = new JLabel("Last Date:");
		endDateLabel.setForeground(Color.white);
		frame.add(endDateLabel);
		endDateLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		endDateLabel.setBounds(70, 240, 100, 20);

		endDateField1 = new JTextField();
		frame.add(endDateField1);
		endDateField1.setBounds(200, 240, 40, 20);

		endDateField2 = new JTextField();
		frame.add(endDateField2);
		endDateField2.setBounds(245, 240, 40, 20);

		endDateField3 = new JTextField();
		frame.add(endDateField3);
		endDateField3.setBounds(290, 240, 60, 20);

		fileTypeLabel = new JLabel("File Type:");
		fileTypeLabel.setForeground(Color.white);
		frame.add(fileTypeLabel);
		fileTypeLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		fileTypeLabel.setBounds(70, 310, 100, 20);

//		fileTypeField = new JTextField();
//		frame.add(fileTypeField);
//		fileTypeField.setBounds(200, 250, 150, 20);
		ButtonGroup group = new ButtonGroup();
		ppt = new JRadioButton(new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/powerpoint.png")));
		ppt.setText("PPT");
		ppt.setBackground(new Color(0xBDBDBD));
		ppt.addMouseListener(this);
		ppt.setFont(new Font("Roboto", Font.PLAIN, 12));
		ppt.setHorizontalTextPosition(JLabel.CENTER);
		ppt.setVerticalTextPosition(JLabel.TOP);
		ppt.setBounds(200, 295, 40, 50);
		ppt.setFocusable(false);
		ppt.setForeground(Color.white);
		frame.add(ppt);

		word = new JRadioButton(new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/word.png")));
		word.setText("Word");
		word.setBackground(null);
		word.addMouseListener(this);
		word.setFont(new Font("Roboto", Font.PLAIN, 12));
		word.setHorizontalTextPosition(JLabel.CENTER);
		word.setVerticalTextPosition(JLabel.TOP);
		word.setBounds(270, 295, 40, 50);
		word.setFocusable(false);
		word.setForeground(Color.white);
		frame.add(word);

		pdf = new JRadioButton(new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/pdf.png")));
		pdf.setForeground(Color.white);
		pdf.setText("PDF");
		pdf.setBackground(null);
		pdf.addMouseListener(this);
		pdf.setFont(new Font("Roboto", Font.PLAIN, 12));
		pdf.setHorizontalTextPosition(JLabel.CENTER);
		pdf.setVerticalTextPosition(JLabel.TOP);
		pdf.setBounds(340, 295, 40, 50);
		pdf.setFocusable(false);
		frame.add(pdf);

		group.add(pdf);
		group.add(word);
		group.add(ppt);

		teacherCommentLabel = new JLabel("Comments:");
		teacherCommentLabel.setForeground(Color.white);
		frame.add(teacherCommentLabel);
		teacherCommentLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		teacherCommentLabel.setBounds(70, 380, 100, 20);

		teacherCommentField = new JTextField();
		teacherCommentField.setColumns(3);
		frame.add(teacherCommentField);
		teacherCommentField.setBounds(200, 380, 150, 20);

		mainLabel = new JLabel("Enter Assignment Details");
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
			Date startDate = new Date(Integer.parseInt(startDateField1.getText()),
					Integer.parseInt(startDateField2.getText()), Integer.parseInt(startDateField3.getText()));
			Date endDate = new Date(Integer.parseInt(endDateField1.getText()),
					Integer.parseInt(endDateField2.getText()), Integer.parseInt(endDateField3.getText()));
			String title = titleField.getText().strip();
			String fileType = file;
			String teacherComment = teacherCommentField.getText().strip();
			if (!Date.verifyDate(startDate)) {
				JOptionPane.showMessageDialog(null, "Invalid Start Date Entered. Try Again.");
			} else if (!Date.verifyDate(endDate)) {
				JOptionPane.showMessageDialog(null, "Invalid End Date Entered. Try Again.");

			} else if (!Date.laterIsGreater(startDate, endDate)) {
				JOptionPane.showMessageDialog(null, "Last Date should be greater than previous date");

			} else if (title.isBlank()) {
				JOptionPane.showMessageDialog(null, "Title cannot be blank. Try Again.");

			}
//			if(Date.verifyDate(startDate) && Date.verifyDate(endDate) && Date.laterIsGreater(startDate, endDate)) {
//				Assignment curr = new Assignment(startDate, endDate, title, fileType, teacherComment);
//				Assignment.issueAssignment(curr);
//				frame.dispose();
//			}
			else {
				Assignment curr = new Assignment(startDate, endDate, title, fileType, teacherComment);
				Assignment.issueAssignment(curr);
				frame.dispose();
			}
		} else if (e.getSource() == pdf) {
			pdf.setBackground(new Color(0xBDBDBD));
			ppt.setBackground(null);
			word.setBackground(null);
			file = "pdf";
		} else if (e.getSource() == word) {
			pdf.setBackground(null);
			ppt.setBackground(null);
			word.setBackground(new Color(0xBDBDBD));
			file = "word";
		} else {
			pdf.setBackground(null);
			ppt.setBackground(new Color(0xBDBDBD));
			word.setBackground(null);
			file = "ppt";
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
