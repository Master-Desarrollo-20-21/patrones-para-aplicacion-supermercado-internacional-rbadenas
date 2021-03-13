package main.java.rbadenas.supermarket.menu.commands;

import main.java.rbadenas.supermarket.menu.Command;
import main.java.rbadenas.supermarket.ticket.lines.SaleLine;

public class SaleLineCommand extends Command {

    public SaleLineCommand() {
        super("Enter sale line");
    }

    @Override
    public void execute() {
        var line = new SaleLine(askForId(), askForUnits());
        this.ticket.addLine(line);
    }

    private int askForId() {
        return console.readInt("Enter id: ");
    }

    private int askForUnits() {
        return console.readInt("Enter units: ");
    }
}