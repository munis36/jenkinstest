package com.monotonic.testing.m2;

/**
 * Created by MN883H on 1/5/2018.
 */
public final class Cafe {
    private int beansInStock = 0;
    private int milkInStock = 0;

    public Coffee brew(CoffeeType coffeeType){
        return brew(coffeeType, 1);
    }

    public Coffee brew(CoffeeType coffeeType, int quantity){

        requirePositive(quantity);
        int requiredBeans= coffeeType.getRequiredBeans() * quantity;
        int requiredMilk = coffeeType.getRequiredMilk() * quantity;
        if (requiredBeans > beansInStock || requiredMilk > milkInStock){
            throw new IllegalStateException("Insufficient beans or milk");
        }
        beansInStock -= requiredBeans;
        milkInStock -= milkInStock;

        return new Coffee(coffeeType, requiredBeans, requiredMilk);
    }

    public void restockBeans(int weightInGrams){
        requirePositive(weightInGrams);
        beansInStock += weightInGrams;
    }

    public void restockMilk(int weightInLitres){
        requirePositive(weightInLitres);
        milkInStock += weightInLitres;
    }

    private void requirePositive(int qty){
        if(qty < 1){
            throw new IllegalArgumentException();
        }
    }

    public int getBeansInStock() {
        return beansInStock;
    }

    public int getMilkInStock() {
        return milkInStock;
    }
}
