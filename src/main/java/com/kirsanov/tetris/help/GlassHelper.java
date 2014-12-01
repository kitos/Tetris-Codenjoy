package com.kirsanov.tetris.help;

import com.kirsanov.tetris.model.Glass;
import com.kirsanov.tetris.model.Point;

public class GlassHelper {

    private GlassHelper() {
    }

    public static boolean canDrop(Glass glass, int x, int y, Point... figurePoints) {
        for (Point point : figurePoints) {
            int absoluteX = x + point.getX();
            int absoluteY = y + point.getY();
            if (absoluteX < 0 || absoluteY < 0 || absoluteX > Glass.WIDTH - 1 || absoluteY > Glass.HEIGHT - 1
                    || glass.isOccupied(absoluteX, absoluteY)) {
                return false;
            }
        }
        return true;
    }
}
