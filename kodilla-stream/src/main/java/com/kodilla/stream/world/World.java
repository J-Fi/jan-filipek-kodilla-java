package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> continentList = new ArrayList<>();

    public List<Continent> getContinentList() {
        return new ArrayList<>(continentList);
    }

    public void addContinent(Continent continent) {
        continentList.add(continent);
    }

    public BigDecimal getPopulation() {
        BigDecimal worldPopulation = continentList.stream()
                .flatMap(continent -> continent.getThisContinentCountryList().stream())
                .map(country -> country.getPopulation())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return worldPopulation;
    }
}
