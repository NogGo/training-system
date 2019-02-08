package ru.my.test.patterns.factoryMethod.factory;

import ru.my.test.patterns.factoryMethod.Travels.Travel;

/**
 * Базовый класс фабрики. Заметьте, что "фабрика" – это всего лишь
 * дополнительная роль для класса. Он уже имеет какую-то бизнес-логику, в
 * которой требуется создание разнообразных продуктов.
 */

public abstract class Dialog {

    public void selectTranspot() {
        Travel travel = createTravel();
        travel.startPack();
    }

    public abstract Travel createTravel();
}