package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionMduleRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem z odczytaniem pliku!");
        }
    }
}
