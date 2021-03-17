package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import org.assertj.core.api.Assertions;
import java.util.List;

public class BusinessWorkerTest {
    @Test
    public void doThat() throws Exception {
        // get Logback Logger
        Logger fooLogger = (Logger) LoggerFactory.getLogger(BusinessWorker.class);

        // create and start a ListAppender
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();

        // add the appender to the logger
        fooLogger.addAppender(listAppender);

        // call method under test
        BusinessWorker foo = new BusinessWorker();
        foo.generateLogs("start");

        // JUnit assertions
        List<ILoggingEvent> logsList = listAppender.list;
        assertEquals("start", logsList.get(0)
                .getMessage());
//        assertEquals(Level.INFO, logsList.get(0)
//                .getLevel());
//
//        assertEquals("finish", logsList.get(1)
//                .getMessage());
//        assertEquals(Level.INFO, logsList.get(1)
//                .getLevel());
    }
}