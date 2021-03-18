package com.lab.utility;

import com.lab.view.BookView;

import java.util.Calendar;
import java.util.Scanner;

public class InputUtility {

    private static Scanner sc = new Scanner(System.in);
    private static BookView view;

    public static void setView(BookView view) {
        InputUtility.view = view;
    }

    public static int inputSwitchValueWithScanner() {

        view.printMessage(view.INPUT_INT_SWITCH_DATA);
        while (true) {
            try {
                if (!sc.hasNextInt()) {
                    throw new WrongInputException(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_SWITCH_DATA);
                }
                return sc.nextInt();
            } catch (Exception e) {
                view.printlnMessage(e.getMessage());
            }
        }
    }


    public static int inputYearValueWithScanner() {
        view.printMessage(view.INPUT_INT_YEAR_DATA);
        while (true) {
            try {
                if (!sc.hasNextInt()) {
                    throw new WrongInputException(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_YEAR_DATA);
                }
                int year = sc.nextInt();
                if (year < 0) {
                    throw new NegativeNumberException(view.WRONG_NEGATIVE_DATA + view.INPUT_INT_YEAR_DATA);
                }
                if (year > Calendar.getInstance().get(Calendar.YEAR)) {
                    throw new FutureYearException(view.TOO_BIG_YEAR_DATA + view.INPUT_INT_YEAR_DATA);
                }
                return year;
            } catch (Exception e) {
                view.printlnMessage(e.getMessage());
            }
        }
    }

    public static double inputDoubleValueWithScanner() {

        view.printMessage(view.INPUT_DOUBLE_PRICE_DATA);
        while (true) {
            try {
                if (!sc.hasNextDouble()) {
                    throw new WrongInputException(view.WRONG_INPUT_DOUBLE_PRICE_DATA + view.INPUT_DOUBLE_PRICE_DATA);
                }
                double price = sc.nextDouble();
                if (price < 0) {
                    throw new NegativeNumberException(view.WRONG_NEGATIVE_DATA + view.INPUT_DOUBLE_PRICE_DATA);
                }
                return price;
            } catch (Exception e) {
                view.printlnMessage(e.getMessage());
            }
        }
    }

    public static String inputAuthorValueWithScanner() {
        view.printMessage(view.INPUT_STRING_AUTHOR_DATA);
        String author = sc.nextLine();
        while (author.equals("")) author = sc.nextLine();
        return author;
    }

    public static String inputTitleValueWithScanner() {
        view.printMessage(view.INPUT_STRING_TITLE_DATA);
        String author = sc.nextLine();
        while (author.equals("")) author = sc.nextLine();
        return author;
    }

    public static String inputPublishingHouseValueWithScanner() {
        view.printMessage(view.INPUT_STRING_PUBLISHING_HOUSE_DATA);
        String author = sc.nextLine();
        while (author.equals("")) author = sc.nextLine();
        return author;
    }

    static class NegativeNumberException extends Exception {
        NegativeNumberException() {
        }

        NegativeNumberException(String msg) {
            super(msg);
        }
    }

    static class WrongInputException extends Exception {
        WrongInputException(String msg) {
            super(msg);
            sc.next();
        }
    }

    static class FutureYearException extends Exception {
        FutureYearException() {
        }

        FutureYearException(String msg) {
            super(msg);
        }
    }

}

