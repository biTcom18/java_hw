package com.example.demo.bank;


import com.example.demo.exceptions.ExchangeRateApplicationException;
import com.example.demo.model.Rate;

import java.util.Date;

public interface Client {

    public abstract Rate getRate(String code, Date date) throws
            ExchangeRateApplicationException;


    /**
     * Get today's currency rate rom CBR
     *
     * @param code - currency code
     */
    public abstract Rate getRate(String code) throws
            ExchangeRateApplicationException;

}