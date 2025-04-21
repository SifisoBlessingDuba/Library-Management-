package org.example.Entity;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationFactoryTest {

    @org.junit.jupiter.api.Test
    void CreateRegistration() {
        Registration reg = RegistrationFactory.createRegistration(
                "Sifiso",
                "Duba",
                "223072559@mycput.ac.za",
                "071 444 6184",
                true,
                1234,
                "10:00 - 11:00",
                1


        );

        assertNotNull(reg);
    }
}