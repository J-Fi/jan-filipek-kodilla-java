package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .Bun("Bułka z sezamem")
                .Burgers(3)
                .Sauce("1000 wysp")
                .Ingredient("sałata")
                .Ingredient("cebula")
                .Ingredient("bekon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals("Bułka z sezamem", bigmac.getBun());
        Assert.assertEquals(3, bigmac.getBurgers());
        Assert.assertEquals("1000 wysp", bigmac.getSauce());
        Assert.assertEquals(3, howManyIngredients);
    }
}
