package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadingScreen implements ActionListener {
	JFrame mainFrame;
	JLabel loading;
	JLabel text;
	JButton cont;

	public LoadingScreen() {
		mainFrame = new JFrame();
		mainFrame.setSize(1366, 768);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		mainFrame.setTitle("CUOnline Portal Desktop Version");
		mainFrame.getContentPane().setBackground(Color.WHITE);
		mainFrame.setLayout(null);

		loading = new JLabel();
		loading.setBounds(651, 312, 64, 64);
		mainFrame.add(loading);
		loading.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/Preloader_2.gif")));

		text = new JLabel("Please Wait While We Load Your Profile.");
		text.setForeground(new Color(0x00AACF));
		text.setBounds(545, 400, 400, 20);
		mainFrame.add(text);
		mainFrame.setVisible(true);

		Timer t = new Timer(3000, this);
		t.setRepeats(false);
		t.start();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (Identify.isTeacher) {
			new Teacher_Profile();
		} else {
			new Student_Dashboard();
		}
		mainFrame.dispose();
	}
}
