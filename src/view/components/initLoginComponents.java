package view;

import javax.swing.*;
import java.awt.*;

public class initLoginComponents {
    private JLabel logo;
    private JPanel headerPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;

    public JPanel initHeader(ImageIcon darkIcon) {
        logo = new JLabel("LOGO", SwingConstants.CENTER);
        logo.setFont(new Font("SansSerif", Font.BOLD, 24));

        JButton darkThemeIconLabel = new JButton(darkIcon);
        darkThemeIconLabel.setContentAreaFilled(false);
        darkThemeIconLabel.setFocusPainted(false);
        darkThemeIconLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 15));

        headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        headerPanel.add(logo, BorderLayout.CENTER);
        headerPanel.add(darkThemeIconLabel, BorderLayout.EAST);

        return headerPanel;
    }

    public JPanel initLeftPanel() {
        leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        leftPanel.setPreferredSize(new Dimension(300, 400));

        JLabel welcomeBackLabel = new JLabel("Welcome Back");
        welcomeBackLabel.setForeground(new Color(0, 150, 0));
        welcomeBackLabel.setFont(new Font("SansSerif", Font.BOLD, 20));

        JLabel enterLoginData = new JLabel("Enter the credentials to login");
        enterLoginData.setFont(new Font("SansSerif", Font.PLAIN, 14));

        JLabel username = new JLabel("Username");
        JTextField usernameField = new JTextField(20);
        usernameField.setMaximumSize(new Dimension(500, 25));

        JLabel password = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setMaximumSize(new Dimension(500, 25));

        JLabel email = new JLabel("Email");
        JTextField emailField = new JTextField(20);
        emailField.setMaximumSize(new Dimension(500, 25));

        JButton loginButton = new JButton("Sign In");
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(0, 150, 0));
        loginButton.setMaximumSize(new Dimension(250, 30));

        leftPanel.add(welcomeBackLabel);
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(enterLoginData);
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(username);
        leftPanel.add(Box.createVerticalStrut(5));
        leftPanel.add(usernameField);
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(password);
        leftPanel.add(Box.createVerticalStrut(5));
        leftPanel.add(passwordField);
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(email);
        leftPanel.add(Box.createVerticalStrut(5));
        leftPanel.add(emailField);
        leftPanel.add(Box.createVerticalStrut(15));
        leftPanel.add(loginButton);

        return leftPanel;
    }

    public JPanel initRightPanel() {
        rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        JLabel noAccountLabel = new JLabel("Do not have an Account?");
        noAccountLabel.setForeground(new Color(0, 150, 0));
        noAccountLabel.setFont(new Font("SansSerif", Font.BOLD, 20));

        JLabel signupPrompt = new JLabel("<html>If you do not have an account already,<br>create one by clicking <a href='#'>Sign Up</a></html>");
        signupPrompt.setFont(new Font("SansSerif", Font.PLAIN, 14));

        rightPanel.add(noAccountLabel);
        rightPanel.add(Box.createVerticalStrut(10));
        rightPanel.add(signupPrompt);

        return rightPanel;
    }
}
