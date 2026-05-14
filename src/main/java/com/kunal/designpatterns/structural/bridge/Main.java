package com.kunal.designpatterns.structural.bridge;

import com.kunal.designpatterns.structural.bridge.devices.Device;
import com.kunal.designpatterns.structural.bridge.devices.Radio;
import com.kunal.designpatterns.structural.bridge.devices.TV;
import com.kunal.designpatterns.structural.bridge.remotes.AdvancedRemote;
import com.kunal.designpatterns.structural.bridge.remotes.BasicRemote;

public class Main {

    public static void testDevice(Device device)
    {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
    public static void main(String[] args)
    {
        testDevice(new TV());
        testDevice(new Radio());
    }
}
