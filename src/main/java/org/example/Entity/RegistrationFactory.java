package org.example.Entity;

import org.example.util.Helper;

public class RegistrationFactory {
    public static Registration createRegistration(String name, String surname, String email,
                                                  String cellNumber,Boolean isHandicapped,
                                                  int pin, String timeSlot, int room) {

        if (Helper.isNullOrEmpty(name)
                || Helper.isNullOrEmpty(surname)
                || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(cellNumber)
                || Helper.isNullOrEmpty(String.valueOf(isHandicapped))
                || Helper.isNullOrEmpty(String.valueOf(pin))
                || Helper.isNullOrEmpty(timeSlot)
                || Helper.isNullOrEmpty(String.valueOf(room))
        ) {
            return null;

        }

        return new Registration.Builder()
                .setName(name)
                .setSurname(surname)
                .setEmail(email)
                .setCellNumber(cellNumber)
                .setIsHandicapped(isHandicapped)
                .setPin(pin)
                .setTimeSlot(timeSlot)
                .setRoom(room)
                .build();


    }

}

