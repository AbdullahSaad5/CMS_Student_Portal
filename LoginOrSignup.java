package CMS_Student_Portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginOrSignup extends Template implements ActionListener {
    JPanel mainPanel;
    JLabel identityLabel;
    JButton loginButton, signupButton;
    public LoginOrSignup() {
        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(200, 200));
        mainFrame.add(mainPanel, BorderLayout.CENTER);
        backButton.setEnabled(true);
        backButton.addActionListener(this);

        identityLabel = new JLabel("Login or Signup");
        identityLabel.setFont(new Font("Roboto", Font.BOLD, 20));
        identityLabel.setBounds(612, 54, 200, 25);
        mainPanel.setLayout(null);
        mainPanel.add(identityLabel);


        loginButton = new JButton("Login");
        mainPanel.add(loginButton);
        loginButton.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/Login2.png")));
        loginButton.setFocusable(false);
        loginButton.setBounds(508, 124, 110, 110);
        loginButton.setFont(new Font("Roboto", Font.PLAIN, 16));
        loginButton.setHorizontalTextPosition(JLabel.CENTER);
        loginButton.setVerticalTextPosition(JLabel.BOTTOM);
        loginButton.setBackground(new Color(0, 184, 15, 128));

        signupButton = new JButton("Signup");
        mainPanel.add(signupButton);
        signupButton.setIcon(new ImageIcon(getClass().getResource("/CMS_Icons/Additional Icons/Signup.png")));
        signupButton.setFocusable(false);
        signupButton.setBounds(738, 124, 110, 110);
        signupButton.setFont(new Font("Roboto", Font.PLAIN, 16));
        signupButton.setHorizontalTextPosition(JLabel.CENTER);
        signupButton.setVerticalTextPosition(JLabel.BOTTOM);
        signupButton.setBackground(new Color(184, 121, 1, 128));


        signupButton.addActionListener(this);
        loginButton.addActionListener(this);

        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton){
            new Login();
        }
        else if(e.getSource() == signupButton){
            new SignUp();
        }
        else{
            new Identify();
        }
    mainFrame.dispose();
    }
}