package com.caveofprogramming.spring.test;

import java.util.List;

/**
 * Created by IrianLaptop on 7/10/2017.
 */
public class FruitBasket {
    private String name;
    private List<String> fruits;

    public FruitBasket(String name, List<String> fruits) {
        this.name = name;
        this.fruits = fruits;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("contains :\n");
        for (String fruit : fruits){
            sb.append(fruit);
            sb.append("\n");
        }
        return sb.toString();
    }
}
