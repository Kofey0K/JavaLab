package com.lab.model;

import java.util.Arrays;

public class BookStorage {
    private BookEntity[] storage = new BookEntity[100];
    private int length;
    public int getLength() {
        return length;
    }
    public BookStorage() {
        length = 0;
        addArrayOfBooks(DataSOS.createArrayOfPredefinedBooks());
    }

    public BookEntity[] getStorage() {
        return Arrays.copyOf(storage, length);
    }

    public void addBook(BookEntity x) {
        storage[length] = x;
        length++;
    }

    public void addArrayOfBooks(BookEntity[] array) {
        for (BookEntity book: array) {
            addBook(book);
        }

    }


}
