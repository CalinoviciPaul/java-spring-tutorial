package com.caveofprogramming.spring.test;

public class ConsoleWriter implements LogWriter {

	public ConsoleWriter() {
	}

	public void write(String text) {
		System.out.println(text);
	}

}
