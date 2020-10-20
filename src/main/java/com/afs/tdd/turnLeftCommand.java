package com.afs.tdd;

public class turnLeftCommand implements Command{

    private CommandCenter commandCenter;

    public turnLeftCommand (CommandCenter commandCenter){
        this.commandCenter = commandCenter;
    }

    @Override
    public void execute() {
        commandCenter.turnLeft();
    }
}
