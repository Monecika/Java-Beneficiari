package view;

import controller.LoginController;

import javax.swing.*;
import java.awt.*;

public class LoginView {
    private final LoginController controller;
    private final initLoginComponents components = new initLoginComponents();
    private final String DARK_ICON_PATH = "../assets/themeIcons/dark_theme.png";
    private final String LIGHT_ICON_PATH = "../assets/themeIcons/light_theme.png";
    private JFrame frame;
    private JPanel headerPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;

    private JLabel welcomeLabel;
    private JLabel enterRegisterData;
    private JLabel repeatPassword;
    private JLabel email;
    private JButton registerButton;

    public LoginView(LoginController controller) {
        this.controller = controller;
    }

    public void initLight() {
        frame = new JFrame();
        frame.setTitle("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        ImageIcon darkIcon = new ImageIcon(controller.createImageIcon(DARK_ICON_PATH).getImage());

        headerPanel = components.initHeader(darkIcon);
        leftPanel = components.initLeftPanel();
        leftPanel.setPreferredSize(new Dimension(300, 200));

        frame.add(headerPanel, BorderLayout.NORTH);

        frame.add(leftPanel);

        frame.setVisible(true);
    }
}
