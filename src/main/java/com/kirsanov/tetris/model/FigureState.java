package com.kirsanov.tetris.model;

import java.util.Arrays;

public class FigureState {

    private Point[] points;
    private int rotate;

    public FigureState() {
    }

    public FigureState(Point[] points, int rotate) {
        this.points = points;
        this.rotate = rotate;
    }

    public int getLowestPoint() {
        return Arrays.asList(points).stream().map(point -> point.getY()).min(Integer::compare).get();
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
