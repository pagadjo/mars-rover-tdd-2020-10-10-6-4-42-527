package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class marsRover {
    private static final String MOVE_COMMAND = "M";
    private static final String TURN_LEFT_COMMAND = "L";
    private static final String TURN_RIGHT_COMMAND = "R";
    private static final char NORTH = 'N';
    private static final char SOUTH = 'S';
    private static final char EAST = 'E';
    private static final char WEST = 'W';
    private int coordinateX;
    private int coordinateY;
    private char direction;

    public marsRover(int coordinateX, int coordinateY, char direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public void validateCommand(String validCommand) throws CommandNotDefinedException {
        String[] inputCommands = validCommand.split("");
        List<String> validCommands = Arrays.asList(MOVE_COMMAND, TURN_LEFT_COMMAND, TURN_RIGHT_COMMAND);

        for (String inputCommand : inputCommands) {
            if (!(validCommands.contains(inputCommand))) {
                throw new CommandNotDefinedException("Command not valid : " + inputCommand);
            } else execCommand(inputCommand);
        }
    }

    public void execCommand(String commands) {
        switch (commands) {
            case MOVE_COMMAND:
                moveRover();
                break;
            case TURN_LEFT_COMMAND:
                turnLeft();
                break;
            case TURN_RIGHT_COMMAND:
                turnRight();
                break;
        }
    }

    private void turnRight() {
        switch (direction) {
            case NORTH:
                direction = EAST;
                break;
            case SOUTH:
                direction = WEST;
                break;
            case EAST:
                direction = SOUTH;
                break;
            case WEST:
                direction = NORTH;
                break;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = WEST;
                break;
            case SOUTH:
                direction = EAST;
                break;
            case EAST:
                direction = NORTH;
                break;
            case WEST:
                direction = SOUTH;
                break;
        }
    }

    private void moveRover() {
        switch (direction) {
            case NORTH:
                coordinateY++;
                break;
            case SOUTH:
                coordinateY--;
                break;
            case EAST:
                coordinateX++;
                break;
            case WEST:
                coordinateX--;
                break;
        }
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public char getDirection() {
        return direction;
    }

}
