package com.kunal.designpatterns.creational.builder;

import com.kunal.designpatterns.creational.builder.builders.Builder;
import com.kunal.designpatterns.creational.builder.builders.CarBuilder;
import com.kunal.designpatterns.creational.builder.builders.CarManualBuilder;
import com.kunal.designpatterns.creational.builder.cars.Car;
import com.kunal.designpatterns.creational.builder.cars.Manual;
import com.kunal.designpatterns.creational.builder.director.Director;

/**
 * Main class. Everything comes together here.
 */
public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        // Director may know several building recipes.
        director.constructSportsCar(carManualBuilder);
        Manual carManual = carManualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
