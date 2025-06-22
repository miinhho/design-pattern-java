package io.github.miinhho.builders;

import io.github.miinhho.builders.cars.Car;
import io.github.miinhho.builders.cars.CarType;
import io.github.miinhho.builders.components.Engine;
import io.github.miinhho.builders.components.GPSNavigator;
import io.github.miinhho.builders.components.Transmission;
import io.github.miinhho.builders.components.TripComputer;

public class CarBuilder implements Builder<Car> {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public CarBuilder setCarType(CarType carType) {
        this.carType = carType;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public CarBuilder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Car build() {
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
