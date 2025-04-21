package org.example.SwingGUI;

import javax.swing.*;

public class ProjectJFrame extends JFrame {
    RegistrationGUI reg;

    public ProjectJFrame() {
        reg = new RegistrationGUI();
        this.setTitle("Snake Game");
        this.add(reg);
        this.pack();
        this.setVisible(true);
        this.setFocusable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        reg.requestFocusInWindow();
    }
}
