package CMS_Student_Portal;

import java.awt.*;

import javax.swing.*;

public class SearchStudent {
	JFrame frame;
	JScrollPane students;
	JLabel label;
	JTextArea record;

	public SearchStudent() {
		frame = new JFrame();
		frame.setTitle("Search Records");
		frame.setResizable(false);
		frame.setSize(1024, 576);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.white);
		frame.setIconImage(new ImageIcon(getClass().getResource("/CMS_Student_Portal/WindowIcon.png")).getImage());

		
		label = new JLabel(new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/search.png")));
		label.setText("Search Results");
		label.setFont(new Font("Roboto", Font.BOLD, 20));
		label.setBounds(400, 15, 300, 64);
		
		record = new JTextArea();
		record.setEditable(false);
		record.setFont(new Font("Roboto", Font.ITALIC, 15));
		record.setText(Student.searchAdvancedString(viewAllStudents.searched));
		
		record.setBounds(0, 100, 1024, 576);

		students = new JScrollPane(record, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		students.getVerticalScrollBar().setBackground(Color.white);
		students.setBackground(new Color(144, 202, 249));
		students.setBounds(0, 100, 1024, 576);
		frame.add(students);
		frame.add(label);


		frame.add(students);

		frame.setVisible(true);
	}
}
