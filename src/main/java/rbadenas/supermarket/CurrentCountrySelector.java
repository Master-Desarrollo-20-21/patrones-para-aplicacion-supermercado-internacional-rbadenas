package main.java.rbadenas.supermarket;

import main.java.rbadenas.supermarket.countryConfiguration.CountryFactory;
import main.java.rbadenas.supermarket.countryConfiguration.spanishConfiguration.SpanishCountryFactory;

public class CurrentCountrySelector {
    
    public CurrentCountrySelector() {}

    public CountryFactory getCountryFactory(){
        return new SpanishCountryFactory();
    }
}