package io.github.miinhho.builders;

import io.github.miinhho.builders.cars.Car;
import io.github.miinhho.builders.director.Director;

public class Demo {
    public static void main(String[] args) {
        var director = new Director();
        var builder = new CarBuilder();
        Car car = director.constructSportsCar(builder).build();
        System.out.println("Car built: " + car.getCarType());
    }
}
