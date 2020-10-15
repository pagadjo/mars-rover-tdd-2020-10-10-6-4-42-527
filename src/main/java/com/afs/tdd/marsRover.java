package com.afs.tdd;

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

    public void executeMovement(String movement) {
        Arrays.asList(movement.split("")).forEach(moves -> this.execMove(moves));
    }

    private void execMove(String moves) {
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
        if (direction == 'N') {
            direction = 'E';
        }
        if (direction == 'S') {
            direction = 'W';
        }
        if (direction == 'E') {
            direction = 'S';
        }
    }

    private void turnLeft() {
        if (direction == 'N') {
            direction = 'W';
        }
        if (direction == 'S') {
            direction = 'E';
        }
        if (direction == 'E') {
            direction = 'N';
        }
    }

    private void moveRover() {
        if (direction == 'N') {
            coordY += 1;
        }
        if (direction == 'S') {
            coordY -= 1;
        }
        if (direction == 'E') {
            coordX += 1;
        }
        if (direction == 'W') {
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
