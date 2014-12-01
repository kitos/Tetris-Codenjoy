package com.kirsanov.tetris.model.figures;

import com.kirsanov.tetris.model.FigureState;
import com.kirsanov.tetris.model.Point;

import java.util.ArrayList;
import java.util.List;

public class I extends Figure {

    private List<FigureState> states;

    protected I() {
        states = new ArrayList<FigureState>(2);
        states.add(new FigureState(new Point[]{new Point(0, 1), new Point(0, 0), new Point(0, -1), new Point(0, -2)}, 0));
        states.add(new FigureState(new Point[]{new Point(-2, 0), new Point(-1, 0), new Point(0, 0), new Point(1, 0)}, 1));
    }

    @Override
    public List<FigureState> getStates() {
        return states;
    }
}
