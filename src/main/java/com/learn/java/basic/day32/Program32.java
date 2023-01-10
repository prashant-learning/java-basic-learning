package com.learn.java.basic.day32;


/**
 * create a class Book with some instance variable (following attribute )
 */


public class Program32 {

    public static void main(String[] args) {

        Book book = new Book(
                "978-8173666025",
                "Head First Java: A Brain-Friendly Guide, 2Nd Edition (Covers Java 5.0)",
                "Kathy Sierra",
                1200.00D
        );
        Book book1= new Book(
                "978-8173666025",
                "Head First Java: A Brain-Friendly Guide, 2Nd Edition (Covers Java 5.0)",
                "Kathy Sierra",
                1200.00D
        );

        Book book3 = book;
        System.out.println(book);
        System.out.println(book3);
        System.out.println(book1);
        System.out.println(book == book3);

        book.displayDetails();

        System.out.println(book.discountedPrice(25));
    }
}
