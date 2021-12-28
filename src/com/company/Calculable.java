package com.company;

public interface Calculable {
    void calculate();

    //  создать все методу по действиям
    void multiply();

    default void divide() {
        Calculator calculator = new Calculator(Person.a, Person.mathChar, Person.b);
        if (calculator.mathChar == '/') {
            if (calculator.second == 0) {
                throw new ArithmeticException("You can't divide by " + 0);
            } else calculator.res = calculator.first / calculator.second;
        }
//        void add ();
//        void minus ();

    }
}
