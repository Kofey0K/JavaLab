package com.lab.controller;

import com.lab.model.BookConverter;
import com.lab.model.BookModel;
import com.lab.utility.InputUtility;
import com.lab.view.BookView;

public class BookController {

    private BookModel model;
    private BookView view;

    public BookController() {
        model = new BookModel();
        view = new BookView();
        InputUtility.setView(view);
    }

    public void addBook() {
        model.addBook(InputUtility.inputTitleValueWithScanner(), InputUtility.inputAuthorValueWithScanner(), InputUtility.inputPublishingHouseValueWithScanner(), InputUtility.inputYearValueWithScanner(), InputUtility.inputDoubleValueWithScanner());
    }

    public void findBooksFromSetAuthor() {
        view.printArray(BookConverter.getArrayInString(model.findBooksFromSetAuthor(InputUtility.inputAuthorValueWithScanner())));
    }

    public void findBooksFromSetPublishingHouse() {
        view.printArray(BookConverter.getArrayInString(model.findBooksFromSetPublishingHouse(InputUtility.inputPublishingHouseValueWithScanner())));
    }

    public void findBooksPublishedLaterThanSetYear() {
        view.printArray(BookConverter.getArrayInString(model.findBooksPublishedLaterThanSetYear(InputUtility.inputYearValueWithScanner())));
    }

    public void runMenu() {
        view.printlnMessage(view.GREETINGS);
        int switchVar;
        while (true) {
            view.printlnMessage(view.MENU_POSSIBILITIES);
            switchVar = InputUtility.inputSwitchValueWithScanner();

            switch (switchVar) {

                case 1:
                    view.printArray(BookConverter.getArrayInString(model.getStorage()));
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    findBooksFromSetAuthor();
                    break;
                case 4:
                    findBooksFromSetPublishingHouse();
                    break;
                case 5:
                    findBooksPublishedLaterThanSetYear();
                    break;
                case 6:
                    System.exit(1000);
                    break;
                default:
                    view.printlnMessage(BookView.WRONG_INPUT_INT_DATA);
                    break;
            }
        }
    }

}
