package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
        List<String> inputCommands = Arrays.asList(validCommand.split(""));
        List<String> validCommands = Arrays.asList(("MLR").split(""));

        for (int x = 0; x < inputCommands.size(); x++) {
            if (!(validCommands.contains(inputCommands.get(x)))) {
                System.out.println(inputCommands.get(x));
                throw new CommandNotDefinedException("Not a valid Command");
            }
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
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'W':
                direction = 'S';
                break;
        }
    }

    private void moveRover() {
        switch (direction) {
            case 'N':
                coordY += 1;
                break;
            case 'S':
                coordY -= 1;
                break;
            case 'E':
                coordX += 1;
                break;
            case 'W':
                coordX -= 1;
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
