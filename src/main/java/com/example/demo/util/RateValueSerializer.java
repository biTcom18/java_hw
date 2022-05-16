package com.example.demo.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.BigDecimal;


public class RateValueSerializer
        extends JsonSerializer<BigDecimal> {
    @Override
    public void serialize(BigDecimal rateValue,
                          JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider)
            throws IOException {
        jsonGenerator.writeString(rateValue.toString());

    }
}