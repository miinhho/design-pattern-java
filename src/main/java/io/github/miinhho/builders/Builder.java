package io.github.miinhho.builders;

import io.github.miinhho.builders.cars.CarType;
import io.github.miinhho.builders.components.Engine;
import io.github.miinhho.builders.components.GPSNavigator;
import io.github.miinhho.builders.components.Transmission;
import io.github.miinhho.builders.components.TripComputer;

public interface Builder<T> {
    Builder<T> setCarType(CarType type);
    Builder<T> setSeats(int seats);
    Builder<T> setEngine(Engine engine);
    Builder<T> setTransmission(Transmission transmission);
    Builder<T> setTripComputer(TripComputer tripComputer);
    Builder<T> setGPSNavigator(GPSNavigator gpsNavigator);
    T build();
}
