package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Interface extends Template implements ActionListener {
    JPanel mainPanel;
    JButton dashboard, regCard, fees, resultCard, profile, logOut;
    public Main_Interface(){
        // Setting main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainFrame.add(mainPanel, BorderLayout.CENTER);
        backButton.setVisible(false);

        // Adding dashboard button
        dashboard = new JButton("Dashboard");
        mainPanel.add(dashboard);
        dashboard.setBounds(398, 22, 75, 65);
        dashboard.setFont(new Font("Roboto", Font.BOLD, 8));
        dashboard.setFocusable(false);
        dashboard.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/dashboard.png")));
        dashboard.setHorizontalTextPosition(JLabel.CENTER);
        dashboard.setVerticalTextPosition(JLabel.BOTTOM);

        // Adding registration card button
        regCard = new JButton("<html><div style='text-align: center;'>" + "Registration <br> Card" + "</div></html>");
        mainPanel.add(regCard);
        regCard.setBounds(498, 22, 75, 65);
        regCard.setFont(new Font("Roboto", Font.BOLD, 8));
        regCard.setFocusable(false);
        regCard.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/RegistrationCard.png")));
        regCard.setHorizontalTextPosition(JLabel.CENTER);
        regCard.setVerticalTextPosition(JLabel.BOTTOM);

        // Adding fee button
        fees = new JButton("Fees");
        mainPanel.add(fees);
        fees.setBounds(598, 22, 75, 65);
        fees.setFont(new Font("Roboto", Font.BOLD, 8));
        fees.setFocusable(false);
        fees.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/feesIcon1.png")));
        fees.setHorizontalTextPosition(JLabel.CENTER);
        fees.setVerticalTextPosition(JLabel.BOTTOM);

        // Adding result card button
        resultCard = new JButton("Result Card");
        mainPanel.add(resultCard);
        resultCard.setBounds(698, 22, 75, 65);
        resultCard.setFont(new Font("Roboto", Font.BOLD, 8));
        resultCard.setFocusable(false);
        resultCard.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/resultCard.png")));
        resultCard.setHorizontalTextPosition(JLabel.CENTER);
        resultCard.setVerticalTextPosition(JLabel.BOTTOM);

        // Adding profile button
        profile = new JButton("Profile");
        mainPanel.add(profile);
        profile.setBounds(798, 22, 75, 65);
        profile.setFont(new Font("Roboto", Font.BOLD, 8));
        profile.setFocusable(false);
        profile.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/profile.png")));
        profile.setHorizontalTextPosition(JLabel.CENTER);
        profile.setVerticalTextPosition(JLabel.BOTTOM);
        profile.addActionListener(this);

        // Adding logout button
        logOut = new JButton("Logout");
        mainPanel.add(logOut);
        logOut.setBounds(898, 22, 75, 65);
        logOut.setFont(new Font("Roboto", Font.BOLD, 8));
        logOut.setFocusable(false);
        logOut.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/logOut.png")));
        logOut.setHorizontalTextPosition(JLabel.CENTER);
        logOut.setVerticalTextPosition(JLabel.BOTTOM);

        logOut.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == logOut){
            new Login();
            mainFrame.dispose();
        }
        else if(e.getSource() == profile){
            new Profile();
            mainFrame.dispose();
        }
    }
}
