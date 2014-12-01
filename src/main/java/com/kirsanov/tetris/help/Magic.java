package com.kirsanov.tetris.help;

import com.kirsanov.tetris.model.Move;

import java.util.Comparator;

public class Magic implements Comparator<Move> {
    @Override
    public int compare(Move m1, Move m2) {
        return Integer.compare(m1.getY(), m2.getY());
    }
}
