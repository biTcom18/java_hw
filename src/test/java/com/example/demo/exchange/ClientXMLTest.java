package com.example.demo.exchange;


import com.example.demo.bank.Client;
import com.example.demo.bank.ClientXML;
import com.example.demo.model.Rate;
import org.junit.Test;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertNotNull;


public class ClientXMLTest {

    @Test
    public void testGetRateToday() throws Exception {
        Client client = new ClientXML();
        Rate rate = client.getRate("USD");
        assertNotNull(rate);
    }

    @Test
    public void testGetRate1() throws Exception {
       Client client = new ClientXML();
        String dateString = "08.06.2000";
        DateFormat df = new SimpleDateFormat("dd.mm.yyyy");
        Date date = df.parse(dateString);
        Rate r = client.getRate("uah", date);
        assertNotNull(r);
    }


}