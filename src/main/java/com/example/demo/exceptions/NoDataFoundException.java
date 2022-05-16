package com.example.demo.exceptions;

public class NoDataFoundException
        extends  ExchangeRateApplicationException{
    @Override
    public String getErrorTextMessage() {
        return "No data found";
    }
}