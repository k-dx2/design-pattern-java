package com.kunal.designpatterns.creational.builder.builders;

import com.kunal.designpatterns.creational.builder.cars.CarType;
import com.kunal.designpatterns.creational.builder.cars.Manual;
import com.kunal.designpatterns.creational.builder.components.Engine;
import com.kunal.designpatterns.creational.builder.components.GPSNavigator;
import com.kunal.designpatterns.creational.builder.components.Transmission;
import com.kunal.designpatterns.creational.builder.components.TripComputer;

public class CarManualBuilder implements Builder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType=carType;

    }

    @Override
    public void setSeats(int seats) {
        this.seats=seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine=engine;

    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission=transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer=tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator=gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
