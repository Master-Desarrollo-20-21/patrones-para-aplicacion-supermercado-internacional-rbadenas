package main.java.rbadenas.supermarket.operations;

import main.java.rbadenas.supermarket.ticket.TicketVisitor;
import main.java.rbadenas.supermarket.ticket.Ticket;
import main.java.rbadenas.supermarket.ticket.Footer;
import main.java.rbadenas.supermarket.ticket.Header;
import main.java.rbadenas.supermarket.ticket.lines.*;

public class TicketOperation implements TicketVisitor {

    protected Ticket ticket;
    
    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void visit(SaleLine line) { }

    @Override
    public void visit(RepetitionLine line) { }

    @Override
    public void visit(CancellationLine line) { }

    @Override
    public void visit(ReturnLine line) { }

    @Override
    public void visit(Footer footer) { }

    @Override
    public void visit(Header header) { }
    
}