package view;

import controller.MainController;

import javax.swing.*;

public class MainView {
    private final MainController controller;

    private JFrame frame;


    public MainView(MainController controller) {
        this.controller = controller;
    }

    public void init() {
        frame = new JFrame();
        frame.setTitle("Beneficiaris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);



        frame.setVisible(true);
    }
}
