package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge sc = new SecondChallenge();
        try {
            String result = sc.probablyIWillThrowException(1.3 , 4.2);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Wartości poza tolerancją!");
        }
    }
}
