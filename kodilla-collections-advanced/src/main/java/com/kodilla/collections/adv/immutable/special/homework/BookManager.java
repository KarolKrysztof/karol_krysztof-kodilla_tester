package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    private Set<Book> books = new HashSet<>();

    public Book createBook(String title, String author) {
        Book book = find(title, author);
        if (book != null) {
            return book;
        }

        Book book1 = new Book(title, author);
        books.add(book1);

        return book1;
    }

    private Book find(String title, String author) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }

}
