package org.example.SwingGUI;

import org.example.util.FileHandling;

import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class TimeSlotManager {

    String[] timeSlots = {
        "09:00 - 10:00",
        "10:00 - 11:00",
        "11:00 - 12:00",
        "12:00 - 13:00",
        "13:00 - 14:00",
        "14:00 - 15:00",
        "15:00 - 16:00",
        "16:00 - 17:00",
        "17:00 - 18:00",
        "18:00 - 19:00",
        "19:00 - 20:00",
        "20:00 - 21:00",
        "21:00 - 22:00"

        };

    int seats = 10;
    String[][] slots;

    public TimeSlotManager() {
        slots = new String[timeSlots.length][seats];

        for (int i = 0; i < timeSlots.length; i++) {
           for (int j = 0; j < seats; j++) {
                slots[i][j] = "Free";
                }
            }
        }

        public String[] getHeaders() {
            String[] headers = new String[seats + 1];
            headers[0] = "Time Slot";
            for (int i = 1; i <= seats; i++) {
                headers[i] = "Room " + i;
            }
            return headers;
        }

        public Object[][] getTableData() {
            Object[][] data = new Object[timeSlots.length][seats + 1];

            for (int i = 0; i < timeSlots.length; i++) {
                data[i][0] = timeSlots[i];
                for (int j = 0; j < seats; j++) {
                    data[i][j + 1] = slots[i][j];
                }
            }

            return data;
        }

    public void markBookedSlotsFromFile(DefaultTableModel model) {
        try {
            FileHandling fileHandling = new FileHandling();
            fileHandling.openFile();
            ArrayList<String> slotsFromFile = fileHandling.getBookedSlots();

            for (String bookedSlot : slotsFromFile) {
                String[] bookingDetails = bookedSlot.split("#");
                String timeSlot = bookingDetails[0];
                int room = Integer.parseInt(bookingDetails[1]);

                for (int i = 0; i < model.getRowCount(); i++) {
                    if (model.getValueAt(i, 0).equals(timeSlot)) {
                        model.setValueAt("Booked", i, room);
                    }
                }
            }

            fileHandling.closeFile();
        } catch (Exception e) {
            System.out.println("Error reading and marking booked slots: " + e.getMessage());
        }
    }
    }


