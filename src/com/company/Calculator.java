package com.company;

public class Calculator implements Calculable {
    public double first;
    public char mathChar;
    public double second;
    public double res;


    public Calculator(double first, char mathChar, double second) {
        this.first = first;
        this.second = second;
        this.mathChar = mathChar;

    }

    public double getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public char getMathChar() {
        return mathChar;
    }

    public void setMathChar(char mathChar) {
        this.mathChar = mathChar;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public double getRes() {
        return res;
    }



    public void calculate() {
        if (this.mathChar == '+') {
            this.res = this.first + this.second;
        } else if (this.mathChar == '-') {
            this.res = this.first - this.second;
        } else if (this.mathChar == '*') {
            this.res = this.first * this.second;
        } else if (this.mathChar == '/') {
            if (this.second==0){
                throw new ArithmeticException("You can't divide by " + 0);
            }else this.res = this.first / this.second;
        }
    }

    @Override
    public void multiply() {

    }
}
