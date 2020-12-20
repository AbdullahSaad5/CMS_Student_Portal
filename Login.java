package CMS_Student_Portal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Login extends Template implements ActionListener {
    JPanel mainPanel;
    JTextField userField;
    JPasswordField passField;
    JLabel userLabel, passLabel, loginLabel, success;
    JButton loginButton;
    public Login(){
        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(200, 200));
        mainPanel.setLayout(null);
        mainFrame.add(mainPanel, BorderLayout.CENTER);
        backButton.setEnabled(true);
        backButton.addActionListener(this);

        success = new JLabel("");
        success.setFont(new Font("Roboto", Font.PLAIN, 15));
        mainPanel.add(success);

        loginLabel = new JLabel("Log In To Your Account");
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

        loginButton = new JButton("Login");
        loginButton.setBounds(633, 194, 100, 20);
        loginButton.setFocusable(false);
        mainPanel.add(loginButton);
        loginButton.addActionListener(this);


        mainFrame.setVisible(true);
    }

    private Student getAccountS(){
        ArrayList<Student> list1 = Student.readStudentRecord();
        for (Student curr: list1){
            if(curr.getUsername().equals(userField.getText()) && curr.getPassword().equals(passField.getText())){
                return curr;
            }
        }
        return null;
    }

    private Teacher getAccountT(){
        ArrayList<Teacher> list2 = Teacher.readTeacherRecord();
        for (Teacher curr: list2){
            if(curr.getUsername().equals(userField.getText()) && curr.getPassword().equals(passField.getText())){
                return curr;
            }
        }
        return null;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == loginButton && Identify.isTeacher) {
                Teacher curr = getAccountT();
                if (curr != null) {
                    Identify.account = curr;
                    new LoadingScreen();
                    mainFrame.dispose();

                }
            }
            else if(e.getSource() == loginButton && !Identify.isTeacher) {
                    Student curr = getAccountS();
                    if(curr != null){
                        Identify.account = curr;
                        new LoadingScreen();
                        mainFrame.dispose();
                    }

            else {
                success.setText("Invalid Login Credentials");
                success.setForeground(new Color(255, 0, 0));
                success.setBounds(596, 254, 200, 20);
            }
        }
        else {
            new LoginOrSignup();
            mainFrame.dispose();
        }
    }
}
