package org.example;

public class Car {

    // Marke des Autos
    private String brand;

    // Modell des Autos
    private String model;

    // Farbe des Autos
    private String color;

    // Baujahr des Autos
    private int year;

    // Aktuelle Geschwindigkeit
    private int speed;

    // Konstruktor zum Erstellen eines Autos mit Marke, Modell, Farbe und Baujahr
    public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.speed = 0;
    }

    // Methode zum Starten des Autos
    public void startCar() {
        System.out.println(brand + " " + model + " wurde gestartet.");
    }

    // Methode zum Beschleunigen des Autos
    public void speedUpCar(int erhoehung) {
        speed += erhoehung;
        System.out.println(brand + " " + model + " beschleunigt auf " + speed + " km/h.");
    }

    // Methode zum Zurückgeben der aktuellen Geschwindigkeit
    public int getSpeed() {
        return speed;
    }

    // Methode zum Zurückgeben der Farbe
    public String getColor() {
        return color;
    }

    // Methode zum Zurückgeben des Baujahrs
    public int getYear() {
        return year;
    }
}
