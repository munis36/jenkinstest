package com.monotonic.testing.m2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by MN883H on 1/5/2018.
 */
public class CafeTest {
    // can brew espresso
    @Test
    public void canBrewEspresso(){
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        //it is an espress!
        //no milk
        //that we've got enough coffee
        Assert.assertEquals(CoffeeType.Espresso, coffee.getType());
        Assert.assertEquals(0,coffee.getMilk());
        Assert.assertEquals(7,coffee.getBeans());
    }
}
