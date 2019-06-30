package com.kodilla.good.patterns.challenges;

public class Computer implements Product {
    private String productCategory;
    private String productCodeNumber;

    public Computer(String productCategory, String productCodeNumber) {
        this.productCategory = productCategory;
        this.productCodeNumber = productCodeNumber;
    }

    @Override
    public String getProductCategory() {
        return productCategory;
    }

    @Override
    public String getProductCodeNumber() {
        return productCodeNumber;
    }
}
