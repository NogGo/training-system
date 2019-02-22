package ru.my.test.patterns.generating.abstractFactory.factories;

import ru.my.test.patterns.generating.abstractFactory.chairs.Chair;
import ru.my.test.patterns.generating.abstractFactory.chairs.ItalianChair;
import ru.my.test.patterns.generating.abstractFactory.sofa.ItalianSofa;
import ru.my.test.patterns.generating.abstractFactory.sofa.Sofa;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class ItalianFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ItalianChair();
    }

    @Override
    public Sofa createSofa() {
        return new ItalianSofa();
    }
}
