package com.lab.controller.exceptions;

public class FutureYearException extends RuntimeException {
    public FutureYearException(String msg) {
        super(msg);
    }
    public FutureYearException(){}
}
