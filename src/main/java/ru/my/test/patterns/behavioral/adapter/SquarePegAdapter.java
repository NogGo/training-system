package ru.my.test.patterns.behavioral.adapter;

public class SquarePegAdapter extends RoundPeg{

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public double getRadius(){
        return (peg.getWidth() * Math.sqrt(2))/2;
    }
}
