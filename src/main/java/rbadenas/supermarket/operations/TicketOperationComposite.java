package main.java.rbadenas.supermarket.operations;

import java.util.ArrayList;
import java.util.List;

import main.java.rbadenas.supermarket.ticket.Footer;
import main.java.rbadenas.supermarket.ticket.Header;
import main.java.rbadenas.supermarket.ticket.Ticket;
import main.java.rbadenas.supermarket.ticket.lines.*;


public class TicketOperationComposite extends TicketOperation{
    
    private List<TicketOperation> operations;

    public TicketOperationComposite() {
        this.operations = new ArrayList<TicketOperation>();
    }

    public void add(TicketOperation operation){
        this.operations.add(operation);
    }

    @Override
    public void setTicket(Ticket ticket){
        super.setTicket(ticket);
        for (TicketOperation ticketOperation : operations) {
            ticketOperation.setTicket(ticket);
        }
    }

    @Override
    public void visit(SaleLine line) { 
        for (TicketOperation ticketOperation : operations) {
            ticketOperation.visit(line);
        }
    }

    @Override
    public void visit(RepetitionLine line) { 
        for (TicketOperation ticketOperation : operations) {
            ticketOperation.visit(line);
        }
    }

    @Override
    public void visit(CancellationLine line) { 
        for (TicketOperation ticketOperation : operations) {
            ticketOperation.visit(line);
        }
    }

    @Override
    public void visit(ReturnLine line) { 
        for (TicketOperation ticketOperation : operations) {
            ticketOperation.visit(line);
        }
    }

    @Override
    public void visit(Footer footer) { 
        for (TicketOperation ticketOperation : operations) {
            ticketOperation.visit(footer);
        }
    }

    @Override
    public void visit(Header header) { 
        for (TicketOperation ticketOperation : operations) {
            ticketOperation.visit(header);
        }
    }
    
}