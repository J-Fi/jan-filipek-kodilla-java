package com.kodilla.good.patterns.challenges;

public class EmailInformationService implements InformationService {
    public void inform(User user) {
        System.out.println("This info was sent by email to Mr " + user.getFirstName());
    }
}