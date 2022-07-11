package sourcecode.screen.controller;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import sourcecode.board.Board;
import sourcecode.board.Cell;
import sourcecode.player.Player;

import javafx.scene.image.ImageView;

public class GamePlayScreenController implements Initializable {
	private Player player1, player2, currentPlayer;
	private Board board;
//	private Cell[] boardList = this.board.getBoard();

    public GamePlayScreenController(Board board, Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }

	@FXML
	private Pane cell1;

	@FXML
	private ImageView leftArrowCell1;

	@FXML
	private ImageView rightArrowCell1;

	@FXML
	private Label numOfGems1;

	@FXML
	private Pane cell2;

	@FXML
	private ImageView leftArrowCell2;

	@FXML
	private ImageView rightArrowCell2;

	@FXML
	private Label numOfGems2;

	@FXML
	private Pane cell3;

	@FXML
	private ImageView leftArrowCell3;

	@FXML
	private ImageView rightArrowCell3;

	@FXML
	private Label numOfGems3;

	@FXML
	private Pane cell4;

	@FXML
	private ImageView leftArrowCell4;

	@FXML
	private ImageView rightArrowCell4;

	@FXML
	private Label numOfGems4;

	@FXML
	private Pane cell5;

	@FXML
	private ImageView leftArrowCell5;

	@FXML
	private ImageView rightArrowCell5;

	@FXML
	private Label numOfGems5;

	@FXML
	private Pane cell7;

	@FXML
	private ImageView leftArrowCell7;

	@FXML
	private ImageView rightArrowCell7;

	@FXML
	private Label numOfGems7;

	@FXML
	private Pane cell8;

	@FXML
	private ImageView leftArrowCell8;

	@FXML
	private ImageView rightArrowCell8;

	@FXML
	private Label numOfGems8;

	@FXML
	private Pane cell9;

	@FXML
	private ImageView leftArrowCell9;

	@FXML
	private ImageView rightArrowCell9;

	@FXML
	private Label numOfGems9;

	@FXML
	private Pane cell10;

	@FXML
	private ImageView leftArrowCell10;

	@FXML
	private ImageView rightArrowCell10;

	@FXML
	private Label numOfGems10;

	@FXML
	private Pane cell11;

	@FXML
	private ImageView leftArrowCell11;

	@FXML
	private ImageView rightArrowCell11;

	@FXML
	private Label numOfGems11;

	@FXML
	private Label numOfGems0;

	@FXML
	private Label numOfGems6;

	@FXML
	private Label player1Name;

	@FXML
	private Label player2Name;

	@FXML
	private Label player1Score;

	@FXML
	private Label player2Score;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO
		
	}

    @FXML
    void cellChosen(MouseEvent event) {
        String paneChosen = event.getPickResult().getIntersectedNode().getId();
		System.out.println(paneChosen);
        // Set Imageview (Let rightArrow and leftArrow visible after clicked this Pane)
		// TODO clean this up

		if (paneChosen.contains("cell1")) {
        	leftArrowCell1.setVisible(true);
        	rightArrowCell1.setVisible(true);
        	leftArrowCell2.setVisible(false);
        	rightArrowCell2.setVisible(false);
        	leftArrowCell3.setVisible(false);
        	rightArrowCell3.setVisible(false);
        	leftArrowCell4.setVisible(false);
        	rightArrowCell4.setVisible(false);
           	leftArrowCell5.setVisible(false);
        	rightArrowCell5.setVisible(false);
           	leftArrowCell7.setVisible(false);
        	rightArrowCell7.setVisible(false);
        	leftArrowCell8.setVisible(false);
        	rightArrowCell8.setVisible(false);
        	leftArrowCell9.setVisible(false);
        	rightArrowCell9.setVisible(false);
          	leftArrowCell10.setVisible(false);
        	rightArrowCell10.setVisible(false);
        	leftArrowCell11.setVisible(false);
        	rightArrowCell11.setVisible(false);
        }else if (paneChosen.equals("cell2")) {
        	leftArrowCell1.setVisible(false);
        	rightArrowCell1.setVisible(false);
        	leftArrowCell3.setVisible(false);
        	rightArrowCell3.setVisible(false);
        	leftArrowCell4.setVisible(false);
        	rightArrowCell4.setVisible(false);
           	leftArrowCell5.setVisible(false);
        	rightArrowCell5.setVisible(false);
           	leftArrowCell7.setVisible(false);
        	rightArrowCell7.setVisible(false);
        	leftArrowCell8.setVisible(false);
        	rightArrowCell8.setVisible(false);
        	leftArrowCell9.setVisible(false);
        	rightArrowCell9.setVisible(false);
          	leftArrowCell10.setVisible(false);
        	rightArrowCell10.setVisible(false);
        	leftArrowCell11.setVisible(false);
        	rightArrowCell11.setVisible(false);
        	leftArrowCell2.setVisible(true);
        	rightArrowCell2.setVisible(true);
        }else if (paneChosen.equals("cell3")) {
        	leftArrowCell3.setVisible(true);
        	rightArrowCell3.setVisible(true);
        	leftArrowCell1.setVisible(false);
        	rightArrowCell1.setVisible(false);
        	leftArrowCell2.setVisible(false);
        	rightArrowCell2.setVisible(false);
        	leftArrowCell4.setVisible(false);
        	rightArrowCell4.setVisible(false);
           	leftArrowCell5.setVisible(false);
        	rightArrowCell5.setVisible(false);
           	leftArrowCell7.setVisible(false);
        	rightArrowCell7.setVisible(false);
        	leftArrowCell8.setVisible(false);
        	rightArrowCell8.setVisible(false);
        	leftArrowCell9.setVisible(false);
        	rightArrowCell9.setVisible(false);
          	leftArrowCell10.setVisible(false);
        	rightArrowCell10.setVisible(false);
        	leftArrowCell11.setVisible(false);
        	rightArrowCell11.setVisible(false);
        }else if (paneChosen.equals("cell4")) {
        	leftArrowCell4.setVisible(true);
        	rightArrowCell4.setVisible(true);
        	leftArrowCell1.setVisible(false);
        	rightArrowCell1.setVisible(false);
        	leftArrowCell2.setVisible(false);
        	rightArrowCell2.setVisible(false);
        	leftArrowCell3.setVisible(false);
        	rightArrowCell3.setVisible(false);
           	leftArrowCell5.setVisible(false);
        	rightArrowCell5.setVisible(false);
           	leftArrowCell7.setVisible(false);
        	rightArrowCell7.setVisible(false);
        	leftArrowCell8.setVisible(false);
        	rightArrowCell8.setVisible(false);
        	leftArrowCell9.setVisible(false);
        	rightArrowCell9.setVisible(false);
          	leftArrowCell10.setVisible(false);
        	rightArrowCell10.setVisible(false);
        	leftArrowCell11.setVisible(false);
        	rightArrowCell11.setVisible(false);
        }else if (paneChosen.equals("cell5")) {
        	leftArrowCell5.setVisible(true);
        	rightArrowCell5.setVisible(true);
        	leftArrowCell1.setVisible(false);
        	rightArrowCell1.setVisible(false);
        	leftArrowCell2.setVisible(false);
        	rightArrowCell2.setVisible(false);
        	leftArrowCell3.setVisible(false);
        	rightArrowCell3.setVisible(false);
        	leftArrowCell4.setVisible(false);
        	rightArrowCell4.setVisible(false);
           	leftArrowCell7.setVisible(false);
        	rightArrowCell7.setVisible(false);
        	leftArrowCell8.setVisible(false);
        	rightArrowCell8.setVisible(false);
        	leftArrowCell9.setVisible(false);
        	rightArrowCell9.setVisible(false);
          	leftArrowCell10.setVisible(false);
        	rightArrowCell10.setVisible(false);
        	leftArrowCell11.setVisible(false);
        	rightArrowCell11.setVisible(false);
        }else if (paneChosen.equals("cell7")) {
        	leftArrowCell7.setVisible(true);
        	rightArrowCell7.setVisible(true);
        	leftArrowCell1.setVisible(false);
        	rightArrowCell1.setVisible(false);
        	leftArrowCell2.setVisible(false);
        	rightArrowCell2.setVisible(false);
        	leftArrowCell3.setVisible(false);
        	rightArrowCell3.setVisible(false);
        	leftArrowCell4.setVisible(false);
        	rightArrowCell4.setVisible(false);
           	leftArrowCell5.setVisible(false);
        	rightArrowCell5.setVisible(false);
        	leftArrowCell8.setVisible(false);
        	rightArrowCell8.setVisible(false);
        	leftArrowCell9.setVisible(false);
        	rightArrowCell9.setVisible(false);
          	leftArrowCell10.setVisible(false);
        	rightArrowCell10.setVisible(false);
        	leftArrowCell11.setVisible(false);
        	rightArrowCell11.setVisible(false);
        }else if (paneChosen.equals("cell8")) {
        	leftArrowCell8.setVisible(true);
        	rightArrowCell8.setVisible(true);
        	leftArrowCell1.setVisible(false);
        	rightArrowCell1.setVisible(false);
        	leftArrowCell2.setVisible(false);
        	rightArrowCell2.setVisible(false);
        	leftArrowCell3.setVisible(false);
        	rightArrowCell3.setVisible(false);
        	leftArrowCell4.setVisible(false);
        	rightArrowCell4.setVisible(false);
           	leftArrowCell5.setVisible(false);
        	rightArrowCell5.setVisible(false);
           	leftArrowCell7.setVisible(false);
        	rightArrowCell7.setVisible(false);
        	leftArrowCell9.setVisible(false);
        	rightArrowCell9.setVisible(false);
          	leftArrowCell10.setVisible(false);
        	rightArrowCell10.setVisible(false);
        	leftArrowCell11.setVisible(false);
        	rightArrowCell11.setVisible(false);
        }else if (paneChosen.equals("cell9")) {
        	leftArrowCell9.setVisible(true);
        	rightArrowCell9.setVisible(true);
        	leftArrowCell1.setVisible(false);
        	rightArrowCell1.setVisible(false);
        	leftArrowCell2.setVisible(false);
        	rightArrowCell2.setVisible(false);
        	leftArrowCell3.setVisible(false);
        	rightArrowCell3.setVisible(false);
        	leftArrowCell4.setVisible(false);
        	rightArrowCell4.setVisible(false);
           	leftArrowCell5.setVisible(false);
        	rightArrowCell5.setVisible(false);
           	leftArrowCell7.setVisible(false);
        	rightArrowCell7.setVisible(false);
        	leftArrowCell8.setVisible(false);
        	rightArrowCell8.setVisible(false);
          	leftArrowCell10.setVisible(false);
        	rightArrowCell10.setVisible(false);
        	leftArrowCell11.setVisible(false);
        	rightArrowCell11.setVisible(false);
        }else if (paneChosen.equals("cell10")) {
        	leftArrowCell10.setVisible(true);
        	rightArrowCell10.setVisible(true);
        	leftArrowCell1.setVisible(false);
        	rightArrowCell1.setVisible(false);
        	leftArrowCell2.setVisible(false);
        	rightArrowCell2.setVisible(false);
        	leftArrowCell3.setVisible(false);
        	rightArrowCell3.setVisible(false);
        	leftArrowCell4.setVisible(false);
        	rightArrowCell4.setVisible(false);
           	leftArrowCell5.setVisible(false);
        	rightArrowCell5.setVisible(false);
           	leftArrowCell7.setVisible(false);
        	rightArrowCell7.setVisible(false);
        	leftArrowCell8.setVisible(false);
        	rightArrowCell8.setVisible(false);
        	leftArrowCell9.setVisible(false);
        	rightArrowCell9.setVisible(false);
        	leftArrowCell11.setVisible(false);
        	rightArrowCell11.setVisible(false);
        }else if (paneChosen.equals("cell11")) {
        	leftArrowCell11.setVisible(true);
        	rightArrowCell11.setVisible(true);
        	leftArrowCell1.setVisible(false);
        	rightArrowCell1.setVisible(false);
        	leftArrowCell2.setVisible(false);
        	rightArrowCell2.setVisible(false);
        	leftArrowCell3.setVisible(false);
        	rightArrowCell3.setVisible(false);
        	leftArrowCell4.setVisible(false);
        	rightArrowCell4.setVisible(false);
           	leftArrowCell5.setVisible(false);
        	rightArrowCell5.setVisible(false);
           	leftArrowCell7.setVisible(false);
        	rightArrowCell7.setVisible(false);
        	leftArrowCell8.setVisible(false);
        	rightArrowCell8.setVisible(false);
        	leftArrowCell9.setVisible(false);
        	rightArrowCell9.setVisible(false);
          	leftArrowCell10.setVisible(false);
        	rightArrowCell10.setVisible(false);
        }
    }

    @FXML
    void leftDirectionChosen(MouseEvent event) {
        String leftDirectionChosen = event.getPickResult().getIntersectedNode().getId();
		System.out.println(leftDirectionChosen);
        Cell[] boardList = this.board.getBoard();
        if (player1.isInTurn()) {
        	this.currentPlayer = this.player1;
        }else {
        	this.currentPlayer = this.player2;
        }

		for(int i = 1; i <= 5; i++) {
			String leftArrowName = "leftArrowCell" + i;
			if(leftDirectionChosen.equals(leftArrowName)) {
				currentPlayer.pickUpGemFrom(boardList[i]);
				currentPlayer.spreadGem(boardList[i], 1, this.board);
				setNumGems(boardList);
				setScore();
			}
		}

        for (int i = 7; i <= 11; i++) {
        	String leftArrowName = "leftArrowCell" + i;
        	if (leftDirectionChosen.equals(leftArrowName)){ 
        		currentPlayer.pickUpGemFrom(boardList[i]);
        		currentPlayer.spreadGem(boardList[i], 0, this.board);
        		setNumGems(boardList);
        		setScore();
        	}
        }

    }

    @FXML
    void rightDirectionChosen(MouseEvent event) {
        String rightDirectionChosen = event.getPickResult().getIntersectedNode().getId();
		System.out.println(rightDirectionChosen);
        Cell[] boardList = this.board.getBoard();
        if (player1.isInTurn()) {
        	this.currentPlayer = this.player1;
        }else {
        	this.currentPlayer = this.player2;
        }

		for(int i = 1; i <= 5; i++) {
			String rightArrowName = "rightArrowCell" + i;
			if(rightDirectionChosen.equals(rightArrowName)) {
				currentPlayer.pickUpGemFrom(boardList[i]);
				currentPlayer.spreadGem(boardList[i], 0, this.board);
				setNumGems(boardList);
				setScore();
			}
		}

		for (int i = 7; i <= 11; i++) {
			String rightArrowName = "rightArrowCell" + i;
			if (rightDirectionChosen.equals(rightArrowName)){
				currentPlayer.pickUpGemFrom(boardList[i]);
				currentPlayer.spreadGem(boardList[i], 1, this.board);
				setNumGems(boardList);
				setScore();
			}
		}

    }
    
    public void setNumGems(Cell[] boardList) {
  	    numOfGems0.setText("" + boardList[0].getGemList().size());
    	numOfGems1.setText("" + boardList[1].getGemList().size());
    	numOfGems2.setText("" + boardList[2].getGemList().size());
    	numOfGems3.setText("" + boardList[3].getGemList().size());
    	numOfGems4.setText("" + boardList[4].getGemList().size());
    	numOfGems5.setText("" + boardList[5].getGemList().size());
    	numOfGems6.setText("" + boardList[6].getGemList().size());
    	numOfGems7.setText("" + boardList[7].getGemList().size());
    	numOfGems8.setText("" + boardList[8].getGemList().size());
    	numOfGems9.setText("" + boardList[9].getGemList().size());
    	numOfGems10.setText("" + boardList[10].getGemList().size());
    	numOfGems11.setText("" + boardList[11].getGemList().size());
    	
    }
    
    public void setScore() {
    	player1Score.setText("" + this.player1.calculateScore());
    	player2Score.setText("" + this.player2.calculateScore());
    }

//	public void setPlayerName() {
//		player1Name.setText(this.player1.getName());
//		player2Name.setText(this.player2.getName());
//	}

}
