package CMS_Student_Portal;


import javax.swing.*;

public class Scrollable {
	public Scrollable(){
		
	JFrame frame = new JFrame();
	
	frame.setSize(500 ,500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JTextArea area = new JTextArea();
	area.setText(Student.displayAllStudents());
	
	
	JScrollPane sc = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	frame.add(sc);
	frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Scrollable();
	}
}