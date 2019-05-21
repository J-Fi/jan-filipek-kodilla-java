package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal population;

    public Country(final String countryName, final BigDecimal population) {
        this.countryName = countryName;
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        return getCountryName().equals(country.getCountryName());

    }

    @Override
    public int hashCode() {
        return getCountryName().hashCode();
    }
}
