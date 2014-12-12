package com.kirsanov.tetris.model;

public class Move {

    private int x;
    private int y;
    private int rotate;
    private int lowestPointY;
    private int gapsUnderFigure;

    public Move() {
    }

    public Move(int x, int y, int rotate, int lowestPointY, int gapsUnderFigure) {
        this.x = x;
        this.y = y;
        this.rotate = rotate;
        this.lowestPointY = lowestPointY;
        this.gapsUnderFigure = gapsUnderFigure;
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

    public int getLowestPointY() {
        return lowestPointY;
    }

    public void setLowestPointY(int lowestPointY) {
        this.lowestPointY = lowestPointY;
    }

    public int getGapsUnderFigure() {
        return gapsUnderFigure;
    }

    public void setGapsUnderFigure(int gapsUnderFigure) {
        this.gapsUnderFigure = gapsUnderFigure;
    }
}
