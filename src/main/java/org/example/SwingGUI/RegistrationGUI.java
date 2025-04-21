package org.example.SwingGUI;

import org.example.Entity.Registration;
import org.example.Entity.RegistrationFactory;
import org.example.util.FileHandling;
import org.example.util.FileWriting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class RegistrationGUI extends JFrame implements ActionListener {
    JPanel pnlTop, pnlBottom;
    private JTextField name, surname, email, cellNumber,pin;
    private JLabel lblName, lblsurname, lblEmail, lblCellNumber,lblPin, handicapped, lblTimeSlot;
    private JButton regBtn;
    private JRadioButton handicappedRadio;
    private Boolean isHandicapped = false;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scrollPane;

    TimeSlotManager slot = new TimeSlotManager();
    TableRender render = new TableRender();

    public RegistrationGUI() {
        super("Library Booking System");
        pnlBottom = new JPanel();
        pnlTop = new JPanel();

        name = new JTextField();
        surname = new JTextField();
        email = new JTextField();
        cellNumber = new JTextField();
        pin = new JTextField();


        lblName = new JLabel("Name:");
        lblsurname = new JLabel("Surname:");
        lblEmail = new JLabel("Email:");
        lblCellNumber = new JLabel("Cell Number:");
        handicapped = new JLabel("Handicapped:");
        lblPin = new JLabel("Create a 4 digit Pin:");
        lblTimeSlot = new JLabel("Select timeslot below");


        handicappedRadio = new JRadioButton("");

        model = new DefaultTableModel();
        table = new JTable(model);
        scrollPane = new JScrollPane(table);

        regBtn = new JButton("Register");

    }

    public void setGUI(){
        pnlTop.setLayout(new GridLayout(7, 2));
        pnlBottom.setLayout(new GridLayout(1, 1));

        this.add(scrollPane, BorderLayout.CENTER);


        pnlTop.add(lblName);
        pnlTop.add(name);
        pnlTop.add(lblsurname);
        pnlTop.add(surname);
        pnlTop.add(lblEmail);
        pnlTop.add(email);
        pnlTop.add(lblCellNumber);
        pnlTop.add(cellNumber);
        pnlTop.add(lblPin);
        pnlTop.add(pin);
        pnlTop.add(handicapped);
        pnlTop.add(handicappedRadio);
        pnlTop.add(lblTimeSlot);

        pnlBottom.add(regBtn);

        model.setDataVector(slot.getTableData(), slot.getHeaders());

        slot.markBookedSlotsFromFile(model);

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(render);
        }

        this.add(pnlTop, BorderLayout.NORTH);
        this.add(pnlBottom, BorderLayout.SOUTH);

        regBtn.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (handicappedRadio.isSelected()) {
            isHandicapped = true;
        }else {
            isHandicapped = false;
        }
        if (e.getSource() == regBtn) {
            int row = table.getSelectedRow();
            int col = table.getSelectedColumn();

            // Ignore time slot column
            if (row != -1 && col != -1 && col != 0) {
                String value = model.getValueAt(row, col).toString();

                if (value.equalsIgnoreCase("Free")) {
                    // Mark as booked
                    model.setValueAt("Booked", row, col);

                    String timeSlot = model.getValueAt(row, 0).toString();

                    Registration registration = RegistrationFactory.createRegistration(name.getText(),surname.getText(), email.getText(), cellNumber.getText(),isHandicapped, Integer.parseInt(pin.getText()), timeSlot, col);
                    FileWriting.writeToFile(registration.toString());

                    JOptionPane.showMessageDialog(this, "Booking successful!");

                }else {
                    JOptionPane.showMessageDialog(this, "This slot is already booked.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
            }else {
                JOptionPane.showMessageDialog(this, "Please select a valid slot.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}

