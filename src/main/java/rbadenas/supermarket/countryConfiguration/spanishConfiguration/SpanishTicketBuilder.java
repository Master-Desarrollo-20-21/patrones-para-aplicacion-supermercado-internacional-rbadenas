package main.java.rbadenas.supermarket.countryConfiguration.spanishConfiguration;

import main.java.rbadenas.supermarket.countryConfiguration.TicketBuilder;
import main.java.rbadenas.supermarket.operations.TicketOperationComposite;
import main.java.rbadenas.supermarket.operations.line.*;
import main.java.rbadenas.supermarket.operations.global.*;
import main.java.rbadenas.supermarket.ticket.Footer;
import main.java.rbadenas.supermarket.ticket.Header;

public class SpanishTicketBuilder extends TicketBuilder{

    public SpanishTicketBuilder() {
        super();
    }


    @Override
    public Header getHeader() {
        return new SpanishHeader();
    }

    @Override
    public Footer getFooter() {
        return new SpanishFooter();
    }

    @Override
    public TicketOperationComposite getGlobalTicketOperation() {

        var globalTicketOperation = new TicketOperationComposite();
        globalTicketOperation.add(new TotalPriceCalculator());
        globalTicketOperation.add(new TaxPrinterOperation());
        globalTicketOperation.add(new ScreenViewerOperation());

        return globalTicketOperation;
    }

    @Override
    public TicketOperationComposite getLineTicketOperation() {

        var lineTicketOperation = new TicketOperationComposite();
        lineTicketOperation.add(new PriceCalculatorOperation());
        lineTicketOperation.add(new ThreeXTwoOfertOperation());

        return lineTicketOperation;
    }
    
}