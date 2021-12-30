package com.company;

import java.sql.SQLOutput;

public class Person implements Registration {
    private String name;
    private String surname;
    private int id;
    static int a;
    static int b;
    static char mathChar;
    static double res;

    public Person(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        registration();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.name.equals("")) {
            System.out.println("Enter a valid data");
        } else this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public void registration() {
        if (getName() != null) {
            System.out.println(getName() + " " + getSurname() + " registered successfully.");
            Calculator calculator = new Calculator(this.a, this.mathChar, this.b);
            calculator.calculate();
            System.out.println("The result of your request is equal to: " + calculator.res);
        } else System.out.println("What are you doing!? Didn't you forgot to enter your name first?)");
    }
}
