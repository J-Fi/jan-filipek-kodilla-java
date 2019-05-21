package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> thisContinentCountryList = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getThisContinentCountryList() {
        return new ArrayList<>(thisContinentCountryList);
    }

    public void addCountry(Country country) {
        thisContinentCountryList.add(country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;

        Continent continent = (Continent) o;

        return getContinentName().equals(continent.getContinentName());

    }

    @Override
    public int hashCode() {
        return getContinentName().hashCode();
    }
}
