package com.kodilla.testing.calculator;

public class Calculator {
    int a;
    int b;

    public Calculator (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add () {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }
}

class TestingMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator(5,6);

        System.out.println("Test jednostkowy nr 1 - metoda ADD");
        int sum = calc.add();
        if (sum == (5 + 6)) {
            System.out.println("test metody ADD - OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test jednostkowy nr 2 - metoda SUBTRACT");
        int subtract = calc.subtract();
        if (subtract == (5 - 6)) {
            System.out.println("test metody SUBTRACT - OK");
        } else {
            System.out.println("Error!");
        }

    }
}