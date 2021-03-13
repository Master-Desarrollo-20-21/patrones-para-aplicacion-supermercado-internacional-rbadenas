package main.java.rbadenas.supermarket.ticket.lines;

import java.text.MessageFormat;

import main.java.rbadenas.supermarket.ticket.Line;

public abstract class IdLine extends Line
{
    protected int id;
    protected int units;

    protected IdLine(int id, int units) {
        super();
        this.id = id;
        this.units = units;
    }

    public int getId(){
        return this.id;
    }
    public int getUnits(){
        return this.units;
    }

    public String toString(){
        var formattedId = String.format("%4s", id);
        var formattedUnits = String.format("%4s", units);
        var message = MessageFormat.format("\t id: {0}\t{1} uds.\t", formattedId, formattedUnits);
        return message + super.toString();
    }
}