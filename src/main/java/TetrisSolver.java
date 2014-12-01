import com.kirsanov.tetris.help.Command;
import com.kirsanov.tetris.help.GlassHelper;
import com.kirsanov.tetris.help.Magic;
import com.kirsanov.tetris.model.FigureState;
import com.kirsanov.tetris.model.Glass;
import com.kirsanov.tetris.model.Move;
import com.kirsanov.tetris.model.figures.Figure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TetrisSolver {

    public String answer(String aFigure, int curX, int curY, String glassString, String next) {
        Glass glass = Glass.fromString(glassString);
        Figure figure = Figure.createFigure(aFigure.charAt(0));
        List<Move> moves = new ArrayList<Move>();

        for (int y = 0; y < Glass.WIDTH; y++) {
            for (int x = 0; x < Glass.HEIGHT; x++) {
                for (FigureState figureState : figure.getStates()) {
                    if (GlassHelper.canDrop(glass, x, y, figureState.getPoints())) {
                        moves.add(new Move(x, y, figureState.getRotate()));
                    }
                }
            }
        }
        Collections.sort(moves, new Magic());
        Move bestMove = moves.get(0);
        Command command = new Command()
                .rotate(bestMove.getRotate());
        int dx = curX - bestMove.getX();
        command = dx > 0 ? command.left(Math.abs(dx)) : command.right(Math.abs(dx));


        glass.print();
        return command.build();
    }
}
