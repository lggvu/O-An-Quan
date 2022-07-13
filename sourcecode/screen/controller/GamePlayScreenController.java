package sourcecode.screen.controller;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sourcecode.board.Board;
import sourcecode.board.Cell;
import sourcecode.player.Player;

import javafx.scene.image.ImageView;


public class GamePlayScreenController implements Initializable {
	private Player player1, player2, currentPlayer;
	private Board board;
	private static int handDirection;
	public static int cell_Num;
//	private Cell[] boardList = this.board.getBoard();

    public GamePlayScreenController(Board board, Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }

	@FXML
	private static Pane cell1;

	@FXML
	private ImageView leftArrowCell1;

	@FXML
	private ImageView rightArrowCell1;

	@FXML
	private Label numOfGems1;

	@FXML
	private static Pane cell2;

	@FXML
	private ImageView leftArrowCell2;

	@FXML
	private ImageView rightArrowCell2;

	@FXML
	private Label numOfGems2;

	@FXML
	private static Pane cell3;

	@FXML
	private ImageView leftArrowCell3;

	@FXML
	private ImageView rightArrowCell3;

	@FXML
	private Label numOfGems3;

	@FXML
	private static Pane cell4;

	@FXML
	private ImageView leftArrowCell4;

	@FXML
	private ImageView rightArrowCell4;

	@FXML
	private Label numOfGems4;

	@FXML
	private static Pane cell5;

	@FXML
	private ImageView leftArrowCell5;

	@FXML
	private ImageView rightArrowCell5;

	@FXML
	private Label numOfGems5;

	@FXML
	private static Pane cell7;

	@FXML
	private ImageView leftArrowCell7;

	@FXML
	private ImageView rightArrowCell7;

	@FXML
	private Label numOfGems7;

	@FXML
	private static Pane cell8;

	@FXML
	private ImageView leftArrowCell8;

	@FXML
	private ImageView rightArrowCell8;

	@FXML
	private Label numOfGems8;

	@FXML
	private static Pane cell9;

	@FXML
	private ImageView leftArrowCell9;

	@FXML
	private ImageView rightArrowCell9;

	@FXML
	private Label numOfGems9;

	@FXML
	private static Pane cell10;

	@FXML
	private ImageView leftArrowCell10;

	@FXML
	private ImageView rightArrowCell10;

	@FXML
	private Label numOfGems10;

	@FXML
	private static Pane cell11;

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

	@FXML
	private Button btnExit;
	
    @FXML
    private static ImageView player1Badge;
    
    @FXML
    private static ImageView player2Badge;

	@FXML
	void btnExitClicked(ActionEvent event) {
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Exit Confirmation");
		alert.setHeaderText("Exit Game");
		alert.setContentText("Are you sure you want to exit?");
		Optional<ButtonType> res = alert.showAndWait();
		if(res.get() == ButtonType.OK) {
			// quit game
			Stage stage = (Stage) btnExit.getScene().getWindow();
			stage.close();
		} else {
			// close dialog
			alert.close();
		}

	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		player1.setTurn(Math.random() < 0.5);
		if (player1.isInTurn()) {
			GameStart(player1, player2, board);
		}else {
			GameStart(player2, player1, board);
		}
		
	}

    @FXML
    void cellChosen(MouseEvent event) {
        String paneChosen = event.getPickResult().getIntersectedNode().getId();
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
        	cell_Num = 1;
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
        	cell_Num = 2;
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
        	cell_Num = 3;
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
        	cell_Num = 4;
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
        	cell_Num = 5;
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
        	cell_Num = 7;
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
        	cell_Num = 8;
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
        	cell_Num = 9;
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
        	cell_Num = 10;
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
        	cell_Num = 11;
        }
    }

    @FXML
    void leftDirectionChosen(MouseEvent event) {
        String leftDirectionChosen = event.getPickResult().getIntersectedNode().getId();
        this.handDirection = 1;
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
        this.handDirection = 0;
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
    
    public static boolean isGameOver(Player player1, Player player2, Board board) {
    	boolean res = false;
    	if (board.getNumBigGem() - player1.numBigGemsInGemsCaptured() - player2.numBigGemsInGemsCaptured() == 0) {
    		res = true;
    	}else if (player1.isCellOnSideEmpty()) {
    		res = true;
    	}else if (player2.isCellOnSideEmpty()) {
    		res = true;
    	}
    	return res;
    }
    
    public static void GameStart(Player player1, Player player2, Board board){
        ArrayList <Cell> Player1CellOnSide = new ArrayList<Cell>();
        ArrayList <Cell> Player2CellOnSide = new ArrayList<Cell>();
        Cell[] boardList = board.getBoard();
        for (int i = 1; i < 6; i ++) { 
            Player1CellOnSide.add(boardList[i]);
        }
        for (int i = 7; i < 12; i ++) {
            Player2CellOnSide.add(boardList[i]);
        }
        
        while (!(isGameOver(player1, player2, board))) {
        	// disable all cells on side of player 2;
        	cell7.setDisable(true);
           	cell8.setDisable(true);
           	cell9.setDisable(true);
           	cell10.setDisable(true);
           	cell11.setDisable(true);
        	player1Badge.setVisible(true);
        	}
            while (!(player1.pickUpGemFrom(boardList[cell_Num]))){
            	//DONOTHING
            }
            
            while (handDirection != 1 && handDirection != 0) {
            	//DO NOTHING
            }
            
          	player2Badge.setVisible(true);
            //Disable all cell on sides of player1
        	cell1.setDisable(true);
           	cell2.setDisable(true);
           	cell3.setDisable(true);
           	cell4.setDisable(true);
           	cell5.setDisable(true);
            while(!player2.pickUpGemFrom(boardList[cell_Num] )){
            	
            	// DO NOTHING
                }
            player2.pickUpGemFrom(boardList[cell_Num]);
            while (handDirection != 1 && handDirection != 0) {
            	//DO NOTHING
            }
   
        }
        //TODO: IF PLAYER1 IS IN TURN, THEN DISABLE ALL CELLSONSIDE OF PLAYER2
        // AFTER PLAYER 1 CLICKS, DISABLE ALL THE IMAGEVIEWS THAT ARE NOT IN THIS PANE => let it invisible
        //ADD A BOOLEAN ATTRIBUTE TO CHECK WHETHER RIGHT OF LEFT BUTTON CLICKED (IN RIGHTClick and leftClicked)
 }
    


