package main.java.rbadenas.supermarket.ticket.lines;

import java.text.MessageFormat;

import main.java.rbadenas.supermarket.ticket.Line;

public abstract class NumberLine extends Line
{
    protected int number;

    protected NumberLine(int number) {
        super();
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public String toString(){
        var formattedNumber = String.format("%4s", number+1);
        var message = MessageFormat.format("\tnum: {0}\t\t\t", formattedNumber);
        return message + super.toString();
    }
}