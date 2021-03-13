package main.java.rbadenas.supermarket.countryConfiguration;

import main.java.rbadenas.supermarket.CurrentCountrySelector;
import main.java.rbadenas.supermarket.menu.Menu;
import main.java.rbadenas.supermarket.ticket.Ticket;

public abstract class CountryFactory {
    
    private static CountryFactory instance;

    public static CountryFactory instance(){
        if(instance == null){
            instance = new CurrentCountrySelector().getCountryFactory();  
        }
        return instance;
    }

    protected CountryFactory() { }


    public abstract Ticket getTicket();

    public abstract Menu getMenu();

}
