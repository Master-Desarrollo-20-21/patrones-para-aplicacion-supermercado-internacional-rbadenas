package main.java.rbadenas.supermarket.operations.global;

import main.java.rbadenas.supermarket.ticket.lines.*;
import main.java.rbadenas.supermarket.ticket.Footer;

public class TotalPriceCalculator extends GlobalTicketOperation {
    
    private int total;

    
    @Override
    public void visit(SaleLine line) {
        this.total += line.getPrice();
    }

    @Override
    public void visit(RepetitionLine line) {
        this.total += line.getPrice();
    }

    @Override
    public void visit(CancellationLine line) {
        this.total += line.getPrice();
    }

    @Override
    public void visit(ReturnLine line) {
        this.total += line.getPrice();
    }

    @Override
    public void visit(Footer footer) {
        footer.setTotalPrice(total);
    }
}
