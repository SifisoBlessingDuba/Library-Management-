package org.example.util;

import java.util.ArrayList;
import java.util.List;

public class FileReading {
        public static List<String> readBookedSlots() {
            List<String> bookedSlots = new ArrayList<>();
            try {
                FileHandling fileHandling = new FileHandling();
                fileHandling.openFile();
                bookedSlots = fileHandling.getBookedSlots();
                fileHandling.closeFile();
            } catch (Exception e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
            return bookedSlots;
        }
}
