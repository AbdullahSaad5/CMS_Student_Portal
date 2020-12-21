package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student_Dashboard implements ActionListener {
    JFrame mainFrame;
    JPanel mainPanel, welcomePanel;
    JButton dashboard, regCard, fees, resultCard, profile, logOut;

    public Student_Dashboard(){
        mainFrame = new JFrame();
        mainFrame.setSize(1366, 768);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setTitle("CUOnline Portal Desktop Version");
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setBackground(new Color(0x1F2C4F));
        mainPanel.setLayout(null);
        mainFrame.add(mainPanel, BorderLayout.CENTER);


        welcomePanel = new JPanel();
        welcomePanel.setBackground(new Color(0x0898A0));
        welcomePanel.setBounds(0, 0, 1366, 25);
        mainPanel.add(welcomePanel);


        // Adding dashboard button
//        "<html><p style='style='text-align: left'>Dashboard</p></html>"
        dashboard = new JButton("Dashboard");
        mainPanel.add(dashboard);
        dashboard.setBounds(607, 48, 64, 71);
        dashboard.setFont(new Font("Roboto", Font.BOLD, 6));
        dashboard.setFocusable(false);
        dashboard.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/dashboard.png")));
        dashboard.setVerticalTextPosition(JLabel.BOTTOM);
        dashboard.setHorizontalTextPosition(JLabel.CENTER);
        dashboard.setMargin(null);
        dashboard.setBackground(Color.WHITE);

        // Adding registration card button
        regCard = new JButton("<html><p style='text-align:center'>Registration<br>Card</p></html>");
        mainPanel.add(regCard);
        regCard.setBounds(679, 48, 64, 71);
        regCard.setFont(new Font("Roboto", Font.BOLD, 7));
        regCard.setFocusable(false);
        regCard.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/RegistrationCard.png")));
        regCard.setHorizontalAlignment(JLabel.TRAILING);
        regCard.setHorizontalTextPosition(JLabel.CENTER);
        regCard.setVerticalTextPosition(JLabel.BOTTOM);

        regCard.setBackground(Color.WHITE);

        // Adding fee button
        fees = new JButton("Fees");
        mainPanel.add(fees);
        fees.setBounds(751, 48, 64, 71);
        fees.setFont(new Font("Roboto", Font.BOLD, 8));
        fees.setFocusable(false);
        fees.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/feesIcon1.png")));
        fees.setHorizontalTextPosition(JLabel.CENTER);
        fees.setVerticalTextPosition(JLabel.BOTTOM);
        fees.setBackground(Color.WHITE);

        // Adding result card button
        resultCard = new JButton("<html><p style='text-align:center'>Result<br>Card</p></html>");
        mainPanel.add(resultCard);
        resultCard.setBounds(822, 48, 64, 71);
        resultCard.setFont(new Font("Roboto", Font.BOLD, 7));
        resultCard.setFocusable(false);
        resultCard.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/resultCard.png")));
        resultCard.setHorizontalTextPosition(JLabel.CENTER);
        resultCard.setVerticalTextPosition(JLabel.BOTTOM);
        resultCard.setBackground(Color.WHITE);
        regCard.setHorizontalAlignment(JLabel.TRAILING);


        // Adding profile button
        profile = new JButton("Profile");
        mainPanel.add(profile);
        profile.setBounds(894, 48, 64, 71);
        profile.setFont(new Font("Roboto", Font.BOLD, 8));
        profile.setFocusable(false);
        profile.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/profile.png")));
        profile.setHorizontalTextPosition(JLabel.CENTER);
        profile.setVerticalTextPosition(JLabel.BOTTOM);
        profile.addActionListener(this);
        profile.setBackground(Color.WHITE);

        // Adding logout button
        logOut = new JButton("Logout");
        mainPanel.add(logOut);
        logOut.setBounds(966, 48, 64, 71);
        logOut.setFont(new Font("Roboto", Font.BOLD, 8));
        logOut.setFocusable(false);
        logOut.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/logOut.png")));
        logOut.setHorizontalTextPosition(JLabel.CENTER);
        logOut.setVerticalTextPosition(JLabel.BOTTOM);
        logOut.addActionListener(this);
        logOut.setBackground(Color.WHITE);

        JLabel image = new JLabel();
        mainPanel.add(image);
        image.setBounds(170, 42, 309, 93);
        image.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/logo_with_text.png")));

        JLabel user = new JLabel();
        mainPanel.add(user);
        user.setBounds(1097, 29, 113, 113);
        user.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/user.png")));



        JLabel background = new JLabel();
        background.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Student Portal/background.jpg")));
        background.setBounds(0,0, 1366, 768);
        mainPanel.add(background);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == logOut){
            logOut.setBackground(new Color(0x13A89E));
            logOut.setForeground(Color.WHITE);
            new Login();
            mainFrame.dispose();
        }
        else if(e.getSource() == profile){
            new Student_Profile();
            mainFrame.dispose();
        }
    }
}
