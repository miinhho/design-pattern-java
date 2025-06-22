package io.github.miinhho.bridge;

import io.github.miinhho.bridge.devices.Device;
import io.github.miinhho.bridge.devices.Radio;
import io.github.miinhho.bridge.devices.Tv;
import io.github.miinhho.bridge.remotes.AdvancedRemote;
import io.github.miinhho.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        var tv = new Tv();
        testDevice(tv);

        var radio = new Radio();
        testDevice(radio);
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        var basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        var advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
