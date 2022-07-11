package sourcecode.test;

import sourcecode.board.Board;
import sourcecode.board.Cell;

public class BoardTest {
    public static void main(String[] args) {
        Board board = new Board();

        System.out.println(board);

        Cell[] boardVis = board.getBoard();
        for(Cell cell:boardVis) {
            System.out.println(cell.seeDetails());
        }

        System.out.println(board.getNumSmallGem());
    }
}