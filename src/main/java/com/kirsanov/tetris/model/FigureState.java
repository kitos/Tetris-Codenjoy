package com.kirsanov.tetris.model;

public class FigureState {

    private Point[] points;
    private int rotate;

    public FigureState() {
    }

    public FigureState(Point[] points, int rotate) {
        this.points = points;
        this.rotate = rotate;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public int getRotate() {
        return rotate;
    }

    public void setRotate(int rotate) {
        this.rotate = rotate;
    }
}
