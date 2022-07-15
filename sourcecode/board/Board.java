package sourcecode.board;

import sourcecode.gem.*;

public class Board {

    private final Cell[] boardList = new Cell[12];


    public Board() {
        this.boardList[0] = new HalfCircle(0, 1);
        this.boardList[0].addGem(new bigGem(this.boardList[0]));


        this.boardList[6] = new HalfCircle(6, 1);
        this.boardList[6].addGem(new bigGem(this.boardList[6]));


        for(int i = 1; i <= 5; i++) {
            this.boardList[i] = new Square(i, 5);
            for(int j = 0; j < this.boardList[i].getNumberOfGems(); j++) {
                this.boardList[i].addGem(new smallGem(this.boardList[i]));
            }
        }
        for(int i = 7; i <= 11; i++) {
            this.boardList[i] = new Square(i, 5);
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
            return this.boardList[11];
        }
        else {
            return this.boardList[cell.getPosition() - 1];
        }
    }

    public Cell getNextCellClockwise(Cell cell) {
        if(cell.getPosition() == 11) {
            return this.boardList[0];
        }
        else {
            return this.boardList[cell.getPosition() + 1];
        }
    }

}