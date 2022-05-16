package com.example.demo.exceptions;


import com.example.demo.model.Rate;

public class InvalidDateFormatException
        extends ExchangeRateApplicationException {

    public InvalidDateFormatException(String stringDate) {
        super("Illegal date: [" + stringDate + "]." +
                " Correct form: [" + Rate.DATE_FORMAT_PATTERN + "]");
    }

    @Override
    public String getErrorTextMessage() {
        return getMessage();
    }
}