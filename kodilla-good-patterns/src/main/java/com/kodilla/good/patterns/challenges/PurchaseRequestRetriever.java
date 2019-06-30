package com.kodilla.good.patterns.challenges;

public class PurchaseRequestRetriever {
    public PurchaseRequest retrieve_1() {
        User user = new User("Jan", "Filipek", "janflpk@yahoo.com");
        int numberOfPieces = 12;
        Product book = new Book("ABC", "Jan", "Filipek", 2011, "Book", "wsd/23145-2123");

        return new PurchaseRequest(user, numberOfPieces, book);
    }

    public PurchaseRequest retrieve_2() {
        User user = new User("Karol", "Findek", 484832432);
        int numberOfPieces = 2;
        Product computer = new Computer("laptop", "com/231493/fres");

        return new PurchaseRequest(user, numberOfPieces, computer);
    }
}
