package com.kodilla.good.patterns.challenges;

public class Book implements Product {
    private String title;
    private String authorFirstName;
    private String authorLastName;
    private int publishedYear;
    private String productCategory;
    private String productCodeNumber;

    public Book(String title, String authorFirstName, String authorLastName, int publishedYear, String productCategory, String productCodeNumber) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.publishedYear = publishedYear;
        this.productCategory = productCategory;
        this.productCodeNumber = productCodeNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    @Override
    public String getProductCategory() {
        return productCategory;
    }

    @Override
    public String getProductCodeNumber() {
        return productCodeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (getPublishedYear() != book.getPublishedYear()) return false;
        if (!getTitle().equals(book.getTitle())) return false;
        if (!getAuthorFirstName().equals(book.getAuthorFirstName())) return false;
        return getAuthorLastName().equals(book.getAuthorLastName());
    }

    @Override
    public int hashCode() {
        int result = getTitle().hashCode();
        result = 31 * result + getAuthorFirstName().hashCode();
        result = 31 * result + getAuthorLastName().hashCode();
        result = 31 * result + getPublishedYear();
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
