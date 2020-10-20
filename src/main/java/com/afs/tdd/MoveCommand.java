package com.afs.tdd;

public class MoveCommand implements Command{
    private CommandCenter CommandCenter ;

    public MoveCommand (CommandCenter CommandCenter){
        this.CommandCenter = CommandCenter;
    }
    @Override
    public void execute() {
        CommandCenter.move();
    }
}
