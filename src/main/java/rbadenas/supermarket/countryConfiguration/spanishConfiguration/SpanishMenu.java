package main.java.rbadenas.supermarket.countryConfiguration.spanishConfiguration;

import main.java.rbadenas.supermarket.menu.Menu;
import main.java.rbadenas.supermarket.menu.commands.*;

public class SpanishMenu extends Menu {
    
    public SpanishMenu() {
        super();
    }

    @Override
    protected void setCommands() {
        this.commands.add(new SaleLineCommand());
        this.commands.add(new ReturnLineCommand());
        this.commands.add(new RepetitionLineCommand());
        this.commands.add(new CancellationLineCommand()); 
    }   
}