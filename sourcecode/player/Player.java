package sourcecode.player;

import sourcecode.board.*;

import java.util.ArrayList;

public class Player {
    private boolean inTurn;
    private int score;
    private String name;
    private int id;
    private ArrayList<Gem> gemsInHand = new ArrayList<Gem>();

    Hand hand = new Hand();
    Cell handPosition = hand.getHandPosition();

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Cell position) {
        this.name = name;
    }

    public void pickUpGemFrom(Cell cell) {
        if(cell instanceof HalfCircle) {
            System.out.println("Cannot pick gems from this cell.");
            // block click from user
        }
        else {
            this.gemsInHand.addAll(cell.getGemList());
            cell.emptyCell();
        }
    }

    public void spreadGem(int handDirection) {
        if(handDirection == 0) {  // clockwise
            for (int i = 0; i < this.gemsInHand.size(); i++) {
                handPosition = Board.getLeftCell(hand.getHandPosition());
                dropGemInto(this.gemsInHand.get(i), handPosition);
            }
            if(handPosition.spreadable(handDirection)) {
                pickUpGemFrom(handPosition);
                spreadGem(handDirection);
            }
        } else if(handDirection == 1) { // anti-clockwise
            for (int i = 0; i < this.gemsInHand.size(); i++) {
                handPosition = Board.getLeftCell(hand.getHandPosition());
                dropGemInto(this.gemsInHand.get(i), handPosition);
            }
            if(handPosition.spreadable(handDirection)) {
                pickUpGemFrom(handPosition);
                spreadGem(handDirection);
            }
        }
    }

    public void dropGemInto(Gem gem, Cell cell) {
        if(this.gemsInHand.size() > 0) {
            cell.addGem(Gem);
            this.gemsInHand.remove(Gem);
        }
        // else skip
    }

    public void earnGemFrom(Cell cell, int handDirection) {
        while(handPosition.edible(handDirection)) {
            this.gemsInHand.addAll(handPosition.getGemList());
            cell.emptyCell();
            handPosition = cell;
        }
    }

    public boolean isInTurn() {
        return inTurn;
    }

    public void setScore() {
        this.score = this.gemsInHand.size();
    }
}
