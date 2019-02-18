package ru.my.test.patterns.generating_design_patterns.abstractFactory.chairs;

public class ItalianChair implements Chair{
    @Override
    public void legLength() {
        System.out.println("Calculate legLength for  ItalianChair");
    }

    @Override
    public void seatWidth() {
        System.out.println("Calculate seatWidth for  ItalianChair");

    }
}
