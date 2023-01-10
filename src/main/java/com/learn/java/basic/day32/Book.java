package com.learn.java.basic.day32;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private double price;


    // parametriased constructor
    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public void displayDetails() {
        System.out.println("isbn number: " + this.isbn
                + " title of the book: " + this.title
                + " author is : " + this.author
                + " price of the book is " + this.price
        );
    }

    /**
     *    100  10%   =>  90
     *
     *    100 - ( 100 * 10 / 100)  = 90
     *
     *    CP SP DP
     *
     *   price  - ( price * 10  / 100)  =  90
     *
     */

    public double discountedPrice(double percentage){
      //  this() calls current constructor
       // super() immediate parent constructor

       double discountedPrice =  this.price - ((this.price * percentage)/100);

        return discountedPrice;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
