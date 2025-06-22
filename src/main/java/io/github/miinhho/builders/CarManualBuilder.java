package io.github.miinhho.builders;

import io.github.miinhho.builders.cars.CarType;
import io.github.miinhho.builders.cars.Manual;
import io.github.miinhho.builders.components.Engine;
import io.github.miinhho.builders.components.GPSNavigator;
import io.github.miinhho.builders.components.Transmission;
import io.github.miinhho.builders.components.TripComputer;

public class CarManualBuilder implements Builder<Manual> {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public CarManualBuilder setCarType(CarType carType) {
        this.carType = carType;
        return this;
    }

    @Override
    public CarManualBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarManualBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarManualBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarManualBuilder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public CarManualBuilder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    @Override
    public Manual build() {
        return new Manual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
