package ru.geekbrains.command.after;

import ru.geekbrains.command.Light;

public class LightCommand implements Command {
    private Light light = new Light();

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}