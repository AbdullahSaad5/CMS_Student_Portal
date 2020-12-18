package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;

public class Student_Profile extends Student_Dashboard {
    JPanel interfacePanel;
    JLabel nameLabel, name;
    JLabel regLabel, regNo;
    JLabel semLabel, sem;
    JLabel ageLabel, age;
    JLabel gpaLabel, gpa;
    JLabel homeLabel, home;
    JLabel busLabel, bus;
    Student curr;

    public Student_Profile(){

        curr = new Student((Student) Identify.account);
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

        regLabel = new JLabel("Reg No:");
        regLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        regLabel.setBounds(598, 80, 60, 20);

        regNo = new JLabel();
        regNo.setFont(new Font("Roboto", Font.BOLD, 15));
        regNo.setText(curr.getPassword());
        regNo.setBounds(718, 80, 200, 20);


        semLabel = new JLabel("Semester:");
        semLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        semLabel.setBounds(598, 110, 100, 20);

        sem = new JLabel();
        sem.setFont(new Font("Roboto", Font.BOLD, 15));
        sem.setText(curr.getSemester());
        sem.setBounds(718, 110, 200, 20);


        ageLabel = new JLabel("Age:");
        ageLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        ageLabel.setBounds(598, 142, 50, 20);

        age = new JLabel();
        age.setFont(new Font("Roboto", Font.BOLD, 15));
        age.setText(curr.getAge());
        age.setBounds(718, 142, 200, 20);


        gpaLabel = new JLabel("CGPA:");
        gpaLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        gpaLabel.setBounds(598, 174, 50, 20);

        gpa = new JLabel();
        gpa.setFont(new Font("Roboto", Font.BOLD, 15));
        gpa.setText(curr.getCGPA());
        gpa.setBounds(718, 174, 200, 20);


        homeLabel = new JLabel("Home City:");
        homeLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        homeLabel.setBounds(598, 206, 100, 20);

        home = new JLabel();
        home.setFont(new Font("Roboto", Font.BOLD, 15));
        home.setText(curr.getHomeCity());
        home.setBounds(718, 206, 200, 20);


        busLabel = new JLabel("Bus Facility:");
        busLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        busLabel.setBounds(598, 238, 100, 20);

        bus = new JLabel();
        bus.setFont(new Font("Roboto", Font.BOLD, 15));
        bus.setText(curr.getBusFacility());
        bus.setBounds(718, 238, 200, 20);



        interfacePanel.add(nameLabel);
        interfacePanel.add(regLabel);
        interfacePanel.add(semLabel);
        interfacePanel.add(ageLabel);
        interfacePanel.add(gpaLabel);
        interfacePanel.add(homeLabel);
        interfacePanel.add(busLabel);

        interfacePanel.add(name);
        interfacePanel.add(regNo);
        interfacePanel.add(sem);
        interfacePanel.add(age);
        interfacePanel.add(gpa);
        interfacePanel.add(home);
        interfacePanel.add(bus);


        mainFrame.setVisible(true);
    }
}
