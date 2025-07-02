package org.example;

public class Person {

    // Name der Person
    private String name;

    // Alter der Person
    private int age;

    // Geschlecht der Person
    private String gender;

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    // Konstruktor zum Erstellen einer Person mit Name, Alter und Geschlecht
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Methode, die die Person vorstellt
    public void vorstellen() {
        System.out.println("Hallo, ich bin " + name + " und " + age + " Jahre alt. Dazu kommt das ich " + gender + " bin!");
    }
}