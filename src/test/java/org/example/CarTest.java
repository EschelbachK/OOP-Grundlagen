package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    // Testet, ob das Auto gestartet werden kann
    @org.junit.jupiter.api.Test
    void shouldStartCarAndPrintMessage() {
        // Erstellt ein Auto
        Car car = new Car("BMW", "X5", "Schwarz", 2021);

        // Startet das Auto (nur Ausgabe, kein assert nötig)
        car.startCar();
    }

    // Testet, ob das Auto korrekt beschleunigt
    @org.junit.jupiter.api.Test
    void shouldIncreaseSpeedWhenAccelerated() {
        // Erstellt ein Auto
        Car car = new Car("Audi", "A4", "Rot", 2022);

        // Beschleunigt das Auto um 30 km/h
        car.speedUpCar(30);

        // Prüft, ob die Geschwindigkeit jetzt 30 ist
        assertEquals(30, car.getSpeed());
    }

    // Testet, ob ein neues Auto Geschwindigkeit 0 hat
    @org.junit.jupiter.api.Test
    void shouldReturnZeroSpeedForNewCar() {
        // Erstellt ein Auto
        Car car = new Car("VW", "Golf", "Blau", 2020);

        // Prüft, ob die Geschwindigkeit 0 ist
        assertEquals(0, car.getSpeed());
    }

    // Testet, ob die Farbe korrekt zurückgegeben wird
    @org.junit.jupiter.api.Test
    void shouldReturnCorrectColor() {
        // Erstellt ein Auto
        Car car = new Car("Mercedes", "C-Klasse", "Silber", 2019);

        // Prüft, ob die Farbe stimmt
        assertEquals("Silber", car.getColor());
    }

    // Testet, ob das Baujahr korrekt zurückgegeben wird
    @org.junit.jupiter.api.Test
    void shouldReturnCorrectYear() {
        // Erstellt ein Auto
        Car car = new Car("Opel", "Astra", "Weiß", 2018);

        // Prüft, ob das Baujahr stimmt
        assertEquals(2018, car.getYear());
    }
}
