package ru.geekbrains.command.after;

import ru.geekbrains.command.Door;

public class DoorCommand implements Command {
    private Door door = new Door();

    @Override
    public void execute() {
        door.open();
    }

    @Override
    public void undo() {
        door.close();
    }
}
