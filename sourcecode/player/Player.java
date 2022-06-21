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
    private ArrayList<Cell> cellOnSide = new ArrayList<Cell>();

    Hand hand = new Hand();
    Cell handPosition = hand.getHandPosition();
	private ArrayList<Cell> cellsOnSides;
    
    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Cell position) {
        this.name = name;
    }

    public boolean pickUpGemFrom(Cell cell) {
        if(cell instanceof HalfCircle || cell.isEmpty() || !cellOnSide.contains(cell) ) {
            return false;
        } 
        else {
            this.gemsInHand.addAll(cell.getGemList());
            cell.emptyCell();
            return true;
        }
    }

    public void spreadGem(int handDirection) {
        if(handDirection == 0) {  // clockwise
            for (int i = 0; i < this.gemsInHand.size(); i++) {
                handPosition = Board.getRightCell(hand.getHandPosition());
                dropGemInto(this.gemsInHand.get(i), handPosition);
            }
            if(handPosition.spreadable(handDirection)) {
                pickUpGemFrom(handPosition);
                spreadGem(handDirection);
            } else if(Board.getRightCell(hand.getHandPosition()).isEmpty()){
                Cell tempPosition = Board.getRightCell(hand.getHandPosition());
                earnGemFrom(Board.getRightCell(tempPosition), 0);

            }
        } else if(handDirection == 1) { // anti-clockwise
            for (int i = 0; i < this.gemsInHand.size(); i++) {
                handPosition = Board.getLeftCell(hand.getHandPosition());
                dropGemInto(this.gemsInHand.get(i), handPosition);
            }
            if(handPosition.spreadable(handDirection)) {
                pickUpGemFrom(handPosition);
                spreadGem(handDirection);
            }else if(Board.getRightCell(hand.getHandPosition()).isEmpty()){
                Cell tempPosition = Board.getRightCell(hand.getHandPosition());
                earnGemFrom(Board.getRightCell(tempPosition), 0);

            }
        }
    }

    public void dropGemInto(Gem gem, Cell cell) {
        if(this.gemsInHand.size() > 0) {
            cell.addGem(gem);
            this.gemsInHand.remove(gem);
        }
        // else skip
    }

    public void earnGemFrom(Cell cell, int handDirection) {
        while(handPosition.edible(handDirection)) {
            this.gemsCaptured.addAll(handPosition.getGemList());
            cell.emptyCell();
            handPosition = cell;
        }
    }

    public boolean isInTurn() {
        return inTurn;
    }

    public int CalculteScore() {
        int Score = 0;
        for(int i = 0; i < this.gemsCaptured.size(); i ++){
            if (gemsCaptured.get(i) instanceof bigGem){
                Score += 5;
            }else{
                Score += 1;
            }
        }
        return Score;
    }
    public void setCellsOnSides(ArrayList<Cell> CellsOnSide){
        this.cellsOnSides = CellsOnSide;
    }
    public int getScore(){
        return this.score;
    }

	public void setTurn(boolean turn) {
		this.inTurn = turn;
		
	}

}
