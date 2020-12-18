package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp_Details extends Template implements ActionListener {
    JPanel mainPanel;
    JButton submit;
    JTextField nameField, regNoField, semesterField, ageField, gpaField, cityField, busField;
    JLabel nameLabel, regNoLabel, semesterLabel, ageLabel, gpaLabel, cityLabel, busLabel, mainLabel, success;
    static Student curr = new Student("a", "a", "a", "a", "a", "a", "a");
    public SignUp_Details(){
        backButton.setEnabled(true);
        backButton.addActionListener(this);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainFrame.add(mainPanel, BorderLayout.CENTER);

        success = new JLabel("");
        mainPanel.add(success);
        success.setFont(new Font("Roboto", Font.PLAIN, 15));

        nameLabel = new JLabel("Name:");
        mainPanel.add(nameLabel);
        nameLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        nameLabel.setBounds(582, 58, 55, 20);

        nameField = new JTextField();
        mainPanel.add(nameField);
        nameField.setBounds(658, 58, 150, 20);

        regNoLabel = new JLabel("Reg No:");
        mainPanel.add(regNoLabel);
        regNoLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        regNoLabel.setBounds(574, 107, 65, 20);

        regNoField = new JTextField();
        mainPanel.add(regNoField);
        regNoField.setBounds(658, 107, 150, 20);

        semesterLabel = new JLabel("Semester:");
        mainPanel.add(semesterLabel);
        semesterLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        semesterLabel.setBounds(562, 156, 75, 20);

        semesterField = new JTextField();
        mainPanel.add(semesterField);
        semesterField.setBounds(658, 156, 150, 20);

        ageLabel = new JLabel("Age:");
        mainPanel.add(ageLabel);
        ageLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        ageLabel.setBounds(588, 207, 50, 20);

        ageField = new JTextField();
        mainPanel.add(ageField);
        ageField.setBounds(658, 207, 150, 20);

        gpaLabel = new JLabel("CGPA:");
        mainPanel.add(gpaLabel);
        gpaLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        gpaLabel.setBounds(581, 255, 50, 20);

        gpaField = new JTextField();
        mainPanel.add(gpaField);
        gpaField.setBounds(658, 255, 150, 20);

        cityLabel = new JLabel("Home City:");
        mainPanel.add(cityLabel);
        cityLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        cityLabel.setBounds(552, 303, 85, 20);

        cityField = new JTextField();
        mainPanel.add(cityField);
        cityField.setBounds(658, 303, 150, 20);

        busLabel = new JLabel("Bus Facility:");
        mainPanel.add(busLabel);
        busLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        busLabel.setBounds(547, 355, 90, 20);

        busField = new JTextField();
        mainPanel.add(busField);
        busField.setBounds(658, 355, 150, 20);

        mainLabel = new JLabel("Enter Your Details");
        mainPanel.add(mainLabel);
        mainLabel.setBounds(595, 20, 175, 20);
        mainLabel.setFont(new Font("Roboto", Font.BOLD + Font.ITALIC, 20));

        submit = new JButton("Submit");
        mainPanel.add(submit);
        submit.setFocusable(false);
        submit.setBounds(633, 400, 100, 20);
        submit.setFont(new Font("Roboto", Font.PLAIN, 16));
        submit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit) {
            if (nameField.getText().isBlank() || regNoField.getText().isBlank() || semesterField.getText().isBlank() ||
                    ageField.getText().isBlank() || gpaField.getText().isBlank() || cityField.getText().isBlank() || busField.getText().isBlank()) {
                success.setText("Please Enter All the Details.");
                success.setForeground(new Color(255, 0, 0));
                success.setBounds(590, 440, 190, 20);
            } else {
                success.setText("Details Registered.");
                success.setForeground(new Color(0, 255, 0));
                success.setBounds(618, 440, 130, 20);

                curr = new Student(nameField.getText(), regNoField.getText(), semesterField.getText(), ageField.getText(),
                        gpaField.getText(), cityField.getText(), busField.getText());
                Student.writeStudentRecord(curr);
                new Main_Interface();
                mainFrame.dispose();
            }
        }
        else{
            new SignUp();
            mainFrame.dispose();
        }
    }
}
