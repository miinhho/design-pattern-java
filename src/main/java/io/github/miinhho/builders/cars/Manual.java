package io.github.miinhho.builders.cars;

import io.github.miinhho.builders.components.Engine;
import io.github.miinhho.builders.components.GPSNavigator;
import io.github.miinhho.builders.components.Transmission;
import io.github.miinhho.builders.components.TripComputer;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        StringBuilder manual = new StringBuilder();
        manual.append("Car Type: ").append(carType).append("\n")
              .append("Seats: ").append(seats).append("\n")
              .append("Engine: volume - ").append(engine.getVolume()).append("; mileage: - ").append(engine.getMileage()).append("\n")
              .append("Transmission: ").append(transmission).append("\n");

        if (tripComputer != null) {
            manual.append("Trip Computer: Functional\n");
        } else {
            manual.append("Trip Computer: N/A\n");
        }

        if (gpsNavigator != null) {
            manual.append("GPS Navigator: Functional\n");
        } else {
            manual.append("GPS Navigator: No\n");
        }

        return manual.toString();
    }
}
