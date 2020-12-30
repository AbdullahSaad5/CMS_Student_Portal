package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Teacher_Quiz_GUI extends Teacher_Portal_Screen implements MouseListener {
	JButton addQuiz, modifyQuiz, seeSubmissions;
	JLabel addLabel, viewLabel, attempsLabel, mainLabel;
	JPanel mainWindow, QuizHeading;
	JLabel number, title, startDate, endDate, fileSize, fileType, action, teacherComment, dataLabel;
	JTextField numberField, titleField, startDateField, endDateField, fileSizeField, fileTypeField, teacherCommentField;
	public static boolean assigned;
	JLabel background;
	static Quiz currQuiz;

	public Teacher_Quiz_GUI() {

		modifyQuiz = new JButton();
		modifyQuiz.setBounds(1025, 7, 58, 58);
		modifyQuiz.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhiteEye.png")));
		modifyQuiz.setBackground(null);
		modifyQuiz.setFocusable(false);
		modifyQuiz.setBorder(null);
		modifyQuiz.addMouseListener(this);
		infoPanel.add(modifyQuiz);

		addQuiz = new JButton();
		addQuiz.setBounds(1105, 7, 58, 58);
		addQuiz.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhitePen.png")));
		addQuiz.setBackground(null);
		addQuiz.setFocusable(false);
		addQuiz.setBorder(null);
		addQuiz.addMouseListener(this);
		infoPanel.add(addQuiz);

		seeSubmissions = new JButton();
		seeSubmissions.setBounds(1185, 7, 58, 58);
		seeSubmissions.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/BlueEye.png")));
		seeSubmissions.setBackground(null);
		seeSubmissions.setFocusable(false);
		seeSubmissions.setBorder(null);
		seeSubmissions.addMouseListener(this);
		infoPanel.add(seeSubmissions);

		addLabel = new JLabel("<html><p style='text-align: center'>Modify<br>Quiz<p><html>");
		addLabel.setBounds(1042, 65, 50, 30);
		addLabel.setFont(new Font("Roboto", Font.PLAIN, 9));
		addLabel.setForeground(Color.white);
		infoPanel.add(addLabel);

		viewLabel = new JLabel("<html><p style='text-align: center'>Add<br>Quiz<p><html>");
		viewLabel.setBounds(1127, 65, 60, 30);
		viewLabel.setFont(new Font("Roboto", Font.PLAIN, 9));
		viewLabel.setForeground(Color.white);
		infoPanel.add(viewLabel);

		attempsLabel = new JLabel("<html><p style='text-align: center'>View<br>Attempts<p><html>");
		attempsLabel.setBounds(1198, 65, 70, 30);
		attempsLabel.setFont(new Font("Roboto", Font.PLAIN, 9));
		attempsLabel.setForeground(Color.white);
		infoPanel.add(attempsLabel);

		mainLabel = new JLabel("Add Quiz");
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

		ArrayList<Quiz> list = Quiz.readQuizRecord();
		if (list.size() == 0) {
			assigned = false;
		} else {
			assigned = true;
			currQuiz = Quiz.readQuizRecord().get(0);
		}

		infoPanel.repaint();
		mainFrame.setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == addQuiz) {
			if (Quiz_Submissions.allSubmitted()) {
				assigned = false;
				Quiz.removeQuizzes();
				Quiz_Submissions.removeAllSubmissions();
			}
			if (!assigned) {
				new AddQuiz();
			} else {
				JOptionPane.showMessageDialog(null, "One Quiz is already assigned. Can't assign more right now.");
			}
		}
		else if(e.getSource() == modifyQuiz) {
			new ModifyQuiz(); 
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
		if (e.getSource() == addQuiz) {
			addQuiz
					.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/BluePen.png")));
		}
		if (e.getSource() == modifyQuiz) {
			modifyQuiz
					.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/BlueEye.png")));
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addQuiz) {
			addQuiz
					.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhitePen.png")));
		}
		if (e.getSource() == modifyQuiz) {
			modifyQuiz
					.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/WhiteEye.png")));
		}
	}
}
