package com.kodilla.testing.library;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private LibraryDatabase libraryDatabaseMock;
    private BookLibrary bookLibrary;
    private LibraryUser libraryUser;

    private List<Book> generateListOfNBooks (int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book ("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Before
    public void setup() {
        libraryDatabaseMock = mock(LibraryDatabase.class);
        bookLibrary = new BookLibrary(libraryDatabaseMock);
        libraryUser = new LibraryUser("Jan", "Filipek", "762314578");
    }


    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithConditionBla("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());

    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithConditionBla("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithConditionBla("Any Title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithConditionBla("FortyBooks");

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithConditionBla("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    public void testListBooksInHandsOfNoBooksBorrowed() {
        //Given
        List<Book> listBook0 = new ArrayList<Book>();
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listBook0);

        //When
        List<Book> resultList = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(0, resultList.size());
    }

    @Test
    public void testListBooksInHandsOfOneBook() {
        //Given
        List<Book> listBook1 = new ArrayList<Book>();
        Book book = new Book("Pan Tadeusz", "Adam Mickiewicz", 2019);
        listBook1.add(book);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listBook1);

        //When
        List<Book> resultList = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(1, resultList.size());
    }

    @Test
    public void testListBooksInHandsOfFiveBooks() {
        //Given
        List<Book> listBook5 = new ArrayList<Book>();
        Book book = new Book("Pan Tadeusz", "Adam Mickiewicz", 2019);
        Book book1 = new Book("Proces", "Franz Kafka", 2010);
        Book book2 = new Book("Cena", "Waldemar Łysiak", 2009);
        Book book3 = new Book("Zgred", "Rafał Ziemkiewicz", 2019);
        Book book4 = new Book("Zapiski...", "Leopold Tyrmand", 2019);
        listBook5.add(book);
        listBook5.add(book1);
        listBook5.add(book2);
        listBook5.add(book3);
        listBook5.add(book4);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listBook5);

        //When
        List<Book> resultList = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(5, resultList.size());
    }
}
