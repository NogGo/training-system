package ru.my.test.patterns.generating_design_patterns.factoryMethod.factory;

import ru.my.test.patterns.generating_design_patterns.factoryMethod.Travels.Travel;
import ru.my.test.patterns.generating_design_patterns.factoryMethod.Travels.WinterTravel;

public class WinDialog extends Dialog {
    @Override
    public Travel createTravel() {
        return new WinterTravel();
    }
}
