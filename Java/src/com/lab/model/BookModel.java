package com.lab.model;

import java.util.Arrays;

public class BookModel {

    private BookStorage storage;

    public BookModel() {
        storage = new BookStorage();
    }

    public BookEntity[] getStorage() {
        return storage.getStorage();
    }

    public void addBook(String title, String author, String publishingHouse, int year, double price) {
        BookEntity entity = new BookEntity();
        entity.setTitle(title);
        entity.setAuthor(author);
        entity.setPublishingHouse(publishingHouse);
        entity.setYear(year);
        entity.setPrice(price);
        storage.addBook(entity);
    }

    public BookEntity[] findBooksFromSetAuthor(String author) {
        int len = 0;
        BookEntity[] result = new BookEntity[storage.getLength()];
        for (int i = 0; i < storage.getLength(); i++) {
            if (getStorage()[i].getAuthor().equals(author)) {
                result[len] = getStorage()[i];
                len++;
            }
        }
        return Arrays.copyOf(result, len);
    }

    public BookEntity[] findBooksFromSetPublishingHouse(String publishingHouse) {
        int len = 0;
        BookEntity[] result = new BookEntity[storage.getLength()];
        for (int i = 0; i < storage.getLength(); i++) {
            if (getStorage()[i].getPublishingHouse().equals(publishingHouse)) {
                result[len] = getStorage()[i];
                len++;
            }
        }
        return Arrays.copyOf(result, len);
    }

    public BookEntity[] findBooksPublishedLaterThanSetYear(int year) {
        int len = 0;
        BookEntity[] result = new BookEntity[storage.getLength()];
        for (int i = 0; i < storage.getLength(); i++) {
            if (getStorage()[i].getYear() > year) {
                result[len] = getStorage()[i];
                len++;
            }
        }
        return Arrays.copyOf(result, len);
    }
}
