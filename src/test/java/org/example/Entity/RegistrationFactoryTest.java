package org.example.Entity;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationFactoryTest {

    @org.junit.jupiter.api.Test
    void CreateRegistration() {
        Registration reg = RegistrationFactory.createRegistration(
                "Sifiso",
                "223072559@mycput.ac.za",
                "223072559",
                "14:00");
        assertNotNull(reg);
    }
}