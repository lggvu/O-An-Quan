package sourcecode.player;

import sourcecode.board.*;
import sourcecode.gem.Gem;
import sourcecode.gem.bigGem;

import java.util.ArrayList;

public class Player {
    private boolean inTurn;
    private int score;
    private String name;
    private int id;
    private ArrayList<Gem> gemsInHand = new ArrayList<Gem>();

    public void setName(String name) {
        this.name = name;
    }

    private ArrayList<Gem> gemsCaptured = new ArrayList<Gem>();
    private ArrayList<Cell> cellsOnSide = new ArrayList<Cell>();
    private Cell handPosition;
    private int numGemsBorrowed;
    public boolean borrow;

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

    public Player() {

    }

    public Player(String name, Cell position) {
        this.name = name;
        this.handPosition = position;
    }

    public boolean pickUpGemFrom(Cell cell) {
        /*
        Action: Pick up gem from cell `cell`
         */
        if(!(cell instanceof HalfCircle) && !(cell.isEmpty())) { // TODO add cells on side
//            System.out.println("Picked up from cell " + cell.getPosition());
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
        Suppose already picked up gem from initPosition
        Actions: move to the cell nearby, drop gem into it, continue moving to the cells nearby
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
        /*
        Action: Drop the gem `gem` into cell `cell`
         */
        if(this.gemsInHand.size() > 0) {
            cell.addGem(gem);
            this.gemsInHand.remove(gem);
            System.out.println("Dropped gem into cell " + cell.getPosition());
        }
        // else skip
    }

    public String getName() {
        return this.name;
    }

    public void earnGemFrom(Cell cell) {
        /*
        Action: earn gem from cell `cell`
         */
        this.gemsCaptured.addAll(cell.getGemList());
        cell.emptyCell();
        System.out.println("Eat all gems at: " + cell.getPosition());
    }
    public boolean isInTurn() {
        return inTurn;
    }

    public int calculateScore() {
        int score = 0;
        for(int i = 0; i < this.gemsCaptured.size(); i ++){
            if (gemsCaptured.get(i) instanceof bigGem){
                score += 5;
            } else{
                score += 1;
            }
        }
        score -= this.numGemsBorrowed;
        return score;
    }
    public void setCellsOnSides(ArrayList<Cell> CellsOnSide){
        this.cellsOnSide = CellsOnSide;
    }
    public int getScore(){
        return this.score;
    }

    public void setTurn(boolean turn) {
        this.inTurn = turn;

    }
    public boolean isCellOnSideEmpty() {
        int res = board.getNumSquare() / 2;
        for (int i = 0; i < this.cellsOnSide.size(); i ++) {
            if (this.cellsOnSide.get(i).isEmpty()) {
                res -= 1;
            }
        }
        return res == 0;
    }

    public void setNumBorrow(int numGemsBorrowed) {
        this.numGemsBorrowed = numGemsBorrowed;
    }
    public void setBorrow(boolean isBorrow) {
        this.borrow = isBorrow;
    }

	public int numBigGemsInGemsCaptured() {
		int res = 0;
		for (int i = 0; i < gemsCaptured.size(); i++) {
			if (gemsCaptured.get(i) instanceof bigGem) {
				res += 1;
			}
		}
		return res;
	}



}