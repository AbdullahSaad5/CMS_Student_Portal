package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student_Dashboard_new implements ActionListener {
    JFrame mainFrame;
    JPanel mainPanel;
    JButton dashboard, regCard, fees, resultCard, profile, logOut;

    public Student_Dashboard_new(){
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


        // Adding dashboard button
//        "<html><p style='style='text-align: left'>Dashboard</p></html>"
        dashboard = new JButton("Dashboard");
        mainPanel.add(dashboard);
        dashboard.setBounds(607, 48, 64, 71);
        dashboard.setFont(new Font("Roboto", Font.BOLD, 6));
        dashboard.setFocusable(false);
        dashboard.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/dashboard.png")));
        dashboard.setVerticalTextPosition(JLabel.BOTTOM);
        dashboard.setHorizontalTextPosition(JLabel.CENTER);
        dashboard.setMargin(null);

        // Adding registration card button
        regCard = new JButton("<html>Registration<br>Card</html>");
        mainPanel.add(regCard);
        regCard.setBounds(679, 48, 64, 71);
        regCard.setFont(new Font("Roboto", Font.BOLD, 8));
        regCard.setFocusable(false);
        regCard.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/RegistrationCard.png")));
        regCard.setHorizontalTextPosition(JLabel.CENTER);
        regCard.setVerticalTextPosition(JLabel.BOTTOM);

        // Adding fee button
        fees = new JButton("Fees");
        mainPanel.add(fees);
        fees.setBounds(751, 48, 64, 71);
        fees.setFont(new Font("Roboto", Font.BOLD, 8));
        fees.setFocusable(false);
        fees.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/feesIcon1.png")));
        fees.setHorizontalTextPosition(JLabel.CENTER);
        fees.setVerticalTextPosition(JLabel.BOTTOM);

        // Adding result card button
        resultCard = new JButton("Result Card");
        mainPanel.add(resultCard);
        resultCard.setBounds(822, 48, 64, 71);
        resultCard.setFont(new Font("Roboto", Font.BOLD, 6));
        resultCard.setFocusable(false);
        resultCard.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/resultCard.png")));
        resultCard.setHorizontalTextPosition(JLabel.CENTER);
        resultCard.setVerticalTextPosition(JLabel.BOTTOM);

        // Adding profile button
        profile = new JButton("Profile");
        mainPanel.add(profile);
        profile.setBounds(894, 48, 64, 71);
        profile.setFont(new Font("Roboto", Font.BOLD, 8));
        profile.setFocusable(false);
        profile.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/profile.png")));
        profile.setHorizontalTextPosition(JLabel.CENTER);
        profile.setVerticalTextPosition(JLabel.BOTTOM);
        profile.addActionListener(this);

        // Adding logout button
        logOut = new JButton("Logout");
        mainPanel.add(logOut);
        logOut.setBounds(966, 48, 64, 71);
        logOut.setFont(new Font("Roboto", Font.BOLD, 8));
        logOut.setFocusable(false);
        logOut.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/logOut.png")));
        logOut.setHorizontalTextPosition(JLabel.CENTER);
        logOut.setVerticalTextPosition(JLabel.BOTTOM);
        logOut.addActionListener(this);

        JLabel image = new JLabel();
        mainPanel.add(image);
        image.setBounds(170, 42, 309, 93);
        image.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/logo_with_text.png")));

        JLabel user = new JLabel();
        mainPanel.add(user);
        user.setBounds(1097, 29, 113, 113);
        user.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/user.png")));

        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == logOut){
            new Login();
            mainFrame.dispose();
        }
        else if(e.getSource() == profile){
            new Student_Profile();
            mainFrame.dispose();
        }
    }
}
