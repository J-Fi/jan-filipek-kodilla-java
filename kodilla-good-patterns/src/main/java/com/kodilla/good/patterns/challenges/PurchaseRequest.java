package com.kodilla.good.patterns.challenges;

public class PurchaseRequest {

    private User user;
    private int numberOfPieces;
    private Product product;

    public PurchaseRequest(User user, int numberOfPieces, Product product) {
        this.user = user;
        this.numberOfPieces = numberOfPieces;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public Product getProduct() {
        return product;
    }
}
