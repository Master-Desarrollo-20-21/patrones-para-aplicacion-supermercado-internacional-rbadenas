package main.java.rbadenas.supermarket.countryConfiguration;

import main.java.rbadenas.supermarket.operations.TicketOperationComposite;
import main.java.rbadenas.supermarket.ticket.Footer;
import main.java.rbadenas.supermarket.ticket.Header;
import main.java.rbadenas.supermarket.ticket.Ticket;

public abstract class TicketBuilder {

    private TicketOperationComposite globalTicketOperation;
    private TicketOperationComposite lineTicketOperation;

    protected TicketBuilder() {}

    public Ticket build(){

        var ticket = new Ticket(this.getHeader(), this.getFooter());

        this.lineTicketOperation = this.getLineTicketOperation();
        this.globalTicketOperation = this.getGlobalTicketOperation();

        this.lineTicketOperation.setTicket(ticket);
        this.globalTicketOperation.setTicket(ticket);
        
        ticket.setLineTicketOperation(this.lineTicketOperation);
        ticket.setGlobalTicketOperation(this.globalTicketOperation);

        return ticket;
    }

    public abstract Header getHeader();
    public abstract Footer getFooter();

    public abstract TicketOperationComposite getGlobalTicketOperation();
    public abstract TicketOperationComposite getLineTicketOperation();
}
