package sourcecode.test;

import sourcecode.board.Cell;
import sourcecode.gem.*;

public class CellTest {
    public static void main(String[] args) {
        Cell cell = new Cell();
        Gem gem1 = new bigGem(cell);
        Gem gem2 = new smallGem(cell);
        cell.addGem(gem1);
        cell.addGem(gem2);

        for(Gem gem:cell.getGemList()) {
            System.out.println(gem);
        }
    }
}