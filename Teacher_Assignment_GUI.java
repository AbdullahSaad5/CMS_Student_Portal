package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Teacher_Assignment_GUI extends Teacher_Portal_Screen implements MouseListener{
	JButton addAssignment, viewAssignment, seeSubmissions;
	JLabel addLabel, viewLabel, submissionLabel, mainLabel;
	JPanel mainWindow, assignmentHeading;
	JLabel number, title, startDate, endDate, fileSize, fileType, action, teacherComment, dataLabel;
	JTextField numberField, titleField, startDateField, endDateField, fileSizeField, fileTypeField, teacherCommentField;
	private static boolean addBool = true, viewBool= false, seeBool = false;
	
	public Teacher_Assignment_GUI() {
		
		viewAssignment = new JButton();
		viewAssignment.setBounds(1025, 7, 58, 58);
		viewAssignment.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhiteEye.png")));
		viewAssignment.setBackground(null);
		viewAssignment.setFocusable(false);
		viewAssignment.setBorder(null);
		viewAssignment.addMouseListener(this);
		infoPanel.add(viewAssignment);
		
		addAssignment = new JButton();
		addAssignment.setBounds(1105, 7, 58, 58);
		addAssignment.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/BluePen.png")));
		addAssignment.setBackground(null);
		addAssignment.setFocusable(false);
		addAssignment.setBorder(null);
		addAssignment.addMouseListener(this);
		infoPanel.add(addAssignment);
		
		seeSubmissions = new JButton();
		seeSubmissions.setBounds(1185, 7, 58, 58);
		seeSubmissions.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhiteEye.png")));
		seeSubmissions.setBackground(null);
		seeSubmissions.setFocusable(false);
		seeSubmissions.setBorder(null);
		seeSubmissions.addMouseListener(this);
		infoPanel.add(seeSubmissions);
		
		addLabel = new JLabel("<html><p style='text-align: center'>View<br>Assignment<p><html>");
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
		submissionLabel.setBounds(1190 , 65, 70, 30);
		submissionLabel.setFont(new Font("Roboto", Font.PLAIN, 9));
		submissionLabel.setForeground(Color.white);
		infoPanel.add(submissionLabel);
		
		
		mainLabel = new JLabel("Add Assignment");
		mainLabel.setBounds(87 , 16, 240, 34);
		mainLabel.setFont(new Font("Roboto", Font.BOLD + Font.ITALIC, 30));
		mainLabel.setForeground(Color.white);
		infoPanel.add(mainLabel);
		
		mainWindow = new JPanel();
		mainWindow.setLayout(null);
		mainWindow.setBounds(157, 308, 1053, 367);
		mainWindow.setBackground(Color.white);
		mainPanel.add(mainWindow);
		
		mainWindow.repaint();
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
		background.setBounds(0, 0, 1366, 768);
		mainPanel.add(background);
		
		infoPanel.repaint();
		mainFrame.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == addAssignment) {
			addBool = true;
			viewBool = false;
			seeBool = false;
			new AddAssignment();
			viewAssignment.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhiteEye.png")));
			seeSubmissions.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhiteEye.png")));

		}
		else if(e.getSource() == viewAssignment) {
			addBool = false;
			viewBool = true;
			seeBool = false;
			addAssignment.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhitePen.png")));
			seeSubmissions.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhiteEye.png")));

		}
		else if(e.getSource() == seeSubmissions) {
			addBool = false;
			viewBool = false;
			seeBool = true;
			addAssignment.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhitePen.png")));
			viewAssignment.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhiteEye.png")));

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
		if(e.getSource() == addAssignment) {
			addAssignment.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/BluePen.png")));
		}
		if(e.getSource() == viewAssignment) {
			viewAssignment.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/BlueEye.png")));
		}
		if(e.getSource() == seeSubmissions) {
			seeSubmissions.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/BlueEye.png")));
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addAssignment && !addBool) {
			addAssignment.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhitePen.png")));
		}
		if(e.getSource() == viewAssignment && !viewBool) {
			viewAssignment.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhiteEye.png")));
		}
		if(e.getSource() == seeSubmissions && !seeBool) {
			seeSubmissions.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhiteEye.png")));
		}
	}
}
