package sourcecode.board;

import sourcecode.board.Cell;

public class HalfCircle extends Cell {
    private boolean bigGem;

    public HalfCircle(boolean bigGem) {
        this.bigGem = bigGem;
    }

    public boolean isBigGem() {
        return bigGem;
    }
}
