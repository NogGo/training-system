package ru.my.test.patterns.generating.factoryMethod.v1.factory;

import ru.my.test.patterns.generating.factoryMethod.v1.Travels.SummerTravel;
import ru.my.test.patterns.generating.factoryMethod.v1.Travels.Travel;

public class SumDialog extends Dialog {
    @Override
    public Travel createTravel() {
        return new SummerTravel();
    }
}
