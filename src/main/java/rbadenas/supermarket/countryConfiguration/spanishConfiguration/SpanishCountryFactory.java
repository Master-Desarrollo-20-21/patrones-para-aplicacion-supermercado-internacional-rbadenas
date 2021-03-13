package main.java.rbadenas.supermarket.countryConfiguration.spanishConfiguration;

import main.java.rbadenas.supermarket.countryConfiguration.CountryFactory;
import main.java.rbadenas.supermarket.countryConfiguration.TicketBuilder;
import main.java.rbadenas.supermarket.menu.Menu;
import main.java.rbadenas.supermarket.ticket.Ticket;

public class SpanishCountryFactory extends CountryFactory{

    private TicketBuilder ticketBuilder;

    public SpanishCountryFactory() {
        super();
        this.ticketBuilder = new SpanishTicketBuilder();
    }

    @Override
    public Ticket getTicket() {
        return ticketBuilder.build();
    }

    @Override
    public Menu getMenu() {
        return new SpanishMenu();
    }
    
}