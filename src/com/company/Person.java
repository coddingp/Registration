package com.company;

import java.sql.SQLOutput;

public class Person implements Registration {
    private String name;
    private String surname;
    private String id;
    static int a;
    static int b;
    static char mathChar;
    static double res;

    public Person(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        registration();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals(null)) {
            System.out.println("Enter a valid data");
        } else if (name.equals("")) {
            System.out.println("Enter a valid data");
        } else this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (!id.equals("")) {
            this.id = id;
        }else throw new NullPointerException("There is Null ID. You need to specify it using English letters and integer numbers");
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
        if ((getName() != null && !getName().equals("")) && (getSurname() != null && !getSurname().equals(""))&& !getId().equals("")) {
            System.out.println(getName() + " " + getSurname() + " registered successfully.");
            Calculator calculator = new Calculator(a, mathChar, b);
            calculator.calculate();
            System.out.println("The result of your request is equal to: " + calculator.res);
        } else System.out.println("What are you doing!? Didn't you forgot to enter your name, surname or ID first?)");
    }
}
