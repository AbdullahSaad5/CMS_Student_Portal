package CMS_Student_Portal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Thread.sleep;

public class SignUp extends Template implements ActionListener {
    JPanel mainPanel;
    JTextField userField;
    JPasswordField passField;
    JLabel userLabel, passLabel, loginLabel, success;
    JButton signUpButton;

    public SignUp(){
        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(200, 200));
        mainPanel.setLayout(null);
        mainFrame.add(mainPanel, BorderLayout.CENTER);
        backButton.setEnabled(true);
        backButton.addActionListener(this);


        success = new JLabel("");
        success.setFont(new Font("Roboto", Font.BOLD, 15));
        mainPanel.add(success);

        loginLabel = new JLabel("Create a new Account");
        loginLabel.setFont(new Font("Roboto", Font.BOLD + Font.ITALIC, 20));
        loginLabel.setBounds(570, 33, 225, 30);
        mainPanel.add(loginLabel);

        userLabel = new JLabel("Username:");
        passLabel = new JLabel("Password:");
        userField = new JTextField();
        passField = new JPasswordField();
        mainFrame.add(mainPanel);

        mainPanel.add(userField);
        userField.setBounds(660, 91, 150, 20);
        mainPanel.add(userLabel);
        userLabel.setBounds(560, 91, 100, 20);
        mainPanel.add(passField);
        passField.setBounds(660, 140, 150, 20);
        mainPanel.add(passLabel);
        passLabel.setBounds(560, 140, 100, 20);

        signUpButton = new JButton("Sign Up");
        mainPanel.add(signUpButton);
        signUpButton.setBounds(636, 194, 100, 20);
        signUpButton.setFocusable(false);
        signUpButton.addActionListener(this);


        mainFrame.setVisible(true);

    }


    private void checkSignup(){
        if (userField.getText().length() == 0 || passField.getText().length() == 0) {
        success.setText("Signup Failed!");
        success.setForeground(new Color(255, 0, 0));
        success.setBounds(636, 250, 150, 20);

        }
        else if (checkUsername(userField.getText()) && checkPassword(passField.getText())) {
        success.setText("Signup Successful!");
        success.setForeground(new Color(0, 255, 0));
        success.setBounds(622, 250, 150, 20);

        new SignUp_Details();
        mainFrame.dispose();

        }
        else if (checkUsername(userField.getText())) {
        success.setText("<html>" +
                "<body>" +
                "<p>" +
                "<ul>" +
                "Invalid Password<br><br>" +
                "Password must contain: <br>" +
                "<li>At least 6 character</li>" +
                "<li>At least one special character <br></li>" +
                "<li>At least one uppercase and lowercase letter <br></li>" +
                "<ul>" +
                "<p>" +
                "</body>" +
                "</html>");
        success.setForeground(new Color(0x052EAA));
        success.setBounds(560, 250, 350, 150);
        }
        else {
        success.setText("Signup Failed!");
        success.setForeground(new Color(255, 0, 0));
        success.setBounds(636, 250, 150, 20);

        }
    }

    private boolean checkUsername(String username) {
        for (int i = 0; i < username.length(); i++) {
            char curr = username.charAt(i);
            if (!Character.isLetterOrDigit(curr)) {
                return false;
            }
        }
        return true;
    }


    private boolean checkPassword(String password) {
        if (password.length() <= 6) {
            return false;
        }
        if (password.toLowerCase().equals(password)) {
            return false;
        }
        if (password.toUpperCase().equals(password)) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            char curr = password.charAt(i);
            if (!Character.isLetterOrDigit(curr)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == signUpButton) {
            checkSignup();
        }
        else{
            new LoginOrSignup();
            mainFrame.dispose();
        }
    }
}
