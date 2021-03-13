package main.java.rbadenas.supermarket.menu;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import main.java.rbadenas.supermarket.menu.commands.ExitCommand;
import main.java.rbadenas.supermarket.ticket.Ticket;
import main.java.rbadenas.utils.Console;

public abstract class Menu {

    protected List<Command> commands;
    private ExitCommand exitCommand;

    public Menu() {
        this.commands = new ArrayList<Command>();
        this.setCommands();

        this.exitCommand = new ExitCommand();
        this.commands.add(this.exitCommand);
    }

    protected abstract void setCommands();

    public void execute(Ticket ticket){
        this.associateTicketToCommands(ticket);
        do{
            this.commands.get(getOption()).execute();
        }while(!isClosed());
        ticket.close();
    }

    private void associateTicketToCommands(Ticket ticket){
        for (Command command : commands) {
            command.setTicket(ticket);
        }
    }

    private void write(){
        for (int i = 0; i < commands.size(); i++) {
            var message = MessageFormat.format(" {0} {1}", i+1, commands.get(i).getTitle());
            Console.instance().writeln(message);
        }
    }

    private int getOption(){

        int optionId;

        do{
            Console.instance().writeln("Menu:");
            String text = "Select an option [1-" + commands.size() + "]";
            this.write();
            optionId = Console.instance().readInt(text);
        }while(!this.isValidOptionId(optionId));

        return optionId - 1;
    }

    private boolean isValidOptionId(int optionId){
        return 1 <= optionId && optionId <= commands.size();
    }

    public boolean isClosed(){
        return this.exitCommand.isExecuted();
    }

}