package com.afs.tdd;

public class executeCommand {

    Command command;

    public executeCommand(Command command) {
        this.command = command;
    }

    public void execCommand(){
        command.execute();
    }
}
