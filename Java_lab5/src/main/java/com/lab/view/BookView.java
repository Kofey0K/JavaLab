package com.lab.view;

public class BookView {
    public static final String INPUT_INT_YEAR_DATA = "Enter the year of publishing = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please.";
    public static final String INPUT_STRING_TITLE_DATA = "Enter the title of the book = ";
    public static final String INPUT_STRING_AUTHOR_DATA = "Enter the author of the book = ";
    public static final String INPUT_STRING_PUBLISHING_HOUSE_DATA = "Enter the publishing house = ";
    public static final String INPUT_DOUBLE_PRICE_DATA = "Enter the price of the book = ";
    public static final String WRONG_INPUT_DOUBLE_PRICE_DATA = "Wrong input! Repeat please.";
    public static final String NO_RESULTS_FOUND = "No results found!";
    public static final String GREETINGS = "Greetings, user!";
    public static final String INPUT_INT_SWITCH_DATA = "Enter a number according to what you want to do.";
    public static final String MENU_POSSIBILITIES =
            "\n1 - Show all books\n" +
                    "2 - Add a book\n" +
                    "3 - Search for books from an author\n" +
                    "4 - Search for books from a publishing house\n" +
                    "5 - Search for books published later than set year\n" +
                    "6 - Exit\n";
    public static final String WRONG_NEGATIVE_DATA = "Wrong input! This number cannot be less than zero.";
    public static final String TOO_BIG_YEAR_DATA = "Wrong input! This year has not come yet.";
    public static final String SAVE_FAILED = "Something went wrong! The data wasn't saved.";
    public static final String LOAD_FAILED = "Something went wrong! The data wasn't loaded.";
    public static final String ASK_FOR_SAVE = "Would you like to save this search result?\n y- yes, n - no";
    public static final String SUCCESSFUL_SAVE = "Successfully saved! You can find your saved_books.txt file at your documents folder.";
    //...//

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printlnMessage(String message) {
        System.out.println(message);
    }

    public void printArray(String[] array) {
        System.out.printf("%-10s%-26s%-26s%-20s%-16s%-16s%n", "Id", "Title", "Author", "Publishing House", "Year", "Price");
        System.out.printf("----------------------------------------------------------------------------------------------------------\n");
        if (array.length > 0)
            for (int i = 0; i < array.length; ++i) {
                printMessage(array[i]);
            }
        else printlnMessage(NO_RESULTS_FOUND);
    }

}
