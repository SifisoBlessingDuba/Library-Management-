package org.example.Entity;

import org.example.util.FileHandling;

import java.util.logging.FileHandler;

public class Registration {
    private String name;
    private String surname;
    private String email;
    private String timeSlot;
    private String cellNumber;
    private int room;
    private Boolean isHandicapped = false;
    private int pin;

    private Registration() {

    }
    private Registration(String name,String surname, String email, String cellNumber,
                         Boolean isHandicapped,int pin, String timeSlot,int room) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.isHandicapped = isHandicapped;
        this.pin = pin;
        this.timeSlot = timeSlot;
        this.cellNumber = cellNumber;
        this.room = room;
    }

    private String getName() {
        return name;
    }
    private String getSurname() {
        return surname;
    }
    private String getEmail() {
        return email;
    }
    private Boolean getISHandicapped() {
        return isHandicapped;
    }
    private int getPassword() {
        return pin;
    }
    private String getTimeSlot() {
        return timeSlot;
    }
    private String getCellNumber() {
        return cellNumber;
    }
    private int getRoom() {
        return room;
    }
    @Override
    public String toString() {
        return   name + "#" + surname + "#"+ email + "#" + cellNumber
                + "#" + timeSlot + "#" + room + "#" + pin;
    }

    public static class Builder {
        private String name;
        private String surname;
        private String email;
        private Boolean isHandicapped;
        private int pin;
        private String timeSlot;
        private String cellNumber;
        private int room;

        public Builder() {

        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setIsHandicapped(Boolean isHandicapped) {
            this.isHandicapped = isHandicapped;
            return this;
        }
        public Builder setPin(int pin) {
            this.pin = pin;
            return this;
        }
        public Builder setTimeSlot(String timeSlot) {
            this.timeSlot = timeSlot;
            return this;
        }
        public Builder setCellNumber(String cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }
        public Builder setRoom(int room) {
            this.room = room;
            return this;
        }
        public Registration build() {
            return new Registration(name,surname, email, cellNumber,isHandicapped, pin, timeSlot, room);
        }
    }


}
