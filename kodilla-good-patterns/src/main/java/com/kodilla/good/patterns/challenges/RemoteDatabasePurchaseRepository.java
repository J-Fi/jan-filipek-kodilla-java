package com.kodilla.good.patterns.challenges;

public class RemoteDatabasePurchaseRepository implements PurchaseRepository {
    public void sendDataToRepo(User user, int numberOfPieces, Product product) {
        System.out.println("The following data is sent to the repository in a remote database of Mr. " + user.getFirstName());
    }
}
