package controller;

import model.LoginModel;

import javax.swing.*;
import java.awt.*;

public class LoginController {
    private final LoginModel loginModel;

    public LoginController(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    public ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            Image img = icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            return new ImageIcon(img);
        }
        return null;
    }
}
