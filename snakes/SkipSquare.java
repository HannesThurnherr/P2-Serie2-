package snakes;

public class SkipSquare extends Square {

    public SkipSquare(Game game, int position) {
        super(game, position);
    }

    @Override
    public String squareLabel() {
        return String.format("%d (Skip)", position);
    }
}
