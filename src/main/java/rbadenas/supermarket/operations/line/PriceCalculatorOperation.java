package main.java.rbadenas.supermarket.operations.line;

import main.java.rbadenas.supermarket.ticket.lines.*;

public class PriceCalculatorOperation extends LineTicketOperation {
    
    private final static int MAX_PRICE = 100;
    private final static int MIN_PRICE = 10;

    @Override
    public void visit(SaleLine line) {
        var price = line.getUnits() * getRandomPrice();
        line.setPrice(price);
    }

    @Override
    public void visit(RepetitionLine line) {
        SaleLine saleLine = (SaleLine)ticket.getLine(line.getNumber());
        line.setPrice(saleLine.getPrice());
    }

    @Override
    public void visit(CancellationLine line) {
        SaleLine saleLine = (SaleLine)ticket.getLine(line.getNumber());
        var price = saleLine.getUnits() * getRandomPrice();
        line.setPrice(-price);
    }

    @Override
    public void visit(ReturnLine line) {
        var price = line.getUnits() * getRandomPrice();
        line.setPrice(-price);
    }

    private int getRandomPrice(){
        return (int)Math.floor(Math.random()*(MIN_PRICE-MAX_PRICE)+MAX_PRICE);
    }
}
