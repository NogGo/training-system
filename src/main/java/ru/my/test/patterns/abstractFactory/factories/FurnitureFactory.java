package ru.my.test.patterns.abstractFactory.factories;

import ru.my.test.patterns.abstractFactory.chairs.Chair;
import ru.my.test.patterns.abstractFactory.sofa.Sofa;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa();
}
