package ru.my.test.patterns.generating.abstractFactory.factories;

import ru.my.test.patterns.generating.abstractFactory.chairs.Chair;
import ru.my.test.patterns.generating.abstractFactory.sofa.Sofa;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa();
}
