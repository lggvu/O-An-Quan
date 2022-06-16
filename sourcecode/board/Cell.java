package sourcecode.board;

import java.util.ArrayList;

public class Cell {
    protected int position;
    protected int numberOfGems;
    protected ArrayList<Gem> gemList = new ArrayList<Gem>();

    public Cell(int position, int numberOfGems) {
        this.position = position;
        this.numberOfGems = numberOfGems;
    }

    public Cell(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public int getNumberOfGems() {
        return numberOfGems;
    }

    public void addGem(Gem gem) {
        for(int i = 0; i < this.numberOfGems; i++) {
            gemList.add(Gem gem);
        }
    }

    public String toString() {
        return(
                "Cell " + this.getClass().getSimpleName() +
                        "Position:" + this.position +
                        ", number of gems: " + this.numberOfGems
                );
    }
}