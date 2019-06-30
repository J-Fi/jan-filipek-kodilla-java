package com.kodilla.good.patterns.challenges;

public class ComputerPurchaseService implements PurchaseService {
    public boolean purchase(User user, int numberOfPieces, Product product) {
        System.out.println("This is body of the " + product.getProductCategory() + " " + product.getProductCodeNumber() + " purchase method ... for Mr. " + user.getFirstName());
        return true;
    }
}
