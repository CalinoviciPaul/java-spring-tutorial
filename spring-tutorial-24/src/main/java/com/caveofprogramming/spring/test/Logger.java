package com.caveofprogramming.spring.test;

/*
 * Dummy implementation of logger.
 */

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {

    @Autowired(required = false)
    private ConsoleWriter consoleWriter;

    @Autowired
    private FileWriter fileWriter;


    //@Autowired
    /*public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
*/    //@Autowired
    public void setConsoleWriter(ConsoleWriter writer) {
        this.consoleWriter = writer;
    }


    //@Autowired
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        if (consoleWriter != null) {
            consoleWriter.write(text);
        }
    }

}
