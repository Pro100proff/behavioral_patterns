package ru.geekbrains.observer;

public class Sensor extends ObservableSubject {
    private Integer temperature;

    public Sensor(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void changeTemp(Integer temperature){
        this.temperature = temperature;
        notify(temperature);
    }

    public void error(){
        String error = "Error!";
        System.out.println(error);
        notify(error);
    }
}
