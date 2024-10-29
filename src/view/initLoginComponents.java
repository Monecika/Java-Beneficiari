package view;

import javax.swing.*;
import java.awt.*;

public class initLoginComponents {
    private JLabel logo;
    private JPanel headerPanel;

    private JLabel welcomeBackLabel;
    private JLabel enterLoginData;
    private JLabel username;
    private TextField usernameField;
    private JLabel password;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel leftPanel;

    public JPanel initHeader(ImageIcon darkIcon) {
        logo = new JLabel("Logo");
        JButton darkThemeIconLabel = new JButton(darkIcon);
        darkThemeIconLabel.setContentAreaFilled(false);
        darkThemeIconLabel.setFocusPainted(false);
        darkThemeIconLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 15));

        headerPanel = new JPanel(new BorderLayout());
        JPanel logoPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        logoPanel.add(logo);
        headerPanel.add(logoPanel, BorderLayout.CENTER);
        headerPanel.add(darkThemeIconLabel, BorderLayout.EAST);

        return headerPanel;
    }

    public JPanel initLeftPanel(){
        leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        welcomeBackLabel = new JLabel("Welcome Back");
        welcomeBackLabel.setForeground(Color.GREEN);
        enterLoginData = new JLabel("Enter Login Data");
        username = new JLabel("Username");
        usernameField = new TextField();
        password = new JLabel("Password");
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.GREEN);

        leftPanel.add(welcomeBackLabel);
        leftPanel.add(enterLoginData);
        leftPanel.add(username);
        leftPanel.add(usernameField);
        leftPanel.add(password);
        leftPanel.add(passwordField);
        leftPanel.add(loginButton);

        return leftPanel;
    }
}
