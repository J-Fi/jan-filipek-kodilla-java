package com.kodilla.patterns.strategy.social;

public class ZGenerations extends User {
    public ZGenerations(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
