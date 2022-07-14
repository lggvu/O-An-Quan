package sourcecode.board;

import sourcecode.gem.Gem;

import java.util.ArrayList;

public abstract class Cell {
    private int position;
    private int numberOfGems;
    private ArrayList<Gem> gemList = new ArrayList<Gem>();

    public Cell(int position, int numberOfGems) {
        this.position = position;
        this.numberOfGems = numberOfGems;
    }

    public Cell() {

    }

    public Cell(int position) {
        this.position = position;
    }

    public ArrayList<Gem> getGemList() {
        return gemList;
    }

    public int getPosition() {
        return position;
    }

    public int getNumberOfGems() {
        return numberOfGems;
    }

    public void addGem(Gem gem) {
        this.gemList.add(gem);
    }

    public String seeDetails() {
        StringBuffer gemDetails = new StringBuffer();
        for(Gem gem:this.gemList) {
            gemDetails.append(gem);
        }
        return(
                "Cell " + this.getClass().getSimpleName() +
                        "Position:" + this.position +
                        ", number of gems: " + this.getGemList().size() +
                        ", gem list: " + gemDetails
                );
    }

    public String toString() {
        return "Cell " + this.getClass().getSimpleName() + ", position: " + this.position;
    }

    public void emptyCell() {
        this.gemList.removeAll(this.gemList);
    }

    public boolean isEmpty() {
        return this.getGemList().size() == 0;
    }

}