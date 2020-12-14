package ru.geekbrains.command;

public class RemoteController {
    private Door door;
    private Light light;

    public RemoteController(Door door, Light light) {
        this.door = door;
        this.light = light;
    }

    public void turnOnLight(){
        light.on();
    }
    public void turnOffLight(){
        light.off();
    }
}
