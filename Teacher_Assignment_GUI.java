package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Teacher_Assignment_GUI extends Teacher_Portal_Screen implements MouseListener {
	JButton addAssignment, modifyAssignment, seeSubmissions;
	JLabel addLabel, viewLabel, submissionLabel, mainLabel;
	JPanel mainWindow, assignmentHeading;
	JLabel number, title, startDate, endDate, fileSize, fileType, action, teacherComment, dataLabel;
	JTextField numberField, titleField, startDateField, endDateField, fileSizeField, fileTypeField, teacherCommentField;
	public static boolean assigned;
	JLabel background;
	static Assignment currAssignment;

	public Teacher_Assignment_GUI() {

		modifyAssignment = new JButton();
		modifyAssignment.setBounds(1025, 7, 58, 58);
		modifyAssignment.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhiteEye.png")));
		modifyAssignment.setBackground(null);
		modifyAssignment.setFocusable(false);
		modifyAssignment.setBorder(null);
		modifyAssignment.addMouseListener(this);
		infoPanel.add(modifyAssignment);

		addAssignment = new JButton();
		addAssignment.setBounds(1105, 7, 58, 58);
		addAssignment.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhitePen.png")));
		addAssignment.setBackground(null);
		addAssignment.setFocusable(false);
		addAssignment.setBorder(null);
		addAssignment.addMouseListener(this);
		infoPanel.add(addAssignment);

		seeSubmissions = new JButton();
		seeSubmissions.setBounds(1185, 7, 58, 58);
		seeSubmissions.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/BlueEye.png")));
		seeSubmissions.setBackground(null);
		seeSubmissions.setFocusable(false);
		seeSubmissions.setBorder(null);
		seeSubmissions.addMouseListener(this);
		infoPanel.add(seeSubmissions);

		addLabel = new JLabel("<html><p style='text-align: center'>Modify<br>Assignment<p><html>");
		addLabel.setBounds(1028, 65, 50, 30);
		addLabel.setFont(new Font("Roboto", Font.PLAIN, 9));
		addLabel.setForeground(Color.white);
		infoPanel.add(addLabel);

		viewLabel = new JLabel("<html><p style='text-align: center'>Add<br>Assignment<p><html>");
		viewLabel.setBounds(1110, 65, 60, 30);
		viewLabel.setFont(new Font("Roboto", Font.PLAIN, 9));
		viewLabel.setForeground(Color.white);
		infoPanel.add(viewLabel);

		submissionLabel = new JLabel("<html><p style='text-align: center'>View<br>Submission<p><html>");
		submissionLabel.setBounds(1190, 65, 70, 30);
		submissionLabel.setFont(new Font("Roboto", Font.PLAIN, 9));
		submissionLabel.setForeground(Color.white);
		infoPanel.add(submissionLabel);

		mainLabel = new JLabel("Add Assignment");
		mainLabel.setBounds(87, 16, 240, 34);
		mainLabel.setFont(new Font("Roboto", Font.BOLD + Font.ITALIC, 30));
		mainLabel.setForeground(Color.white);
		infoPanel.add(mainLabel);

		mainWindow = new JPanel();
		mainWindow.setLayout(null);
		mainWindow.setBounds(157, 308, 1053, 367);
		mainWindow.setBackground(Color.white);
		mainPanel.add(mainWindow);

		mainWindow.repaint();
		background = new JLabel();
		background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
		background.setBounds(0, 0, 1366, 768);
		mainPanel.add(background);

		ArrayList<Assignment> list = Assignment.readAssignmentRecord();
		if (list.size() == 0) {
			assigned = false;
		} else {
			assigned = true;
			currAssignment = Assignment.readAssignmentRecord().get(0);
		}

		infoPanel.repaint();
		mainFrame.setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == addAssignment) {
			if (Submissions.allSubmitted()) {
				assigned = false;
				Assignment.removeAssignments();
				Submissions.removeAllSubmissions();
			}
			if (!assigned) {
				new AddAssignment();
				assigned = true;
			} else {
				JOptionPane.showMessageDialog(null, "One assignment is already assigned. Can't assign more right now.");
			}
		}
		else if(e.getSource() == modifyAssignment) {
			new ModifyAssignment(); 
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
		if (e.getSource() == addAssignment) {
			addAssignment
					.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/BluePen.png")));
		}
		if (e.getSource() == modifyAssignment) {
			modifyAssignment
					.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/BlueEye.png")));
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addAssignment) {
			addAssignment
					.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhitePen.png")));
		}
		if (e.getSource() == modifyAssignment) {
			modifyAssignment
					.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhiteEye.png")));
		}
	}
}
