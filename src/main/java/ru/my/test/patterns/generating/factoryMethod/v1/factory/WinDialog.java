package ru.my.test.patterns.generating.factoryMethod.v1.factory;

import ru.my.test.patterns.generating.factoryMethod.v1.Travels.Travel;
import ru.my.test.patterns.generating.factoryMethod.v1.Travels.WinterTravel;

public class WinDialog extends Dialog {
    @Override
    public Travel createTravel() {
        return new WinterTravel();
    }
}
