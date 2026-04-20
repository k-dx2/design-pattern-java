package com.kunal.designpatterns.creational.builder.builders;

import com.kunal.designpatterns.creational.builder.cars.CarType;
import com.kunal.designpatterns.creational.builder.components.Engine;
import com.kunal.designpatterns.creational.builder.components.GPSNavigator;
import com.kunal.designpatterns.creational.builder.components.Transmission;
import com.kunal.designpatterns.creational.builder.components.TripComputer;

public interface Builder
{
    void setCarType(CarType car);
    void setSeats( int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
