package ru.geekbrains.template;

public class Peperoni extends PizzaCreator{
    @Override
    protected void prepare() {
        System.out.println("Кладу много колбасы");
    }

    @Override
    protected void bake() {
        System.out.println("пеку при температуре 180");
    }
}
