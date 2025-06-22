package io.github.miinhho.bridge.remotes;

import io.github.miinhho.bridge.devices.Device;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {
    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote: power toggle");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down");
        int newVolume = device.getVolume() - 10;
        device.setVolume(newVolume);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");
        int newVolume = device.getVolume() + 10;
        device.setVolume(newVolume);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote: channel down");
        int newChannel = device.getChannel() - 1;
        device.setChannel(newChannel);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: channel up");
        int newChannel = device.getChannel() + 1;
        device.setChannel(newChannel);
    }
}
