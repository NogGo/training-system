package ru.my.test.patterns.generating.builder.build;

import ru.my.test.patterns.generating.builder.cars.Type;
import ru.my.test.patterns.generating.builder.components.Engine;
import ru.my.test.patterns.generating.builder.components.GPSNavigator;
import ru.my.test.patterns.generating.builder.components.Transmission;
import ru.my.test.patterns.generating.builder.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {

    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
