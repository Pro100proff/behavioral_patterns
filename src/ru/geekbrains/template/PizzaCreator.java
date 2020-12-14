package ru.geekbrains.template;

public abstract class PizzaCreator {

    public final void create(){
        prepare();
        bake();
        box();
    }

    private void box() {
        System.out.println("Пицца запаковывается");
    }

    private void bake() {
        System.out.println("Пицца печется");
    }

    protected abstract void prepare();
}
