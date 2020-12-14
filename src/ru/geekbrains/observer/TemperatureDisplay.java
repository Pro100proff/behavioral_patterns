package ru.geekbrains.observer;

public class TemperatureDisplay implements Observer {

    @Override
    public void update(ObservableSubject subject, Object arg) {
        System.out.println("Температура стала " + arg);
    }
}
