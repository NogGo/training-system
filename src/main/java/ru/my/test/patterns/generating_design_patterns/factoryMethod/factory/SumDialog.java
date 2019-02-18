package ru.my.test.patterns.generating_design_patterns.factoryMethod.factory;

import ru.my.test.patterns.generating_design_patterns.factoryMethod.Travels.SummerTravel;
import ru.my.test.patterns.generating_design_patterns.factoryMethod.Travels.Travel;

public class SumDialog extends Dialog {
    @Override
    public Travel createTravel() {
        return new SummerTravel();
    }
}
