package ru.my.test.patterns.factoryMethod.factory;

import ru.my.test.patterns.factoryMethod.Travels.Travel;
import ru.my.test.patterns.factoryMethod.Travels.WinterTravel;

public class WinDialog extends Dialog {
    @Override
    public Travel createTravel() {
        return new WinterTravel();
    }
}
