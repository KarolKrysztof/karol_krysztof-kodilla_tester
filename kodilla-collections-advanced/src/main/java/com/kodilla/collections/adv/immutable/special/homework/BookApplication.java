package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book =  bookManager.createBook("Rich Dad Poor Dad", "Robert Kiyosaki");
        Book book1 = bookManager.createBook("How to Win Friends and Influence People", "Dale Carnegie");
        Book book2 = bookManager.createBook("Rich Dad Poor Dad", "Robert Kiyosaki");

        if (book == book2) {
            System.out.println("Book Manager works fine");
        } else {
            System.out.println("Book Manage failed");
        }
    }

}
