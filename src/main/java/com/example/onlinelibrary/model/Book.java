package com.example.onlinelibrary.model;

public class Book {
    private String title,IBAN,author;

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
