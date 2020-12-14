package ru.geekbrains.command;

import ru.geekbrains.command.after.Command;
import ru.geekbrains.command.after.DoorCommand;
import ru.geekbrains.command.after.LightCommand;
import ru.geekbrains.command.after.SmartHouseController;

public class Main {
    public static void main(String[] args) {
        SmartHouseController controller = new SmartHouseController();
        Command lightCommand = new LightCommand();
        controller.setCommand(lightCommand);
        controller.perform();
        Command doorCommand = new DoorCommand();
        controller.setCommand(doorCommand);
        controller.perform();
    }
}
