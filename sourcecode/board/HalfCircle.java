package sourcecode.board;

import sourcecode.board.Cell;

public class HalfCircle extends Cell {
    private boolean bigGem;

    public HalfCircle(int position, int numberOfGems) {
        super(position, numberOfGems);
    }

    public boolean isBigGem() {
        return bigGem;
    }
}
