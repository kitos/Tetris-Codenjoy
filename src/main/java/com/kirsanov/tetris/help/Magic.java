package com.kirsanov.tetris.help;

import com.kirsanov.tetris.model.Move;

import java.util.Comparator;

public class Magic implements Comparator<Move> {
    @Override
    public int compare(Move m1, Move m2) {
        int gapsComparison = Integer.compare(m1.getGapsUnderFigure(), m2.getGapsUnderFigure());
        return gapsComparison != 0 ? gapsComparison : Integer.compare(m1.getLowestPointY(), m2.getLowestPointY());
    }
}
