package sourcecode.board;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Board {
    private final int NUMBER_OF_SQUARES = 10; // even number
    private final int NUMBER_OF_HALFCIRCLES = 2;  // even number
    private final int NUMBER_OF_SMALLGEMS = 50;
    private final int NUMBER_OF_BIGGEMS = 2;

    private Cell[] board = new Cell[NUMBER_OF_HALFCIRCLES + NUMBER_OF_SQUARES];

    public Board() {
        this.board[0] = new HalfCircle(0, NUMBER_OF_BIGGEMS/2);
        this.board[(NUMBER_OF_SQUARES+NUMBER_OF_HALFCIRCLES)/2] = new HalfCircle((NUMBER_OF_SQUARES+NUMBER_OF_HALFCIRCLES)/2, NUMBER_OF_BIGGEMS/2);
        for(int i = 1; i <= (NUMBER_OF_SQUARES/2); i++) {
            this.board[i] = new Square(i, NUMBER_OF_SMALLGEMS/NUMBER_OF_SQUARES);
        }
        for(int i = (NUMBER_OF_SQUARES/2)+2; i <= NUMBER_OF_SQUARES + NUMBER_OF_HALFCIRCLES - 1; i++) {
            this.board[i] = new Square(i, NUMBER_OF_SMALLGEMS / NUMBER_OF_SQUARES);
        }
    }

    public Cell[] getBoard() {
        return board;
    }
}
