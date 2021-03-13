package main.java.rbadenas.supermarket.ticket;

import main.java.rbadenas.supermarket.ticket.lines.*;

public interface TicketVisitor {
    void visit(SaleLine line);
    
    void visit(RepetitionLine line);
    
    void visit(CancellationLine line);
    
    void visit(ReturnLine line);
    
    void visit(Footer footer);
    
    void visit(Header header);
    
}