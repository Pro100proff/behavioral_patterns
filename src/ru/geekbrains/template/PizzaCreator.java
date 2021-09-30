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

    protected abstract void prepare();
    protected abstract void bake();
}
