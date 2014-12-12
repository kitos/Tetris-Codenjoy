package com.kirsanov.tetris.help;

import com.kirsanov.tetris.model.Glass;
import com.kirsanov.tetris.model.Point;

import java.util.HashSet;
import java.util.Set;

public class GlassHelper {

    private GlassHelper() {
    }

    public static boolean canDrop(Glass glass, int x, int y, Point... figurePoints) {
        for (Point point : figurePoints) {
            Point absolutePoint = toAbsolute(x, y, point);
            if (!glass.contains(absolutePoint) || glass.isOccupied(absolutePoint)) {
                return false;
            }
        }
        return true;
    }

    public static int gapsUnder(Glass glass, int x, int y, Point... figurePoints) {
        Set<Point> gaps = new HashSet<>();
        for (Point point : figurePoints) {
            Point absolutePoint = toAbsolute(x, y, point);
            for (int i = absolutePoint.getY(); i >= 0; i--) {
                Point gap = new Point(absolutePoint.getX(), i);
                if (!glass.isOccupied(gap)) {
                    gaps.add(gap);
                }
            }
        }
        return gaps.size();
    }

    private static Point toAbsolute(int x, int y, Point point) {
        return new Point(x + point.getX(), y + point.getY());
    }
}
