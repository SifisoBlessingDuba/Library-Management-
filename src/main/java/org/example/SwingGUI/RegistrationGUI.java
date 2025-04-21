package org.example.SwingGUI;

import org.example.Entity.Registration;
import org.example.Entity.RegistrationFactory;

import javax.swing.*;

public class RegistrationGUI extends JPanel {
    private JTextField name, email, cellNumber, timeSlot;
    private JLabel lblName, lblEmail, lblCellNumber;
    private JPanel panel;
    private Registration reg;

    public RegistrationGUI() {
        name = new JTextField();
        email = new JTextField();
        cellNumber = new JTextField();
        timeSlot = new JTextField();
        panel = new JPanel();
        lblName = new JLabel("Name:");
        lblEmail = new JLabel("Email:");
        lblCellNumber = new JLabel("Cell Number:");


    }



}
