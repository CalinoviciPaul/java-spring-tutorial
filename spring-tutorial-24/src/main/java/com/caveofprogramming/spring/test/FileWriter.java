package com.caveofprogramming.spring.test;

public class FileWriter implements LogWriter {

	public FileWriter() {
	}

	public void write(String text) {
		// Write to a file here.
		// Dummy implementation
		System.out.println("Write to file: " + text);
		
	}

}
