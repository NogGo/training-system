package ru.my.test.patterns.generating_design_patterns.abstractFactory.factories;

import ru.my.test.patterns.generating_design_patterns.abstractFactory.chairs.Chair;
import ru.my.test.patterns.generating_design_patterns.abstractFactory.chairs.ItalianChair;
import ru.my.test.patterns.generating_design_patterns.abstractFactory.sofa.ItalianSofa;
import ru.my.test.patterns.generating_design_patterns.abstractFactory.sofa.Sofa;

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
