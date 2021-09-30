package ru.geekbrains.observer;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor(21);
        TemperatureDisplay display = new TemperatureDisplay();
        ClimateSystem climateSystem = new ClimateSystem();
        sensor.attach(display);
        sensor.attach(climateSystem);
        sensor.changeTemp(12);
        sensor.changeTemp(23);
        sensor.changeTemp(14);
        sensor.error();
    }
}
