package view;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import controller.LoginController;
import javax.swing.*;
import java.awt.*;

public class LoginView {
    private final LoginController controller;
    private final initLoginComponents components = new initLoginComponents();
    private final String DARK_ICON_PATH = "../assets/themeIcons/dark_theme.png";
    private JFrame frame;
    private JPanel headerPanel;
    private JPanel containerPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;

    public LoginView(LoginController controller) {
        this.controller = controller;
    }

    public void initLight() {
        frame = new JFrame();
        frame.setTitle("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(new BorderLayout());

        FlatDarkLaf.setup();

        ImageIcon darkIcon = new ImageIcon(controller.createImageIcon(DARK_ICON_PATH).getImage());
        headerPanel = components.initHeader(darkIcon);

        containerPanel = new JPanel();
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.X_AXIS));
        containerPanel.setBorder(BorderFactory.createEmptyBorder(50, 200, 50, 50));

        leftPanel = components.initLeftPanel();
        containerPanel.add(leftPanel);

        containerPanel.add(Box.createHorizontalStrut(500));

        rightPanel = components.initRightPanel();
        containerPanel.add(rightPanel);

        frame.add(headerPanel, BorderLayout.NORTH);
        frame.add(containerPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
