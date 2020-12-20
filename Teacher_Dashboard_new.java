package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teacher_Dashboard_new implements ActionListener {
    JFrame mainFrame;
    JPanel mainPanel, logoutPanel;
    JButton home, myDocs, groups, reports, quizzes, bank, gradedDiscussion, moderateDiscussion, assignments, notifications, logout;
    JLabel homeLabel, docsLabel, groupsLabel, reportsLabel, quizzesLabel, bankLabel, gradedLabel, moderateLabel, assignmentsLabel, notificationsLabel;
    public Teacher_Dashboard_new(){
        mainFrame = new JFrame();
        mainFrame.setSize(1366, 768);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setTitle("CUOnline Portal Desktop Version");
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setBackground(new Color(0x1E214A));
        mainPanel.setLayout(null);
        mainFrame.add(mainPanel, BorderLayout.CENTER);

        logoutPanel = new JPanel();
        logoutPanel.setBackground(new Color(0x0898A0));
        logoutPanel.setLayout(null);
        logoutPanel.setBounds(0, 0, 1366, 35);
        mainPanel.add(logoutPanel);

        logout = new JButton("Logout");
        logout.setFont(new Font("Roboto", Font.PLAIN, 15));
        logout.setForeground(Color.WHITE);
        logout.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/logoutTeacher.png")));
        logout.setBounds(1169, 0, 130, 35);
        logout.setBorder(null);
        logout.setFocusable(false);
        logout.setBackground(null);
        logout.setHorizontalTextPosition(JLabel.LEFT);
        logout.setVerticalTextPosition(JLabel.CENTER);
        logoutPanel.add(logout);



        // Adding dashboard button
        home = new JButton();
        mainPanel.add(home);
        home.setBounds(564, 43, 61, 61);
        home.setFocusable(false);
        home.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/home2.png")));
        home.setVerticalTextPosition(JLabel.BOTTOM);
        home.setHorizontalTextPosition(JLabel.CENTER);
        home.setMargin(null);
        home.setBackground(Color.WHITE);


        // Adding registration card button
        myDocs = new JButton();
        mainPanel.add(myDocs);
        myDocs.setBounds(634, 43, 61, 61);
        myDocs.setFont(new Font("Roboto", Font.BOLD, 8));
        myDocs.setFocusable(false);
        myDocs.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/Note2.png")));
        myDocs.setHorizontalTextPosition(JLabel.CENTER);
        myDocs.setVerticalTextPosition(JLabel.BOTTOM);
        myDocs.setBackground(Color.WHITE);


        // Adding fee button
        groups = new JButton();
        mainPanel.add(groups);
        groups.setBounds(705, 43, 61, 61);
        groups.setFont(new Font("Roboto", Font.BOLD, 8));
        groups.setFocusable(false);
        groups.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/Group2.png")));
        groups.setHorizontalTextPosition(JLabel.CENTER);
        groups.setVerticalTextPosition(JLabel.BOTTOM);
        groups.setBackground(Color.WHITE);

        // Adding result card button
        reports = new JButton();
        mainPanel.add(reports);
        reports.setBounds(775, 43, 61, 61);
        reports.setFont(new Font("Roboto", Font.BOLD, 6));
        reports.setFocusable(false);
        reports.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/trend2.png")));
        reports.setHorizontalTextPosition(JLabel.CENTER);
        reports.setVerticalTextPosition(JLabel.BOTTOM);
        reports.setBackground(Color.WHITE);

        // Adding profile button
        quizzes = new JButton();
        mainPanel.add(quizzes);
        quizzes.setBounds(845, 43, 61, 61);
        quizzes.setFont(new Font("Roboto", Font.BOLD, 8));
        quizzes.setFocusable(false);
        quizzes.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/Quiz2.png")));
        quizzes.setHorizontalTextPosition(JLabel.CENTER);
        quizzes.setVerticalTextPosition(JLabel.BOTTOM);
        quizzes.addActionListener(this);
        quizzes.setBackground(Color.WHITE);

        // Adding logout button
        bank = new JButton();
        mainPanel.add(bank);
        bank.setBounds(915, 43, 61, 61);
        bank.setFont(new Font("Roboto", Font.BOLD, 8));
        bank.setFocusable(false);
        bank.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/Quiz2.png")));
        bank.setHorizontalTextPosition(JLabel.CENTER);
        bank.setVerticalTextPosition(JLabel.BOTTOM);
        bank.addActionListener(this);
        bank.setBackground(Color.WHITE);


        gradedDiscussion = new JButton();
        mainPanel.add(gradedDiscussion);
        gradedDiscussion.setBounds(985, 43, 61, 61);
        gradedDiscussion.setFont(new Font("Roboto", Font.BOLD, 8));
        gradedDiscussion.setFocusable(false);
        gradedDiscussion.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/Graded Discussion2.png")));
        gradedDiscussion.setHorizontalTextPosition(JLabel.CENTER);
        gradedDiscussion.setVerticalTextPosition(JLabel.BOTTOM);
        gradedDiscussion.addActionListener(this);
        gradedDiscussion.setBackground(Color.WHITE);


        moderateDiscussion = new JButton();
        mainPanel.add(moderateDiscussion);
        moderateDiscussion.setBounds(1055, 43, 61, 61);
        moderateDiscussion.setFont(new Font("Roboto", Font.BOLD, 8));
        moderateDiscussion.setFocusable(false);
        moderateDiscussion.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/Discussion2.png")));
        moderateDiscussion.setHorizontalTextPosition(JLabel.CENTER);
        moderateDiscussion.setVerticalTextPosition(JLabel.BOTTOM);
        moderateDiscussion.addActionListener(this);
        moderateDiscussion.setBackground(Color.WHITE);


        notifications = new JButton();
        mainPanel.add(notifications);
        notifications.setBounds(1125, 43, 61, 61);
        notifications.setFont(new Font("Roboto", Font.BOLD, 8));
        notifications.setFocusable(false);
        notifications.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/Notifications2.png")));
        notifications.setHorizontalTextPosition(JLabel.CENTER);
        notifications.setVerticalTextPosition(JLabel.BOTTOM);
        notifications.addActionListener(this);
        notifications.setBackground(Color.WHITE);


        assignments = new JButton();
        mainPanel.add(assignments);
        assignments.setBounds(1195, 43, 61, 61);
        assignments.setFont(new Font("Roboto", Font.BOLD, 8));
        assignments.setFocusable(false);
        assignments.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Teacher Portal/Silver/Assignments2.png")));
        assignments.setHorizontalTextPosition(JLabel.CENTER);
        assignments.setVerticalTextPosition(JLabel.BOTTOM);
        assignments.addActionListener(this);
        assignments.setBackground(Color.WHITE);


        homeLabel = new JLabel("Home");
        homeLabel.setBounds(579, 108, 35, 20);
        homeLabel.setFont(new Font("Roboto", Font.PLAIN, 12));
        homeLabel.setForeground(new Color(0xBDBEC2));
        mainPanel.add(homeLabel);


        docsLabel = new JLabel("My Docs");
        docsLabel.setBounds(642, 108, 50, 20);
        docsLabel.setFont(new Font("Roboto", Font.PLAIN, 12));
        docsLabel.setForeground(new Color(0xBDBEC2));
        mainPanel.add(docsLabel);



        groupsLabel = new JLabel("Groups");
        groupsLabel.setBounds(717, 108, 50, 20);
        groupsLabel.setFont(new Font("Roboto", Font.PLAIN, 12));
        groupsLabel.setForeground(new Color(0xBDBEC2));
        mainPanel.add(groupsLabel);



        reportsLabel = new JLabel("Reports");
        reportsLabel.setBounds(784, 108, 50, 20);
        reportsLabel.setFont(new Font("Roboto", Font.PLAIN, 12));
        reportsLabel.setForeground(new Color(0xBDBEC2));
        mainPanel.add(reportsLabel);



        quizzesLabel = new JLabel("Quizzes");
        quizzesLabel.setBounds(856, 108, 50, 20);
        quizzesLabel.setFont(new Font("Roboto", Font.PLAIN, 12));
        quizzesLabel.setForeground(new Color(0xBDBEC2));
        mainPanel.add(quizzesLabel);



        bankLabel = new JLabel("<html><p style='text-align: center'>Manage Quiz<br>Bank<p><html>");
        bankLabel.setBounds(912, 108, 80, 30);
        bankLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
        bankLabel.setForeground(new Color(0xBDBEC2));
        mainPanel.add(bankLabel);



        gradedLabel = new JLabel("<html><p style='text-align: center'>Graded<br>Discussion<br>Board<p><html>");
        gradedLabel.setBounds(987, 108, 60, 45);
        gradedLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
        gradedLabel.setForeground(new Color(0xBDBEC2));
        mainPanel.add(gradedLabel);



        moderateLabel = new JLabel("<html><p style='text-align: center'>Moderate<br>Discussion<br>Board<p><html>");
        moderateLabel.setBounds(1058, 108, 70, 45);
        moderateLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
        moderateLabel.setForeground(new Color(0xBDBEC2));
        mainPanel.add(moderateLabel);



        notificationsLabel = new JLabel("Notifications");
        notificationsLabel.setBounds(1122, 108, 70, 20);
        notificationsLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
        notificationsLabel.setForeground(new Color(0xBDBEC2));
        mainPanel.add(notificationsLabel);



        assignmentsLabel = new JLabel("Assignments");
        assignmentsLabel.setBounds(1192, 108, 75, 20);
        assignmentsLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
        assignmentsLabel.setForeground(new Color(0xBDBEC2));
        mainPanel.add(assignmentsLabel);

        JLabel image = new JLabel();
        mainPanel.add(image);
        image.setBounds(170, 42, 309, 93);
        image.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/logo_with_text.png")));

        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bank){
            new Login();
            mainFrame.dispose();
        }
        else if(e.getSource() == notifications){
            new Teacher_Profile();
            mainFrame.dispose();
        }
    }
}
