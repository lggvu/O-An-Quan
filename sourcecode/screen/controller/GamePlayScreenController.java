package sourcecode.screen.controller;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import sourcecode.board.Board;
import sourcecode.board.Cell;
import sourcecode.player.Player;

import javafx.scene.image.ImageView;

public class GamePlayScreenController implements Initializable {
	private Player player1, player2, currentPlayer;
	private Board board;
	public static int cell_Num;
	private boolean playMusic = false;
	private Media media;
	private MediaPlayer mediaPlayer = null;
	private String winnerPlayer;
	private int winnerScore;
	private String endGameContent;

    public GamePlayScreenController(Board board, Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }
    
    @FXML
    private ImageView Mute;
    
    @FXML
    private ImageView unMute;
    
    @FXML
    private Button adjustMusicButton;

	@FXML
	private Button btnExit;

	@FXML
	private Pane cell01;

	@FXML
	private ImageView imgLeftArrow1;

	@FXML
	private ImageView imgRightArrow1;

	@FXML
	private Label numOfGems1;

	@FXML
	private Button leftArrowCell1;

	@FXML
	private Button rightArrowCell1;

	@FXML
	private Pane cell02;

	@FXML
	private Label numOfGems2;

	@FXML
	private ImageView imgLeftArrow2;

	@FXML
	private ImageView imgRightArrow2;

	@FXML
	private Button rightArrowCell2;

	@FXML
	private Button leftArrowCell2;

	@FXML
	private Pane cell03;

	@FXML
	private ImageView imgLeftArrow3;

	@FXML
	private ImageView imgRightArrow3;

	@FXML
	private Label numOfGems3;

	@FXML
	private Button leftArrowCell3;

	@FXML
	private Button rightArrowCell3;

	@FXML
	private Pane cell04;

	@FXML
	private ImageView imgLeftArrow4;

	@FXML
	private ImageView imgRightArrow4;

	@FXML
	private Label numOfGems4;

	@FXML
	private Button leftArrowCell4;

	@FXML
	private Button rightArrowCell4;

	@FXML
	private Pane cell05;

	@FXML
	private ImageView imgLeftArrow5;

	@FXML
	private ImageView imgRightArrow5;

	@FXML
	private Label numOfGems5;

	@FXML
	private Button leftArrowCell5;

	@FXML
	private Button rightArrowCell5;

	@FXML
	private Pane cell07;

	@FXML
	private ImageView imgLeftArrow7;

	@FXML
	private ImageView imgRightArrow7;

	@FXML
	private Label numOfGems7;

	@FXML
	private Button rightArrowCell7;

	@FXML
	private Button leftArrowCell7;

	@FXML
	private Pane cell08;

	@FXML
	private ImageView imgLeftArrow8;

	@FXML
	private ImageView imgRightArrow8;

	@FXML
	private Label numOfGems8;

	@FXML
	private Button leftArrowCell8;

	@FXML
	private Button rightArrowCell8;

	@FXML
	private Pane cell09;

	@FXML
	private ImageView imgLeftArrow9;

	@FXML
	private ImageView imgRightArrow9;

	@FXML
	private Label numOfGems9;

	@FXML
	private Button leftArrowCell9;

	@FXML
	private Button rightArrowCell9;

	@FXML
	private Pane cell10;

	@FXML
	private ImageView imgLeftArrow10;

	@FXML
	private ImageView imgRightArrow10;

	@FXML
	private Label numOfGems10;

	@FXML
	private Button leftArrowCell10;

	@FXML
	private Button rightArrowCell10;

	@FXML
	private Pane cell11;

	@FXML
	private Label numOfGems11;

	@FXML
	private ImageView imgRightArrow11;

	@FXML
	private ImageView imgLeftArrow11;

	@FXML
	private Button leftArrowCell11;

	@FXML
	private Button rightArrowCell11;

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
	private ImageView player1Badge;

	@FXML
	private ImageView player2Badge;

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
		// TODO
		player1.setTurn((Math.random()) < 0.5);
		if (player1.isInTurn()) {
			player2.setTurn(false);
		    for(Pane pane : Arrays.asList(cell01, cell02, cell03, cell04, cell05)) {
			    pane.setDisable(false);
				}
		    for(Pane pane : Arrays.asList(cell07, cell08, cell09, cell10, cell11)) {
			    pane.setDisable(true);
				}
				player1Badge.setVisible(true);
				player2Badge.setVisible(false);
		}else {
			player2.setTurn(true);
		    for(Pane pane : Arrays.asList(cell01, cell02, cell03, cell04, cell05)) {
			    pane.setDisable(true);
				}
		    for(Pane pane : Arrays.asList(cell07, cell08, cell09, cell10, cell11)) {
			    pane.setDisable(false);
				}
				player1Badge.setVisible(false);
				player2Badge.setVisible(true);
		}
	    try {
	          this.media = new Media(getClass().getResource("/sourcecode/screen/music/gameMusic.mp3").toURI().toString());
	        } catch (URISyntaxException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        this.mediaPlayer = new MediaPlayer(this.media);
			
		
	    ArrayList <Cell> Player1CellOnSide = new ArrayList<Cell>();
	    ArrayList <Cell> Player2CellOnSide = new ArrayList<Cell>();
	    Cell[] boardList = board.getBoard();
	    for (int i = 1; i < 6; i ++) { 
	        Player1CellOnSide.add(boardList[i]);
	     }
	    for (int i = 7; i < 12; i ++) {
	        Player2CellOnSide.add(boardList[i]);
	     }
	    player1.setCellsOnSide(Player1CellOnSide);
	    player2.setCellsOnSide(Player2CellOnSide);
		
	}

    @FXML
    void cellChosen(MouseEvent event) {
		Pane paneChosen = (Pane) event.getPickResult().getIntersectedNode();
		ObservableList<Node> childrenElements = paneChosen.getChildren();

		String id = paneChosen.getId();
		cell_Num = Integer.parseInt(id.substring(id.length()-2));
		System.out.println(cell_Num);

		// set invisible for all arrows and its button
		for(ImageView imageView : Arrays.asList(imgLeftArrow1, imgLeftArrow2, imgLeftArrow3, imgLeftArrow4, imgLeftArrow5,
				imgLeftArrow7, imgLeftArrow8, imgLeftArrow9, imgLeftArrow10, imgLeftArrow11,
				imgRightArrow1, imgRightArrow2, imgRightArrow3, imgRightArrow4, imgRightArrow5,
				imgRightArrow7, imgRightArrow8, imgRightArrow9, imgRightArrow10, imgRightArrow11)) {
			imageView.setVisible(false);
		}

		for(Button arrowButton : Arrays.asList(leftArrowCell1, leftArrowCell2, leftArrowCell3, leftArrowCell4, leftArrowCell5,
				leftArrowCell7, leftArrowCell8, leftArrowCell9, leftArrowCell10, leftArrowCell11, rightArrowCell1, rightArrowCell2,
				rightArrowCell3, rightArrowCell4, rightArrowCell5, rightArrowCell7, rightArrowCell8, rightArrowCell9, rightArrowCell10, rightArrowCell11)) {
			arrowButton.setVisible(false);
		}

		for(Node node:childrenElements) {
			node.setVisible(true);
		}
    }

    @FXML
    void leftDirectionChosen(ActionEvent event) {
    	System.out.println(player1.isInTurn());
		Pane paneChosen = (Pane) ((Node) event.getTarget()).getParent();
		System.out.println("pane chosen: " + paneChosen);
		String id = paneChosen.getId();
		int index = Integer.parseInt(id.substring(id.length()-2));

		Cell[] boardList = this.board.getBoard();
        if(this.player1.isInTurn()) {
			this.currentPlayer = this.player1;
		} else {
			this.currentPlayer = this.player2;
		}

		if(index >= 1 && index <= 5) {
			currentPlayer.pickUpGemFrom(boardList[index]);
			currentPlayer.spreadGem(boardList[index], 1, this.board);
			setNumGems(boardList);
			setScore();
		}

		if(index >= 7 && index <= 11) {
			currentPlayer.pickUpGemFrom(boardList[index]);
			currentPlayer.spreadGem(boardList[index], 0, this.board);
			setNumGems(boardList);
			setScore();
		}	
		if (!(isGameOver(this.player1, this.player2, this.board))) {
			changeTurn();
		}else {
			for(Pane pane : Arrays.asList(cell01, cell02, cell03, cell04, cell05, cell07, cell08,  cell09, cell10, cell11)) {
				pane.setDisable(true);
			}
		}

    }

    @FXML
    void rightDirectionChosen(ActionEvent event) {
		Pane paneChosen = (Pane) ((Node) event.getTarget()).getParent();
		System.out.println("pane chosen: " + paneChosen);
		String id = paneChosen.getId();
		int index = Integer.parseInt(id.substring(id.length()-2));

		Cell[] boardList = this.board.getBoard();

		if(this.player1.isInTurn()) {
			this.currentPlayer = this.player1;
		} else {
			this.currentPlayer = this.player2;
		}

		if(index >= 1 && index <= 5) {
			currentPlayer.pickUpGemFrom(boardList[index]);
			currentPlayer.spreadGem(boardList[index], 0, this.board);
			setNumGems(boardList);
			setScore();
		}

		if(index >= 7 && index <= 11) {
			currentPlayer.pickUpGemFrom(boardList[index]);
			currentPlayer.spreadGem(boardList[index], 1, this.board);
			setNumGems(boardList);
			setScore();
		}
		
		if (!(isGameOver(this.player1, this.player2, this.board))) {
			changeTurn();

		}else {
			for(Pane pane : Arrays.asList(cell01, cell02, cell03, cell04, cell05, cell07, cell08,  cell09, cell10, cell11)) {
				pane.setDisable(true);
			}
		}
	   	System.out.println(player1.isInTurn());
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

	public boolean isGameOver(Player player1, Player player2, Board board) {
		boolean res = false;
		if (2 - player1.numBigGemsInGemsCaptured() - player2.numBigGemsInGemsCaptured() == 0) {
			res = true;
		}else if (player1.isCellOnSideEmpty()) {
			res = true;
		}else if (player2.isCellOnSideEmpty()) {
			res = true;
		}

		if(res) {
			System.out.println("Game finished");
			if(player1.calculateScore() > player2.calculateScore()) {
				this.winnerPlayer = player1.getName();
				this.winnerScore = player1.calculateScore();
				this.endGameContent = winnerPlayer + " wins! Score: " + winnerScore;
			}
			else if(player1.calculateScore() < player2.calculateScore()){
				this.winnerPlayer = player2.getName();
				this.winnerScore = player2.calculateScore();
				this.endGameContent = winnerPlayer + " wins! Score: " + winnerScore;
			}
			else {
				this.endGameContent = "Draw";
			}
			displayEndGameScreen();
		}

		return res;
	}

	public void displayEndGameScreen() {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("End Game");
		alert.setHeaderText("End Game");
		alert.setContentText(endGameContent);
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
	
	public void changeTurn() {
		if (this.currentPlayer == this.player1) {
			this.player1.setTurn(false);
			this.player2.setTurn(true);
			for(Pane pane : Arrays.asList(cell01, cell02, cell03, cell04, cell05)) {
				pane.setDisable(true);
			}
			for(Pane pane : Arrays.asList(cell07, cell08, cell09, cell10, cell11)) {
				if (!(isPaneEmpty(pane))) {
					pane.setDisable(false);
				}else {
					pane.setDisable(true);
				}
			}
			player1Badge.setVisible(false);
			player2Badge.setVisible(true);
		}else {
			this.player1.setTurn(true);
			this.player2.setTurn(false);
			for(Pane pane : Arrays.asList(cell01, cell02, cell03, cell04, cell05)) {
				if (!(isPaneEmpty(pane))) {
					pane.setDisable(false);
				}else {
					pane.setDisable(true);
				}
			}
			for(Pane pane : Arrays.asList(cell07, cell08, cell09, cell10, cell11)) {
				pane.setDisable(true);
			}
			player1Badge.setVisible(true);
			player2Badge.setVisible(false);
		}
	}
	public static boolean isPaneEmpty(Pane pane) {
	    boolean empty = false;
		for (Node n : pane.getChildren()) {
		    if (n instanceof Label) {
		        String text = ((Label)n).getText();
		        if (text.equals("" + '0')) {
			    empty = true;
			    break;
			    }
            }
		}
		return empty;
    }
	
    @FXML
    void adjustMusic(MouseEvent event) {
		if (this.playMusic) {
			this.playMusic = false;
	        Mute.setVisible(false);
	        unMute.setVisible(true);
	    }else {
	        this.playMusic = true;
	        Mute.setVisible(true);
	        unMute.setVisible(false);
	        }
	    if (this.playMusic) {
	        this.mediaPlayer.play();
	    }else {
	        this.mediaPlayer.stop();
	    }

    }

}
 
