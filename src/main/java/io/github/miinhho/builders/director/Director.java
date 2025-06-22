package io.github.miinhho.builders.director;

import io.github.miinhho.builders.Builder;
import io.github.miinhho.builders.cars.CarType;
import io.github.miinhho.builders.components.Engine;
import io.github.miinhho.builders.components.GPSNavigator;
import io.github.miinhho.builders.components.Transmission;
import io.github.miinhho.builders.components.TripComputer;

public class Director {
    public <T, B extends Builder<T>> B constructSportsCar(B builder) {
        var engine = new Engine(3.0, 0);

        builder
                .setCarType(CarType.SPORTS_CAR)
                .setSeats(2)
                .setEngine(engine)
                .setTransmission(Transmission.SEMI_AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
        return builder;
    }

    public <T, B extends Builder<T>> B constructCityCar(B builder) {
        var engine = new Engine(1.2, 0);
        builder
                .setCarType(CarType.CITY_CAR)
                .setSeats(2)
                .setEngine(engine)
                .setTransmission(Transmission.AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
        return builder;
    }

    public <T, B extends Builder<T>> B constructSUV(B builder) {
        var engine = new Engine(2.5, 0);
        builder
                .setCarType(CarType.SUV)
                .setSeats(4)
                .setEngine(engine)
                .setTransmission(Transmission.MANUAL)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
        return builder;
    }
}
