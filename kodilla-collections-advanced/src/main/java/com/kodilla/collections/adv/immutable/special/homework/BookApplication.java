package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book = new BookManager().createBook("Rich Dad Poor Dad", "Robert Kiyosaki");
        Book book1 = new BookManager().createBook("How to Win Friends and Influence People", "Dale Carnegie");

        System.out.println(book == book1);

    }

}
