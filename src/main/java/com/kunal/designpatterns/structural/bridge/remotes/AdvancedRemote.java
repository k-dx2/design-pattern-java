package com.kunal.designpatterns.structural.bridge.remotes;

import com.kunal.designpatterns.structural.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote{

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
