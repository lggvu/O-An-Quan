package sourcecode.board;

import sourcecode.gem.*;

public class Board {
    private static final int numSquare = 10; // even number
    private static final int numHalfCircle = 2;  // even number
    private static final int numSmallGem = 50;
    private static final int numBigGem = 2;
    private Cell[] boardList = new Cell[numHalfCircle + numSquare];

    public int getNumSquare() {
        return numSquare;
    }

    public int getNumHalfCircle() {
        return numHalfCircle;
    }

    public int getNumSmallGem() {
        return numSmallGem;
    }

    public int getNumBigGem() {
        return numBigGem;
    }

    public Board() {
        this.boardList[0] = new HalfCircle(0, numBigGem /2);
        this.boardList[0].addGem(new bigGem(this.boardList[0]));


        this.boardList[(numSquare + numHalfCircle)/2] = new HalfCircle((numSquare + numHalfCircle)/2, numBigGem /2);
        this.boardList[(numSquare + numHalfCircle) / 2].addGem(new bigGem(this.boardList[(numSquare + numHalfCircle) / 2]));


        for(int i = 1; i <= (numSquare /2); i++) {
            this.boardList[i] = new Square(i, numSmallGem / numSquare);
            for(int j = 0; j < this.boardList[i].getNumberOfGems(); j++) {
                this.boardList[i].addGem(new smallGem(this.boardList[i]));
            }
        }
        for(int i = (numSquare/2)+2; i <= numSquare + numHalfCircle - 1; i++) {
            this.boardList[i] = new Square(i, numSmallGem / numSquare);
            for(int j = 0; j < this.boardList[i].getNumberOfGems(); j++) {
                this.boardList[i].addGem(new smallGem(this.boardList[i]));
            }
        }
    }

    public Cell[] getBoard() {
        return boardList;
    }

    public Cell getNextCellCounterClockwise(Cell cell) {
        if(cell.getPosition() == 0) {
            return this.boardList[numSquare + numHalfCircle - 1];
        }
        else {
            return this.boardList[cell.getPosition() - 1];
        }
    }

    public Cell getNextCellClockwise(Cell cell) {
        if(cell.getPosition() == numSquare + numHalfCircle - 1) {
            return this.boardList[0];
        }
        else {
            return this.boardList[cell.getPosition() + 1];
        }
    }

}