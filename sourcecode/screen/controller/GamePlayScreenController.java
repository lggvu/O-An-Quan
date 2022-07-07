package sourcecode.screen.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sourcecode.board.Board;
import sourcecode.board.Cell;
import sourcecode.player.Player;

public class GamePlayScreenController {
	private Player player1, player2, currentPlayer;
	private Board board;

    @FXML
    private Label Player1Score;

    @FXML
    private Label Player2Score;

    @FXML
    private Pane cell1;

    @FXML
    private Pane cell10;

    @FXML
    private Pane cell11;

    @FXML
    private Pane cell2;

    @FXML
    private Pane cell3;

    @FXML
    private Pane cell4;

    @FXML
    private Pane cell5;

    @FXML
    private Pane cell7;

    @FXML
    private Pane cell8;

    @FXML
    private Pane cell9;

    @FXML
    private ImageView leftArrowCell1;

    @FXML
    private ImageView leftArrowCell10;

    @FXML
    private ImageView leftArrowCell11;

    @FXML
    private ImageView leftArrowCell2;

    @FXML
    private ImageView leftArrowCell3;
    
    @FXML
    private ImageView leftArrowCell4;


    @FXML
    private ImageView leftArrowCell5;

    @FXML
    private ImageView leftArrowCell7;

    @FXML
    private ImageView leftArrowCell8;

    @FXML
    private ImageView leftArrowCell9;

    @FXML
    private Label numOfGems0;

    @FXML
    private Label numOfGems1;

    @FXML
    private Label numOfGems10;

    @FXML
    private Label numOfGems11;

    @FXML
    private Label numOfGems2;

    @FXML
    private Label numOfGems3;

    @FXML
    private Label numOfGems4;

    @FXML
    private Label numOfGems5;
    
    @FXML
    private Label numOfGems6;

    @FXML
    private Label numOfGems7;

    @FXML
    private Label numOfGems8;

    @FXML
    private Label numOfGems9;

    @FXML
    private Label player1Name;

    @FXML
    private Label player2Name;

    @FXML
    private ImageView rightArrowCell1;

    @FXML
    private ImageView rightArrowCell10;

    @FXML
    private ImageView rightArrowCell11;

    @FXML
    private ImageView rightArrowCell2;

    @FXML
    private ImageView rightArrowCell3;

    @FXML
    private ImageView rightArrowCell4;

    @FXML
    private ImageView rightArrowCell5;

    @FXML
    private ImageView rightArrowCell7;

    @FXML
    private ImageView rightArrowCell8;

    @FXML
    private ImageView rightArrowCell9;
    public GamePlayScreenController(Player player1, Player player2, Board board, Stage stage) {
    	super();
    	this.player1 = player1;
    	this.player2 = player2;
    	this.board = board;
    	
    }

    @FXML
    void cell1Chosen(MouseEvent event) {
    	this.leftArrowCell1.setVisible(true);
    	this.rightArrowCell1.setVisible(true);
    }

    @FXML
    void leftDirectionChosen1(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[1], 0, this.board);
    }

    @FXML
    void rightDirectionChosen1(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[1], 1, this.board);
    }
    
    @FXML
    void cell2Chosen(MouseEvent event) {
    	this.leftArrowCell2.setVisible(true);
    	this.rightArrowCell2.setVisible(true);
    }

    @FXML
    void leftDirectionChosen2(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[2], 0, this.board);
    }

    @FXML
    void rightDirectionChosen2(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[2], 1, this.board);
    }
    
    @FXML
    void cell3Chosen(MouseEvent event) {
    	this.leftArrowCell3.setVisible(true);
    	this.rightArrowCell3.setVisible(true);
    }

    @FXML
    void leftDirectionChosen3(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[3], 0, this.board);
    }

    @FXML
    void rightDirectionChosen3(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[3], 1, this.board);
    }
    
    @FXML
    void cell4Chosen(MouseEvent event) {
    	this.leftArrowCell4.setVisible(true);
    	this.rightArrowCell4.setVisible(true);
    }

    @FXML
    void leftDirectionChosen4(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[4], 0, this.board);
    }

    @FXML
    void rightDirectionChosen4(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[4], 1, this.board);
    }
    
    @FXML
    void cell5Chosen(MouseEvent event) {
    	this.leftArrowCell5.setVisible(true);
    	this.rightArrowCell5.setVisible(true);
    }

    @FXML
    void leftDirectionChosen5(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[5], 0, this.board);
    }

    @FXML
    void rightDirectionChosen5(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[5], 1, this.board);
    }
    
    @FXML
    void cell7Chosen(MouseEvent event) {
    	this.leftArrowCell7.setVisible(true);
    	this.rightArrowCell7.setVisible(true);
    }

    @FXML
    void leftDirectionChosen7(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[7], 0, this.board);
    }

    @FXML
    void rightDirectionChosen7(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[7], 1, this.board);
    }
    
    @FXML
    void cell8Chosen(MouseEvent event) {
    	this.leftArrowCell8.setVisible(true);
    	this.rightArrowCell8.setVisible(true);
    }

    @FXML
    void leftDirectionChosen8(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[8], 0, this.board);
    }

    @FXML
    void rightDirectionChosen8(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[8], 1, this.board);
    }
    
    @FXML
    void cell9Chosen(MouseEvent event) {
    	this.leftArrowCell9.setVisible(true);
    	this.rightArrowCell9.setVisible(true);
    }

    @FXML
    void leftDirectionChosen9(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[9], 0, this.board);
    }

    @FXML
    void rightDirectionChosen9(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[9], 1, this.board);
    }
    
    @FXML
    void cell10Chosen(MouseEvent event) {
    	this.leftArrowCell10.setVisible(true);
    	this.rightArrowCell10.setVisible(true);
    }

    @FXML
    void leftDirectionChosen10(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[10], 0, this.board);
    }

    @FXML
    void rightDirectionChosen10(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[10], 1, this.board);
    }
    
    @FXML
    void cell11Chosen(MouseEvent event) {
    	this.leftArrowCell11.setVisible(true);
    	this.rightArrowCell11.setVisible(true);
    }

    @FXML
    void leftDirectionChosen11(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[11], 0, this.board);
    }

    @FXML
    void rightDirectionChosen11(MouseEvent event) {
    	Cell[] boardList = this.board.getBoard();
    	this.currentPlayer.spreadGem(boardList[11], 1, this.board);
    }
    
    
    private void setScore(Player player1, Player player2, Board board) {
    	this.player1 = player1;
    	this.player2 = player2;
    	this.board = board;
    	Player1Score.setText("" + player1.calculateScore());
    	Player2Score.setText("" + player2.calculateScore());
    	
    }
    
    private void setNumGemsInCell0(Board board) {
        Cell[] boardList = board.getBoard();
    	this.numOfGems0.setText("" + boardList[0].getGemList().size());
    	
    }
    
    private void setNumGemsInCell1(Board board) {
        Cell[] boardList = board.getBoard();
    	this.numOfGems1.setText("" + boardList[1].getGemList().size());
    	
    }
    
    private void setNumGemsInCell2(Board board) {
        Cell[] boardList = board.getBoard();
    	this.numOfGems2.setText("" + boardList[2].getGemList().size());
    	
    }
    
    private void setNumGemsInCell3(Board board) {
        Cell[] boardList = board.getBoard();
    	this.numOfGems3.setText("" + boardList[3].getGemList().size());
    	
    }
    
    private void setNumGemsInCell4(Board board) {
        Cell[] boardList = board.getBoard();
    	this.numOfGems4.setText("" + boardList[4].getGemList().size());
    	
    }
    
    private void setNumGemsInCell5(Board board) {
        Cell[] boardList = board.getBoard();
    	this.numOfGems5.setText("" + boardList[5].getGemList().size());
    	
    }
    
    private void setNumGemsInCell6(Board board) {
        Cell[] boardList = board.getBoard();
    	this.numOfGems6.setText("" + boardList[6].getGemList().size());
    	
    }
    
    private void setNumGemsInCell7(Board board) {
        Cell[] boardList = board.getBoard();
    	this.numOfGems7.setText("" + boardList[7].getGemList().size());
    	
    }
    
    private void setNumGemsInCell8(Board board) {
        Cell[] boardList = board.getBoard();
    	this.numOfGems8.setText("" + boardList[8].getGemList().size());
    	
    }
    
    private void setNumGemsInCell9(Board board) {
        Cell[] boardList = board.getBoard();
    	this.numOfGems9.setText("" + boardList[9].getGemList().size());
    	
    }
    
    private void setNumGemsInCell10(Board board) {
        Cell[] boardList = board.getBoard();
    	this.numOfGems10.setText("" + boardList[10].getGemList().size());
    	
    }
    
    private void setNumGemsInCell11(Board board) {
        Cell[] boardList = board.getBoard();
    	this.numOfGems11.setText("" + boardList[11].getGemList().size());
    	
    }
}


