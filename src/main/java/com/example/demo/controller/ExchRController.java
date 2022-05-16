package com.example.demo.controller;

import com.example.demo.bank.Client;
import com.example.demo.bank.ClientXML;
import com.example.demo.exceptions.ExchangeRateApplicationException;
import com.example.demo.exceptions.InvalidDateFormatException;
import com.example.demo.model.Rate;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class ExchRController {


    @RequestMapping(method = RequestMethod.GET, value = "/api/rate/{code}/{date}")
    public Rate getRate(@PathVariable("code")
                                String code,
                        @PathVariable("date")
                                String date) throws ExchangeRateApplicationException {
        Client clent = getCbrClient();
        Rate r = getCbrClient().getRate(code, parseDate(date));
        return r;

    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/rate/{code}")
    public Rate getRate(@PathVariable("code")
                                String code) throws ExchangeRateApplicationException {
        Rate r = getCbrClient().getRate(code);
        return r;

    }

    @ExceptionHandler(ExchangeRateApplicationException.class)
    public Error handleError(ExchangeRateApplicationException exception) {
        return new Error(exception.getErrorTextMessage());
    }


    private Client getCbrClient() {
        return new ClientXML();
    }

    private Date parseDate(String dateString) throws InvalidDateFormatException {
        DateFormat df = new SimpleDateFormat(Rate.DATE_FORMAT_PATTERN);
        try {
            Date date = df.parse(dateString);
            return date;
        } catch (ParseException e) {
            throw new InvalidDateFormatException(dateString);
        }
    }
}