package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Identify extends Template implements ActionListener {
    JPanel mainPanel;
    JLabel identityLabel;
    JButton teacherButton, studentButton;
    public Identify() {
       mainPanel = new JPanel();
       mainPanel.setPreferredSize(new Dimension(200, 200));
       mainFrame.add(mainPanel, BorderLayout.CENTER);

       identityLabel = new JLabel("Confirm Your Identity");
       identityLabel.setFont(new Font("Roboto", Font.BOLD, 20));
       identityLabel.setBounds(583, 124, 200 ,25);
       mainPanel.setLayout(null);
       mainPanel.add(identityLabel);


       teacherButton = new JButton("Teacher");
        mainPanel.add(teacherButton);
        teacherButton.setFocusable(false);
       teacherButton.setBounds(508, 184, 150, 30);
       teacherButton.setFont(new Font("Roboto", Font.PLAIN, 16));

       studentButton = new JButton("Student");
        mainPanel.add(studentButton);
        studentButton.setFocusable(false);
        studentButton.setBounds(708, 184, 150, 30);
        studentButton.setFont(new Font("Roboto", Font.PLAIN, 16));

        studentButton.addActionListener(this);
        teacherButton.addActionListener(this);

       mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new LoginOrSignup();
        mainFrame.dispose();
    }
}