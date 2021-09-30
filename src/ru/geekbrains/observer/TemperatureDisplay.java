package ru.geekbrains.observer;

public class TemperatureDisplay implements Observer {

    @Override
    public void update(ObservableSubject subject, Object arg) {
        if (arg.toString().equals("error!")){
            System.out.println("error");
        }
        System.out.println("Температура стала " + arg);
    }
}
