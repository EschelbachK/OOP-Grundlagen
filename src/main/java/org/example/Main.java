package org.example;

public class Main {
    public static void main(String[] args) {
        // Erstes Auto wird erstellt
        Car auto1 = new Car("BMW", "X5", "Schwarz", 2021);

        // Erstes Auto wird gestartet
        auto1.startCar();

        // Zweites Auto wird erstellt
        Car auto2 = new Car("Audi", "A4", "Rot", 2022);

        // Zweites Auto wird beschleunigt
        auto2.speedUpCar(50);

        // Geschwindigkeit des zweiten Autos wird angezeigt
        System.out.println("Aktuelle Geschwindigkeit von " + auto2.getSpeed() + " km/h.");

        // PERSON

        // Person 1 erstellen und vorstellen
        Person person1 = new Person("Anna", 25, "weiblich");
        person1.vorstellen();

        // Person 2 erstellen und vorstellen
        Person person2 = new Person("Max", 30, "männlich");
        person2.vorstellen();

        // Person 3 erstellen und vorstellen
        Person person3 = new Person("Lena", 22, "weiblich");
        person3.vorstellen();
    }
}
