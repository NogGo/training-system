package ru.my.test.patterns.generating.factoryMethod.factory;

import ru.my.test.patterns.generating.factoryMethod.Travels.Travel;

/**
 * Базовый класс фабрики. Заметьте, что "фабрика" – это всего лишь
 * дополнительная роль для класса. Он уже имеет какую-то бизнес-логику, в
 * которой требуется создание разнообразных продуктов.
 */

public abstract class Dialog {

    /**
     * Используем фабричный метод. Бизнес-логика не зависит от
     * конкретных классов продуктов. Travel — это общий
     * интерфейс путешествий, поэтому все хорошо.
     **/
    public void pack() {
        Travel travel = createTravel();
        travel.startPack();
    }

    /**
     * Подклассы будут переопределять этот метод, чтобы создавать конкретные
     * объекты продуктов, разные для каждой фабрики.
     */
    public abstract Travel createTravel();
}