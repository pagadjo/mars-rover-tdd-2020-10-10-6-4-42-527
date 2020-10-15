package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;

public class marsRover {

    private int coordX;
    private int coordY;
    private char direction;

    public marsRover(int coordX, int coordY, char direction) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.direction = direction;
    }

    public void execCommandsMany(String movementMany) {
        Arrays.asList(movementMany.split("")).forEach(this::execCommand);
    }

    public void validateCommand(String validCommand) throws CommandNotDefinedException {
        if (!validCommand.contains("M") && !validCommand.contains("R") && !validCommand.contains("L")) {
            throw new CommandNotDefinedException("Not a valid Command");
        }
    }

    public void execCommand(String moves) {
        if (moves.equals("M")) {
            moveRover();
        }
        if (moves.equals("L")) {
            turnLeft();
        }
        if (moves.equals("R")) {
            turnRight();
        }
    }

    private void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'W':
                direction = 'N';
                break;
        }
    }

    private void turnLeft() {
        if (direction == 'N') {
            direction = 'W';
        } else if (direction == 'S') {
            direction = 'E';
        } else if (direction == 'E') {
            direction = 'N';
        } else if (direction == 'W') {
            direction = 'S';
        }

    }

    private void moveRover() {
        if (direction == 'N') {
            coordY += 1;
        } else if (direction == 'S') {
            coordY -= 1;
        } else if (direction == 'E') {
            coordX += 1;
        } else if (direction == 'W') {
            coordX -= 1;
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
