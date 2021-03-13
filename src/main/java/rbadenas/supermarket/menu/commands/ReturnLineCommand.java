package main.java.rbadenas.supermarket.menu.commands;

import main.java.rbadenas.supermarket.menu.Command;
import main.java.rbadenas.supermarket.ticket.lines.ReturnLine;

public class ReturnLineCommand extends Command {

    public ReturnLineCommand() {
        super("Enter return line");
    }

    @Override
    public void execute() {
        var line = new ReturnLine(askForId(), askForUnits());
        this.ticket.addLine(line);
    }

    private int askForId() {
        return console.readInt("Enter id: ");
    }

    private int askForUnits() {
        return console.readInt("Enter units: ");
    }
}