package ru.my.test.patterns.generating.abstractFactory.chairs;

public class ClassicalChair implements Chair{
    @Override
    public void legLength() {
        System.out.println("Calculate legLength for  ClassicalChair");
    }

    @Override
    public void seatWidth() {
        System.out.println("Calculate seatWidth for  ClassicalChair");
    }
}
