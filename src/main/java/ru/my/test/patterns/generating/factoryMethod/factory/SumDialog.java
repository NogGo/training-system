package ru.my.test.patterns.generating.factoryMethod.factory;

import ru.my.test.patterns.generating.factoryMethod.Travels.SummerTravel;
import ru.my.test.patterns.generating.factoryMethod.Travels.Travel;

public class SumDialog extends Dialog {
    @Override
    public Travel createTravel() {
        return new SummerTravel();
    }
}
