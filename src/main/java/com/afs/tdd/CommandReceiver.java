package com.afs.tdd;

public class CommandReceiver {
    private static final String MOVE_COMMAND = "M";
    private static final String TURN_LEFT_COMMAND = "L";
    private static final String TURN_RIGHT_COMMAND = "R";
    private MoveCommand moveCommand;
    private turnLeftCommand turnLeftCommand;
    private turnRightCommand turnRightCommand;

    public CommandReceiver(marsRover marsRover) {
        this.moveCommand = new MoveCommand(marsRover);
        this.turnLeftCommand = new turnLeftCommand(marsRover);
        this.turnRightCommand = new turnRightCommand(marsRover);
    }

    public void executeCommands(String commands){
        String[] inputCommands = commands.split("");

        for (String inputCommand : inputCommands) {
            switch (inputCommand) {
                case MOVE_COMMAND:
                    this.moveCommand.execute();
                    break;
                case TURN_LEFT_COMMAND:
                    this.turnLeftCommand.execute();
                    break;
                case TURN_RIGHT_COMMAND:
                    this.turnRightCommand.execute();
                    break;
                default:
                    throw new CommandNotDefinedException("Command not valid : " + inputCommand);
            }
        }
    }
}


