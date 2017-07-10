package com.caveofprogramming.spring.test;

/*
 * Dummy implementation of logger.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Logger {

    private ConsoleWriter consoleWriter;

    @Autowired

   // @Inject JSR-330
    private FileWriter fileWriter;


    //@Autowired
    /*public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
*/

    @Autowired(required = false)
    @Qualifier(value = "squirrel")
/*
    @Resource(name = "squirrel") JSR 250
*/
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


    @PostConstruct
    public void init(){

    }

    @PreDestroy
    public void detroy(){

    }

}
