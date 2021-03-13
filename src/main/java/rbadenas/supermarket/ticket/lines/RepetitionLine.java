package main.java.rbadenas.supermarket.ticket.lines;

import main.java.rbadenas.supermarket.ticket.TicketVisitor;

public class RepetitionLine extends NumberLine {

    public RepetitionLine(int number) {
        super(number);
    }

    @Override
    public void accept(TicketVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString(){
        return "Repetition " + super.toString();
    }
}