package main.java.rbadenas.supermarket.ticket;

import java.util.Date;

public class Header {

    private Date date;
    public Header() {
        this.date = new Date();
    }

    public Date getDate(){
        return this.date;
    }

    public void accept(TicketVisitor visitor){
        visitor.visit(this);
    }

    public String toString(){
        return "Head date: " + date;
    }
}
