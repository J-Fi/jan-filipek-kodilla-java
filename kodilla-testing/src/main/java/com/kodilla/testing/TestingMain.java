package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6 - przykładowy SUT");
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");
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
