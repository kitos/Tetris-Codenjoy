package com.kirsanov.tetris.model.figures;

import com.kirsanov.tetris.model.FigureState;
import com.kirsanov.tetris.model.Point;

import java.util.ArrayList;
import java.util.List;

public class T extends Figure {
    private List<FigureState> states;

    protected T() {
        states = new ArrayList<>(4);
        states.add(new FigureState(new Point[]{new Point(-1, 0), new Point(0, 0), new Point(0, 1), new Point(0, 1)}, 0));
        states.add(new FigureState(new Point[]{new Point(0, 1), new Point(0, 0), new Point(1, 0), new Point(0, -1)}, 1));
        states.add(new FigureState(new Point[]{new Point(-1, 0), new Point(0, 0), new Point(0, 1), new Point(0, -1)}, 2));
        states.add(new FigureState(new Point[]{new Point(0, 1), new Point(0, 0), new Point(-1, 0), new Point(0, -1)}, 3));
    }

    @Override
    public List<FigureState> getStates() {
        return states;
    }
}
