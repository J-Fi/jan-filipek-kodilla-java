package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String stringToBeautify, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(stringToBeautify);
        System.out.println("The String after decoration: " + result);
    }
}
