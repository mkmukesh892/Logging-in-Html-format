package com.vogella.logger.test;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.vogella.logger.MyLogger;
public class UseLogger {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);


    public void doSomeThingAndLog() {
        // ... more code

        // now we demo the logging

        // set the LogLevel to Severe, only severe Messages will be written
        LOGGER.setLevel(Level.SEVERE);
        LOGGER.severe("this is a serve log");
        LOGGER.warning("this is warning log");
        LOGGER.info("this is info log");
        LOGGER.finest("Really not important");

        // set the LogLevel to Info, severe, warning and info will be written
        // finest is still not written
        LOGGER.setLevel(Level.INFO);
        LOGGER.severe("severe Log");
        LOGGER.warning("warning Log");
        LOGGER.info("Info Log");
        LOGGER.finest("Really not important");
       
        //display all message
        LOGGER.setLevel(Level.ALL);
        
        
    	LOGGER.log(Level.SEVERE, "severe log is happend");   
        LOGGER.log(Level.WARNING, "warning log is happend");
        LOGGER.log(Level.INFO, "info log is happend");
        LOGGER.log(Level.CONFIG, "config log is happend");
        LOGGER.log(Level.FINE, "fine log is happend"); 
        LOGGER.log(Level.FINER, "finer log is happend");
        LOGGER.log(Level.FINEST, "finest log is happend");     
        LOGGER.log(Level.ALL, "all log is display");       

    }

    public static void main(String[] args) {
        UseLogger tester = new UseLogger();
        try {
            MyLogger.setup();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problems with creating the log files");
        }
        tester.doSomeThingAndLog();
    }
}
