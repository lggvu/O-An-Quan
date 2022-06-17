package sourcecode.board;

import sourcecode.gem.Gem;

import java.util.ArrayList;

public class Cell {
    private int position;
    private int numberOfGems;
    private ArrayList<Gem> gemList = new ArrayList<Gem>();

    public Cell(int position, int numberOfGems) {
        this.position = position;
        this.numberOfGems = numberOfGems;
    }

    public Cell(int position) {
        this.position = position;
    }

    public Cell() {

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
        StringBuffer gemPrint =  new StringBuffer();
        for(Gem gem:this.gemList) {
            gemPrint.append(gem.toString());
        }

        return(
                "Cell " + this.getClass().getSimpleName() +
                        "Position:" + this.position +
                        ", number of gems: " + this.gemList.size() +
                        ", gem list: " + gemPrint
                );
    }

    public String toString() {
        return "Cell " + this.getClass().getSimpleName() + ", position: " + this.position;
    }

    public void emptyCell() {
        this.gemList.removeAll(this.gemList);
    }

    public boolean isEmpty() {
        if(this.numberOfGems == 0) {
            return true;
        }
        return false;
    }

    public void setPosition(int position) {
        this.position = position;
    }
/*
    public boolean spreadable(int direction) { // check if THIS cell can be used to continue spreading
        if(direction == 1) {
            Cell nextCell = Board.getRightCell(this);
            if(nextCell instanceof HalfCircle) {
                return false;
            }
            else {
                if(!nextCell.isEmpty()) {
                    return true;
                }
            }
        }

        else if(direction == 0) {
            Cell nextCell = Board.getLeftCell(this);
            if(nextCell instanceof HalfCircle) {
                return false;
            }
            else {
                if(!nextCell.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean edible(int direction) { // check if the cell that is TWO cells away can be collected or not
        if(direction == 1) {
            Cell oneCellRight = Board.getRightCell(this);
            Cell twoCellRight = Board.getRightCell(oneCellRight);
            if(!(this.isEmpty()) && (oneCellRight.isEmpty()) && !(twoCellRight.isEmpty())) {
                return true;
            }
        }
        else if(direction == 0) {
            Cell oneCellLeft = Board.getLeftCell(this);
            Cell twoCellLeft = Board.getLeftCell(oneCellLeft);
            if(!(this.isEmpty()) && (oneCellLeft.isEmpty()) && !(twoCellLeft.isEmpty())) {
                return true;
            }
        }
        return false;
    }



 */



}