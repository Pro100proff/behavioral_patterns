package ru.geekbrains.command.after;

import ru.geekbrains.command.after.Command;

public class SmartHouseController {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void perform(){
        if(command != null) {
            command.execute();
        }
    }

    public void undo(){
        command.undo();
    }
}
