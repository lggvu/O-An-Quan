package sourcecode.player;

import sourcecode.board.Cell;

public class Hand {
    private Cell handPosition;
    private int direction;
    /*
    direction = 0: clockwise
    direction = 1: anti-clockwise
     */

    public void setHandPosition(Cell handPosition) {
        this.handPosition = handPosition;
    }

    public Cell getHandPosition() {
        return handPosition;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}