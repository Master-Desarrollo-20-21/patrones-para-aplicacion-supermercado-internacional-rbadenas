package main.java.rbadenas.supermarket.menu.commands;

import main.java.rbadenas.supermarket.menu.Command;
import main.java.rbadenas.supermarket.ticket.lines.CancellationLine;

public class CancellationLineCommand extends Command {

    public CancellationLineCommand() {
        super("Enter cancellation line");
    }

    @Override
    public void execute() {
        var line = new CancellationLine(askForNumber());
        this.ticket.addLine(line);
    }

    private int askForNumber() {
        int number;
        do{
            number = console.readInt("Enter number: ");
        }while(!ticket.isValidLine(number-1));

        return number-1;
    }
}