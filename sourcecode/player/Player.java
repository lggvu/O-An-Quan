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
    private ArrayList<Gem> gemsCaptured = new ArrayList<Gem>();
    private ArrayList<Cell> cellsOnSide = new ArrayList<Cell>();
    private Cell handPosition;

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

    public void pickUpGemFrom(Cell cell) {
        if(!(cell instanceof HalfCircle) && !(cell.isEmpty())) { // TODO add cells on side
//            System.out.println("Picked up from cell " + cell.getPosition());
            this.gemsInHand.addAll(cell.getGemList());
            cell.emptyCell();
        }
    }

    public void spreadGem(Cell initPosition, int handDirection, Board board) {
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
                if(!board.getNextCellClockwise(nextHandPosition).isEmpty()) {  // edible cell
                    earnGemFrom(board.getNextCellClockwise(nextHandPosition));
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
                if(!board.getNextCellCounterClockwise(nextHandPosition).isEmpty()) {  // edible cell
                    earnGemFrom(board.getNextCellCounterClockwise(nextHandPosition));
                }
            }
        }
    }

    public void dropGemInto(Gem gem, Cell cell) {
        if(this.gemsInHand.size() > 0) {
            cell.addGem(gem);
            this.gemsInHand.remove(gem);
//            System.out.println("Dropped gem into cell " + cell.getPosition());
        }
        // else skip
    }


    public void earnGemFrom(Cell cell) {
        this.gemsCaptured.addAll(cell.getGemList());
        cell.emptyCell();
//        System.out.println("Eat all gems at: " + cell.getPosition());
    }
    public boolean isInTurn() {
        return inTurn;
    }

    public int CalculateScore() {
        int score = 0;
        for(int i = 0; i < this.gemsCaptured.size(); i ++){
            if (gemsCaptured.get(i) instanceof bigGem){
                score += 5;
            }else{
                score += 1;
            }
        }
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

}
