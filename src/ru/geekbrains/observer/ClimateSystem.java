package ru.geekbrains.observer;

public class ClimateSystem implements Observer {
    @Override
    public void update(ObservableSubject subject, Object arg) {
        int i = Integer.parseInt(arg.toString());
        if (i < 15){
            System.out.println("начинаю прогревать");
        }
    }
}
