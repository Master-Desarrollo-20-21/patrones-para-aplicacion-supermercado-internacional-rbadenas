package main.java.rbadenas.supermarket.ticket;

import java.text.MessageFormat;

public abstract class Line {
    
    protected int price;

    public Line() {}

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public abstract void accept(TicketVisitor visitor);

    public String toString(){
        //return "   price: " + price;

        var formattedPrice = String.format("%6s", price);
        var message = MessageFormat.format("{0}€\t", formattedPrice);
        return message;
    }
}
