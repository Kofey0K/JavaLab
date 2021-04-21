package com.lab.controller;

import com.lab.controller.exceptions.FutureYearException;
import com.lab.controller.exceptions.NegativeNumberException;
import com.lab.model.BookConverter;
import com.lab.model.BookModel;
import com.lab.utility.InputUtility;
import com.lab.view.BookView;

import java.io.IOException;

public class BookController {

    private BookModel model;
    private BookView view;

    public BookController() {
        view = new BookView();
        try {
            model = new BookModel();
        } catch (IOException | ClassNotFoundException e){
            view.printlnMessage(view.LOAD_FAILED);
            System.exit(-1);
        }
        InputUtility.setView(view);

    }

    public void addBook() {
        int year = InputUtility.inputYearValueWithScanner();
        try {
            Validator.validateYearValue(year);
        } catch (NegativeNumberException e) {
            view.printlnMessage(view.WRONG_NEGATIVE_DATA);
            return;
        } catch (FutureYearException e) {
            view.printlnMessage(view.TOO_BIG_YEAR_DATA);
            return;
        }
        double price = InputUtility.inputDoubleValueWithScanner();
        try {
            Validator.validateDoubleValue(price);
        } catch (NegativeNumberException e) {
            view.printlnMessage(view.WRONG_NEGATIVE_DATA);
            return;
        }
        model.addBook(InputUtility.inputTitleValueWithScanner(), InputUtility.inputAuthorValueWithScanner(), InputUtility.inputPublishingHouseValueWithScanner(), year, price);
    }

    public void findBooksFromSetAuthor() {
        String[] array = BookConverter.getArrayInString(model.findBooksFromSetAuthor(InputUtility.inputAuthorValueWithScanner()));
        view.printArray(array);
        askForSave(array);
    }

    public void findBooksFromSetPublishingHouse() {
        String[] array = BookConverter.getArrayInString(model.findBooksFromSetPublishingHouse(InputUtility.inputPublishingHouseValueWithScanner()));
        view.printArray(array);
        askForSave(array);
    }

    public void findBooksPublishedLaterThanSetYear() {
        String[] array = BookConverter.getArrayInString(model.findBooksPublishedLaterThanSetYear(InputUtility.inputYearValueWithScanner()));
        view.printArray(array);
        askForSave(array);
    }
    public void save(){
        try{
        model.save();
        } catch (IOException | NullPointerException e){
            view.printlnMessage(view.SAVE_FAILED);
        }

    }

    public void askForSave(String[] result){
        view.printlnMessage(view.ASK_FOR_SAVE);
        String yesNo = InputUtility.inputYesNoConfirmation();
        if( yesNo.equals("y")){
            try {
                model.saveSearchResult(result);
                view.printlnMessage(view.SUCCESSFUL_SAVE);
            } catch (IOException e){
                view.printlnMessage(view.SAVE_FAILED);
            }
        }
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
                    save();
                    System.exit(1000);
                    break;
                default:
                    view.printlnMessage(BookView.WRONG_INPUT_INT_DATA);
                    break;
            }
        }
    }

}
