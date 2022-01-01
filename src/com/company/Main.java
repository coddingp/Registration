package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int x = 0;
        Scanner scanName = new Scanner(System.in);
        System.out.println("To use the calculator you need to register first!\nEnter you Name: ");

        String name = scanName.nextLine();


        Scanner scanSurname = new Scanner(System.in);
        System.out.println("\nEnter your surname: ");
        String surname = scanName.nextLine();
        Scanner scanID = new Scanner(System.in);
        System.out.println("\nEnter your ID: ");
        String id = scanName.nextLine();

        int a = 0;
        System.out.println("Enter first integer number from 1 to 1 000 000");
        Scanner scanFirstNumber = new Scanner(System.in);
        if (scanFirstNumber.hasNextInt()) {
            a = scanFirstNumber.nextInt();
        } else System.out.println("Enter integer number from 1 to 1 000 000");
        String math = "";
        System.out.println("Enter math char of operation you want to do (+,-,*,/)");
        Scanner scanMathOperation = new Scanner(System.in);
        if (scanMathOperation.hasNextLine()) {
            math += scanMathOperation.next();
            if (math.equals("+") || math.equals("-") || math.equals("*") || math.equals("/")) {
                System.out.println("");
            } else {
                System.out.println("You have used an improper math operation.");
                throw new ArithmeticException("Try to use some of the next chars: +,-,*,/");
            }
        }
        int b = 0;
        System.out.println("Enter second integer number from 1 to 1 000 000");

        Scanner scanSecondNumber = new Scanner(System.in);
        if (scanSecondNumber.hasNextInt()) {
            b = scanSecondNumber.nextInt();
        } else System.out.println("Enter integer number from 1 to 1 000 000");

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

//        name +=x;

        Person personFirst = new Person(name, surname, id);

        if (personFirst.getName() != null) {
            File personFirstFile = new File("personFirst");
            FileWriter fileWriter = new FileWriter("personFirst");
            fileWriter.write(personFirst.toString());
            FileReader fileReader = new FileReader(personFirstFile);
            fileWriter.close();
            fileReader.close();
        } else {
            throw new NullPointerException("Exception: name is null!");
        }
        if (personFirst.getSurname() != null) {
            File personFirstFile = new File("personFirst");
            FileWriter fileWriter = new FileWriter("personFirst");
            fileWriter.write(personFirst.toString());
            FileReader fileReader = new FileReader(personFirstFile);
            fileWriter.close();
            fileReader.close();
        } else {
            throw new NullPointerException("Exception: surname is null!");
        }
        if (!personFirst.getId().equals("")) {
            File personFirstFile = new File("personFirst");
            FileWriter fileWriter = new FileWriter("personFirst");
            fileWriter.write(personFirst.toString());
            FileReader fileReader = new FileReader(personFirstFile);
            fileWriter.close();
            fileReader.close();
        } else {
            throw new NullPointerException("Exception: id is null!");
        }

    }
}
