package ru.geekbrains.observer;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor(21);
        TemperatureDisplay display = new TemperatureDisplay();
        sensor.attach(display);
        sensor.changeTemp(12);
        sensor.changeTemp(23);
        sensor.changeTemp(15);
        sensor.error();
    }
}
