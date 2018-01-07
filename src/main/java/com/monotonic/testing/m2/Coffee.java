package com.monotonic.testing.m2;

/**
 * Created by MN883H on 1/5/2018.
 */
public final class Coffee {
    private final CoffeeType type;
    private final int beans;
    private final int milk;

    public Coffee(CoffeeType coffeeType,int beans,int milk){
        this.type = coffeeType;
        this.beans = beans;
        this.milk = milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getMilk() {
        return milk;
    }

    public CoffeeType getType() {
        return type;
    }

    @Override
    public String toString() {
        System.out.println("Test");
        return "Coffee{" +
                "type=" + type +
                "milk=" + milk +
                "beans=" + beans +
                "}";
    }
}
