package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Person person = (Person)context.getBean("person");
		person.speak();

		Person person2 = (Person)context.getBean("person");
		person.speak();

		person.setTaxId(666);

		Address address = (Address) context.getBean("address");
		System.out.println(person2);
		System.out.println(address);
		((ClassPathXmlApplicationContext)context).close();
	}
}
