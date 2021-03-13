package main.java.rbadenas.supermarket.ticket;

import java.util.ArrayList;
import java.util.List;

import main.java.rbadenas.utils.Console;

public class Ticket {
    
    private Header header;
    private Footer footer;
    private List<Line> lines;
    private TicketVisitor globalTicketOperation;
    private TicketVisitor lineTicketOperation;

    public Ticket(Header header, Footer footer) {
        this.header = header;
        this.footer = footer;
        this.lines = new ArrayList<Line>();
    }

    public void setLineTicketOperation(TicketVisitor lineTicketOperation){
        this.lineTicketOperation = lineTicketOperation;
    }

    public void setGlobalTicketOperation(TicketVisitor globalTicketOperation){
        this.globalTicketOperation = globalTicketOperation;
    }

    public void open(){
        header.accept(this.lineTicketOperation);
    }

    public void addLine(Line line){
        line.accept(this.lineTicketOperation);
        this.lines.add(line);
    }

    public void close(){
        header.accept(globalTicketOperation);
        for (Line line : lines) {
            line.accept(globalTicketOperation);
        }
        footer.accept(lineTicketOperation);
        footer.accept(globalTicketOperation);
        this.print();
    }

    private void print() {
        Console.instance().writeln("\n\n*** Ticket report ***\n");
        Console.instance().writeln(header.toString()+"\n");
        for (Line line : lines) {
            Console.instance().writeln(" " + line.toString());
        }
        Console.instance().writeln("\n"+footer.toString() + "\n\n");
    }

    public boolean isValidLine(int number){
        return 0 <= number && number <= lines.size()-1;
    }
    
    public Line getLine(int number){
        return this.lines.get(number);
    }

}