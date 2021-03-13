package main.java.rbadenas.supermarket.menu.commands;

import main.java.rbadenas.supermarket.menu.Command;

public class ExitCommand extends Command
{
    private boolean isExecuted;
    public ExitCommand() {
        super("Close ticket");
        this.reset();
    }

    @Override
    public void execute() {
        this.isExecuted = true;
    }

    public boolean isExecuted()
    {
        return this.isExecuted;
    }

    public void reset(){
        this.isExecuted = false;
    } 
}