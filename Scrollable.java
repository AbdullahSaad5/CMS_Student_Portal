package CMS_Student_Portal;

import javax.swing.*;

public class Scrollable {
	public Scrollable(){
		
	JFrame frame = new JFrame();
	frame.setSize(500 ,500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel label = new JLabel();
	label.setSize(500, 300);
	label.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
	
	JScrollPane sc = new JScrollPane(label, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	frame.add(sc);
	frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Scrollable();
	}
}