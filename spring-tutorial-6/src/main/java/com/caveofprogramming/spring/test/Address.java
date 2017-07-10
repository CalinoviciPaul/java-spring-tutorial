package com.caveofprogramming.spring.test;

/**
 * Created by IrianLaptop on 7/10/2017.
 */
public class Address {
    private String street;
    private String postcode;


    public Address(String street, String postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
