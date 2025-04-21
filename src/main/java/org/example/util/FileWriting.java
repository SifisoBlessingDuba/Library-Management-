package org.example.util;

public class FileWriting {

    public static void writeToFile(String details) {
        try {
            FileHandling fileHandling = new FileHandling();
            fileHandling.openFile();
            fileHandling.processFile(details);
            fileHandling.closeFile();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


}
