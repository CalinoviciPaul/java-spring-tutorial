package com.caveofprogramming.spring.test;

/**
 * Created by IrianLaptop on 7/10/2017.
 */
public class PersonFactory {

    public Person createPerson(int id, String name){
        System.out.println("Using factory to create person.");
        return new Person(id, name);
    }
}
