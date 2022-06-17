package sourcecode.test;

import sourcecode.board.Cell;
import sourcecode.gem.Gem;

public class CellTest {
    public static void main(String[] args) {
        Cell cell = new Cell();
        Gem gem1 = new Gem(cell);
        Gem gem2 = new Gem(cell);
        cell.addGem(gem1);
        cell.addGem(gem2);
    }
}
