package org.example;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    // Testet, ob die Vorstellungsmethode ohne Fehler läuft
    @org.junit.jupiter.api.Test
    void shouldIntroducePersonCorrectly() {
        // Erstellt eine Person
        Person person = new Person("Anna", 25, "weiblich");

        // Ruft die Vorstellungsmethode auf (nur Ausgabe, kein assert nötig)
        person.vorstellen();
    }

    // Testet, ob der Name korrekt zurückgegeben wird
    @org.junit.jupiter.api.Test
    void shouldReturnCorrectName() {
        // Erstellt eine Person
        Person person = new Person("Max", 30, "männlich");

        // Prüft, ob der Name stimmt
        assertEquals("Max", person.getName());
    }

    // Testet, ob das Alter korrekt zurückgegeben wird
    @org.junit.jupiter.api.Test
    void shouldReturnCorrectAge() {
        // Erstellt eine Person
        Person person = new Person("Lena", 22, "weiblich");

        // Prüft, ob das Alter stimmt
        assertEquals(22, person.getAge());
    }

    // Testet, ob das Geschlecht korrekt zurückgegeben wird
    @org.junit.jupiter.api.Test
    void shouldReturnCorrectGender() {
        // Erstellt eine Person
        Person person = new Person("Chris", 40, "divers");

        // Prüft, ob das Geschlecht stimmt
        assertEquals("divers", person.getGender());
    }
}
