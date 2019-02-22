package ru.my.test.patterns.generating_design_patterns.abstractFactory.app;

import ru.my.test.patterns.generating_design_patterns.abstractFactory.chairs.Chair;
import ru.my.test.patterns.generating_design_patterns.abstractFactory.factories.FurnitureFactory;
import ru.my.test.patterns.generating_design_patterns.abstractFactory.sofa.Sofa;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {

    private Chair chair;
    private Sofa sofa;

    public Application(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
    }

    public void caculate() {
        chair.legLength();
        chair.seatWidth();

        sofa.doing();
    }
}
