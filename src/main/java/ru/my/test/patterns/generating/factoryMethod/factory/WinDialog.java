package ru.my.test.patterns.generating.factoryMethod.factory;

import ru.my.test.patterns.generating.factoryMethod.Travels.Travel;
import ru.my.test.patterns.generating.factoryMethod.Travels.WinterTravel;

public class WinDialog extends Dialog {
    @Override
    public Travel createTravel() {
        return new WinterTravel();
    }
}
