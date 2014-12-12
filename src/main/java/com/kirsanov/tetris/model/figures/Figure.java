package com.kirsanov.tetris.model.figures;

import com.kirsanov.tetris.model.FigureState;

import java.util.List;

public abstract class Figure {

    public static Figure createFigure(char figureCode) {
        switch (figureCode) {
            case 'O':
                return new O();
            case 'I':
                return new I();
            case 'J':
                return new J();
            case 'L':
                return new L();
            case 'S':
                return new S();
            case 'Z':
                return new Z();
            case 'T':
                return new T();
            default:
                throw new IllegalArgumentException("Unknown figure code: " + figureCode);
        }
    }

    public abstract List<FigureState> getStates();
}
