package org.example.Entity;

public class Registration {
    private String name;
    private String email;
    private String TimeSlot;
    private String cellNumber;

    private Registration() {

    }
    private Registration(String name, String email, String cellNumber, String timeSlot) {
        this.name = name;
        this.email = email;
        this.TimeSlot = timeSlot;
        this.cellNumber = cellNumber;
    }

    private String getName() {
        return name;
    }
    private String getEmail() {
        return email;
    }
    private String getTimeSlot() {
        return TimeSlot;
    }
    private String getCellNumber() {
        return cellNumber;
    }

    public static class Builder {
        private String name;
        private String email;

        private String timeSlot;
        private String cellNumber;

        public Builder() {

        }
        public Builder setName(String name) {
            return this;
        }
        public Builder setEmail(String email) {
            return this;
        }
        public Builder setTimeSlot(String timeSlot) {
            return this;
        }
        public Builder setCellNumber(String cellNumber) {
            return this;
        }
        public Registration build() {
            return new Registration(name, email, cellNumber, timeSlot);
        }
    }

}
