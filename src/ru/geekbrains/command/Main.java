package ru.geekbrains.command;

import ru.geekbrains.command.after.Command;
import ru.geekbrains.command.after.DoorCommand;
import ru.geekbrains.command.after.LightCommand;
import ru.geekbrains.command.after.SmartHouseController;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SmartHouseController controller = new SmartHouseController();
        Command lightCommand = new LightCommand();
        Command doorCommand = new DoorCommand();
        controller.setCommand(List.of(lightCommand, doorCommand));
        controller.perform();
        controller.undo();
    }
}
