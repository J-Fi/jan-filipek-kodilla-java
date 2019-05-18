package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithConditionBla (String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf (LibraryUser libraryUser) {
        List<Book> bookList = new ArrayList<Book>();
        Book book = new Book ("Title", "Author", 2010);
        Book book1 = new Book ("Title1", "Author1", 2011);
        bookList.add(book);
        bookList.add(book1);
        return bookList;
    }
}
