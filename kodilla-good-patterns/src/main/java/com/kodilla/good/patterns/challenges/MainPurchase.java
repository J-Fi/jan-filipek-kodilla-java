package com.kodilla.good.patterns.challenges;

public class MainPurchase {
    public static void main(String[] args) {
        ProductOrderService pos1 = new ProductOrderService(new EmailInformationService(), new BookPurchaseService(), new FilePurchaseRepository());
        PurchaseRequestRetriever prr1 = new PurchaseRequestRetriever();
        PurchaseDto pDto1 = pos1.process(prr1.retrieve_1());

        System.out.println("Has the book been purchased? " + pDto1.isPurchased());

        System.out.println("");

        ProductOrderService pos2 = new ProductOrderService(new SmsInformationService(), new ComputerPurchaseService(), new RemoteDatabasePurchaseRepository());
        PurchaseRequestRetriever prr2 = new PurchaseRequestRetriever();
        PurchaseDto pDto2 = pos2.process(prr2.retrieve_2());

        System.out.println("Has the computer been purchased? " + pDto2.isPurchased());
    }
}
