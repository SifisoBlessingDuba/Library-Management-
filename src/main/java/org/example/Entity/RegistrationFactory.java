package org.example.Entity;

import org.example.util.Helper;

public class RegistrationFactory {
    public static Registration createRegistration(String name, String email, String cellNumber, String timeSlot) {

        if (Helper.isNullOrEmpty(name)
                || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(cellNumber)
                || Helper.isNullOrEmpty(timeSlot)
        ) {
            return null;

        }

        return new Registration.Builder()
                .setName(name)
                .setEmail(email)
                .setCellNumber(cellNumber)
                .setTimeSlot(timeSlot)
                .build();


    }

}

