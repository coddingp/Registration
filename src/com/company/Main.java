package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Enter math char of operation you want");
        Scanner scanner2 = new Scanner(System.in);
        String math = scanner2.next();

        System.out.println("Enter second number");

        Scanner scanner3 = new Scanner(System.in);
        int b = scanner3.nextInt();

        Person.a = a;
        Person.b = b;
        if (math.equals("+")) {
            Person.mathChar = '+';
        } else if (math.equals("-")) {
            Person.mathChar = '-';
        } else if (math.equals("*")) {
            Person.mathChar = '*';
        } else if (math.equals("/")) {
            Person.mathChar = '/';
        }

        Calculator calculator = new Calculator(a, Person.mathChar, b);


        Person personFirst = new Person("Boris", "Mathias", 12356);

        if (personFirst.getName() != null) {
            File personFirstFile = new File("personFirst");
            FileWriter fileWriter = new FileWriter("personFirst");
            fileWriter.write(personFirst.toString());
            FileReader fileReader = new FileReader(personFirstFile);
            fileWriter.close();
//            for (int i = 0; i < personFirstFile.length(); i++) {
//                System.out.println(fileReader.read());
//            }
            fileReader.close();
        }else {
            throw new NullPointerException("Exception: s is null!");
        }
        if (personFirst.getSurname() != null) {
            File personFirstFile = new File("personFirst");
            FileWriter fileWriter = new FileWriter("personFirst");
            fileWriter.write(personFirst.toString());
            FileReader fileReader = new FileReader(personFirstFile);
            fileWriter.close();
//            for (int i = 0; i < personFirstFile.length(); i++) {
//                System.out.println(fileReader.read());
//            }
            fileReader.close();
        }else {
            throw new NullPointerException("Exception: s is null!");
        }
        if (personFirst.getId() > 1 && personFirst.getId()<30000) {
            File personFirstFile = new File("personFirst");
            FileWriter fileWriter = new FileWriter("personFirst");
            fileWriter.write(personFirst.toString());
            FileReader fileReader = new FileReader(personFirstFile);
            fileWriter.close();
//            for (int i = 0; i < personFirstFile.length(); i++) {
//                System.out.println(fileReader.read());
//            }
            fileReader.close();
        }else {
            throw new NullPointerException("Exception: s is null!");
        }

    }
}
