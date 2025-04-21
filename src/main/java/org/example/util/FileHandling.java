package org.example.util;

import java.io.*;
import java.util.ArrayList;

public class FileHandling {
    String room;

    private BufferedWriter writer;
    private BufferedReader reader;

    public void openFile() throws IOException {
        writer = new BufferedWriter(new FileWriter("Bookings.txt", true));
        reader = new BufferedReader(new FileReader("Bookings.txt"));
        System.out.println("File Opened");
    }

    public void processFile(String output) throws IOException {
        writer.write(output);
        writer.newLine();

    }

    public ArrayList<String> getBookedSlots() throws IOException {
        System.out.println("File Reading");
        ArrayList<String> bookedSlots = new ArrayList<>();
        String line;
        reader.readLine();

        while ((line = reader.readLine()) != null) {
            String[] sInput = line.split("#");
            if (sInput.length >= 7) {
                String timeSlot = sInput[4];
                String room = sInput[5];
                bookedSlots.add(timeSlot + "#" + room);
            }
        }

        return bookedSlots;
    }

    public void closeFile ()throws IOException {
            writer.close();
            reader.close();
        System.out.println("File Closed");
    }
}

