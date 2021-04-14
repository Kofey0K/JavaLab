package com.lab.controller;
import com.lab.controller.exceptions.FutureYearException;
import com.lab.controller.exceptions.NegativeNumberException;

import java.util.Calendar;

public class Validator {

    public static void validateYearValue(int year){
        if (year < 0) {
            throw new NegativeNumberException();
        }
        if (year > Calendar.getInstance().get(Calendar.YEAR)) {
            throw new FutureYearException();
        }

    }
    public static void validateDoubleValue(double price){
        if (price < 0) {
            throw new NegativeNumberException();
        }

    }
}
