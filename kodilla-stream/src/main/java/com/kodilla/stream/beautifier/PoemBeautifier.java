package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String stringToBeautify, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(stringToBeautify);
    }
}
