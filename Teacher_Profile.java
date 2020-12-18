package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;

public class Teacher_Profile extends Teacher_Dashboard {
    JPanel interfacePanel;
    JLabel nameLabel, name;
    JLabel fieldLabel, field;
    JLabel experienceField, experience;
    JLabel ageLabel, age;
    JLabel qualificationLabel, qualification;
    JLabel homeLabel, home;
    JLabel busLabel, bus;
    Teacher curr;

    public Teacher_Profile(){

        curr = new Teacher((Teacher) Identify.account);
        interfacePanel = new JPanel();
        interfacePanel.setLayout(null);
        mainPanel.add(interfacePanel);
        interfacePanel.setBounds(0, 88, 1366, 430);

        nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        nameLabel.setBounds(598, 48, 50, 20);

        name = new JLabel();
        name.setFont(new Font("Roboto", Font.BOLD, 15));
        name.setText(curr.getUsername());
        name.setBounds(718, 48, 200, 20);

        fieldLabel = new JLabel("Reg No:");
        fieldLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        fieldLabel.setBounds(598, 80, 60, 20);

        field = new JLabel();
        field.setFont(new Font("Roboto", Font.BOLD, 15));
        field.setText(curr.getPassword());
        field.setBounds(718, 80, 200, 20);


        experienceField = new JLabel("Semester:");
        experienceField.setFont(new Font("Roboto", Font.PLAIN, 15));
        experienceField.setBounds(598, 110, 100, 20);

        experience = new JLabel();
        experience.setFont(new Font("Roboto", Font.BOLD, 15));
        experience.setText(curr.getExperience());
        experience.setBounds(718, 110, 200, 20);


        ageLabel = new JLabel("Age:");
        ageLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        ageLabel.setBounds(598, 142, 50, 20);

        age = new JLabel();
        age.setFont(new Font("Roboto", Font.BOLD, 15));
        age.setText(curr.getAge());
        age.setBounds(718, 142, 200, 20);


        qualificationLabel = new JLabel("CGPA:");
        qualificationLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        qualificationLabel.setBounds(598, 174, 50, 20);

        qualification = new JLabel();
        qualification.setFont(new Font("Roboto", Font.BOLD, 15));
        qualification.setText(curr.getQualification());
        qualification.setBounds(718, 174, 200, 20);

//
//        homeLabel = new JLabel("Home City:");
//        homeLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
//        homeLabel.setBounds(598, 206, 100, 20);
//
//        home = new JLabel();
//        home.setFont(new Font("Roboto", Font.BOLD, 15));
//        home.setText(curr.getHomeCity());
//        home.setBounds(718, 206, 200, 20);
//
//
//        busLabel = new JLabel("Bus Facility:");
//        busLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
//        busLabel.setBounds(598, 238, 100, 20);
//
//        bus = new JLabel();
//        bus.setFont(new Font("Roboto", Font.BOLD, 15));
//        bus.setText(curr.getBusFacility());
//        bus.setBounds(718, 238, 200, 20);



        interfacePanel.add(nameLabel);
        interfacePanel.add(fieldLabel);
        interfacePanel.add(experienceField);
        interfacePanel.add(ageLabel);
        interfacePanel.add(qualificationLabel);
//        interfacePanel.add(homeLabel);
//        interfacePanel.add(busLabel);

        interfacePanel.add(name);
        interfacePanel.add(field);
        interfacePanel.add(experience);
        interfacePanel.add(age);
        interfacePanel.add(qualification);
//        interfacePanel.add(home);
//        interfacePanel.add(bus);


        mainFrame.setVisible(true);
    }
}
