package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Biblioteka Narodowa");
        Book book1 = new Book("Proces", "Franz Kafka", LocalDate.of(2019,10,22));
        Book book2 = new Book("Jądro ciemności", "Joseph Conrad", LocalDate.of(2011,10,22));
        Book book3 = new Book("Solaris", "Stanisław Lem", LocalDate.of(2014,10,22));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Ossolineum");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Ossolineum");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().remove(book3);
        library.getBooks().remove(book2);

        //then
        assertEquals(1, library.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
