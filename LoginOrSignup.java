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
        identityLabel.setBounds(612, 124, 200, 25);
        mainPanel.setLayout(null);
        mainPanel.add(identityLabel);


        loginButton = new JButton("Login");
        mainPanel.add(loginButton);
        loginButton.setFocusable(false);
        loginButton.setBounds(508, 184, 150, 30);
        loginButton.setFont(new Font("Roboto", Font.PLAIN, 16));

        signupButton = new JButton("Signup");
        mainPanel.add(signupButton);
        signupButton.setFocusable(false);
        signupButton.setBounds(708, 184, 150, 30);
        signupButton.setFont(new Font("Roboto", Font.PLAIN, 16));

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