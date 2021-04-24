package com.example.onlinelibrary.model;

/**
 * Entity representing Book
 */
public class Book {
    private String title,IBAN,author;

    /**
     * Constructor of book
     * @param title title of book
     * @param IBAN IBAN of book
     * @param author author of book
     */
    public Book(String title, String IBAN, String author) {
        this.title = title;
        this.IBAN = IBAN;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getAuthor() {
        return author;
    }
}
