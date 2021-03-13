package main.java.rbadenas.supermarket.menu;

import main.java.rbadenas.supermarket.ticket.Ticket;
import main.java.rbadenas.utils.Console;

public abstract class Command {
    
    private String title;
    protected Ticket ticket;
    protected Console console;

    protected Command(String title) {
        this.title = title;
        this.console = Console.instance();
    }

    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public String getTitle(){
        return this.title;
    }

    public abstract void execute();
}
