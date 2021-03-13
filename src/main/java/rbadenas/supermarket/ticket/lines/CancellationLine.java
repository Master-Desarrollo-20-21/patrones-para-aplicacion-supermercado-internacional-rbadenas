package main.java.rbadenas.supermarket.ticket.lines;

import main.java.rbadenas.supermarket.ticket.TicketVisitor;

public class CancellationLine extends NumberLine {

    public CancellationLine(int number) {
        super(number);
    }

    @Override
    public void accept(TicketVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString(){
        return "Cancellation " + super.toString();
    }
}