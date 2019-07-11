package com.kodilla.patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = Logger.getInstance();
        logger.log("Log1");
        logger.log("Log2");
        logger.log("Log3");
        logger.log("Log4");
        logger.log("Log5");

        //when
        String lastLog = logger.getLastLog();

        //
        assertEquals(lastLog, "Log5");
    }
}
