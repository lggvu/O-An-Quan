package sourcecode.test;

import sourcecode.board.Board;
import sourcecode.board.Cell;
import sourcecode.player.Player;

import java.util.ArrayList;

public class PlayerTest {
    public static void main(String[] args) {
        Board board = new Board();
        Cell[] boardList = board.getBoard();
        Player player = new Player("lggvu", boardList[1]);  // plays in the upper part

        ArrayList<Cell> cellOnSide = new ArrayList<>();


        for(int i=1; i < 6; i++) {
            cellOnSide.add(boardList[i]);
        }
        player.setCellsOnSide(cellOnSide);

        System.out.println("cells on side of player: " + player.getCellsOnSide() );

        // initial states
        System.out.println("Initial board: ");
        for(Cell cell:boardList) {
            System.out.println(cell.seeDetails());
        }
        System.out.println("Initial player position: " + player.getHandPosition());
        System.out.println();

        // test spread gem
        System.out.println();
        System.out.println("Test spread");
        System.out.println(player.getGemsInHand().size());
        player.pickUpGemFrom(boardList[2]);
        player.spreadGem(boardList[2], 0, board); // anti-clockwise
        System.out.println(player.getGemsInHand().size());
        for(Cell cell:boardList) {
            System.out.println(cell.seeDetails());
        }
     }
}