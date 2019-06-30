package com.kodilla.good.patterns.challenges;

public class SmsInformationService implements InformationService {
    public void inform(User user) {
        System.out.println("This is an SMS sent to Mr. " + user.getFirstName() + " to confirm the purchase of the product.");
    }
}
