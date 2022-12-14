package sourcecode.player;

import sourcecode.board.*;
import sourcecode.gem.Gem;
import sourcecode.gem.bigGem;

import java.util.ArrayList;

public class Player {
    private boolean inTurn;
    private final String name;
    private ArrayList<Gem> gemsInHand = new ArrayList<Gem>();
    private ArrayList<Gem> gemsCaptured = new ArrayList<Gem>();
    private ArrayList<Cell> cellsOnSide = new ArrayList<Cell>();
    private Cell handPosition;

    Board board = new Board();

    public ArrayList<Gem> getGemsInHand() {
        return gemsInHand;
    }

    public Cell getHandPosition() {
        return handPosition;
    }

    public ArrayList<Cell> getCellsOnSide() {
        return cellsOnSide;
    }

    public void setCellsOnSide(ArrayList<Cell> cellsOnSide) {
        this.cellsOnSide = cellsOnSide;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Cell position) {
        this.name = name;
        this.handPosition = position;
    }

    public boolean pickUpGemFrom(Cell cell) {
        if((cell instanceof Pickable) && (!(cell.isEmpty()))) {
            this.gemsInHand.addAll(cell.getGemList());
            cell.emptyCell();
            return true;
        }
        else {
            return false;
        }
    }

    public void spreadGem(Cell initPosition, int handDirection, Board board) {
        /*
        Suppose player has ALREADY pickup from the cell initPosition
        Actions: move to the cell next to initPosition, drop gem into it, continue moving to other cells nearby
        Directions:
            0: clockwise
            1: counter-clockwise
         */

        this.handPosition = initPosition;
        if (handDirection == 0) {  // clockwise
            ArrayList<Gem> tmpGemsInHand = new ArrayList<>(this.gemsInHand);
            for (Gem gem : tmpGemsInHand) {
                handPosition = board.getNextCellClockwise(handPosition);
                dropGemInto(gem, handPosition);
            }
            // check turn continuity
            Cell nextHandPosition = board.getNextCellClockwise(handPosition);
            if(!nextHandPosition.isEmpty()) {
                if(!(nextHandPosition instanceof HalfCircle)) {  // can continue spreading
                    pickUpGemFrom(nextHandPosition);
                    spreadGem(nextHandPosition, handDirection, board);
                }
            }
            else {
                while(nextHandPosition.isEmpty() && !(board.getNextCellClockwise(nextHandPosition).isEmpty())) {  // edible cell
                    earnGemFrom(board.getNextCellClockwise(nextHandPosition));
                    nextHandPosition = board.getNextCellClockwise(board.getNextCellClockwise(nextHandPosition));
                }
            }

        } else if (handDirection == 1) { // anti-clockwise
            ArrayList<Gem> tmpGemsInHand = new ArrayList<>(this.gemsInHand);
            for (Gem gem : tmpGemsInHand) {
                handPosition = board.getNextCellCounterClockwise(handPosition);
                dropGemInto(gem, handPosition);
            }
             // check turn continuity
            Cell nextHandPosition = board.getNextCellCounterClockwise(handPosition);
            if(!nextHandPosition.isEmpty()) {
                if(!(nextHandPosition instanceof HalfCircle)) {  // can continue spreading
                    pickUpGemFrom(nextHandPosition);
                    spreadGem(nextHandPosition, handDirection, board);
                }
            }
            else {
                while(nextHandPosition.isEmpty() && !(board.getNextCellCounterClockwise(nextHandPosition).isEmpty())) {  // edible cell
                    earnGemFrom(board.getNextCellCounterClockwise(nextHandPosition));
                    nextHandPosition = board.getNextCellCounterClockwise(board.getNextCellCounterClockwise(nextHandPosition));
                }
            }
        }
    }

    public void dropGemInto(Gem gem, Cell cell) {
        if(this.gemsInHand.size() > 0) {
            cell.addGem(gem);
            this.gemsInHand.remove(gem);
        }
    }

    public void earnGemFrom(Cell cell) {
        this.gemsCaptured.addAll(cell.getGemList());
        cell.emptyCell();
    }
    public boolean isInTurn() {
        return inTurn;
    }

    public int calculateScore() {
        int score = 0;
        for (Gem gem : this.gemsCaptured) {
            score += gem.getVALUE();
        }
        return score;
    }
    public void setTurn(boolean turn) {
        this.inTurn = turn;

    }
    public boolean isCellOnSideEmpty() {
        int res = board.getNumSquare()/2;
        for (Cell cell : this.cellsOnSide) {
            if (cell.isEmpty()) {
                res -= 1;
            }
        }
        return res == 0;
    }

	public String getName() {
		return this.name;
	}
	
}


