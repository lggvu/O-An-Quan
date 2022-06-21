package sourcecode.board;

import sourcecode.gem.*;

public class Board {
    private static final int numSquare = 10; // even number
    private static final int numHalfCircle = 2;  // even number
    private static final int numSmallGem = 50;
    private static final int numBigGem = 2;
    private Cell[] board = new Cell[numHalfCircle + numSquare];

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
        this.board[0] = new HalfCircle(0, numBigGem /2);
        this.board[0].addGem(new bigGem(this.board[0]));

        this.board[(numSquare + numHalfCircle)/2] = new HalfCircle((numSquare + numHalfCircle)/2, numBigGem /2);
        this.board[(numSquare + numHalfCircle)/2].addGem(new smallGem(this.board[(numSquare + numHalfCircle)/2]));

        for(int i = 1; i <= (numSquare /2); i++) {
            this.board[i] = new Square(i, numSmallGem / numSquare);
            for(int j = 0; j < this.board[i].getNumberOfGems(); j++) {
                this.board[i].addGem(new smallGem(this.board[i]));
            }
        }
        for(int i = (numSquare /2)+2; i <= numSquare + numHalfCircle - 1; i++) {
            this.board[i] = new Square(i, numSmallGem / numSquare);
            for(int j = 0; j < this.board[i].getNumberOfGems(); j++) {
                this.board[i].addGem(new smallGem(this.board[i]));
            }
        }
    }

    public Cell[] getBoard() {
        return board;
    }

    public static Cell getRightCell(Cell cell) {
        if(cell.getPosition() == 0) {
            return new Cell(numSquare + numHalfCircle - 1);
        }
        return new Cell(cell.getPosition() + 1);
    }

    public static Cell getLeftCell(Cell cell) {
        if(cell.getPosition() == numSquare + numHalfCircle - 1) {
            return new Cell(0);
        }
        return new Cell(cell.getPosition() - 1);
    }
}