package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();

        Book book1 = new Book("Autor1","Tytuł1", 2019, "sygnatura1");
        Book book2 = new Book("Autor2","Tytuł2", 2000, "sygnatura2");
        Book book3 = new Book("Autor3","Tytuł3", 2003, "sygnatura3");
        Book book4 = new Book("Autor4","Tytuł4", 1976, "sygnatura4");
        Book book5 = new Book("Autor5","Tytuł5", 1996, "sygnatura5");

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        Assert.assertEquals(2000, median);

    }
}
