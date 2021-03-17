package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example {

    private static final Logger LOGGER = LoggerFactory.getLogger(Example.class);

    public void methodWithLogInfo(String message) {
        LOGGER.info(message);
    }
}