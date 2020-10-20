package com.afs.tdd;

public class MoveCommand implements Command{

    private CommandCenter commandCenter;

    public MoveCommand (CommandCenter commandCenter){
        this.commandCenter = commandCenter;
    }

    @Override
    public void execute() {
        commandCenter.moveRover();
    }
}
