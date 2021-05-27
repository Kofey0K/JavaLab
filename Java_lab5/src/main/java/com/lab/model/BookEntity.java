package com.lab.model;

import java.io.Serializable;

public class BookEntity implements Serializable {
    private static int amount = 0;
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int year;
    private double price;

    public BookEntity(String title, String author, String publishingHouse, int year, double price) {
        amount++;
        this.id = amount;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.price = price;
    }

    public BookEntity() {
        amount++;
        this.id = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
