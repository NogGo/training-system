package ru.my.test.patterns.generating_design_patterns.builder.build;

import ru.my.test.patterns.generating_design_patterns.builder.cars.Car;
import ru.my.test.patterns.generating_design_patterns.builder.cars.Type;
import ru.my.test.patterns.generating_design_patterns.builder.components.Engine;
import ru.my.test.patterns.generating_design_patterns.builder.components.GPSNavigator;
import ru.my.test.patterns.generating_design_patterns.builder.components.Transmission;
import ru.my.test.patterns.generating_design_patterns.builder.components.TripComputer;

/**
 * Конкретные строители реализуют шаги, объявленные в общем интерфейсе.
 */
public class CarBuilder implements Builder{
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
