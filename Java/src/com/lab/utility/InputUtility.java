package com.lab.utility;

import com.lab.view.BookView;

import java.util.InputMismatchException;
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
                return sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                view.printlnMessage(view.WRONG_INPUT_INT_DATA + "\n" + view.MENU_POSSIBILITIES + view.INPUT_INT_SWITCH_DATA);
            }
        }
    }


    public static int inputYearValueWithScanner() {
        view.printMessage(view.INPUT_INT_YEAR_DATA);
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                view.printlnMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_YEAR_DATA);
            }
        }
    }

    public static double inputDoubleValueWithScanner() {

        view.printMessage(view.INPUT_DOUBLE_PRICE_DATA);
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                view.printlnMessage(view.WRONG_INPUT_DOUBLE_PRICE_DATA + view.INPUT_DOUBLE_PRICE_DATA);
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


}

