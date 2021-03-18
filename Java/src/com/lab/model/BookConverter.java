package com.lab.model;

public class BookConverter {
    public static String toString(BookEntity book){
        return String.format("%-10s%-26s%-26s%-20s%-16s%-16s%n", book.getId(), book.getTitle(), book.getAuthor(), book.getPublishingHouse(), book.getYear(), book.getPrice());
    }
    public static String[] getArrayInString(BookEntity[] entities){
        String[] res = new String[entities.length];
        for (int i = 0; i < entities.length; i++) {
            res[i] = toString(entities[i]);
        }
        return res;
    }
}
