package com.example.demo.exceptions;


public class ParseXMLException
        extends ExchangeRateApplicationException {
    public ParseXMLException(String message) {
        super(message);
    }

    public ParseXMLException(Throwable cause) {
        super(cause);
    }

    @Override
    public String getErrorTextMessage() {
        return "Exception while parsing XML data.";
    }
}