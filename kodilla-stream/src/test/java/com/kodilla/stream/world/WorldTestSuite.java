package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPopulation() {
        //Given
        World world = new World();

        Country c1 = new Country("Poland", new BigDecimal("38000000"));
        Country c2 = new Country("Germany", new BigDecimal("88000000"));
        Country c3 = new Country("Japan", new BigDecimal("123000000"));
        Country c4 = new Country("China", new BigDecimal("3123000000"));
        Country c5 = new Country("USA", new BigDecimal("188000000"));

        Continent cont1 = new Continent("Europe");
        Continent cont2 = new Continent("Asia");
        Continent cont3 = new Continent("America");

        cont1.addCountry(c1);
        cont1.addCountry(c2);
        cont2.addCountry(c3);
        cont2.addCountry(c4);
        cont3.addCountry(c5);

        world.addContinent(cont1);
        world.addContinent(cont2);
        world.addContinent(cont3);

        //When
        BigDecimal worldPopulation = world.getPopulation();

        //Then
        BigDecimal bigDecimal = new BigDecimal("3560000000");
        Assert.assertEquals(bigDecimal, worldPopulation);
    }
}
