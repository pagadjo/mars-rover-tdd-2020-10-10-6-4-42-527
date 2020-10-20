package com.afs.tdd;

public class turnLeftCommand implements Command{

    private CommandCenter CommandCenter ;

    public turnLeftCommand (CommandCenter CommandCenter){
        this.CommandCenter = CommandCenter;
    }
    @Override
    public void execute() {

        CommandCenter.turnLeft();

    }
}
