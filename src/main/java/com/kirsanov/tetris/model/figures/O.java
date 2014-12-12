package com.kirsanov.tetris.model.figures;

import com.kirsanov.tetris.model.FigureState;
import com.kirsanov.tetris.model.Point;

import java.util.ArrayList;
import java.util.List;

public class O extends Figure {

    private List<FigureState> states;

    protected O() {
        states = new ArrayList<>(1);
        states.add(new FigureState(new Point[]{new Point(0, 0), new Point(1, 0), new Point(1, -1), new Point(0, -1)}, 0));
    }

    @Override
    public List<FigureState> getStates() {
        return states;
    }
}
