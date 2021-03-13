package main.java.rbadenas.supermarket.ticket;

import java.text.MessageFormat;

public class Footer {

    private int totalPrice;

    public Footer() { }

    
    public int getTotalPrice(){
        return this.totalPrice;
    }

    public void accept(TicketVisitor visitor){
        visitor.visit(this);
    }

    public String toString(){
        var formattedPrice = String.format("%6s", totalPrice);
        var message = MessageFormat.format("Footer\t\t\t\t\t\t{0}€", formattedPrice);
        return message;
    }

    public void setTotalPrice(int price) {
        this.totalPrice = price;
    }
}
