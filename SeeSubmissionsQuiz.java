package CMS_Student_Portal;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class SeeSubmissionsQuiz extends Teacher_Quiz_GUI {
	JTextArea subs;
	JScrollPane sc;

	public SeeSubmissionsQuiz() {
		mainLabel.setText("See Attempts");

		infoPanel.add(mainLabel);

		subs = new JTextArea();
		subs.setEditable(false);
		subs.setAutoscrolls(true);
		subs.setFont(new Font("Roboto", Font.ITALIC, 15));
		String output1 = Quiz.display();
		String output2 = Quiz_Submissions.submissionData();
		subs.setText(output1 + "\n\n" + output2);

		sc = new JScrollPane(subs, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sc.getVerticalScrollBar().setBackground(new Color(0x1E214A));
		sc.getBackground().darker();
		sc.setBounds(157, 275, 1053, 400);
		mainPanel.add(sc);
		
		mainWindow.setVisible(false);
		background.setVisible(false);

		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
		background.setBounds(0, 0, 1366, 768);
		mainPanel.add(background);
		
		sc.repaint();
	}

}
