package main.java.rbadenas.supermarket.ticket.lines;

import main.java.rbadenas.supermarket.ticket.TicketVisitor;

public class SaleLine extends IdLine {

    public SaleLine(int id, int units) {
        super(id, units);
    }

    @Override
    public void accept(TicketVisitor visitor) {
        visitor.visit(this);
    }   

    @Override
    public String toString(){
        return "SaleLine " + super.toString();
    }
}