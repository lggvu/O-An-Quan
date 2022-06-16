package sourcecode.test;

import sourcecode.board.Board;
import sourcecode.board.Cell;

public class BoardTest {
    public static void main(String[] args) {
        Board newBoard = new Board();
        Cell[] board = newBoard.getBoard();

        for(Cell cell:board) {
            System.out.println(cell);
        }
    }

}
