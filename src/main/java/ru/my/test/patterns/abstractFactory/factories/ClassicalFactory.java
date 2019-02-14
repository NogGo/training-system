package ru.my.test.patterns.abstractFactory.factories;

import ru.my.test.patterns.abstractFactory.chairs.Chair;
import ru.my.test.patterns.abstractFactory.chairs.ClassicalChair;
import ru.my.test.patterns.abstractFactory.sofa.ClassicalSofa;
import ru.my.test.patterns.abstractFactory.sofa.Sofa;

public class ClassicalFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ClassicalChair();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicalSofa();
    }
}
