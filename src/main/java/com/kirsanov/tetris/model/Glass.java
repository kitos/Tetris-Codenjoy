package com.kirsanov.tetris.model;

public class Glass {

    public static final int HEIGHT = 20;
    public static final int WIDTH = 10;

    private final static char OCCUPIED = '*';
    private String encodedGlass;

    public static Glass fromString(String glass) {
        Glass instance = new Glass();
        instance.encodedGlass = glass;
        return instance;
    }

    public boolean contains(Point point) {
        return contains(point.getX(), point.getY());
    }

    public boolean contains(int x, int y) {
        return x >= 0 && y >= 0 && x < Glass.WIDTH && y < Glass.HEIGHT;
    }

    public boolean isOccupied(Point point) {
        return isOccupied(point.getX(), point.getY());
    }

    public boolean isOccupied(int x, int y) {
        return encodedGlass.charAt(y * WIDTH + x) == OCCUPIED;
    }

    public boolean isOccupied(Point... points) {
        for (Point point : points) {
            if (isOccupied(point.getX(), point.getY())) {
                return false;
            }
        }
        return true;
    }

    public void print() {
        System.out.println("++++++++++++");
        for (int i = HEIGHT - 1; i >= 0; i--) {
            System.out.print('+');
            System.out.print(encodedGlass.substring(i * WIDTH, i * WIDTH + WIDTH));
            System.out.println('+');
        }
        System.out.println("++++++++++++");
    }
}
