package com.example.demo.exceptions;


public class UnknownCharCodeException
        extends ExchangeRateApplicationException {

    private String code;

    public UnknownCharCodeException(String code) {
        super("Unknown currency code : [" + code+"]");
        this.code = code;
    }

    @Override
    public String getErrorTextMessage() {
        return getMessage();
    }
}