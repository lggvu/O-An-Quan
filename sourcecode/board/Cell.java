package sourcecode.board;

public class Cell {
    protected int position;
    protected int numberOfGems;

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

    public String toString() {
        return(
                "Cell " + this.getClass().getSimpleName() +
                        "Position:" + this.position +
                        ", number of gems: " + this.numberOfGems
                );
    }
}