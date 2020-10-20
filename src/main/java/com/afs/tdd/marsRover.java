package com.afs.tdd;

public class marsRover implements CommandCenter{
    private static final char NORTH = 'N';
    private static final char SOUTH = 'S';
    private static final char EAST = 'E';
    private static final char WEST = 'W';

    private static final String UNEXPECTED_VALUE = "Unexpected value: ";
    private int coordinateX;
    private int coordinateY;
    private char direction;

    public marsRover(int coordinateX, int coordinateY, char direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    @Override
    public void turnRight() {
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
            default:
                throw new IllegalStateException(UNEXPECTED_VALUE + direction);
        }
    }

    @Override
    public void moveRover() {
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
            default:
                throw new IllegalStateException(UNEXPECTED_VALUE + direction);
        }
    }

    @Override
    public void turnLeft() {
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
            default:
                throw new IllegalStateException(UNEXPECTED_VALUE + direction);
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
