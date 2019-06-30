package com.kodilla.good.patterns.challenges;

public class FilePurchaseRepository implements PurchaseRepository {
    public void sendDataToRepo(User user, int numberOfPieces, Product product) {
        System.out.println("The following data is sent to the repository of Mr. " + user.getFirstName());
    }
}
