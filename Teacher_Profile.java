package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;

public class Teacher_Profile extends Teacher_Dashboard {
    JPanel detailsPanel;
    JLabel nameLabel, name;
    JLabel fieldLabel, field;
    JLabel experienceField, experience;
    JLabel ageLabel, age;
    JLabel qualificationLabel, qualification;
    JLabel emailLabel, email;
    Teacher curr;

    public Teacher_Profile(){

        curr = new Teacher((Teacher) Identify.account);

        detailsPanel = new JPanel();
        mainPanel.add(detailsPanel);
        detailsPanel.setBackground(new Color(0xD1D2D9));
        detailsPanel.setLayout(null);
        detailsPanel.setBounds(157, 157,1053, 375);

        nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        nameLabel.setBounds(13, 66, 50, 20);

        name = new JLabel();
        name.setFont(new Font("Roboto", Font.BOLD, 15));
        name.setText(curr.getUsername());
        name.setBounds(133, 66, 200, 20);


        emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        emailLabel.setBounds(13, 98, 60, 20);

        email = new JLabel();
        email.setFont(new Font("Roboto", Font.BOLD, 15));
        email.setText(curr.getEmail());
        email.setBounds(718, 206, 200, 20);

        fieldLabel = new JLabel("Field:");
        fieldLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        fieldLabel.setBounds(13, 128, 60, 20);

        field = new JLabel();
        field.setFont(new Font("Roboto", Font.BOLD, 15));
        field.setText(curr.getPassword());
        field.setBounds(718, 80, 200, 20);


        experienceField = new JLabel("Experience:");
        experienceField.setFont(new Font("Roboto", Font.PLAIN, 15));
        experienceField.setBounds(13, 160, 100, 20);

        experience = new JLabel();
        experience.setFont(new Font("Roboto", Font.BOLD, 15));
        experience.setText(curr.getExperience());
        experience.setBounds(290, 160, 200, 20);


        ageLabel = new JLabel("Age:");
        ageLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        ageLabel.setBounds(13, 194, 50, 20);

        age = new JLabel();
        age.setFont(new Font("Roboto", Font.BOLD, 15));
        age.setText(curr.getAge());
        age.setBounds(133, 194, 200, 20);


        qualificationLabel = new JLabel("CGPA:");
        qualificationLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        qualificationLabel.setBounds(13, 226, 50, 20);

        qualification = new JLabel();
        qualification.setFont(new Font("Roboto", Font.BOLD, 15));
        qualification.setText(curr.getQualification());
        qualification.setBounds(113, 226, 200, 20);







        detailsPanel.add(nameLabel);
        detailsPanel.add(fieldLabel);
        detailsPanel.add(experienceField);
        detailsPanel.add(ageLabel);
        detailsPanel.add(qualificationLabel);
        detailsPanel.add(emailLabel);

        detailsPanel.add(name);
        detailsPanel.add(field);
        detailsPanel.add(experience);
        detailsPanel.add(age);
        detailsPanel.add(qualification);
        detailsPanel.add(email);


        mainFrame.setVisible(true);
    }
}
