package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class marsRover {
    private static final String MOVE_COMMAND = "M";
    private static final String TURN_LEFT_COMMAND = "L";
    private static final String TURN_RIGHT_COMMAND = "R";
    private final char NORTH = 'N';
    private final char SOUTH = 'S';
    private final char EAST = 'E';
    private final char WEST = 'W';
    private int coordX;
    private int coordY;
    private char direction;

    public marsRover(int coordX, int coordY, char direction) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.direction = direction;
    }

//    public void execCommandsMany(String movementMany) {
//        Arrays.asList(movementMany.split("")).forEach(this::execCommand);
//    }

    public void validateCommand(String validCommand) throws CommandNotDefinedException {
        String[] inputCommands = validCommand.split("");
        List<String> validCommands = Arrays.asList((MOVE_COMMAND + TURN_LEFT_COMMAND + TURN_RIGHT_COMMAND).split(""));

        for (String inputCommand : inputCommands) {
            if (!(validCommands.contains(inputCommand))) {
                System.out.println(inputCommand);
                throw new CommandNotDefinedException("Not a valid Command!");
            } else execCommand(inputCommand);
        }
    }

    public void execCommand(String moves) {
        if (moves.equals(MOVE_COMMAND)) {
            moveRover();
        }
        if (moves.equals(TURN_LEFT_COMMAND)) {
            turnLeft();
        }
        if (moves.equals(TURN_RIGHT_COMMAND)) {
            turnRight();
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
                coordY++;
                break;
            case SOUTH:
                coordY--;
                break;
            case EAST:
                coordX++;
                break;
            case WEST:
                coordX--;
                break;
        }
    }

    public int coordinateX() {
        return coordX;
    }

    public int coordinateY() {
        return coordY;
    }

    public char getDirection() {
        return direction;
    }

}
