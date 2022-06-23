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
        player.setCellsOnSides(cellOnSide);

        // initial states
        System.out.println("Initial board: ");
        for(Cell cell:boardList) {
            System.out.println(cell.seeDetails());
        }
        System.out.println("Initial player position: " + player.getHandPosition());
        System.out.println();

        // test pickup
        System.out.println("Test pickup");
        System.out.println(player.getGemsInHand().size());
        player.pickUpGemFrom(boardList[5]);
        System.out.println(player.getGemsInHand().size());
        System.out.println(boardList[5].getGemList().size());  // should be 0 now

        // test drop gem into
        System.out.println();
        System.out.println("Test drop");
        System.out.println(boardList[6].getGemList().size());  // 1
        System.out.println(player.getGemsInHand().size()); // 5
        player.dropGemInto(player.getGemsInHand().get(1), boardList[6]);
        System.out.println(boardList[6].getGemList().size());  // should be 2 now
        System.out.println(player.getGemsInHand().size());  // should be 4 now

        // test spread gem
        System.out.println();
        System.out.println("Test spread");
        System.out.println(player.getGemsInHand().size());
        player.spreadGem(boardList[1], 1, board); // anti-clockwise
        System.out.println(player.getGemsInHand().size());
//        for(Cell cell:boardList) {
//            System.out.println(cell.seeDetails());
//        }





    }
}
