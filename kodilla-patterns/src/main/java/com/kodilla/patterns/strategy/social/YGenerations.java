package com.kodilla.patterns.strategy.social;

public class YGenerations extends User {
    public YGenerations(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
