package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BookManager {
    private Book createBook;

    public Book createBook(String title, String author) {
        this.createBook = createBook;
        Set<Book> books = new HashSet<>();
        books.add(new Book("Rich Dad Poor Dad", "Robert Kiyosaki"));
        books.add(new Book("How to Win Friends and Influence People", "Dale Carnegie"));
     return createBook;
    }

    public Book getCreateBook() {
        return createBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookManager that = (BookManager) o;
        return Objects.equals(createBook, that.createBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createBook);
    }

    @Override
    public String toString() {
        return "BookManager{" +
                "createBook=" + createBook +
                '}';
    }
}
