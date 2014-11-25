import com.kirsanov.tetris.help.Command;

public class TetrisSolver {
    final static int DO_NOT_ROTATE = 0;
    final static int ROTATE_90_CLOCKWISE = 1;
    final static int ROTATE_180_CLOCKWISE = 2;
    final static int ROTATE_90_COUNTERCLOCKWISE = 3;

    private int state = 0;

    public String answer(String figure, int x, int y, String glass, String next) {
        Command command = new Command();

        int dx = x - state;
        command = dx > 0 ? command.left(Math.abs(dx)) : command.right(Math.abs(dx));

        int width = figure.equals("O") ? 2 : 1;
        state += width;
        state = state + width > 10 ? 0 : state;

        return command.build();
    }
}
