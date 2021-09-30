package ru.geekbrains.template;

public class Cheese extends PizzaCreator{
    @Override
    protected void prepare() {
        System.out.println("Добавляю много сыра");
    }

    @Override
    protected void bake() {
        System.out.println("пеку при температуре 100");
    }
}
