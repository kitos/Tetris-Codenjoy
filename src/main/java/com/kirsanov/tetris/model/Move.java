package com.kirsanov.tetris.model;

public class Move {

    private int x;
    private int y;
    private int rotate;

    public Move() {
    }

    public Move(int x, int y, int rotate) {
        this.x = x;
        this.y = y;
        this.rotate = rotate;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRotate() {
        return rotate;
    }

    public void setRotate(int rotate) {
        this.rotate = rotate;
    }
}
