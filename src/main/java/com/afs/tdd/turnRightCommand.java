package com.afs.tdd;

public class turnRightCommand implements Command {

    private CommandCenter commandCenter;

    public turnRightCommand(CommandCenter commandCenter) {
        this.commandCenter = commandCenter;
    }

    @Override
    public void execute() {
        commandCenter.turnRight();
    }
}
