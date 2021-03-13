package main.java.rbadenas.supermarket;

import main.java.rbadenas.supermarket.countryConfiguration.CountryFactory;
import main.java.rbadenas.supermarket.menu.Menu;

public class Supermarket {

    private boolean isOpen;
    private Menu menu;

    public Supermarket() {
        this.open();
        this.menu = CountryFactory.instance().getMenu();
    }

    public void sell() {
        do {
            var ticket = CountryFactory.instance().getTicket();
            this.menu.execute(ticket);
        } while (this.isOpen);
    }

    public void open() {
        this.isOpen = true;
    }

    public void close() {
        this.isOpen = false;
    }

    public static void main(String args[]) {
        new Supermarket().sell();
    }
}