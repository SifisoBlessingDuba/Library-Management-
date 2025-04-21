package org.example;

import org.example.SwingGUI.RegistrationGUI;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RegistrationGUI regGUI = new RegistrationGUI();
        regGUI.pack();
        regGUI.setSize(1000, 500);
        regGUI.setVisible(true);
        regGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        regGUI.setGUI();
    }
}